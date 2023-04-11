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
	 * Visit a parse tree produced by {@link LogicPLParser#main_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_call(LogicPLParser.Main_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LogicPLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LogicPLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#function_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declare(LogicPLParser.Function_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(LogicPLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(LogicPLParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#array_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declare(LogicPLParser.Array_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#element_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_declare(LogicPLParser.Element_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#variable_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declare(LogicPLParser.Variable_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#change_variale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_variale(LogicPLParser.Change_varialeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LogicPLParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#print_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_call(LogicPLParser.Print_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(LogicPLParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LogicPLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LogicPLParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#predicate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate_statement(LogicPLParser.Predicate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(LogicPLParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#implication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication_statement(LogicPLParser.Implication_statementContext ctx);
}