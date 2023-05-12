//69
//32
//set name for fun, var
package visitor.nameAnalyzer;
import ast.node.Program;
import ast.node.declaration.ArgDeclaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.expression.QueryExpression;
import ast.node.statement.*;
import compileError.CompileError;
import compileError.Name.FunctionRedefinition;
import compileError.Name.VariableRedefinition;
import java.util.ArrayList;
import java.util.Iterator;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.symbolTableItems.ArrayItem;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();
    private static int i = 0;
    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);
        for (FuncDeclaration functionDeclaration : program.getFuncs()) {
            functionDeclaration.accept(this);
        }
        for (var stmt : program.getMain().getMainStatements()) {
            if(stmt instanceof VarDecStmt) {
                stmt.accept(this);
            }
            if(stmt instanceof ArrayDecStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof ForloopStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof  ImplicationStmt) {
                stmt.accept(this);
            }
        }
        return null;
    }

    // redefinition for args:
    @Override
    public Void visit(ArgDeclaration argDeclaration) {
        var argItem = new VariableItem(argDeclaration.getIdentifier().getName(), argDeclaration.getType());
        try {
            SymbolTable.top.put(argItem);
        } catch (ItemAlreadyExistsException Error)
        {
            VariableRedefinition error = new VariableRedefinition(argDeclaration.getLine(), argDeclaration.getIdentifier().getName());
            this.nameErrors.add(error);
            //set name:
        }

        return null;
    }
    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        var functionItem = new FunctionItem(funcDeclaration);
        var functionSymbolTable = new SymbolTable(SymbolTable.top, funcDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(functionSymbolTable);
        // ToDo

        for(boolean done = false; !done; i++ ) {
            try {
                // add args
                SymbolTable.top.put(functionItem);
                done = true;
            } catch (ItemAlreadyExistsException Error) {
                FunctionRedefinition error = new FunctionRedefinition(funcDeclaration.getLine(), funcDeclaration.getName().getName());
                this.nameErrors.add(error);
                //set new name: (change.....)
                String var10001= funcDeclaration.getName().getName();
                functionItem.setName(var10001 + "$%:)" + i );
            }
        }
        SymbolTable.push(functionSymbolTable);
        for (ArgDeclaration varDeclaration : funcDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }
        for (var stmt : funcDeclaration.getStatements()) {
            if(stmt instanceof VarDecStmt) {
                stmt.accept(this);
            }
            if(stmt instanceof ArrayDecStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof ForloopStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof  ImplicationStmt) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
        return null;
    }
//    @Override
//    public Void visit(QueryExpression queryExpression) {
        // TO DO>>>
//        return null;
//    }
    @Override
    public Void visit(ArrayDecStmt arrayDecStmt) {
        // TO DO>>>
        var arrayItem = new ArrayItem(arrayDecStmt.getIdentifier().getName(), arrayDecStmt.getType());
        try {
            SymbolTable.top.put(arrayItem);
        } catch (ItemAlreadyExistsException Error)
        {
            VariableRedefinition error = new VariableRedefinition(arrayDecStmt.getLine(), arrayDecStmt.getIdentifier().getName());
            this.nameErrors.add(error);
            //set name:
        }
        return null;
    }
    @Override
    public Void visit(ForloopStmt forloopStmt) {
        // TO DO>>>
        var forSymbolTable = new SymbolTable(SymbolTable.top, forloopStmt.toString());
        SymbolTable.push(forSymbolTable);
        for (var stmt : forloopStmt.getStatements()) {
            if(stmt instanceof VarDecStmt) {
                stmt.accept(this);
            }
            if(stmt instanceof ArrayDecStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof ForloopStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof  ImplicationStmt) {
                stmt.accept(this);
            }
        }
        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(ImplicationStmt implicationStmt) {
        // TO DO>>>
        var forSymbolTable = new SymbolTable(SymbolTable.top, implicationStmt.toString());
        SymbolTable.push(forSymbolTable);
        for (var stmt : implicationStmt.getStatements()) {
            if(stmt instanceof VarDecStmt) {
                stmt.accept(this);
            }
            if(stmt instanceof ArrayDecStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof ForloopStmt) {
                stmt.accept(this);
            }
            if (stmt instanceof  ImplicationStmt) {
                stmt.accept(this);
            }
        }
        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(VarDecStmt varDeclaration) {
        var variableItem = new VariableItem(varDeclaration.getIdentifier().getName(), varDeclaration.getType());
        // ToDo
        try {
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExistsException Error)
        {
            VariableRedefinition error = new VariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName());
            this.nameErrors.add(error);
            //set name:
        }
        return null;
    }

}

