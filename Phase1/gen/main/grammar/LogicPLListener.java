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
	 * Enter a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LogicPLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LogicPLParser.FunctionContext ctx);
}