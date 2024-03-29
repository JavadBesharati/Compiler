// Generated from E:/Uni/Uni06/3. compiler/2. CAs/Compiler-Projects-UT-Spring-2023/phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicPLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicPLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#logicPL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicPL(LogicPLParser.LogicPLContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#main_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_call(LogicPLParser.Main_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#main_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_body(LogicPLParser.Main_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LogicPLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#for_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_structure(LogicPLParser.For_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#for_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_body(LogicPLParser.For_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(LogicPLParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(LogicPLParser.Array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#array_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements(LogicPLParser.Array_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(LogicPLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#int_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_declaration(LogicPLParser.Int_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#float_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_declaration(LogicPLParser.Float_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#boolean_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_declaration(LogicPLParser.Boolean_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#chane_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChane_var(LogicPLParser.Chane_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LogicPLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return(LogicPLParser.Function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#print_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expression(LogicPLParser.Print_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#assign_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expression(LogicPLParser.Assign_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#assign_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expression2(LogicPLParser.Assign_expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(LogicPLParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#or_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression2(LogicPLParser.Or_expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(LogicPLParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#and_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression2(LogicPLParser.And_expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#relational2_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational2_expression(LogicPLParser.Relational2_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#relational2_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational2_expression2(LogicPLParser.Relational2_expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#relational1_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational1_expression(LogicPLParser.Relational1_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#relational1_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational1_expression2(LogicPLParser.Relational1_expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arithmatic2_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmatic2_expression(LogicPLParser.Arithmatic2_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arithmatic2_expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmatic2_expression2(LogicPLParser.Arithmatic2_expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arithmatic1_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmatic1_expression(LogicPLParser.Arithmatic1_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(LogicPLParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#predicate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate_expression(LogicPLParser.Predicate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#query_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_1(LogicPLParser.Query_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#query_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_2(LogicPLParser.Query_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#implication_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication_expression(LogicPLParser.Implication_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#unary_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_value(LogicPLParser.Unary_valueContext ctx);
}