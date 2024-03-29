package main.grammar.antlr;// Generated from /home/javad/My Folders/University/6th Term/Complier/CAs/Compiler-Projects-UT-Spring-2023/Phase2/src/main/grammar/LogicPL.g4 by ANTLR 4.9.2

import ast.node.*;
import ast.node.expression.*;
import ast.node.statement.*;
import ast.node.declaration.*;
import ast.node.expression.values.*;
import ast.node.expression.operators.*;
import ast.type.primitiveType.*;
import ast.type.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicPLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, BOOLEAN=2, INT=3, FLOAT=4, MAIN=5, PRINT=6, RETURN=7, FOR=8, 
		TRUE=9, FALSE=10, LPAR=11, RPAR=12, COLON=13, COMMA=14, LBRACE=15, RBRACE=16, 
		SEMICOLON=17, ASSIGN=18, LBRACKET=19, RBRACKET=20, QUARYMARK=21, ARROW=22, 
		OR=23, AND=24, EQ=25, GT=26, LT=27, GTE=28, LTE=29, PLUS=30, MINUS=31, 
		MULT=32, DIV=33, MOD=34, NEQ=35, NOT=36, WS=37, COMMENT=38, IDENTIFIER=39, 
		PREDICATE_IDENTIFIER=40, INT_NUMBER=41, FLOAT_NUMBER=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUNCTION", "BOOLEAN", "INT", "FLOAT", "MAIN", "PRINT", "RETURN", "FOR", 
			"TRUE", "FALSE", "LPAR", "RPAR", "COLON", "COMMA", "LBRACE", "RBRACE", 
			"SEMICOLON", "ASSIGN", "LBRACKET", "RBRACKET", "QUARYMARK", "ARROW", 
			"OR", "AND", "EQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NEQ", "NOT", "WS", "COMMENT", "IDENTIFIER", "PREDICATE_IDENTIFIER", 
			"INT_NUMBER", "FLOAT_NUMBER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'boolean'", "'int'", "'float'", "'main'", "'print'", 
			"'return'", "'for'", "'true'", "'false'", "'('", "')'", "':'", "','", 
			"'{'", "'}'", "';'", "'='", "'['", "']'", "'?'", "'=>'", "'||'", "'&&'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "BOOLEAN", "INT", "FLOAT", "MAIN", "PRINT", "RETURN", 
			"FOR", "TRUE", "FALSE", "LPAR", "RPAR", "COLON", "COMMA", "LBRACE", "RBRACE", 
			"SEMICOLON", "ASSIGN", "LBRACKET", "RBRACKET", "QUARYMARK", "ARROW", 
			"OR", "AND", "EQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NEQ", "NOT", "WS", "COMMENT", "IDENTIFIER", "PREDICATE_IDENTIFIER", 
			"INT_NUMBER", "FLOAT_NUMBER"
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


	public LogicPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogicPL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3$\3%\3%\3&\6&\u00d0\n&\r&\16&\u00d1\3&\3&\3\'\3\'\7\'\u00d8"+
		"\n\'\f\'\16\'\u00db\13\'\3\'\3\'\3(\3(\7(\u00e1\n(\f(\16(\u00e4\13(\3"+
		")\3)\7)\u00e8\n)\f)\16)\u00eb\13)\3*\6*\u00ee\n*\r*\16*\u00ef\3+\7+\u00f3"+
		"\n+\f+\16+\u00f6\13+\3+\5+\u00f9\n+\3+\6+\u00fc\n+\r+\16+\u00fd\2\2,\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\n\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2"+
		"c|\6\2\62;C\\aac|\3\2C\\\5\2\62;C\\c|\3\2\62;\3\2\60\60\2\u0106\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\3W\3\2\2\2\5`\3\2\2\2\7h\3\2\2\2\tl\3\2\2\2\13r\3\2\2\2\rw\3\2\2"+
		"\2\17}\3\2\2\2\21\u0084\3\2\2\2\23\u0088\3\2\2\2\25\u008d\3\2\2\2\27\u0093"+
		"\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009b\3"+
		"\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ac\3\2\2\2\61\u00af\3\2\2\2"+
		"\63\u00b2\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bc"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c3\3\2\2\2C\u00c5\3\2\2\2E"+
		"\u00c7\3\2\2\2G\u00c9\3\2\2\2I\u00cc\3\2\2\2K\u00cf\3\2\2\2M\u00d5\3\2"+
		"\2\2O\u00de\3\2\2\2Q\u00e5\3\2\2\2S\u00ed\3\2\2\2U\u00f8\3\2\2\2WX\7h"+
		"\2\2XY\7w\2\2YZ\7p\2\2Z[\7e\2\2[\\\7v\2\2\\]\7k\2\2]^\7q\2\2^_\7p\2\2"+
		"_\4\3\2\2\2`a\7d\2\2ab\7q\2\2bc\7q\2\2cd\7n\2\2de\7g\2\2ef\7c\2\2fg\7"+
		"p\2\2g\6\3\2\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k\b\3\2\2\2lm\7h\2\2mn\7n\2"+
		"\2no\7q\2\2op\7c\2\2pq\7v\2\2q\n\3\2\2\2rs\7o\2\2st\7c\2\2tu\7k\2\2uv"+
		"\7p\2\2v\f\3\2\2\2wx\7r\2\2xy\7t\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|\16\3"+
		"\2\2\2}~\7t\2\2~\177\7g\2\2\177\u0080\7v\2\2\u0080\u0081\7w\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7p\2\2\u0083\20\3\2\2\2\u0084\u0085\7h\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\22\3\2\2\2\u0088\u0089\7v\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7w\2\2\u008b\u008c\7g\2\2\u008c\24\3\2\2\2\u008d"+
		"\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2"+
		"\u0091\u0092\7g\2\2\u0092\26\3\2\2\2\u0093\u0094\7*\2\2\u0094\30\3\2\2"+
		"\2\u0095\u0096\7+\2\2\u0096\32\3\2\2\2\u0097\u0098\7<\2\2\u0098\34\3\2"+
		"\2\2\u0099\u009a\7.\2\2\u009a\36\3\2\2\2\u009b\u009c\7}\2\2\u009c \3\2"+
		"\2\2\u009d\u009e\7\177\2\2\u009e\"\3\2\2\2\u009f\u00a0\7=\2\2\u00a0$\3"+
		"\2\2\2\u00a1\u00a2\7?\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7]\2\2\u00a4(\3\2"+
		"\2\2\u00a5\u00a6\7_\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7A\2\2\u00a8,\3\2\2"+
		"\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7@\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7"+
		"~\2\2\u00ad\u00ae\7~\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1"+
		"\7(\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7?\2\2\u00b4\64"+
		"\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8"+
		"8\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\u00bb\7?\2\2\u00bb:\3\2\2\2\u00bc\u00bd"+
		"\7>\2\2\u00bd\u00be\7?\2\2\u00be<\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0>\3"+
		"\2\2\2\u00c1\u00c2\7/\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4B\3\2"+
		"\2\2\u00c5\u00c6\7\61\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7\'\2\2\u00c8F\3"+
		"\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\7?\2\2\u00cbH\3\2\2\2\u00cc\u00cd"+
		"\7#\2\2\u00cdJ\3\2\2\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\b&\2\2\u00d4L\3\2\2\2\u00d5\u00d9\7%\2\2\u00d6\u00d8\n\3\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\b\'\2\2\u00dd"+
		"N\3\2\2\2\u00de\u00e2\t\4\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3P\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e9\t\6\2\2\u00e6\u00e8\t\7\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00eaR\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\t\b\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"T\3\2\2\2\u00f1\u00f3\t\b\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f9\t\t\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00fc\t\b\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feV\3\2\2\2\13\2\u00d1"+
		"\u00d9\u00e2\u00e9\u00ef\u00f4\u00f8\u00fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}