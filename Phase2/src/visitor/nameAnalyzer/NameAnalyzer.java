package visitor.nameAnalyzer;

import ast.node.Program;
import ast.node.statement.VarDecStmt;
import java.util.ArrayList;
import symbolTable.SymbolTable;
import symbolTable.symbolTableItems.VariableItem;


public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

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
        }

        return null;
    }


    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        var functionItem = new FunctionItem(funcDeclaration);
        var functionSymbolTable = new SymbolTable(SymbolTable.top, funcDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(functionSymbolTable);

        // ToDo

        for(boolean done = false; !done; ++i) {
            try {
                SymbolTable.top.put(functionItem);
                done = true;
            } catch (ItemAlreadyExistsException var7) {
                FunctionRedefinition error = new FunctionRedefinition(funcDeclaration.getLine(), funcDeclaration.getName().getName());
                this.nameErrors.add(error);
                String var10001 = funcDeclaration.getName().getName();
                functionItem.setName(var10001 + "$%:)" + i);
            }
        }


        for (ArgDeclaration varDeclaration : funcDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }

        for (var stmt : funcDeclaration.getStatements()) {
            if(stmt instanceof VarDecStmt) {
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
        } catch (ItemAlreadyExistsException var5) {
            VariableRedefinition error = new VariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName());
            this.nameErrors.add(error);
        }

        return null;
    }
}

