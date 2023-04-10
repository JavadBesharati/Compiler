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
	 * Enter a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(LogicPLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(LogicPLParser.MainContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LogicPLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LogicPLParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LogicPLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LogicPLParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(LogicPLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(LogicPLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(LogicPLParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(LogicPLParser.ImplicationContext ctx);
}