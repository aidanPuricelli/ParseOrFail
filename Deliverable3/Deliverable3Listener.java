// Generated from Deliverable3.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Deliverable3Parser}.
 */
public interface Deliverable3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Deliverable3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Deliverable3Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(Deliverable3Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(Deliverable3Parser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#controlStructure}.
	 * @param ctx the parse tree
	 */
	void enterControlStructure(Deliverable3Parser.ControlStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#controlStructure}.
	 * @param ctx the parse tree
	 */
	void exitControlStructure(Deliverable3Parser.ControlStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Deliverable3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Deliverable3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Deliverable3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Deliverable3Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(Deliverable3Parser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(Deliverable3Parser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(Deliverable3Parser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(Deliverable3Parser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Deliverable3Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Deliverable3Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Deliverable3Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Deliverable3Parser.AssignmentExpressionContext ctx);
}