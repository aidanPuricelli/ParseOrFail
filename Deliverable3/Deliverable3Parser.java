// Generated from Deliverable3.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Deliverable3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IF=10, ELSE_IF=11, ELSE=12, WHILE=13, FOR=14, LOGIC_NOT=15, LOGIC_AND=16, 
		LOGIC_OR=17, BOOLEAN=18, RANGE=19, ID=20, LITERAL=21, CHAR=22, ARRAY=23, 
		STRING=24, NUMBER=25, INT=26, FLOAT=27, COMPOUND=28, COMMENT=29, INDENT=30, 
		WS=31, NEWLINE=32, LEFT_PARENTH=33, RIGHT_PARENTH=34, RANGEFUNC=35;
	public static final int
		RULE_program = 0, RULE_comparisonOperator = 1, RULE_controlStructure = 2, 
		RULE_block = 3, RULE_variable = 4, RULE_logicalExpression = 5, RULE_arithmeticExpression = 6, 
		RULE_assignmentExpression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "comparisonOperator", "controlStructure", "block", "variable", 
			"logicalExpression", "arithmeticExpression", "assignmentExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'in'", "':'", "'='", 
			"'if'", "'elif'", "'else'", "'while'", "'for'", "'not'", "'and'", "'or'", 
			null, "'range'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "IF", "ELSE_IF", 
			"ELSE", "WHILE", "FOR", "LOGIC_NOT", "LOGIC_AND", "LOGIC_OR", "BOOLEAN", 
			"RANGE", "ID", "LITERAL", "CHAR", "ARRAY", "STRING", "NUMBER", "INT", 
			"FLOAT", "COMPOUND", "COMMENT", "INDENT", "WS", "NEWLINE", "LEFT_PARENTH", 
			"RIGHT_PARENTH", "RANGEFUNC"
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
	public String getGrammarFileName() { return "Deliverable3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Deliverable3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Deliverable3Parser.EOF, 0); }
		public List<ControlStructureContext> controlStructure() {
			return getRuleContexts(ControlStructureContext.class);
		}
		public ControlStructureContext controlStructure(int i) {
			return getRuleContext(ControlStructureContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(Deliverable3Parser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(Deliverable3Parser.COMMENT, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537951232L) != 0)) {
				{
				setState(19);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case ELSE_IF:
				case ELSE:
				case WHILE:
				case FOR:
					{
					setState(16);
					controlStructure();
					}
					break;
				case ID:
					{
					setState(17);
					variable();
					}
					break;
				case COMMENT:
					{
					setState(18);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) ) {
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
	public static class ControlStructureContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Deliverable3Parser.NEWLINE, 0); }
		public TerminalNode ELSE() { return getToken(Deliverable3Parser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(Deliverable3Parser.WHILE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode FOR() { return getToken(Deliverable3Parser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(Deliverable3Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Deliverable3Parser.ID, i);
		}
		public TerminalNode RANGEFUNC() { return getToken(Deliverable3Parser.RANGEFUNC, 0); }
		public List<TerminalNode> INDENT() { return getTokens(Deliverable3Parser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(Deliverable3Parser.INDENT, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ControlStructureContext> controlStructure() {
			return getRuleContexts(ControlStructureContext.class);
		}
		public ControlStructureContext controlStructure(int i) {
			return getRuleContext(ControlStructureContext.class,i);
		}
		public TerminalNode IF() { return getToken(Deliverable3Parser.IF, 0); }
		public TerminalNode ELSE_IF() { return getToken(Deliverable3Parser.ELSE_IF, 0); }
		public List<TerminalNode> WS() { return getTokens(Deliverable3Parser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Deliverable3Parser.WS, i);
		}
		public ControlStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterControlStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitControlStructure(this);
		}
	}

	public final ControlStructureContext controlStructure() throws RecognitionException {
		ControlStructureContext _localctx = new ControlStructureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controlStructure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case ELSE_IF:
				{
				{
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==IF || _la==ELSE_IF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(29);
						match(WS);
						}
						} 
					}
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(35);
				logicalExpression();
				}
				}
				break;
			case ELSE:
				{
				setState(36);
				match(ELSE);
				}
				break;
			case WHILE:
				{
				setState(37);
				match(WHILE);
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(38);
						match(WS);
						}
						} 
					}
					setState(43);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(44);
				logicalExpression();
				}
				break;
			case FOR:
				{
				setState(45);
				match(FOR);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(46);
					match(WS);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(ID);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(53);
					match(WS);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__6);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(60);
					match(WS);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==RANGEFUNC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(69);
			match(T__7);
			setState(70);
			match(NEWLINE);
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(71);
						match(INDENT);
						setState(72);
						block();
						}
						break;
					case 2:
						{
						setState(73);
						match(INDENT);
						setState(74);
						controlStructure();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class BlockContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ControlStructureContext controlStructure() {
			return getRuleContext(ControlStructureContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(Deliverable3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Deliverable3Parser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(79);
				variable();
				}
				break;
			case 2:
				{
				setState(80);
				controlStructure();
				}
				break;
			case 3:
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(81);
					match(NEWLINE);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Deliverable3Parser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(Deliverable3Parser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Deliverable3Parser.WS, i);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(Deliverable3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Deliverable3Parser.NEWLINE, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(WS);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(96);
				assignmentExpression();
				}
				break;
			case 2:
				{
				setState(97);
				arithmeticExpression();
				}
				break;
			}
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(NEWLINE);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(Deliverable3Parser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Deliverable3Parser.WS, i);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode LEFT_PARENTH() { return getToken(Deliverable3Parser.LEFT_PARENTH, 0); }
		public TerminalNode RIGHT_PARENTH() { return getToken(Deliverable3Parser.RIGHT_PARENTH, 0); }
		public TerminalNode LOGIC_AND() { return getToken(Deliverable3Parser.LOGIC_AND, 0); }
		public TerminalNode LOGIC_OR() { return getToken(Deliverable3Parser.LOGIC_OR, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(Deliverable3Parser.LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(Deliverable3Parser.BOOLEAN, 0); }
		public List<TerminalNode> LOGIC_NOT() { return getTokens(Deliverable3Parser.LOGIC_NOT); }
		public TerminalNode LOGIC_NOT(int i) {
			return getToken(Deliverable3Parser.LOGIC_NOT, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logicalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PARENTH:
				{
				{
				setState(106);
				match(LEFT_PARENTH);
				setState(107);
				logicalExpression();
				setState(108);
				match(RIGHT_PARENTH);
				}
				}
				break;
			case LOGIC_NOT:
			case BOOLEAN:
			case ID:
			case LITERAL:
			case WS:
				{
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_NOT) {
					{
					{
					setState(110);
					match(LOGIC_NOT);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(116);
					match(WS);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(122);
					variable();
					}
					break;
				case LITERAL:
					{
					setState(123);
					match(LITERAL);
					}
					break;
				case BOOLEAN:
					{
					setState(124);
					match(BOOLEAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					match(WS);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				{
				{
				setState(135);
				comparisonOperator();
				setState(136);
				logicalExpression();
				}
				}
				break;
			case LOGIC_AND:
			case LOGIC_OR:
				{
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==LOGIC_AND || _la==LOGIC_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						match(WS);
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(145);
				logicalExpression();
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(146);
						match(WS);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case T__7:
			case WS:
			case RIGHT_PARENTH:
				break;
			default:
				break;
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
	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL() { return getTokens(Deliverable3Parser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(Deliverable3Parser.LITERAL, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMPOUND() { return getTokens(Deliverable3Parser.COMPOUND); }
		public TerminalNode COMPOUND(int i) {
			return getToken(Deliverable3Parser.COMPOUND, i);
		}
		public List<TerminalNode> WS() { return getTokens(Deliverable3Parser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Deliverable3Parser.WS, i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitArithmeticExpression(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arithmeticExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				{
				setState(154);
				match(LITERAL);
				}
				break;
			case ID:
				{
				setState(155);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(158);
						match(WS);
						}
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(164);
					match(COMPOUND);
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__8) {
						{
						setState(165);
						match(T__8);
						}
					}

					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(168);
						match(WS);
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LITERAL:
						{
						setState(174);
						match(LITERAL);
						}
						break;
					case ID:
						{
						setState(175);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(Deliverable3Parser.LITERAL, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(Deliverable3Parser.ARRAY, 0); }
		public TerminalNode BOOLEAN() { return getToken(Deliverable3Parser.BOOLEAN, 0); }
		public TerminalNode COMPOUND() { return getToken(Deliverable3Parser.COMPOUND, 0); }
		public List<TerminalNode> WS() { return getTokens(Deliverable3Parser.WS); }
		public TerminalNode WS(int i) {
			return getToken(Deliverable3Parser.WS, i);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(Deliverable3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Deliverable3Parser.NEWLINE, i);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Deliverable3Listener ) ((Deliverable3Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPOUND) {
				{
				setState(183);
				match(COMPOUND);
				}
			}

			setState(186);
			match(T__8);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(187);
				match(WS);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(193);
				variable();
				}
				break;
			case 2:
				{
				setState(194);
				match(LITERAL);
				}
				break;
			case 3:
				{
				setState(195);
				arithmeticExpression();
				}
				break;
			case 4:
				{
				setState(196);
				match(ARRAY);
				}
				break;
			case 5:
				{
				setState(197);
				match(BOOLEAN);
				}
				break;
			}
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(200);
				assignmentExpression();
				}
				break;
			}
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(NEWLINE);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001#\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002"+
		"\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00020\b\u0002"+
		"\n\u0002\f\u00023\t\u0002\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002"+
		"\n\u0002\f\u0002:\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002"+
		"\n\u0002\f\u0002A\t\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"L\b\u0002\u000b\u0002\f\u0002M\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0003\u0003X\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\\\b\u0004\n\u0004\f\u0004_\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0004\u0005\u0004f\b\u0004\n\u0004"+
		"\f\u0004i\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005p\b\u0005\n\u0005\f\u0005s\t\u0005\u0001\u0005\u0005"+
		"\u0005v\b\u0005\n\u0005\f\u0005y\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005~\b\u0005\u0003\u0005\u0080\b\u0005\u0001\u0005\u0005"+
		"\u0005\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008d\b\u0005\n\u0005"+
		"\f\u0005\u0090\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0094\b\u0005"+
		"\n\u0005\f\u0005\u0097\t\u0005\u0003\u0005\u0099\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u009d\b\u0006\u0001\u0006\u0005\u0006\u00a0\b\u0006"+
		"\n\u0006\f\u0006\u00a3\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a7"+
		"\b\u0006\u0001\u0006\u0005\u0006\u00aa\b\u0006\n\u0006\f\u0006\u00ad\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b1\b\u0006\u0005\u0006\u00b3"+
		"\b\u0006\n\u0006\f\u0006\u00b6\t\u0006\u0001\u0007\u0003\u0007\u00b9\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00bd\b\u0007\n\u0007\f\u0007"+
		"\u00c0\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00c7\b\u0007\u0001\u0007\u0003\u0007\u00ca\b\u0007\u0001"+
		"\u0007\u0005\u0007\u00cd\b\u0007\n\u0007\f\u0007\u00d0\t\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0004\u0001\u0000"+
		"\u0001\u0006\u0001\u0000\n\u000b\u0002\u0000\u0014\u0014##\u0001\u0000"+
		"\u0010\u0011\u00f5\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000"+
		"\u0000\bY\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u009c"+
		"\u0001\u0000\u0000\u0000\u000e\u00b8\u0001\u0000\u0000\u0000\u0010\u0014"+
		"\u0003\u0004\u0002\u0000\u0011\u0014\u0003\b\u0004\u0000\u0012\u0014\u0005"+
		"\u001d\u0000\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0007\u0000\u0000\u0000\u001b\u0003\u0001"+
		"\u0000\u0000\u0000\u001c \u0007\u0001\u0000\u0000\u001d\u001f\u0005\u001f"+
		"\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#D\u0003\n\u0005\u0000$D"+
		"\u0005\f\u0000\u0000%)\u0005\r\u0000\u0000&(\u0005\u001f\u0000\u0000\'"+
		"&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,D\u0003\n\u0005\u0000-1\u0005\u000e\u0000\u0000.0\u0005\u001f"+
		"\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000048\u0005\u0014\u0000\u000057\u0005\u001f\u0000"+
		"\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;?\u0005\u0007\u0000\u0000<>\u0005\u001f\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000BD\u0007\u0002\u0000\u0000C\u001c\u0001\u0000\u0000\u0000"+
		"C$\u0001\u0000\u0000\u0000C%\u0001\u0000\u0000\u0000C-\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0005\b\u0000\u0000FK\u0005 \u0000"+
		"\u0000GH\u0005\u001e\u0000\u0000HL\u0003\u0006\u0003\u0000IJ\u0005\u001e"+
		"\u0000\u0000JL\u0003\u0004\u0002\u0000KG\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OX\u0003\b\u0004"+
		"\u0000PX\u0003\u0004\u0002\u0000QS\u0005 \u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WO\u0001"+
		"\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000"+
		"X\u0007\u0001\u0000\u0000\u0000Y]\u0005\u0014\u0000\u0000Z\\\u0005\u001f"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^b\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`c\u0003\u000e\u0007\u0000ac\u0003\f\u0006\u0000"+
		"b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cg\u0001\u0000\u0000\u0000df\u0005 \u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000h\t\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005"+
		"!\u0000\u0000kl\u0003\n\u0005\u0000lm\u0005\"\u0000\u0000m\u0080\u0001"+
		"\u0000\u0000\u0000np\u0005\u000f\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rw\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0005\u001f"+
		"\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x}\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z~\u0003\b\u0004\u0000{~\u0005\u0015\u0000\u0000"+
		"|~\u0005\u0012\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f"+
		"j\u0001\u0000\u0000\u0000\u007fq\u0001\u0000\u0000\u0000\u0080\u0084\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0005\u001f\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0098\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0003"+
		"\u0002\u0001\u0000\u0088\u0089\u0003\n\u0005\u0000\u0089\u0099\u0001\u0000"+
		"\u0000\u0000\u008a\u008e\u0007\u0003\u0000\u0000\u008b\u008d\u0005\u001f"+
		"\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0095\u0003\n\u0005\u0000\u0092\u0094\u0005\u001f\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u0087\u0001\u0000\u0000\u0000\u0098\u008a\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u000b\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0005\u0015\u0000\u0000\u009b\u009d\u0003\b\u0004\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u00b4\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u001f\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0005\u001c\u0000\u0000\u00a5\u00a7\u0005\t\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005\u001f\u0000\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0005\u0015\u0000\u0000\u00af\u00b1\u0003\b\u0004\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00a1\u0001\u0000\u0000\u0000\u00b3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\r\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b9\u0005\u001c\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00be\u0005\t\u0000\u0000\u00bb\u00bd\u0005\u001f"+
		"\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c6\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c7\u0003\b\u0004\u0000\u00c2\u00c7\u0005\u0015\u0000"+
		"\u0000\u00c3\u00c7\u0003\f\u0006\u0000\u00c4\u00c7\u0005\u0017\u0000\u0000"+
		"\u00c5\u00c7\u0005\u0012\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\u000e\u0007\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00ce\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005 \u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u000f\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\"\u0013"+
		"\u0015 )18?CKMTW]bgqw}\u007f\u0084\u008e\u0095\u0098\u009c\u00a1\u00a6"+
		"\u00ab\u00b0\u00b4\u00b8\u00be\u00c6\u00c9\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}