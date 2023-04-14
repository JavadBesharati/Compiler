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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MAIN=11, INT_TYPE=12, FLOAT_TYPE=13, BOOLEAN_TYPE=14, BOOLEAN=15, 
		FUNCTION=16, PRINT=17, FOR=18, RETURN=19, KEYWORDS=20, NATURAL_NUMBERS=21, 
		IDENTIFIER=22, PRIDICATE=23, LOGICAL_NOT_OP=24, BINARY_ARITHMETIC_OP1=25, 
		BINARY_ARITHMETIC_OP2=26, RELATIONAL_OP1=27, RELATIONAL_OP2=28, LOGICAL_AND_OP=29, 
		LOGICAL_OR_OP=30, ASSIGNMENT_OP=31, COMMA=32, SEMICOLON=33, FLOAT=34, 
		WHITESPACE=35, NEWLINE=36, COMMENT=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "MAIN", "INT_TYPE", "FLOAT_TYPE", "BOOLEAN_TYPE", "BOOLEAN", 
			"FUNCTION", "PRINT", "FOR", "RETURN", "KEYWORDS", "NATURAL_NUMBERS", 
			"IDENTIFIER", "PRIDICATE", "LOGICAL_NOT_OP", "BINARY_ARITHMETIC_OP1", 
			"BINARY_ARITHMETIC_OP2", "RELATIONAL_OP1", "RELATIONAL_OP2", "LOGICAL_AND_OP", 
			"LOGICAL_OR_OP", "ASSIGNMENT_OP", "COMMA", "SEMICOLON", "FLOAT", "WHITESPACE", 
			"NEWLINE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "':'", "')'", "'['", "']'", "'0'", "'?'", 
			"'=>'", "'main'", "'int'", "'float'", "'boolean'", null, "'function'", 
			"'print'", "'for'", "'return'", null, null, null, null, "'!'", null, 
			null, null, null, "'&&'", "'||'", "'='", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "MAIN", 
			"INT_TYPE", "FLOAT_TYPE", "BOOLEAN_TYPE", "BOOLEAN", "FUNCTION", "PRINT", 
			"FOR", "RETURN", "KEYWORDS", "NATURAL_NUMBERS", "IDENTIFIER", "PRIDICATE", 
			"LOGICAL_NOT_OP", "BINARY_ARITHMETIC_OP1", "BINARY_ARITHMETIC_OP2", "RELATIONAL_OP1", 
			"RELATIONAL_OP2", "LOGICAL_AND_OP", "LOGICAL_OR_OP", "ASSIGNMENT_OP", 
			"COMMA", "SEMICOLON", "FLOAT", "WHITESPACE", "NEWLINE", "COMMENT"
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
		"\u0004\u0000%\u0100\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0081\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00a6\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00aa\b\u0014\n\u0014\f\u0014\u00ad\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00b1\b\u0015\n\u0015\f\u0015\u00b4\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00b8\b\u0016\n\u0016\f\u0016\u00bb\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00c9\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00cf\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0004!\u00de\b!\u000b!\f!\u00df\u0001!\u0001!\u0004!\u00e4"+
		"\b!\u000b!\f!\u00e5\u0001\"\u0004\"\u00e9\b\"\u000b\"\f\"\u00ea\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0003#\u00f1\b#\u0001#\u0003#\u00f4\b#\u0001"+
		"#\u0001#\u0001$\u0001$\u0005$\u00fa\b$\n$\f$\u00fd\t$\u0001$\u0001$\u0000"+
		"\u0000%\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%\u0001\u0000\n\u0001\u000019\u0001\u000009\u0001\u0000az\u0004\u0000"+
		"09AZ__az\u0001\u0000AZ\u0003\u0000%%**//\u0002\u0000++--\u0001\u0000."+
		".\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u0115\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0001K\u0001\u0000\u0000\u0000\u0003"+
		"M\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007Q\u0001"+
		"\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000bU\u0001\u0000\u0000"+
		"\u0000\rW\u0001\u0000\u0000\u0000\u000fY\u0001\u0000\u0000\u0000\u0011"+
		"[\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015`\u0001"+
		"\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000"+
		"\u0000\u001bo\u0001\u0000\u0000\u0000\u001d\u0080\u0001\u0000\u0000\u0000"+
		"\u001f\u0082\u0001\u0000\u0000\u0000!\u008b\u0001\u0000\u0000\u0000#\u0091"+
		"\u0001\u0000\u0000\u0000%\u0095\u0001\u0000\u0000\u0000\'\u00a5\u0001"+
		"\u0000\u0000\u0000)\u00a7\u0001\u0000\u0000\u0000+\u00ae\u0001\u0000\u0000"+
		"\u0000-\u00b5\u0001\u0000\u0000\u0000/\u00bc\u0001\u0000\u0000\u00001"+
		"\u00be\u0001\u0000\u0000\u00003\u00c0\u0001\u0000\u0000\u00005\u00c8\u0001"+
		"\u0000\u0000\u00007\u00ce\u0001\u0000\u0000\u00009\u00d0\u0001\u0000\u0000"+
		"\u0000;\u00d3\u0001\u0000\u0000\u0000=\u00d6\u0001\u0000\u0000\u0000?"+
		"\u00d8\u0001\u0000\u0000\u0000A\u00da\u0001\u0000\u0000\u0000C\u00dd\u0001"+
		"\u0000\u0000\u0000E\u00e8\u0001\u0000\u0000\u0000G\u00f3\u0001\u0000\u0000"+
		"\u0000I\u00f7\u0001\u0000\u0000\u0000KL\u0005{\u0000\u0000L\u0002\u0001"+
		"\u0000\u0000\u0000MN\u0005}\u0000\u0000N\u0004\u0001\u0000\u0000\u0000"+
		"OP\u0005(\u0000\u0000P\u0006\u0001\u0000\u0000\u0000QR\u0005:\u0000\u0000"+
		"R\b\u0001\u0000\u0000\u0000ST\u0005)\u0000\u0000T\n\u0001\u0000\u0000"+
		"\u0000UV\u0005[\u0000\u0000V\f\u0001\u0000\u0000\u0000WX\u0005]\u0000"+
		"\u0000X\u000e\u0001\u0000\u0000\u0000YZ\u00050\u0000\u0000Z\u0010\u0001"+
		"\u0000\u0000\u0000[\\\u0005?\u0000\u0000\\\u0012\u0001\u0000\u0000\u0000"+
		"]^\u0005=\u0000\u0000^_\u0005>\u0000\u0000_\u0014\u0001\u0000\u0000\u0000"+
		"`a\u0005m\u0000\u0000ab\u0005a\u0000\u0000bc\u0005i\u0000\u0000cd\u0005"+
		"n\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005i\u0000\u0000fg\u0005"+
		"n\u0000\u0000gh\u0005t\u0000\u0000h\u0018\u0001\u0000\u0000\u0000ij\u0005"+
		"f\u0000\u0000jk\u0005l\u0000\u0000kl\u0005o\u0000\u0000lm\u0005a\u0000"+
		"\u0000mn\u0005t\u0000\u0000n\u001a\u0001\u0000\u0000\u0000op\u0005b\u0000"+
		"\u0000pq\u0005o\u0000\u0000qr\u0005o\u0000\u0000rs\u0005l\u0000\u0000"+
		"st\u0005e\u0000\u0000tu\u0005a\u0000\u0000uv\u0005n\u0000\u0000v\u001c"+
		"\u0001\u0000\u0000\u0000wx\u0005t\u0000\u0000xy\u0005r\u0000\u0000yz\u0005"+
		"u\u0000\u0000z\u0081\u0005e\u0000\u0000{|\u0005f\u0000\u0000|}\u0005a"+
		"\u0000\u0000}~\u0005l\u0000\u0000~\u007f\u0005s\u0000\u0000\u007f\u0081"+
		"\u0005e\u0000\u0000\u0080w\u0001\u0000\u0000\u0000\u0080{\u0001\u0000"+
		"\u0000\u0000\u0081\u001e\u0001\u0000\u0000\u0000\u0082\u0083\u0005f\u0000"+
		"\u0000\u0083\u0084\u0005u\u0000\u0000\u0084\u0085\u0005n\u0000\u0000\u0085"+
		"\u0086\u0005c\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087\u0088\u0005"+
		"i\u0000\u0000\u0088\u0089\u0005o\u0000\u0000\u0089\u008a\u0005n\u0000"+
		"\u0000\u008a \u0001\u0000\u0000\u0000\u008b\u008c\u0005p\u0000\u0000\u008c"+
		"\u008d\u0005r\u0000\u0000\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005"+
		"n\u0000\u0000\u008f\u0090\u0005t\u0000\u0000\u0090\"\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005f\u0000\u0000\u0092\u0093\u0005o\u0000\u0000\u0093"+
		"\u0094\u0005r\u0000\u0000\u0094$\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"r\u0000\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005t\u0000"+
		"\u0000\u0098\u0099\u0005u\u0000\u0000\u0099\u009a\u0005r\u0000\u0000\u009a"+
		"\u009b\u0005n\u0000\u0000\u009b&\u0001\u0000\u0000\u0000\u009c\u00a6\u0003"+
		"\u001f\u000f\u0000\u009d\u00a6\u0003\u0015\n\u0000\u009e\u00a6\u0003\u0017"+
		"\u000b\u0000\u009f\u00a6\u0003\u0019\f\u0000\u00a0\u00a6\u0003\u001b\r"+
		"\u0000\u00a1\u00a6\u0003\u001d\u000e\u0000\u00a2\u00a6\u0003!\u0010\u0000"+
		"\u00a3\u00a6\u0003#\u0011\u0000\u00a4\u00a6\u0003%\u0012\u0000\u00a5\u009c"+
		"\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000\u0000\u0000\u00a5\u009e"+
		"\u0001\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6(\u0001\u0000\u0000\u0000\u00a7\u00ab\u0007"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0007\u0001\u0000\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac*\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b2\u0007\u0002"+
		"\u0000\u0000\u00af\u00b1\u0007\u0003\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3,\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b9\u0007\u0004\u0000"+
		"\u0000\u00b6\u00b8\u0007\u0003\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba.\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005!\u0000\u0000\u00bd"+
		"0\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0005\u0000\u0000\u00bf2\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0007\u0006\u0000\u0000\u00c14\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c9\u0005<\u0000\u0000\u00c3\u00c4\u0005<\u0000\u0000"+
		"\u00c4\u00c9\u0005=\u0000\u0000\u00c5\u00c9\u0005>\u0000\u0000\u00c6\u00c7"+
		"\u0005>\u0000\u0000\u00c7\u00c9\u0005=\u0000\u0000\u00c8\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c96\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005=\u0000\u0000\u00cb\u00cf\u0005=\u0000\u0000\u00cc"+
		"\u00cd\u0005!\u0000\u0000\u00cd\u00cf\u0005=\u0000\u0000\u00ce\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf8\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1\u00d2\u0005&\u0000\u0000"+
		"\u00d2:\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005|\u0000\u0000\u00d4\u00d5"+
		"\u0005|\u0000\u0000\u00d5<\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005="+
		"\u0000\u0000\u00d7>\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005,\u0000\u0000"+
		"\u00d9@\u0001\u0000\u0000\u0000\u00da\u00db\u0005;\u0000\u0000\u00dbB"+
		"\u0001\u0000\u0000\u0000\u00dc\u00de\u0007\u0001\u0000\u0000\u00dd\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e3\u0007\u0007\u0000\u0000\u00e2\u00e4"+
		"\u0007\u0001\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6D\u0001\u0000\u0000\u0000\u00e7\u00e9\u0007"+
		"\b\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006\"\u0000"+
		"\u0000\u00edF\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005\r\u0000\u0000"+
		"\u00ef\u00f1\u0005\n\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0005\n\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f3\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0006#\u0000\u0000\u00f6H\u0001\u0000\u0000\u0000\u00f7\u00fb\u0005#"+
		"\u0000\u0000\u00f8\u00fa\b\t\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0006$\u0000\u0000"+
		"\u00ffJ\u0001\u0000\u0000\u0000\u000e\u0000\u0080\u00a5\u00ab\u00b2\u00b9"+
		"\u00c8\u00ce\u00df\u00e5\u00ea\u00f0\u00f3\u00fb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}