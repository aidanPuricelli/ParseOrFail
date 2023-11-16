// Generated from Deliverable2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Deliverable2Parser}.
 */
public interface Deliverable2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Deliverable2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Deliverable2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Deliverable2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Deliverable2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Deliverable2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Deliverable2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Deliverable2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Deliverable2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(Deliverable2Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(Deliverable2Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(Deliverable2Parser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(Deliverable2Parser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Deliverable2Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Deliverable2Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(Deliverable2Parser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(Deliverable2Parser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(Deliverable2Parser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(Deliverable2Parser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Deliverable2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Deliverable2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#compoundAssign}.
	 * @param ctx the parse tree
	 */
	void enterCompoundAssign(Deliverable2Parser.CompoundAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#compoundAssign}.
	 * @param ctx the parse tree
	 */
	void exitCompoundAssign(Deliverable2Parser.CompoundAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(Deliverable2Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(Deliverable2Parser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable2Parser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(Deliverable2Parser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable2Parser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(Deliverable2Parser.BooleanOperatorContext ctx);
}