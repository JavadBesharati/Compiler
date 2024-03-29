// Generated from E:/Uni/Uni06/3. compiler/2. CAs/Compiler-Projects-UT-Spring-2023/phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicPLParser}.
 */
public interface LogicPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#logicPL}.
	 * @param ctx the parse tree
	 */
	void enterLogicPL(LogicPLParser.LogicPLContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#logicPL}.
	 * @param ctx the parse tree
	 */
	void exitLogicPL(LogicPLParser.LogicPLContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#main_call}.
	 * @param ctx the parse tree
	 */
	void enterMain_call(LogicPLParser.Main_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#main_call}.
	 * @param ctx the parse tree
	 */
	void exitMain_call(LogicPLParser.Main_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#main_body}.
	 * @param ctx the parse tree
	 */
	void enterMain_body(LogicPLParser.Main_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#main_body}.
	 * @param ctx the parse tree
	 */
	void exitMain_body(LogicPLParser.Main_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LogicPLParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LogicPLParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#for_structure}.
	 * @param ctx the parse tree
	 */
	void enterFor_structure(LogicPLParser.For_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#for_structure}.
	 * @param ctx the parse tree
	 */
	void exitFor_structure(LogicPLParser.For_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#for_body}.
	 * @param ctx the parse tree
	 */
	void enterFor_body(LogicPLParser.For_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#for_body}.
	 * @param ctx the parse tree
	 */
	void exitFor_body(LogicPLParser.For_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(LogicPLParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(LogicPLParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(LogicPLParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(LogicPLParser.Array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements(LogicPLParser.Array_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements(LogicPLParser.Array_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(LogicPLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(LogicPLParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_declaration(LogicPLParser.Int_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_declaration(LogicPLParser.Int_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloat_declaration(LogicPLParser.Float_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloat_declaration(LogicPLParser.Float_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_declaration(LogicPLParser.Boolean_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_declaration(LogicPLParser.Boolean_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#chane_var}.
	 * @param ctx the parse tree
	 */
	void enterChane_var(LogicPLParser.Chane_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#chane_var}.
	 * @param ctx the parse tree
	 */
	void exitChane_var(LogicPLParser.Chane_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LogicPLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LogicPLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(LogicPLParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(LogicPLParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(LogicPLParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(LogicPLParser.Print_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expression(LogicPLParser.Assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expression(LogicPLParser.Assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#assign_expression2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expression2(LogicPLParser.Assign_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#assign_expression2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expression2(LogicPLParser.Assign_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(LogicPLParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(LogicPLParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#or_expression2}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression2(LogicPLParser.Or_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#or_expression2}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression2(LogicPLParser.Or_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(LogicPLParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(LogicPLParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#and_expression2}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression2(LogicPLParser.And_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#and_expression2}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression2(LogicPLParser.And_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#relational2_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational2_expression(LogicPLParser.Relational2_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#relational2_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational2_expression(LogicPLParser.Relational2_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#relational2_expression2}.
	 * @param ctx the parse tree
	 */
	void enterRelational2_expression2(LogicPLParser.Relational2_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#relational2_expression2}.
	 * @param ctx the parse tree
	 */
	void exitRelational2_expression2(LogicPLParser.Relational2_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#relational1_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational1_expression(LogicPLParser.Relational1_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#relational1_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational1_expression(LogicPLParser.Relational1_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#relational1_expression2}.
	 * @param ctx the parse tree
	 */
	void enterRelational1_expression2(LogicPLParser.Relational1_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#relational1_expression2}.
	 * @param ctx the parse tree
	 */
	void exitRelational1_expression2(LogicPLParser.Relational1_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arithmatic2_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmatic2_expression(LogicPLParser.Arithmatic2_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arithmatic2_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmatic2_expression(LogicPLParser.Arithmatic2_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arithmatic2_expression2}.
	 * @param ctx the parse tree
	 */
	void enterArithmatic2_expression2(LogicPLParser.Arithmatic2_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arithmatic2_expression2}.
	 * @param ctx the parse tree
	 */
	void exitArithmatic2_expression2(LogicPLParser.Arithmatic2_expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arithmatic1_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmatic1_expression(LogicPLParser.Arithmatic1_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arithmatic1_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmatic1_expression(LogicPLParser.Arithmatic1_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(LogicPLParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(LogicPLParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#predicate_expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicate_expression(LogicPLParser.Predicate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#predicate_expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicate_expression(LogicPLParser.Predicate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#query_1}.
	 * @param ctx the parse tree
	 */
	void enterQuery_1(LogicPLParser.Query_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#query_1}.
	 * @param ctx the parse tree
	 */
	void exitQuery_1(LogicPLParser.Query_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#query_2}.
	 * @param ctx the parse tree
	 */
	void enterQuery_2(LogicPLParser.Query_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#query_2}.
	 * @param ctx the parse tree
	 */
	void exitQuery_2(LogicPLParser.Query_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#implication_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplication_expression(LogicPLParser.Implication_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#implication_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplication_expression(LogicPLParser.Implication_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#unary_value}.
	 * @param ctx the parse tree
	 */
	void enterUnary_value(LogicPLParser.Unary_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#unary_value}.
	 * @param ctx the parse tree
	 */
	void exitUnary_value(LogicPLParser.Unary_valueContext ctx);
}