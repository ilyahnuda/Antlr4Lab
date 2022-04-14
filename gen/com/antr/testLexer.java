// Generated from D:/JavaPr/APIS\test.g4 by ANTLR 4.9.2
package com.antr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "LESS_OR_EQUALS", 
			"GREATER", "GREATER_OR_EQUALS", "TRUE", "FALSE", "RETURN", "TAB", "SPACE", 
			"ENDLINE", "NUMBER", "FLOATNUMBER", "PRINT", "WHILE", "IF", "ELSE", "FUNCTION", 
			"VOID", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "PERCENT", "DEGREE", "COMMA", 
			"ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "ID"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21\u0080\n\21\r\21"+
		"\16\21\u0081\3\22\6\22\u0085\n\22\r\22\16\22\u0086\3\22\3\22\6\22\u008b"+
		"\n\22\r\22\16\22\u008c\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u00c2\n#\f#"+
		"\16#\u00c5\13#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$\3\2\6\3\2\f\f\3\2\62;\5\2C\\aac|\6\2\62"+
		";C\\aac|\2\u00c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13V\3\2\2\2\rY\3"+
		"\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25c\3\2\2\2\27h\3\2\2\2\31"+
		"n\3\2\2\2\33u\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!\177\3\2\2\2#\u0084\3\2"+
		"\2\2%\u008e\3\2\2\2\'\u0094\3\2\2\2)\u009a\3\2\2\2+\u009d\3\2\2\2-\u00a2"+
		"\3\2\2\2/\u00a6\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2"+
		"\2\2\67\u00b1\3\2\2\29\u00b3\3\2\2\2;\u00b5\3\2\2\2=\u00b7\3\2\2\2?\u00b9"+
		"\3\2\2\2A\u00bb\3\2\2\2C\u00bd\3\2\2\2E\u00bf\3\2\2\2GH\7k\2\2HI\7p\2"+
		"\2IJ\7v\2\2J\4\3\2\2\2KL\7h\2\2LM\7n\2\2MN\7q\2\2NO\7c\2\2OP\7v\2\2P\6"+
		"\3\2\2\2QR\7#\2\2R\b\3\2\2\2ST\7?\2\2TU\7?\2\2U\n\3\2\2\2VW\7#\2\2WX\7"+
		"?\2\2X\f\3\2\2\2YZ\7>\2\2Z\16\3\2\2\2[\\\7>\2\2\\]\7?\2\2]\20\3\2\2\2"+
		"^_\7@\2\2_\22\3\2\2\2`a\7@\2\2ab\7?\2\2b\24\3\2\2\2cd\7v\2\2de\7t\2\2"+
		"ef\7w\2\2fg\7g\2\2g\26\3\2\2\2hi\7h\2\2ij\7c\2\2jk\7n\2\2kl\7u\2\2lm\7"+
		"g\2\2m\30\3\2\2\2no\7t\2\2op\7g\2\2pq\7v\2\2qr\7w\2\2rs\7t\2\2st\7p\2"+
		"\2t\32\3\2\2\2uv\7\"\2\2vw\7\"\2\2wx\7\"\2\2xy\7\"\2\2y\34\3\2\2\2z{\7"+
		"\"\2\2{\36\3\2\2\2|}\t\2\2\2} \3\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\"\3\2\2\2\u0083"+
		"\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\60\2\2\u0089"+
		"\u008b\t\3\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d$\3\2\2\2\u008e\u008f\7r\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093"+
		"&\3\2\2\2\u0094\u0095\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7g\2\2\u0099(\3\2\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7h\2\2\u009c*\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7f\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7h\2\2\u00a5.\3\2\2\2\u00a6\u00a7\7x\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7f\2\2\u00aa\60\3\2\2\2\u00ab"+
		"\u00ac\7-\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\7,\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b28\3\2\2\2\u00b3"+
		"\u00b4\7\'\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7`\2\2\u00b6<\3\2\2\2\u00b7"+
		"\u00b8\7.\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba@\3\2\2\2\u00bb\u00bc"+
		"\7*\2\2\u00bcB\3\2\2\2\u00bd\u00be\7+\2\2\u00beD\3\2\2\2\u00bf\u00c3\t"+
		"\4\2\2\u00c0\u00c2\t\5\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4F\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\7\2\u0081\u0086\u008c\u00c3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}