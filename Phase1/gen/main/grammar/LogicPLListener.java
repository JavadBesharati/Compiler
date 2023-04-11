// Generated from E:/Uni/Uni06/3. compiler/2. CAs/Compiler-Projects-UT-Spring-2023/Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link LogicPLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LogicPLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LogicPLParser.BodyContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#function_declare}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declare(LogicPLParser.Function_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#function_declare}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declare(LogicPLParser.Function_declareContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LogicPLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LogicPLParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#array_declare}.
	 * @param ctx the parse tree
	 */
	void enterArray_declare(LogicPLParser.Array_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#array_declare}.
	 * @param ctx the parse tree
	 */
	void exitArray_declare(LogicPLParser.Array_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#element_declare}.
	 * @param ctx the parse tree
	 */
	void enterElement_declare(LogicPLParser.Element_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#element_declare}.
	 * @param ctx the parse tree
	 */
	void exitElement_declare(LogicPLParser.Element_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#variable_declare}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declare(LogicPLParser.Variable_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#variable_declare}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declare(LogicPLParser.Variable_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#change_variale}.
	 * @param ctx the parse tree
	 */
	void enterChange_variale(LogicPLParser.Change_varialeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#change_variale}.
	 * @param ctx the parse tree
	 */
	void exitChange_variale(LogicPLParser.Change_varialeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(LogicPLParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(LogicPLParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#print_call}.
	 * @param ctx the parse tree
	 */
	void enterPrint_call(LogicPLParser.Print_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#print_call}.
	 * @param ctx the parse tree
	 */
	void exitPrint_call(LogicPLParser.Print_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(LogicPLParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(LogicPLParser.InputsContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(LogicPLParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(LogicPLParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#predicate_statement}.
	 * @param ctx the parse tree
	 */
	void enterPredicate_statement(LogicPLParser.Predicate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#predicate_statement}.
	 * @param ctx the parse tree
	 */
	void exitPredicate_statement(LogicPLParser.Predicate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(LogicPLParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(LogicPLParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#implication_statement}.
	 * @param ctx the parse tree
	 */
	void enterImplication_statement(LogicPLParser.Implication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#implication_statement}.
	 * @param ctx the parse tree
	 */
	void exitImplication_statement(LogicPLParser.Implication_statementContext ctx);
}