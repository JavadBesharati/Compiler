// Generated from E:/Uni/Uni06/3. compiler/2. CAs/Compiler-Projects-UT-Spring-2023/Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(LogicPLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LogicPLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LogicPLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(LogicPLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#variable_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declare(LogicPLParser.Variable_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LogicPLParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LogicPLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LogicPLParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(LogicPLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication(LogicPLParser.ImplicationContext ctx);
}