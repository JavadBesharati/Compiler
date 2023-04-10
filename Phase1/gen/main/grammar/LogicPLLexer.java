// Generated from E:/Uni/Uni06/3. compiler/2. CAs/Compiler-Projects-UT-Spring-2023/Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogicPLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FUNCTION=6, MAIN=7, TYPE=8, BOOLEAN=9, 
		PRINT=10, FOR=11, RETURN=12, KEYWORDS=13, IDENTIFIER=14, PRIDICATE=15, 
		QUERY_1=16, QUERY_2=17, UNARY_OP=18, BINARY_ARITHMETIC_OP1=19, BINARY_ARITHMETIC_OP2=20, 
		RELATIONAL_OP1=21, RELATIONAL_OP2=22, LOGICAL_AND_OP=23, LOGICAL_OR_OP=24, 
		ASSIGNMENT_OP=25, OPERATORS=26, FLOAT=27, INT=28, NATURAL_NUMBERS=29, 
		VALUE=30, ARRAY_TYPE=31, ARRAY_VALUE=32, ARRAY_ELEMENT=33, WHITESPACE=34, 
		NEWLINE=35, COMMENT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "FUNCTION", "MAIN", "TYPE", "BOOLEAN", 
			"PRINT", "FOR", "RETURN", "KEYWORDS", "IDENTIFIER", "PRIDICATE", "QUERY_1", 
			"QUERY_2", "UNARY_OP", "BINARY_ARITHMETIC_OP1", "BINARY_ARITHMETIC_OP2", 
			"RELATIONAL_OP1", "RELATIONAL_OP2", "LOGICAL_AND_OP", "LOGICAL_OR_OP", 
			"ASSIGNMENT_OP", "OPERATORS", "FLOAT", "INT", "NATURAL_NUMBERS", "VALUE", 
			"ARRAY_TYPE", "ARRAY_VALUE", "ARRAY_ELEMENT", "WHITESPACE", "NEWLINE", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "':'", "'function'", "'main'", null, 
			null, "'print'", "'for'", "'return'", null, null, null, null, null, null, 
			null, null, null, null, "'&&'", "'||'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "FUNCTION", "MAIN", "TYPE", "BOOLEAN", 
			"PRINT", "FOR", "RETURN", "KEYWORDS", "IDENTIFIER", "PRIDICATE", "QUERY_1", 
			"QUERY_2", "UNARY_OP", "BINARY_ARITHMETIC_OP1", "BINARY_ARITHMETIC_OP2", 
			"RELATIONAL_OP1", "RELATIONAL_OP2", "LOGICAL_AND_OP", "LOGICAL_OR_OP", 
			"ASSIGNMENT_OP", "OPERATORS", "FLOAT", "INT", "NATURAL_NUMBERS", "VALUE", 
			"ARRAY_TYPE", "ARRAY_VALUE", "ARRAY_ELEMENT", "WHITESPACE", "NEWLINE", 
			"COMMENT"
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
		"\u0004\u0000$\u012c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007q\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b|\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0096\b\f\u0001\r\u0001"+
		"\r\u0005\r\u009a\b\r\n\r\f\r\u009d\t\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00a1\b\u000e\n\u000e\f\u000e\u00a4\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00c1\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00c7\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u00d9\b\u0019\u0001\u001a\u0005\u001a\u00dc\b\u001a"+
		"\n\u001a\f\u001a\u00df\t\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u00e3"+
		"\b\u001a\u000b\u001a\f\u001a\u00e4\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u00e9\b\u001b\n\u001b\f\u001b\u00ec\t\u001b\u0001\u001b\u0003\u001b\u00ef"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u00f3\b\u001c\n\u001c\f\u001c"+
		"\u00f6\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00fb\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0108\b\u001f\n\u001f\f\u001f\u010b\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0004!\u0115\b!\u000b!\f!\u0116"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u011d\b\"\u0001\"\u0003\"\u0120"+
		"\b\"\u0001\"\u0001\"\u0001#\u0001#\u0005#\u0126\b#\n#\f#\u0129\t#\u0001"+
		"#\u0001#\u0000\u0000$\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$\u0001\u0000\u000b\u0001\u0000az\u0004\u0000"+
		"09AZ__az\u0001\u0000AZ\u0003\u0000!!++--\u0003\u0000%%**//\u0002\u0000"+
		"++--\u0001\u000009\u0001\u0000..\u0001\u000019\u0002\u0000\t\t  \u0002"+
		"\u0000\n\n\r\r\u014d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0001I\u0001\u0000\u0000"+
		"\u0000\u0003K\u0001\u0000\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007"+
		"O\u0001\u0000\u0000\u0000\tQ\u0001\u0000\u0000\u0000\u000bS\u0001\u0000"+
		"\u0000\u0000\r\\\u0001\u0000\u0000\u0000\u000fp\u0001\u0000\u0000\u0000"+
		"\u0011{\u0001\u0000\u0000\u0000\u0013}\u0001\u0000\u0000\u0000\u0015\u0083"+
		"\u0001\u0000\u0000\u0000\u0017\u0087\u0001\u0000\u0000\u0000\u0019\u0095"+
		"\u0001\u0000\u0000\u0000\u001b\u0097\u0001\u0000\u0000\u0000\u001d\u009e"+
		"\u0001\u0000\u0000\u0000\u001f\u00a5\u0001\u0000\u0000\u0000!\u00ad\u0001"+
		"\u0000\u0000\u0000#\u00b4\u0001\u0000\u0000\u0000%\u00b6\u0001\u0000\u0000"+
		"\u0000\'\u00b8\u0001\u0000\u0000\u0000)\u00c0\u0001\u0000\u0000\u0000"+
		"+\u00c6\u0001\u0000\u0000\u0000-\u00c8\u0001\u0000\u0000\u0000/\u00cb"+
		"\u0001\u0000\u0000\u00001\u00ce\u0001\u0000\u0000\u00003\u00d8\u0001\u0000"+
		"\u0000\u00005\u00dd\u0001\u0000\u0000\u00007\u00ee\u0001\u0000\u0000\u0000"+
		"9\u00f0\u0001\u0000\u0000\u0000;\u00fa\u0001\u0000\u0000\u0000=\u00fc"+
		"\u0001\u0000\u0000\u0000?\u0103\u0001\u0000\u0000\u0000A\u010e\u0001\u0000"+
		"\u0000\u0000C\u0114\u0001\u0000\u0000\u0000E\u011f\u0001\u0000\u0000\u0000"+
		"G\u0123\u0001\u0000\u0000\u0000IJ\u0005{\u0000\u0000J\u0002\u0001\u0000"+
		"\u0000\u0000KL\u0005}\u0000\u0000L\u0004\u0001\u0000\u0000\u0000MN\u0005"+
		"(\u0000\u0000N\u0006\u0001\u0000\u0000\u0000OP\u0005)\u0000\u0000P\b\u0001"+
		"\u0000\u0000\u0000QR\u0005:\u0000\u0000R\n\u0001\u0000\u0000\u0000ST\u0005"+
		"f\u0000\u0000TU\u0005u\u0000\u0000UV\u0005n\u0000\u0000VW\u0005c\u0000"+
		"\u0000WX\u0005t\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005o\u0000\u0000"+
		"Z[\u0005n\u0000\u0000[\f\u0001\u0000\u0000\u0000\\]\u0005m\u0000\u0000"+
		"]^\u0005a\u0000\u0000^_\u0005i\u0000\u0000_`\u0005n\u0000\u0000`\u000e"+
		"\u0001\u0000\u0000\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cq\u0005"+
		"t\u0000\u0000de\u0005f\u0000\u0000ef\u0005l\u0000\u0000fg\u0005o\u0000"+
		"\u0000gh\u0005a\u0000\u0000hq\u0005t\u0000\u0000ij\u0005b\u0000\u0000"+
		"jk\u0005o\u0000\u0000kl\u0005o\u0000\u0000lm\u0005l\u0000\u0000mn\u0005"+
		"e\u0000\u0000no\u0005a\u0000\u0000oq\u0005n\u0000\u0000pa\u0001\u0000"+
		"\u0000\u0000pd\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000q\u0010"+
		"\u0001\u0000\u0000\u0000rs\u0005t\u0000\u0000st\u0005r\u0000\u0000tu\u0005"+
		"u\u0000\u0000u|\u0005e\u0000\u0000vw\u0005f\u0000\u0000wx\u0005a\u0000"+
		"\u0000xy\u0005l\u0000\u0000yz\u0005s\u0000\u0000z|\u0005e\u0000\u0000"+
		"{r\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000|\u0012\u0001\u0000"+
		"\u0000\u0000}~\u0005p\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\u0080"+
		"\u0005i\u0000\u0000\u0080\u0081\u0005n\u0000\u0000\u0081\u0082\u0005t"+
		"\u0000\u0000\u0082\u0014\u0001\u0000\u0000\u0000\u0083\u0084\u0005f\u0000"+
		"\u0000\u0084\u0085\u0005o\u0000\u0000\u0085\u0086\u0005r\u0000\u0000\u0086"+
		"\u0016\u0001\u0000\u0000\u0000\u0087\u0088\u0005r\u0000\u0000\u0088\u0089"+
		"\u0005e\u0000\u0000\u0089\u008a\u0005t\u0000\u0000\u008a\u008b\u0005u"+
		"\u0000\u0000\u008b\u008c\u0005r\u0000\u0000\u008c\u008d\u0005n\u0000\u0000"+
		"\u008d\u0018\u0001\u0000\u0000\u0000\u008e\u0096\u0003\u000b\u0005\u0000"+
		"\u008f\u0096\u0003\r\u0006\u0000\u0090\u0096\u0003\u000f\u0007\u0000\u0091"+
		"\u0096\u0003\u0011\b\u0000\u0092\u0096\u0003\u0013\t\u0000\u0093\u0096"+
		"\u0003\u0015\n\u0000\u0094\u0096\u0003\u0017\u000b\u0000\u0095\u008e\u0001"+
		"\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0090\u0001"+
		"\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u001a\u0001\u0000\u0000\u0000\u0097\u009b\u0007"+
		"\u0000\u0000\u0000\u0098\u009a\u0007\u0001\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u001c\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a2\u0007"+
		"\u0002\u0000\u0000\u009f\u00a1\u0007\u0001\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u001e\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"[\u0000\u0000\u00a6\u00a7\u0005?\u0000\u0000\u00a7\u00a8\u0003\u001d\u000e"+
		"\u0000\u00a8\u00a9\u0005(\u0000\u0000\u00a9\u00aa\u0003\u001b\r\u0000"+
		"\u00aa\u00ab\u0005)\u0000\u0000\u00ab\u00ac\u0005]\u0000\u0000\u00ac "+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005[\u0000\u0000\u00ae\u00af\u0003"+
		"\u001d\u000e\u0000\u00af\u00b0\u0005(\u0000\u0000\u00b0\u00b1\u0005?\u0000"+
		"\u0000\u00b1\u00b2\u0005)\u0000\u0000\u00b2\u00b3\u0005]\u0000\u0000\u00b3"+
		"\"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0003\u0000\u0000\u00b5$"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007\u0004\u0000\u0000\u00b7&\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0007\u0005\u0000\u0000\u00b9(\u0001\u0000"+
		"\u0000\u0000\u00ba\u00c1\u0005<\u0000\u0000\u00bb\u00bc\u0005<\u0000\u0000"+
		"\u00bc\u00c1\u0005=\u0000\u0000\u00bd\u00c1\u0005>\u0000\u0000\u00be\u00bf"+
		"\u0005>\u0000\u0000\u00bf\u00c1\u0005=\u0000\u0000\u00c0\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1*\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005=\u0000\u0000\u00c3\u00c7\u0005=\u0000\u0000\u00c4"+
		"\u00c5\u0005!\u0000\u0000\u00c5\u00c7\u0005=\u0000\u0000\u00c6\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7,\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005&\u0000\u0000\u00c9\u00ca\u0005&\u0000\u0000"+
		"\u00ca.\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005|\u0000\u0000\u00cc\u00cd"+
		"\u0005|\u0000\u0000\u00cd0\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005="+
		"\u0000\u0000\u00cf2\u0001\u0000\u0000\u0000\u00d0\u00d9\u0003#\u0011\u0000"+
		"\u00d1\u00d9\u0003%\u0012\u0000\u00d2\u00d9\u0003\'\u0013\u0000\u00d3"+
		"\u00d9\u0003)\u0014\u0000\u00d4\u00d9\u0003+\u0015\u0000\u00d5\u00d9\u0003"+
		"-\u0016\u0000\u00d6\u00d9\u0003/\u0017\u0000\u00d7\u00d9\u00031\u0018"+
		"\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d94\u0001\u0000\u0000\u0000\u00da\u00dc\u0007\u0006\u0000\u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0007\u0007\u0000\u0000\u00e1\u00e3\u0007\u0006\u0000\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e56\u0001\u0000\u0000\u0000\u00e6\u00ea\u0007\b\u0000\u0000\u00e7"+
		"\u00e9\u0007\u0006\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ef\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ef\u00050\u0000\u0000\u00ee\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef8\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f4\u0007\b\u0000\u0000\u00f1\u00f3\u0007\u0006"+
		"\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5:\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fb\u00037\u001b\u0000\u00f8\u00fb\u00035\u001a\u0000\u00f9"+
		"\u00fb\u0003\u0011\b\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb<\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0003\u000f\u0007\u0000\u00fd\u00fe\u0005"+
		"[\u0000\u0000\u00fe\u00ff\u00039\u001c\u0000\u00ff\u0100\u0005]\u0000"+
		"\u0000\u0100\u0101\u0005 \u0000\u0000\u0101\u0102\u0003\u001b\r\u0000"+
		"\u0102>\u0001\u0000\u0000\u0000\u0103\u0104\u0005[\u0000\u0000\u0104\u0109"+
		"\u0003;\u001d\u0000\u0105\u0106\u0005,\u0000\u0000\u0106\u0108\u0003;"+
		"\u001d\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005]\u0000\u0000\u010d@\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0003\u001b\r\u0000\u010f\u0110\u0005[\u0000\u0000\u0110"+
		"\u0111\u00039\u001c\u0000\u0111\u0112\u0005]\u0000\u0000\u0112B\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0007\t\u0000\u0000\u0114\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0006!\u0000\u0000\u0119D\u0001\u0000\u0000\u0000"+
		"\u011a\u011c\u0005\r\u0000\u0000\u011b\u011d\u0005\n\u0000\u0000\u011c"+
		"\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u0120\u0005\n\u0000\u0000\u011f\u011a"+
		"\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0006\"\u0000\u0000\u0122F\u0001"+
		"\u0000\u0000\u0000\u0123\u0127\u0005#\u0000\u0000\u0124\u0126\b\n\u0000"+
		"\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0006#\u0000\u0000\u012bH\u0001\u0000\u0000\u0000\u0014"+
		"\u0000p{\u0095\u009b\u00a2\u00c0\u00c6\u00d8\u00dd\u00e4\u00ea\u00ee\u00f4"+
		"\u00fa\u0109\u0116\u011c\u011f\u0127\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}