// Generated from D:/JavaPr/APIS\test.g4 by ANTLR 4.9.2
package com.antr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, NEGATION=3, EQUAL=4, NON_EQUAL=5, LESS=6, LESS_OR_EQUALS=7, 
		GREATER=8, GREATER_OR_EQUALS=9, TRUE=10, FALSE=11, RETURN=12, TAB=13, 
		SPACE=14, ENDLINE=15, NUMBER=16, FLOATNUMBER=17, PRINT=18, WHILE=19, IF=20, 
		ELSE=21, FUNCTION=22, VOID=23, PLUS=24, MINUS=25, MULTIPLY=26, DIVIDE=27, 
		PERCENT=28, DEGREE=29, COMMA=30, ASSIGN=31, OPEN_BRACKET=32, CLOSE_BRACKET=33, 
		ID=34;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_arif = 2, RULE_statement = 3, RULE_ifHeader = 4, 
		RULE_ifStatement = 5, RULE_elseStatement = 6, RULE_declaration = 7, RULE_assigment = 8, 
		RULE_expressionMath = 9, RULE_br_expr = 10, RULE_compare_op = 11, RULE_functionCall = 12, 
		RULE_function = 13, RULE_functionHeader = 14, RULE_functionParameters = 15, 
		RULE_print_expr = 16, RULE_whileCycle = 17, RULE_whileHeader = 18, RULE_boolExpr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "arif", "statement", "ifHeader", "ifStatement", "elseStatement", 
			"declaration", "assigment", "expressionMath", "br_expr", "compare_op", 
			"functionCall", "function", "functionHeader", "functionParameters", "print_expr", 
			"whileCycle", "whileHeader", "boolExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'!'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'true'", "'false'", "'return'", "'    '", "' '", null, null, 
			null, "'print'", "'while'", "'if'", "'else'", "'def'", "'void'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "','", "'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "LESS_OR_EQUALS", 
			"GREATER", "GREATER_OR_EQUALS", "TRUE", "FALSE", "RETURN", "TAB", "SPACE", 
			"ENDLINE", "NUMBER", "FLOATNUMBER", "PRINT", "WHILE", "IF", "ELSE", "FUNCTION", 
			"VOID", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "PERCENT", "DEGREE", "COMMA", 
			"ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "ID"
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(testParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(testParser.ENDLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(40);
				function();
				setState(41);
				match(ENDLINE);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << WHILE) | (1L << IF) | (1L << ID))) != 0) );
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(testParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(testParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	public static class ArifContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(testParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(testParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(testParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(testParser.MINUS, 0); }
		public TerminalNode PERCENT() { return getToken(testParser.PERCENT, 0); }
		public TerminalNode DEGREE() { return getToken(testParser.DEGREE, 0); }
		public ArifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterArif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitArif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitArif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArifContext arif() throws RecognitionException {
		ArifContext _localctx = new ArifContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PERCENT) | (1L << DEGREE))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(testParser.ENDLINE, 0); }
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileCycleContext whileCycle() {
			return getRuleContext(WhileCycleContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(57);
				declaration();
				setState(58);
				match(ENDLINE);
				}
				break;
			case 2:
				{
				setState(60);
				assigment();
				setState(61);
				match(ENDLINE);
				}
				break;
			case 3:
				{
				setState(63);
				ifStatement();
				}
				break;
			case 4:
				{
				setState(64);
				whileCycle();
				}
				break;
			case 5:
				{
				setState(65);
				functionCall();
				setState(66);
				match(ENDLINE);
				}
				break;
			case 6:
				{
				setState(68);
				print_expr();
				setState(69);
				match(ENDLINE);
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

	public static class IfHeaderContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(testParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public IfHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterIfHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitIfHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitIfHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfHeaderContext ifHeader() throws RecognitionException {
		IfHeaderContext _localctx = new IfHeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IF);
			setState(74);
			match(OPEN_BRACKET);
			setState(75);
			boolExpr();
			setState(76);
			match(CLOSE_BRACKET);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfHeaderContext ifHeader() {
			return getRuleContext(IfHeaderContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(testParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(testParser.ENDLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(testParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(testParser.TAB, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			ifHeader();
			setState(86); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					match(ENDLINE);
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(80);
						match(TAB);
						}
						}
						setState(83); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(85);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(90);
				elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(testParser.ELSE, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(testParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(testParser.ENDLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(testParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(testParser.TAB, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ELSE);
			setState(101); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(94);
					match(ENDLINE);
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(95);
						match(TAB);
						}
						}
						setState(98); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(100);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public ExpressionMathContext expressionMath() {
			return getRuleContext(ExpressionMathContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				match(SPACE);
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(111);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(112);
				match(SPACE);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(ASSIGN);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(119);
				match(SPACE);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(125);
				match(OPEN_BRACKET);
				setState(126);
				type();
				setState(127);
				match(CLOSE_BRACKET);
				}
				break;
			}
			setState(131);
			expressionMath(0);
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

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public ExpressionMathContext expressionMath() {
			return getRuleContext(ExpressionMathContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assigment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(134);
				match(SPACE);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(ASSIGN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(141);
				match(SPACE);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(147);
				match(OPEN_BRACKET);
				setState(148);
				type();
				setState(149);
				match(CLOSE_BRACKET);
				}
				break;
			}
			setState(153);
			expressionMath(0);
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

	public static class ExpressionMathContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public Br_exprContext br_expr() {
			return getRuleContext(Br_exprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(testParser.NUMBER, 0); }
		public TerminalNode FLOATNUMBER() { return getToken(testParser.FLOATNUMBER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<ExpressionMathContext> expressionMath() {
			return getRuleContexts(ExpressionMathContext.class);
		}
		public ExpressionMathContext expressionMath(int i) {
			return getRuleContext(ExpressionMathContext.class,i);
		}
		public ArifContext arif() {
			return getRuleContext(ArifContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public ExpressionMathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExpressionMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExpressionMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExpressionMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMathContext expressionMath() throws RecognitionException {
		return expressionMath(0);
	}

	private ExpressionMathContext expressionMath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionMathContext _localctx = new ExpressionMathContext(_ctx, _parentState);
		ExpressionMathContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expressionMath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(156);
				match(ID);
				}
				break;
			case 2:
				{
				setState(157);
				br_expr();
				}
				break;
			case 3:
				{
				setState(158);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(159);
				match(FLOATNUMBER);
				}
				break;
			case 5:
				{
				setState(160);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionMathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionMath);
					setState(163);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(164);
						match(SPACE);
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(170);
					arif();
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(171);
						match(SPACE);
						}
						}
						setState(176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(177);
					expressionMath(7);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Br_exprContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public ExpressionMathContext expressionMath() {
			return getRuleContext(ExpressionMathContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public Br_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_br_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitBr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Br_exprContext br_expr() throws RecognitionException {
		Br_exprContext _localctx = new Br_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_br_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OPEN_BRACKET);
			setState(185);
			expressionMath(0);
			setState(186);
			match(CLOSE_BRACKET);
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

	public static class Compare_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(testParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(testParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(testParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(testParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(testParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(testParser.GREATER_OR_EQUALS, 0); }
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCompare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCompare_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCompare_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public List<ExpressionMathContext> expressionMath() {
			return getRuleContexts(ExpressionMathContext.class);
		}
		public ExpressionMathContext expressionMath(int i) {
			return getRuleContext(ExpressionMathContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(testParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(testParser.COMMA, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ID);
				setState(191);
				match(OPEN_BRACKET);
				setState(192);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(ID);
				setState(194);
				match(OPEN_BRACKET);
				{
				setState(195);
				expressionMath(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(196);
					match(COMMA);
					setState(197);
					match(SPACE);
					setState(198);
					expressionMath(0);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(204);
				match(CLOSE_BRACKET);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(testParser.ENDLINE, 0); }
		public List<TerminalNode> TAB() { return getTokens(testParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(testParser.TAB, i);
		}
		public TerminalNode RETURN() { return getToken(testParser.RETURN, 0); }
		public TerminalNode SPACE() { return getToken(testParser.SPACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionMathContext expressionMath() {
			return getRuleContext(ExpressionMathContext.class,0);
		}
		public TerminalNode VOID() { return getToken(testParser.VOID, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			functionHeader();
			setState(209);
			match(ENDLINE);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(TAB);
					setState(211);
					statement();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			{
			setState(217);
			match(TAB);
			setState(218);
			match(RETURN);
			setState(219);
			match(SPACE);
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case FLOATNUMBER:
			case OPEN_BRACKET:
			case ID:
				{
				setState(220);
				expressionMath(0);
				}
				break;
			case VOID:
				{
				setState(221);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class FunctionHeaderContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(testParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(testParser.VOID, 0); }
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public FunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFunctionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunctionHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFunctionHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionHeaderContext functionHeader() throws RecognitionException {
		FunctionHeaderContext _localctx = new FunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FUNCTION);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(SPACE);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				{
				setState(230);
				type();
				}
				break;
			case VOID:
				{
				setState(231);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				match(SPACE);
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(239);
			match(ID);
			setState(240);
			match(OPEN_BRACKET);
			setState(241);
			functionParameters();
			setState(242);
			match(CLOSE_BRACKET);
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(testParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(testParser.ID, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(testParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(testParser.COMMA, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(244);
			type();
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				match(SPACE);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(250);
			match(ID);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(252);
					match(SPACE);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				type();
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(259);
					match(SPACE);
					}
					}
					setState(262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(264);
				match(ID);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Print_exprContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(testParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public ExpressionMathContext expressionMath() {
			return getRuleContext(ExpressionMathContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPrint_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPrint_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPrint_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(PRINT);
			setState(272);
			match(OPEN_BRACKET);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(273);
				expressionMath(0);
				}
				break;
			case 2:
				{
				setState(274);
				boolExpr();
				}
				break;
			}
			setState(277);
			match(CLOSE_BRACKET);
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

	public static class WhileCycleContext extends ParserRuleContext {
		public WhileHeaderContext whileHeader() {
			return getRuleContext(WhileHeaderContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(testParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(testParser.ENDLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(testParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(testParser.TAB, i);
		}
		public WhileCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterWhileCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitWhileCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitWhileCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCycleContext whileCycle() throws RecognitionException {
		WhileCycleContext _localctx = new WhileCycleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileCycle);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			whileHeader();
			setState(287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(280);
					match(ENDLINE);
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(281);
						match(TAB);
						}
						}
						setState(284); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(286);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class WhileHeaderContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(testParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public WhileHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterWhileHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitWhileHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitWhileHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileHeaderContext whileHeader() throws RecognitionException {
		WhileHeaderContext _localctx = new WhileHeaderContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(WHILE);
			setState(292);
			match(OPEN_BRACKET);
			setState(293);
			boolExpr();
			setState(294);
			match(CLOSE_BRACKET);
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

	public static class BoolExprContext extends ParserRuleContext {
		public List<ExpressionMathContext> expressionMath() {
			return getRuleContexts(ExpressionMathContext.class);
		}
		public ExpressionMathContext expressionMath(int i) {
			return getRuleContext(ExpressionMathContext.class,i);
		}
		public Compare_opContext compare_op() {
			return getRuleContext(Compare_opContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public TerminalNode NEGATION() { return getToken(testParser.NEGATION, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(testParser.OPEN_BRACKET, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(testParser.CLOSE_BRACKET, 0); }
		public TerminalNode TRUE() { return getToken(testParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(testParser.FALSE, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolExpr);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case FLOATNUMBER:
			case OPEN_BRACKET:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				expressionMath(0);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(297);
					match(SPACE);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				compare_op();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(304);
					match(SPACE);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				expressionMath(0);
				}
				break;
			case NEGATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(NEGATION);
				setState(313);
				match(OPEN_BRACKET);
				setState(314);
				boolExpr();
				setState(315);
				match(CLOSE_BRACKET);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 9:
			return expressionMath_sempred((ExpressionMathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionMath_sempred(ExpressionMathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\6\7T\n\7\r\7\16\7U\3\7\6\7Y\n\7\r\7\16\7Z\3\7\5\7^\n\7\3\b\3\b\3\b\6"+
		"\bc\n\b\r\b\16\bd\3\b\6\bh\n\b\r\b\16\bi\3\t\3\t\6\tn\n\t\r\t\16\to\3"+
		"\t\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0084\n\t\3\t\3\t\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13"+
		"\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094\13\n\3\n\3\n\3\n\3\n\5\n\u009a"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a4\n\13\3\13\3\13\7"+
		"\13\u00a8\n\13\f\13\16\13\u00ab\13\13\3\13\3\13\7\13\u00af\n\13\f\13\16"+
		"\13\u00b2\13\13\3\13\3\13\7\13\u00b6\n\13\f\13\16\13\u00b9\13\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ca"+
		"\n\16\f\16\16\16\u00cd\13\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\3\17"+
		"\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00e1\n\17\3\20\3\20\6\20\u00e5\n\20\r\20\16\20\u00e6\3\20\3\20"+
		"\5\20\u00eb\n\20\3\20\6\20\u00ee\n\20\r\20\16\20\u00ef\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\6\21\u00f9\n\21\r\21\16\21\u00fa\3\21\3\21\3\21\7"+
		"\21\u0100\n\21\f\21\16\21\u0103\13\21\3\21\3\21\6\21\u0107\n\21\r\21\16"+
		"\21\u0108\3\21\3\21\7\21\u010d\n\21\f\21\16\21\u0110\13\21\3\22\3\22\3"+
		"\22\3\22\5\22\u0116\n\22\3\22\3\22\3\23\3\23\3\23\6\23\u011d\n\23\r\23"+
		"\16\23\u011e\3\23\6\23\u0122\n\23\r\23\16\23\u0123\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\7\25\u012d\n\25\f\25\16\25\u0130\13\25\3\25\3\25\7\25"+
		"\u0134\n\25\f\25\16\25\u0137\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0142\n\25\3\25\2\3\24\26\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(\2\5\3\2\3\4\3\2\32\37\3\2\6\13\2\u015c\2/\3\2\2\2\4\67"+
		"\3\2\2\2\69\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\fP\3\2\2\2\16_\3\2\2\2\20k\3"+
		"\2\2\2\22\u0087\3\2\2\2\24\u00a3\3\2\2\2\26\u00ba\3\2\2\2\30\u00be\3\2"+
		"\2\2\32\u00d0\3\2\2\2\34\u00d2\3\2\2\2\36\u00e2\3\2\2\2 \u00f6\3\2\2\2"+
		"\"\u0111\3\2\2\2$\u0119\3\2\2\2&\u0125\3\2\2\2(\u0141\3\2\2\2*+\5\34\17"+
		"\2+,\7\21\2\2,.\3\2\2\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\678\t\2\2\28\5\3\2\2\29:\t\3\2\2:"+
		"\7\3\2\2\2;<\5\20\t\2<=\7\21\2\2=J\3\2\2\2>?\5\22\n\2?@\7\21\2\2@J\3\2"+
		"\2\2AJ\5\f\7\2BJ\5$\23\2CD\5\32\16\2DE\7\21\2\2EJ\3\2\2\2FG\5\"\22\2G"+
		"H\7\21\2\2HJ\3\2\2\2I;\3\2\2\2I>\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3\2\2\2"+
		"IF\3\2\2\2J\t\3\2\2\2KL\7\26\2\2LM\7\"\2\2MN\5(\25\2NO\7#\2\2O\13\3\2"+
		"\2\2PX\5\n\6\2QS\7\21\2\2RT\7\17\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2VW\3\2\2\2WY\5\b\5\2XQ\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3"+
		"\2\2\2\\^\5\16\b\2]\\\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_g\7\27\2\2`b\7\21\2"+
		"\2ac\7\17\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\5\b"+
		"\5\2g`\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2km\5\4\3\2ln\7"+
		"\20\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qu\7$\2\2rt\7"+
		"\20\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x|"+
		"\7!\2\2y{\7\20\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0083\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\7\"\2\2\u0080\u0081\5\4\3\2\u0081\u0082\7#\2"+
		"\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\5\24\13\2\u0086\21\3\2\2\2\u0087\u008b\7$\2\2\u0088"+
		"\u008a\7\20\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0092\7!\2\2\u008f\u0091\7\20\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0099\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7\"\2\2\u0096\u0097\5\4\3\2\u0097\u0098\7#"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\5\24\13\2\u009c\23\3\2\2\2\u009d\u009e\b\13"+
		"\1\2\u009e\u00a4\7$\2\2\u009f\u00a4\5\26\f\2\u00a0\u00a4\7\22\2\2\u00a1"+
		"\u00a4\7\23\2\2\u00a2\u00a4\5\32\16\2\u00a3\u009d\3\2\2\2\u00a3\u009f"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00b7\3\2\2\2\u00a5\u00a9\f\b\2\2\u00a6\u00a8\7\20\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\5\6\4\2\u00ad\u00af\7\20"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\24"+
		"\13\t\u00b4\u00b6\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\25\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\5\24\13\2\u00bc\u00bd\7#\2\2\u00bd"+
		"\27\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf\31\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\u00d1\7#\2\2\u00c3\u00c4\7$\2\2\u00c4\u00c5\7\"\2"+
		"\2\u00c5\u00cb\5\24\13\2\u00c6\u00c7\7 \2\2\u00c7\u00c8\7\20\2\2\u00c8"+
		"\u00ca\5\24\13\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\7#\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c0\3\2\2\2\u00d0\u00c3\3\2"+
		"\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\5\36\20\2\u00d3\u00d8\7\21\2\2\u00d4"+
		"\u00d5\7\17\2\2\u00d5\u00d7\5\b\5\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00e0\7"+
		"\20\2\2\u00de\u00e1\5\24\13\2\u00df\u00e1\7\31\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\35\3\2\2\2\u00e2\u00e4\7\30\2\2\u00e3\u00e5"+
		"\7\20\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00eb\5\4\3\2\u00e9\u00eb"+
		"\7\31\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ed\3\2\2\2"+
		"\u00ec\u00ee\7\20\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2"+
		"\u00f3\7\"\2\2\u00f3\u00f4\5 \21\2\u00f4\u00f5\7#\2\2\u00f5\37\3\2\2\2"+
		"\u00f6\u00f8\5\4\3\2\u00f7\u00f9\7\20\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u010e\7$\2\2\u00fd\u0101\7 \2\2\u00fe\u0100\7\20\2\2\u00ff\u00fe\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5\4\3\2\u0105\u0107\7\20"+
		"\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7$\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u00fd\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f!\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\24\2\2"+
		"\u0112\u0115\7\"\2\2\u0113\u0116\5\24\13\2\u0114\u0116\5(\25\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7#\2\2\u0118"+
		"#\3\2\2\2\u0119\u0121\5&\24\2\u011a\u011c\7\21\2\2\u011b\u011d\7\17\2"+
		"\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\5\b\5\2\u0121\u011a\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124%\3\2\2\2"+
		"\u0125\u0126\7\25\2\2\u0126\u0127\7\"\2\2\u0127\u0128\5(\25\2\u0128\u0129"+
		"\7#\2\2\u0129\'\3\2\2\2\u012a\u012e\5\24\13\2\u012b\u012d\7\20\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\5\30\r\2\u0132"+
		"\u0134\7\20\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\5\24\13\2\u0139\u0142\3\2\2\2\u013a\u013b\7\5\2\2\u013b\u013c\7"+
		"\"\2\2\u013c\u013d\5(\25\2\u013d\u013e\7#\2\2\u013e\u0142\3\2\2\2\u013f"+
		"\u0142\7\f\2\2\u0140\u0142\7\r\2\2\u0141\u012a\3\2\2\2\u0141\u013a\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142)\3\2\2\2&/\65IUZ]d"+
		"iou|\u0083\u008b\u0092\u0099\u00a3\u00a9\u00b0\u00b7\u00cb\u00d0\u00d8"+
		"\u00e0\u00e6\u00ea\u00ef\u00fa\u0101\u0108\u010e\u0115\u011e\u0123\u012e"+
		"\u0135\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}