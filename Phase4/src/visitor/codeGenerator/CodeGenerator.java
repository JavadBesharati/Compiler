package visitor.codeGenerator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import ast.node.Program;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.ArrayAccess;
import ast.node.expression.BinaryExpression;
import ast.node.expression.FunctionCall;
import ast.node.expression.Identifier;
import ast.node.expression.UnaryExpression;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.values.IntValue;
import ast.node.statement.AssignStmt;
import ast.node.statement.ReturnStmt;
import ast.node.statement.VarDecStmt;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.MainItem;
import visitor.Visitor;
import ast.node.expression.operators.UnaryOperator;

import java.util.ArrayList;

public class CodeGenerator extends Visitor<Void> {
    public String commands = ""; // byte codes
    private final ArrayList<String> localVars = new ArrayList<>();

    public Void add_commands(String cmd) {
        commands += cmd + "\n";
        return null;
    }

    private Void run_jasmin_code() {
        try (PrintWriter out = new PrintWriter("result.j")) {
            out.println(commands);
        } catch (FileNotFoundException ignored) {}

        try {
            Runtime.getRuntime().exec("java -jar src\\jasmin.jar src\\*.j");
            Runtime.getRuntime().exec("java Main");
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    private Integer find_local_var_index(String str) {
        if (str.indexOf(' ') != -1)
            str = str.substring(str.indexOf(' ') + 1);
        str = str.replace("Identifier ", "");
        return localVars.indexOf(str);
    }

    private boolean is_valid_istore_load_x (String str) {
        return (str.equals("0") || str.equals("1") || str.equals("2") || str.equals("3"));
    }

    private boolean is_valid_iconst_x (String str) {
        return (str.equals("0") || str.equals("1") || str.equals("2") || (str.equals("3"))
                || str.equals("4") || (str.equals("5")));
    }

    @Override
    public Void visit(Program program) {
        add_commands(".class public Main");
        add_commands(".super java/lang/Object");
        for (FuncDeclaration funcDeclaration : program.getFuncs()) {
            funcDeclaration.accept(this);
            localVars.clear();
        }

        localVars.add("args");
        program.getMain().accept(this);
        run_jasmin_code();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration)
    {
        add_commands(".method public static main([Ljava/lang/String;)V");
        add_commands(".limit stack " + 128);
        add_commands(".limit locals " + 128);

//        MainItem main_item = new MainItem(mainDeclaration);
//        SymbolTable.push(main_item.getMainItemSymbolTable());

        for (var stmt : mainDeclaration.getMainStatements()) {
            stmt.accept(this);
        }

        add_commands("return");
        add_commands(".end method");
        return null;
    }

    @Override
    public Void visit(FuncDeclaration functionDeclaration) {
        String functionName = functionDeclaration.getName().getName();
        add_commands(".method static " + functionName + "()I");
        add_commands(".limit stack " + 128);
        add_commands(".limit locals " + 128);

//        try {
//            FunctionItem functionItem = (FunctionItem) SymbolTable.root
//                    .get(FunctionItem.STARTKEY + functionDeclaration.getName().getName());
//            SymbolTable.push((functionItem.getFunctionSymbolTable()));
//        } catch (ItemNotFoundException ignored) {}

        for (var stmt : functionDeclaration.getStatements()) {
            stmt.accept(this);
        }

        add_commands(".end method");
//        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall)
    {
        String functionName = functionCall.getUFuncName().getName();
        add_commands("invokestatic Main/" + functionName + "()I");
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt)
    {
        returnStmt.getExpression().accept(this);
        add_commands("ireturn");
        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt)
    {
        boolean accessible = false;
        if (assignStmt.getLValue() instanceof ArrayAccess)
        {
            String idx = find_local_var_index(assignStmt.getLValue().toString().replace("ArrayAccess ", ""))
                    .toString();
            if (is_valid_istore_load_x(idx))
                add_commands("aload_" + idx);
            else
                add_commands("aload " + idx);
            accessible = true;
        }
        assignStmt.getRValue().accept(this);
        String local_var_index = find_local_var_index(assignStmt.getLValue().toString()).toString();
        if (accessible)
        {
            add_commands("iastore");
            return null;
        }
        if (is_valid_istore_load_x(local_var_index))
            add_commands("istore_" + local_var_index);
        else
            add_commands("istore " + local_var_index);
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt)
    {
        varDecStmt.getInitialExpression().accept(this);
        localVars.add(varDecStmt.getIdentifier().getName());
        String local_var_index = find_local_var_index(varDecStmt.getIdentifier().toString()).toString();
        if (is_valid_istore_load_x(local_var_index))
            add_commands("istore_" + local_var_index);
        else
            add_commands("istore " + local_var_index);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression)
    {
        unaryExpression.getOperand().accept(this);

        if (unaryExpression.getUnaryOperator().equals(UnaryOperator.minus)) {
            add_commands("ineg");
        }

        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression)
    {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        if (operator == BinaryOperator.add)
        {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);
            add_commands("iadd");
        } else if (operator == BinaryOperator.sub)
        {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);
            add_commands("isub");
        } else if (operator == BinaryOperator.mult)
        {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);
            add_commands("imul");
        } else if (operator == BinaryOperator.div)
        {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);
            add_commands("idiv");
        } else if (operator == BinaryOperator.mod)
        {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);
            add_commands("irem");
        }

        return null;
    }

    @Override
    public Void visit(Identifier identifier) {

        String local_var_index = find_local_var_index(identifier.getName()).toString();
        if (is_valid_istore_load_x(local_var_index))
            add_commands("iload_" + local_var_index);
        else
            add_commands("iload " + local_var_index);

        return null;
    }

    @Override
    public Void visit(IntValue value)
    {
        String val = value.toString().replace("IntValue ", "");
        if (is_valid_iconst_x(val)){
            add_commands("iconst_" + val);
        } else {
            add_commands("bipush " + val);
        }
        return null;
    }

}