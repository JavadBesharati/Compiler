// QueryExpression?
// ArrayAccess?
// Expression?

package visitor.typeAnalyzer;

import ast.node.declaration.ArgDeclaration;
import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import ast.node.expression.values.IntValue;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import ast.type.primitiveType.FloatType;
import ast.type.primitiveType.IntType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.LeftSideNotLValue;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.VarNotDeclared;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

import java.awt.event.WindowStateListener;
import java.util.ArrayList;
import java.util.function.ToIntBiFunction;

public class ExpressionTypeChecker extends Visitor<Type> {

    public ArrayList<CompileError> typeErrors;
    public ExpressionTypeChecker(ArrayList<CompileError> typeErrors){
        this.typeErrors = typeErrors;
    }

    public boolean sameType(Type el1, Type el2) {
        //TODO check the two type are same or not
        // el1 = lValue, el2 = rValue
        // Needed to add any rule for implications, arrays, ...?
        if (el1 instanceof NoType || el2 instanceof NoType) {
            return true;
        }
        if (el1 instanceof BooleanType || el2 instanceof BooleanType) {
            return true;
        }
        if (el1 instanceof FloatType || el2 instanceof FloatType) {
            return true;
        }
        if (el1 instanceof IntType || el2 instanceof IntType) {
            return true;
        }
        return false;
    }

    public boolean isLvalue(Expression expr) {
        //TODO check the expr are lvalue or not
        // Lvalues are arr access by index, identifiers and boolean expression in implications
//        return (expr instanceof Identifier) || (expr instanceof ArrayAccess)
//                || (expr instanceof UnaryExpression); // Doubt: is left side of an implication, unary?
        return (expr instanceof Identifier) || (expr instanceof ArrayAccess);
    }


    @Override
    public Type visit(UnaryExpression unaryExpression) {

        Expression uExpr = unaryExpression.getOperand();
        Type expType = uExpr.accept(this);
        UnaryOperator operator = unaryExpression.getUnaryOperator();

        //TODO check errors and return the type
        if (operator.equals(UnaryOperator.minus)) {
            if (expType instanceof IntType) {
                return new IntType();
            }
            if (expType instanceof FloatType) {
                return new FloatType();
            }
        }
        if (operator.equals(UnaryOperator.plus)) {
            if (expType instanceof IntType) {
                return new IntType();
            }
            if (expType instanceof FloatType) {
                return new FloatType();
            }
        }
        if (operator.equals(UnaryOperator.not)) {
            if (expType instanceof BooleanType) {
                return new BooleanType();
            }
        }
//        former code:
//        if(expType instanceof IntType) {
//            return new IntType();
//        }
//        else {
//            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
//            return new NoType();
//        }
        if (!(expType instanceof NoType)) {
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
        }

        return new NoType();
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        // l = left expression
        // r = right expression
        Expression l = binaryExpression.getLeft();
        Expression r = binaryExpression.getRight();
        // tl = left expression type
        // tr = right expression type
        Type tl = l.accept(this);
        Type tr = r.accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();
        // TODO:
        // &&, ||:
        if (operator.equals(BinaryOperator.and) || operator.equals(BinaryOperator.or)) {
            if (tl instanceof BooleanType && tr instanceof BooleanType) {
                return new BooleanType();
            }
            if ((tl instanceof NoType && tr instanceof BooleanType) || (tl instanceof BooleanType && tr instanceof NoType)
                    || (tl instanceof NoType && tr instanceof NoType)) {
                return new NoType();
            }
        }

        // =
        else if (operator.equals(BinaryOperator.eq)) {
            // what about array? No array type has been declared!
            if (!sameType(tl, tr)) {
                typeErrors.add(new UnsupportedOperandType(r.getLine(), operator.name()));
                return new NoType();
            }
            else {
                if (tl instanceof  NoType || tr instanceof  NoType) {
                    return new NoType();
                }
                else {
                    return new BooleanType();
                }
            }
        }

        // >, <, <=, >=:
        else if (operator.equals(BinaryOperator.lt) || operator.equals(BinaryOperator.gt) ||
            (operator.equals(BinaryOperator.lte)) || (operator.equals(BinaryOperator.gte))) {
            if (tl instanceof IntType && tr instanceof IntType) {
                return new BooleanType();
            }
            if (tl instanceof FloatType && tr instanceof FloatType) {
                return new BooleanType();
            }
            // Can we also compare Float with int? No, as Ali Imam Zadeh told
            if (tl instanceof NoType && (tr instanceof FloatType || tr instanceof IntType)
                || ((tl instanceof FloatType || tl instanceof IntType) && tr instanceof NoType)
                || (tl instanceof NoType && tr instanceof NoType)) {
                return new NoType();
            }
        }
        // ==, != :
        else if (operator.equals(BinaryOperator.assign) || operator.equals(BinaryOperator.neq)) {
            if (!sameType(tl, tr)) {
                typeErrors.add(new UnsupportedOperandType(r.getLine(), operator.name()));
                return new NoType();
            }
            if (!isLvalue(l)) {
                typeErrors.add(new LeftSideNotLValue(l.getLine()));
                return new NoType();
            }
            return tr;
        }

        else { // *, /, +, -, %
            if (tl instanceof IntType && tr instanceof IntType) {
                return new IntType();
            }
            if ((tl instanceof NoType && tr instanceof IntType) ||
            (tl instanceof IntType && tr instanceof NoType) ||
                    (tl instanceof NoType && tr instanceof NoType)) {
                return new NoType();
            }
        }

        typeErrors.add(new UnsupportedOperandType(l.getLine(), operator.name()));
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        // TODO:
        // what about arrays? Is it necessary to handle them too?
        try {
            VariableItem varItem = (VariableItem) SymbolTable.top.get(VariableItem.STARTKEY + identifier.getName());
            return varItem.getType();
        } catch (ItemNotFoundException itemNotFoundException) {
            typeErrors.add(new VarNotDeclared(identifier.getLine(), identifier.getName()));
            return new NoType();
        }
    }

    @Override
    public Type visit(FunctionCall functionCall) {
        // TODO:
        try
        {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.get(FunctionItem.STARTKEY +
                                                            (Identifier) functionCall.getUFuncName());
             return functionItem.getHandlerDeclaration().getType();
        } catch (ItemNotFoundException itemNotFoundException) {
            typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.getUFuncName().toString()));
            return new NoType();
        }
    }

    @Override
    public Type visit(IntValue value) {
        return new IntType();
    }

    @Override
    public Type visit(FloatType value) {
        return new FloatType();
    }

    @Override
    public Type visit(BooleanType value) {
        return new BooleanType();
    }
}
