// To be implemented:
// ArgDeclaration
// ArrayDecStmt
// AssignStmt:              done
// ForloopStmt:             done
// ImplicationStmt
// PredicateStmt
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
import symbolTable.symbolTableItems.ForLoopItem;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.MainItem;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

import java.util.ArrayList;

public class TypeAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    @Override
    public Void visit(Program program) {
        // Should we handle array declaration? (could arrays be defined globally?)
        SymbolTable symbolTable;
        for(FuncDeclaration functionDec : program.getFuncs()) {
//            functionDec.accept(this);
            try {
                FunctionItem functionItem = (FunctionItem) SymbolTable.root
                                            .get(FunctionItem.STARTKEY + functionDec.getName().toString());
                symbolTable = new SymbolTable();
                functionItem.setFunctionSymbolTable(symbolTable);
                SymbolTable.push(symbolTable);
                functionDec.accept(this);
                SymbolTable.pop();
            }
            catch (ItemNotFoundException ignored) {}
            }
        symbolTable = new SymbolTable();
        SymbolTable.push(symbolTable);
        program.getMain().accept(this);
        SymbolTable.pop();
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
        // check return type for array??
        // check that function type is not void, but has no return statement??

//        Boolean has_ret = funcDeclaration.getStatements().

//        if (!(funcDeclaration.getType() instanceof VoidType) && !funcDeclaration.getStatements().accept(this))
        SymbolTable.pop();
        return null;
    }

//    @Override
//    public Void visit(ArgDeclaration argDeclaration) {
//
//    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        var mainItem = new MainItem(mainDeclaration);
        var mainSymbolTable = new SymbolTable(SymbolTable.top, "main");
        mainItem.setMainItemSymbolTable(mainSymbolTable);

        SymbolTable.push(mainItem.getMainItemSymbolTable());

        for (var stmt : mainDeclaration.getMainStatements()) {
            stmt.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ForloopStmt forloopStmt) {
        try {
            ForLoopItem forLoopItem = (ForLoopItem)  SymbolTable.root.get(FunctionItem.STARTKEY + forloopStmt.toString());
            SymbolTable.push((forLoopItem.getForLoopSymbolTable()));
        } catch (ItemNotFoundException e) {}

        for (Statement stmt: forloopStmt.getStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        Type tl = assignStmt.getLValue().accept(expressionTypeChecker);
        Type tr = assignStmt.getRValue().accept(expressionTypeChecker);

        if (!expressionTypeChecker.sameType(tl, tr)) {
            typeErrors.add(new UnsupportedOperandType(assignStmt.getRValue().getLine(), BinaryOperator.assign.name()));
        }

        if (!expressionTypeChecker.isLvalue(assignStmt.getLValue())) {
            typeErrors.add(new LeftSideNotLValue(assignStmt.getLValue().getLine()));
        }

        return null;
    }

//    @Override
//    public Void visit(ArrayDecStmt arrayDecStmt) {
//        try {
//
//        }
//    }
    @Override
    public Void visit(VarDecStmt varDecStmt) {
        try {
            VariableItem variableItem = new VariableItem(varDecStmt);
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExistsException itemAlreadyExistsException) {
            try {
                VariableItem variableItem = (VariableItem) SymbolTable.top.get(VariableItem.STARTKEY + varDecStmt.getIdentifier().getName());
                variableItem.setType(varDecStmt.getType());
            } catch (ItemNotFoundException ignored) {}
        }

        return null;
    }

//    @Override
//    public Void visit(FunctionCall functionCall) {
//        try {
//                SymbolTable.root.get(FunctionItem.STARTKEY + functionCall.getUFuncName().getName());
//        }
//        catch (ItemNotFoundException e) {}
//
//
//        return null;
//    }

}

