// Generated from D:/JavaPr/APIS\test.g4 by ANTLR 4.9.2
package com.antr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(testParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(testParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#arif}.
	 * @param ctx the parse tree
	 */
	void enterArif(testParser.ArifContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#arif}.
	 * @param ctx the parse tree
	 */
	void exitArif(testParser.ArifContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ifHeader}.
	 * @param ctx the parse tree
	 */
	void enterIfHeader(testParser.IfHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ifHeader}.
	 * @param ctx the parse tree
	 */
	void exitIfHeader(testParser.IfHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(testParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(testParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(testParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(testParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(testParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(testParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expressionMath}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMath(testParser.ExpressionMathContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expressionMath}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMath(testParser.ExpressionMathContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#br_expr}.
	 * @param ctx the parse tree
	 */
	void enterBr_expr(testParser.Br_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#br_expr}.
	 * @param ctx the parse tree
	 */
	void exitBr_expr(testParser.Br_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(testParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(testParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(testParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(testParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(testParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(testParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHeader(testParser.FunctionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHeader(testParser.FunctionHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(testParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(testParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expr(testParser.Print_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expr(testParser.Print_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void enterWhileCycle(testParser.WhileCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void exitWhileCycle(testParser.WhileCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#whileHeader}.
	 * @param ctx the parse tree
	 */
	void enterWhileHeader(testParser.WhileHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#whileHeader}.
	 * @param ctx the parse tree
	 */
	void exitWhileHeader(testParser.WhileHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(testParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(testParser.BoolExprContext ctx);
}