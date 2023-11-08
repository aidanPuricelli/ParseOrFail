// Generated from DeliverableOne.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeliverableOneParser}.
 */
public interface DeliverableOneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DeliverableOneParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DeliverableOneParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DeliverableOneParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DeliverableOneParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DeliverableOneParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DeliverableOneParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operation(DeliverableOneParser.Arithmetic_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operation(DeliverableOneParser.Arithmetic_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(DeliverableOneParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(DeliverableOneParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(DeliverableOneParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(DeliverableOneParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(DeliverableOneParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(DeliverableOneParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DeliverableOneParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DeliverableOneParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DeliverableOneParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DeliverableOneParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(DeliverableOneParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(DeliverableOneParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliverableOneParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(DeliverableOneParser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliverableOneParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(DeliverableOneParser.Arithmetic_operatorContext ctx);
}