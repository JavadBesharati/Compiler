// To be implemented:
// ArgDeclaration           done
// ArrayDecStmt             done
// AssignStmt:              done
// ForloopStmt:             done
// ImplicationStmt          done
// PrintStmt
// ReturnStmt
// VarDecStmt               done

// FuncDeclaration          done
// MainDeclaration          done

package visitor.typeAnalyzer;

import ast.node.Program;
import ast.node.declaration.ArgDeclaration;
import ast.node.declaration.Declaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.ArrayAccess;
import ast.node.expression.Expression;
import ast.node.expression.FunctionCall;
import ast.node.expression.Identifier;
import ast.node.expression.operators.BinaryOperator;
import ast.node.statement.*;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import com.sun.jdi.VoidType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.LeftSideNotLValue;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.ConditionTypeNotBool;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.*;
import visitor.Visitor;

import java.text.spi.DateFormatSymbolsProvider;
import java.util.ArrayList;

public class TypeAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    @Override
    public Void visit(Program program) {
        for(var functionDec : program.getFuncs()) {
            functionDec.accept(this);
        }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        try {
            FunctionItem functionItem = (FunctionItem)  SymbolTable.root.get(FunctionItem.STARTKEY + funcDeclaration.getName().getName());
            SymbolTable.push((functionItem.getFunctionSymbolTable()));
        } catch (ItemNotFoundException e) {
            //unreachable
        }

        for (ArgDeclaration argDeclaration : funcDeclaration.getArgs()) {
            argDeclaration.accept(this);
        }

        for(Statement stmt : funcDeclaration.getStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ArgDeclaration argDeclaration) {
        try {
            VariableItem variableItem = (VariableItem) SymbolTable.top.get(VariableItem.STARTKEY + argDeclaration.getIdentifier().getName());
            try {
                SymbolTable.top.put(variableItem);
            } catch (ItemAlreadyExistsException itemAlreadyExistsException) {}
        } catch (ItemNotFoundException itemNotFoundException) {}

        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        var mainItem = new MainItem(mainDeclaration);
        var mainSymbolTable = new SymbolTable(null, "main");
        mainItem.setMainItemSymbolTable(mainSymbolTable);
//        mainItem.getMainItemSymbolTable().pre = null;
        SymbolTable.push(mainItem.getMainItemSymbolTable());

        for (var stmt : mainDeclaration.getMainStatements()) {
            stmt.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ForloopStmt forloopStmt) {

        Type arrItemType = forloopStmt.getArrayName().accept(expressionTypeChecker);
        SymbolTable.push(SymbolTable.top);

        VariableItem forVar = new VariableItem(forloopStmt.getIterator().getName(), arrItemType);
        try {
            SymbolTable.top.put(forVar);
        } catch (ItemAlreadyExistsException ignored) {}

        for(Statement stmt : forloopStmt.getStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();

        //SymbolTable.pop(); // pop twice to change the top to the previous top
        SymbolTable.push(SymbolTable.top); // .top = previous so push it once again

        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        Type tl = assignStmt.getLValue().accept(expressionTypeChecker);
        Type tr = assignStmt.getRValue().accept(expressionTypeChecker);

        if (!expressionTypeChecker.sameType(tl, tr)) {
            typeErrors.add(new UnsupportedOperandType(assignStmt.getRValue().getLine(), BinaryOperator.assign.name()));
        }

//        Is it necessary to check lValue?
//        if (!expressionTypeChecker.isLvalue(assignStmt.getLValue())) {
//            typeErrors.add(new LeftSideNotLValue(assignStmt.getLValue().getLine()));
//        }

        return null;
    }


    @Override
    public Void visit(VarDecStmt varDecStmt) {
        if (varDecStmt.getInitialExpression() != null) {
            Type defaultValType = varDecStmt.getInitialExpression().accept(expressionTypeChecker);
//            SymbolTable.top.put(new VariableItem(varDecStmt));
            if (!expressionTypeChecker.sameType(varDecStmt.getType(), defaultValType)) {
                typeErrors.add(new UnsupportedOperandType(varDecStmt.getLine(), BinaryOperator.assign.name()));
            }
        }

        try {
            VariableItem variableItem = new VariableItem(varDecStmt);
            variableItem.setType(varDecStmt.getType());
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExistsException ignored) {}

        return null;
    }

    @Override
    public Void visit(PrintStmt printStmt) {
        printStmt.getArg().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        if(returnStmt.getExpression() != null) {
            returnStmt.getExpression().accept(expressionTypeChecker);
        }
        return null;
    }

    @Override
    public Void visit(ArrayDecStmt arrayDecStmt) {
        try {
            SymbolTable.top.put(new ArrayItem(arrayDecStmt.getIdentifier().getName(), arrayDecStmt.getType()));

        } catch (ItemAlreadyExistsException ignored) {}

        boolean is_valid_initializer = true;
        int wrongTypesCount = 0;

        for(Expression expression : arrayDecStmt.getInitialValues()){
            Type initVerifyer = expression.accept(expressionTypeChecker);
            if(initVerifyer instanceof NoType) {
                // nothing needed to be done
            }
            else if(!arrayDecStmt.getType().toString().equals(initVerifyer.toString())) {
                is_valid_initializer = false;
                wrongTypesCount ++;
            }
        }

        if(!is_valid_initializer) {
            for (var i = 0; i < wrongTypesCount; i++) {
                typeErrors.add(new UnsupportedOperandType(arrayDecStmt.getLine(), BinaryOperator.assign.name()));
            }
//            typeErrors.add(new UnsupportedOperandType(arrayDecStmt.getLine(), BinaryOperator.assign.name()));
        }
        return null;
    }

    @Override
    public Void visit(ImplicationStmt implicationStmt) {
        Type implicationCondition = implicationStmt.getCondition().accept(expressionTypeChecker);
        if(!(implicationCondition instanceof BooleanType || implicationCondition instanceof NoType)) {
            typeErrors.add(new ConditionTypeNotBool(implicationStmt.getLine()));
        }
//??????
        SymbolTable.push(new SymbolTable(null, SymbolTable.top.name));
//        SymbolTable.push(new SymbolTable(SymbolTable.top, SymbolTable.top.name));
        for (Statement statement : implicationStmt.getStatements()) {
            statement.accept(this);
        }
        SymbolTable.pop();
        return null;
    }
}
