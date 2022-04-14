// Generated from D:/JavaPr/APIS\test.g4 by ANTLR 4.9.2
package com.antr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(testParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(testParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#arif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArif(testParser.ArifContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(testParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#ifHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfHeader(testParser.IfHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(testParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(testParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(testParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#expressionMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMath(testParser.ExpressionMathContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#br_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBr_expr(testParser.Br_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_op(testParser.Compare_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(testParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(testParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHeader(testParser.FunctionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(testParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expr(testParser.Print_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#whileCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCycle(testParser.WhileCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#whileHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileHeader(testParser.WhileHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(testParser.BoolExprContext ctx);
}