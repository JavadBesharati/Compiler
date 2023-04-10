// Generated from E:/Uni/Uni06/3. compiler/2. CAs/Compiler-Projects-UT-Spring-2023/Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogicPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VALUE=7, FLOAT=8, INT=9, 
		NATURAL_NUMBERS=10, FUNCTION=11, MAIN=12, TYPE=13, BOOLEAN=14, PRINT=15, 
		FOR=16, RETURN=17, KEYWORDS=18, IDENTIFIER=19, PRIDICATE=20, QUERY_1=21, 
		QUERY_2=22, UNARY_OP=23, BINARY_ARITHMETIC_OP1=24, BINARY_ARITHMETIC_OP2=25, 
		RELATIONAL_OP1=26, RELATIONAL_OP2=27, LOGICAL_AND_OP=28, LOGICAL_OR_OP=29, 
		ASSIGNMENT_OP=30, OPERATORS=31, ARRAY_TYPE=32, ARRAY_VALUE=33, ARRAY_ELEMENT=34, 
		COMMA=35, SEMICOLON=36, WHITESPACE=37, NEWLINE=38, COMMENT=39;
	public static final int
		RULE_logicPL = 0, RULE_main_call = 1, RULE_body = 2, RULE_line = 3, RULE_function_declare = 4, 
		RULE_argument = 5, RULE_arguments = 6, RULE_variable_declare = 7, RULE_return = 8, 
		RULE_print_call = 9, RULE_inputs = 10, RULE_function_call = 11, RULE_for = 12, 
		RULE_predicate_statement = 13, RULE_implication_statement = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "main_call", "body", "line", "function_declare", "argument", 
			"arguments", "variable_declare", "return", "print_call", "inputs", "function_call", 
			"for", "predicate_statement", "implication_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "':'", "'=>'", null, null, null, null, 
			"'function'", "'main'", null, null, "'print'", "'for'", "'return'", null, 
			null, null, null, null, null, null, null, null, null, "'&&'", "'||'", 
			"'='", null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "VALUE", "FLOAT", "INT", "NATURAL_NUMBERS", 
			"FUNCTION", "MAIN", "TYPE", "BOOLEAN", "PRINT", "FOR", "RETURN", "KEYWORDS", 
			"IDENTIFIER", "PRIDICATE", "QUERY_1", "QUERY_2", "UNARY_OP", "BINARY_ARITHMETIC_OP1", 
			"BINARY_ARITHMETIC_OP2", "RELATIONAL_OP1", "RELATIONAL_OP2", "LOGICAL_AND_OP", 
			"LOGICAL_OR_OP", "ASSIGNMENT_OP", "OPERATORS", "ARRAY_TYPE", "ARRAY_VALUE", 
			"ARRAY_ELEMENT", "COMMA", "SEMICOLON", "WHITESPACE", "NEWLINE", "COMMENT"
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
	public String getGrammarFileName() { return "LogicPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicPLContext extends ParserRuleContext {
		public Main_callContext main_call() {
			return getRuleContext(Main_callContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LogicPLParser.EOF, 0); }
		public List<Function_declareContext> function_declare() {
			return getRuleContexts(Function_declareContext.class);
		}
		public Function_declareContext function_declare(int i) {
			return getRuleContext(Function_declareContext.class,i);
		}
		public LogicPLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicPL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLogicPL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLogicPL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLogicPL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicPLContext logicPL() throws RecognitionException {
		LogicPLContext _localctx = new LogicPLContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logicPL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(30);
				function_declare();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			main_call();
			setState(37);
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
	public static class Main_callContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(LogicPLParser.MAIN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Main_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMain_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMain_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMain_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_callContext main_call() throws RecognitionException {
		Main_callContext _localctx = new Main_callContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(MAIN);
			setState(40);
			match(T__0);
			setState(41);
			body();
			setState(42);
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
	public static class BodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1187848L) != 0)) {
				{
				{
				setState(44);
				line();
				}
				}
				setState(49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public Variable_declareContext variable_declare() {
			return getRuleContext(Variable_declareContext.class,0);
		}
		public Predicate_statementContext predicate_statement() {
			return getRuleContext(Predicate_statementContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Implication_statementContext implication_statement() {
			return getRuleContext(Implication_statementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case RETURN:
			case PRIDICATE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(50);
					variable_declare();
					}
					break;
				case PRIDICATE:
					{
					setState(51);
					predicate_statement();
					}
					break;
				case RETURN:
					{
					setState(52);
					return_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55);
				match(SEMICOLON);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				implication_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declareContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LogicPLParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(LogicPLParser.TYPE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Function_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunction_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunction_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunction_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declareContext function_declare() throws RecognitionException {
		Function_declareContext _localctx = new Function_declareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FUNCTION);
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(T__2);
			{
			setState(63);
			arguments();
			}
			setState(64);
			match(T__3);
			setState(65);
			match(T__4);
			setState(66);
			match(TYPE);
			setState(67);
			match(T__0);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1187848L) != 0)) {
				{
				{
				setState(68);
				line();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LogicPLParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(TYPE);
			setState(77);
			match(IDENTIFIER);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79);
			argument();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				argument();
				}
				}
				setState(86);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declareContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LogicPLParser.TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogicPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogicPLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(LogicPLParser.VALUE, 0); }
		public Variable_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVariable_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVariable_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVariable_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declareContext variable_declare() throws RecognitionException {
		Variable_declareContext _localctx = new Variable_declareContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(87);
			match(TYPE);
			setState(88);
			match(IDENTIFIER);
			setState(89);
			match(ASSIGNMENT_OP);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(90);
				function_call();
				}
				break;
			case 2:
				{
				setState(91);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(92);
				match(IDENTIFIER);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LogicPLParser.RETURN, 0); }
		public TerminalNode VALUE() { return getToken(LogicPLParser.VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(RETURN);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(96);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(97);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(98);
				function_call();
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
	public static class Print_callContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LogicPLParser.PRINT, 0); }
		public Print_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrint_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrint_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrint_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_callContext print_call() throws RecognitionException {
		Print_callContext _localctx = new Print_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PRINT);
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
	public static class InputsContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(LogicPLParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(LogicPLParser.VALUE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogicPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogicPLParser.IDENTIFIER, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(103);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(104);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(105);
				function_call();
				}
				break;
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(109);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(110);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(111);
					function_call();
					}
					break;
				}
				}
				}
				setState(118);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(T__2);
			setState(121);
			inputs();
			setState(122);
			match(T__3);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LogicPLParser.FOR, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(FOR);
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
	public static class Predicate_statementContext extends ParserRuleContext {
		public TerminalNode PRIDICATE() { return getToken(LogicPLParser.PRIDICATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public Predicate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_statementContext predicate_statement() throws RecognitionException {
		Predicate_statementContext _localctx = new Predicate_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predicate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(PRIDICATE);
			setState(127);
			match(T__2);
			setState(128);
			match(IDENTIFIER);
			setState(129);
			match(T__3);
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
	public static class Implication_statementContext extends ParserRuleContext {
		public Implication_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterImplication_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitImplication_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitImplication_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implication_statementContext implication_statement() throws RecognitionException {
		Implication_statementContext _localctx = new Implication_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_implication_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__2);
			setState(132);
			match(T__3);
			setState(133);
			match(T__5);
			setState(134);
			match(T__2);
			setState(135);
			match(T__3);
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
		"\u0004\u0001\'\u008a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003;\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"S\b\u0006\n\u0006\f\u0006V\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007^\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bd\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\nk\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nq\b\n\u0005\ns"+
		"\b\n\n\n\f\nv\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0000\u008a\u0000!\u0001\u0000\u0000\u0000"+
		"\u0002\'\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006"+
		":\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010"+
		"_\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014j\u0001"+
		"\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000"+
		"\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u0083\u0001\u0000\u0000\u0000"+
		"\u001e \u0003\b\u0004\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0003\u0002"+
		"\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000"+
		"\'(\u0005\f\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003\u0004\u0002"+
		"\u0000*+\u0005\u0002\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,.\u0003"+
		"\u0006\u0003\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000026\u0003\u000e\u0007\u000036\u0003"+
		"\u001a\r\u000046\u0003\u0010\b\u000052\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0005$\u0000\u00008;\u0001\u0000\u0000\u00009;\u0003\u001c\u000e\u0000"+
		":5\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\u0007\u0001\u0000"+
		"\u0000\u0000<=\u0005\u000b\u0000\u0000=>\u0005\u0013\u0000\u0000>?\u0005"+
		"\u0003\u0000\u0000?@\u0003\f\u0006\u0000@A\u0005\u0004\u0000\u0000AB\u0005"+
		"\u0005\u0000\u0000BC\u0005\r\u0000\u0000CG\u0005\u0001\u0000\u0000DF\u0003"+
		"\u0006\u0003\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000K\t\u0001\u0000"+
		"\u0000\u0000LM\u0005\r\u0000\u0000MN\u0005\u0013\u0000\u0000N\u000b\u0001"+
		"\u0000\u0000\u0000OT\u0003\n\u0005\u0000PQ\u0005#\u0000\u0000QS\u0003"+
		"\n\u0005\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WX\u0005\r\u0000\u0000XY\u0005\u0013\u0000\u0000"+
		"Y]\u0005\u001e\u0000\u0000Z^\u0003\u0016\u000b\u0000[^\u0005\u0007\u0000"+
		"\u0000\\^\u0005\u0013\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u000f\u0001\u0000\u0000\u0000"+
		"_c\u0005\u0011\u0000\u0000`d\u0005\u0007\u0000\u0000ad\u0005\u0013\u0000"+
		"\u0000bd\u0003\u0016\u000b\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0011\u0001\u0000\u0000\u0000"+
		"ef\u0005\u000f\u0000\u0000f\u0013\u0001\u0000\u0000\u0000gk\u0005\u0007"+
		"\u0000\u0000hk\u0005\u0013\u0000\u0000ik\u0003\u0016\u000b\u0000jg\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"kt\u0001\u0000\u0000\u0000lp\u0005#\u0000\u0000mq\u0005\u0007\u0000\u0000"+
		"nq\u0005\u0013\u0000\u0000oq\u0003\u0016\u000b\u0000pm\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rl\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0015\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u0013\u0000\u0000xy\u0005\u0003"+
		"\u0000\u0000yz\u0003\u0014\n\u0000z{\u0005\u0004\u0000\u0000{\u0017\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0010\u0000\u0000}\u0019\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0014\u0000\u0000\u007f\u0080\u0005\u0003\u0000\u0000"+
		"\u0080\u0081\u0005\u0013\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000"+
		"\u0082\u001b\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0003\u0000\u0000"+
		"\u0084\u0085\u0005\u0004\u0000\u0000\u0085\u0086\u0005\u0006\u0000\u0000"+
		"\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005\u0004\u0000\u0000"+
		"\u0088\u001d\u0001\u0000\u0000\u0000\u000b!/5:GT]cjpt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}