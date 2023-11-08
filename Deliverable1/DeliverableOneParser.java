// Generated from DeliverableOne.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DeliverableOneParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, NUMBER=16, INT=17, 
		FLOAT=18, STRING=19, BOOLEAN=20, CHAR=21, ASSIGN=22, WS=23;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_assignment = 2, RULE_arithmetic_operation = 3, 
		RULE_array_assignment = 4, RULE_variable_declaration = 5, RULE_values = 6, 
		RULE_value = 7, RULE_expression = 8, RULE_assignment_operator = 9, RULE_arithmetic_operator = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "assignment", "arithmetic_operation", "array_assignment", 
			"variable_declaration", "values", "value", "expression", "assignment_operator", 
			"arithmetic_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "','", "'('", "')'", "'+='", "'-='", "'*='", "'/='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, null, null, null, 
			null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUMBER", "INT", "FLOAT", "STRING", "BOOLEAN", 
			"CHAR", "ASSIGN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DeliverableOne.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DeliverableOneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DeliverableOneParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3768336L) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				arithmetic_operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				array_assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				variable_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DeliverableOneParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DeliverableOneParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ID);
				setState(37);
				match(ASSIGN);
				setState(38);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(ID);
				setState(40);
				assignment_operator();
				setState(41);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_operationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public Arithmetic_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterArithmetic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitArithmetic_operation(this);
		}
	}

	public final Arithmetic_operationContext arithmetic_operation() throws RecognitionException {
		Arithmetic_operationContext _localctx = new Arithmetic_operationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmetic_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			expression(0);
			setState(46);
			arithmetic_operator();
			setState(47);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DeliverableOneParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DeliverableOneParser.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitArray_assignment(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(ASSIGN);
			setState(51);
			match(T__0);
			setState(52);
			values();
			setState(53);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DeliverableOneParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DeliverableOneParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			setState(56);
			match(ASSIGN);
			setState(57);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			value();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(60);
				match(T__2);
				setState(61);
				value();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DeliverableOneParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DeliverableOneParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(DeliverableOneParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(DeliverableOneParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(DeliverableOneParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3768320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case CHAR:
				{
				setState(70);
				value();
				}
				break;
			case T__3:
				{
				setState(71);
				match(T__3);
				setState(72);
				expression(0);
				setState(73);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(77);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(78);
					arithmetic_operator();
					setState(79);
					expression(2);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeliverableOneListener ) ((DeliverableOneListener)listener).exitArithmetic_operator(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006?\b\u0006\n\u0006\f\u0006B\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bL"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bR\b\b\n\b\f\bU\t\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0001\u0010\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0002\u0000\u000f\u0010"+
		"\u0013\u0015\u0001\u0000\u0006\t\u0001\u0000\n\u000eW\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004+\u0001\u0000"+
		"\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000"+
		"\n7\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000eC\u0001\u0000"+
		"\u0000\u0000\u0010K\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000"+
		"\u0014X\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e"+
		"#\u0003\u0004\u0002\u0000\u001f#\u0003\u0006\u0003\u0000 #\u0003\b\u0004"+
		"\u0000!#\u0003\n\u0005\u0000\"\u001e\u0001\u0000\u0000\u0000\"\u001f\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000"+
		"#\u0003\u0001\u0000\u0000\u0000$%\u0005\u000f\u0000\u0000%&\u0005\u0016"+
		"\u0000\u0000&,\u0003\u0010\b\u0000\'(\u0005\u000f\u0000\u0000()\u0003"+
		"\u0012\t\u0000)*\u0003\u0010\b\u0000*,\u0001\u0000\u0000\u0000+$\u0001"+
		"\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000,\u0005\u0001\u0000\u0000"+
		"\u0000-.\u0003\u0010\b\u0000./\u0003\u0014\n\u0000/0\u0003\u0010\b\u0000"+
		"0\u0007\u0001\u0000\u0000\u000012\u0005\u000f\u0000\u000023\u0005\u0016"+
		"\u0000\u000034\u0005\u0001\u0000\u000045\u0003\f\u0006\u000056\u0005\u0002"+
		"\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005\u000f\u0000\u000089\u0005"+
		"\u0016\u0000\u00009:\u0003\u000e\u0007\u0000:\u000b\u0001\u0000\u0000"+
		"\u0000;@\u0003\u000e\u0007\u0000<=\u0005\u0003\u0000\u0000=?\u0003\u000e"+
		"\u0007\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\r\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000CD\u0007\u0000\u0000\u0000D\u000f\u0001\u0000"+
		"\u0000\u0000EF\u0006\b\uffff\uffff\u0000FL\u0003\u000e\u0007\u0000GH\u0005"+
		"\u0004\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0005\u0005\u0000\u0000JL\u0001"+
		"\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000"+
		"LS\u0001\u0000\u0000\u0000MN\n\u0001\u0000\u0000NO\u0003\u0014\n\u0000"+
		"OP\u0003\u0010\b\u0002PR\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\u0011\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0007"+
		"\u0001\u0000\u0000W\u0013\u0001\u0000\u0000\u0000XY\u0007\u0002\u0000"+
		"\u0000Y\u0015\u0001\u0000\u0000\u0000\u0006\u0019\"+@KS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}