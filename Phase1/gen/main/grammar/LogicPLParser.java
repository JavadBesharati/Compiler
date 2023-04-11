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
		RULE_argument = 5, RULE_arguments = 6, RULE_variable_declare = 7, RULE_change_variale = 8, 
		RULE_return = 9, RULE_print_call = 10, RULE_inputs = 11, RULE_function_call = 12, 
		RULE_for = 13, RULE_predicate_statement = 14, RULE_and_expression = 15, 
		RULE_or_expression = 16, RULE_logical_expression = 17, RULE_boolean_expression = 18, 
		RULE_implication_statement = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "main_call", "body", "line", "function_declare", "argument", 
			"arguments", "variable_declare", "change_variale", "return", "print_call", 
			"inputs", "function_call", "for", "predicate_statement", "and_expression", 
			"or_expression", "logical_expression", "boolean_expression", "implication_statement"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(40);
				function_declare();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			main_call();
			setState(47);
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
			setState(49);
			match(MAIN);
			setState(50);
			match(T__0);
			setState(51);
			body();
			setState(52);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1777672L) != 0)) {
				{
				{
				setState(54);
				line();
				}
				}
				setState(59);
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
		public Change_varialeContext change_variale() {
			return getRuleContext(Change_varialeContext.class,0);
		}
		public Predicate_statementContext predicate_statement() {
			return getRuleContext(Predicate_statementContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Implication_statementContext implication_statement() {
			return getRuleContext(Implication_statementContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case RETURN:
			case IDENTIFIER:
			case PRIDICATE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(60);
					variable_declare();
					}
					break;
				case 2:
					{
					setState(61);
					change_variale();
					}
					break;
				case 3:
					{
					setState(62);
					predicate_statement();
					}
					break;
				case 4:
					{
					setState(63);
					return_();
					}
					break;
				case 5:
					{
					setState(64);
					function_call();
					}
					break;
				}
				setState(67);
				match(SEMICOLON);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				implication_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				for_();
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
			setState(73);
			match(FUNCTION);
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(T__2);
			{
			setState(76);
			arguments();
			}
			setState(77);
			match(T__3);
			setState(78);
			match(T__4);
			setState(79);
			match(TYPE);
			setState(80);
			match(T__0);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1777672L) != 0)) {
				{
				{
				setState(81);
				line();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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
			setState(89);
			match(TYPE);
			setState(90);
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
			setState(92);
			argument();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				argument();
				}
				}
				setState(99);
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
			setState(100);
			match(TYPE);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(ASSIGNMENT_OP);
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(103);
				function_call();
				}
				break;
			case 2:
				{
				setState(104);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(105);
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
	public static class Change_varialeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogicPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogicPLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(LogicPLParser.VALUE, 0); }
		public Change_varialeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_variale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterChange_variale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitChange_variale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitChange_variale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_varialeContext change_variale() throws RecognitionException {
		Change_varialeContext _localctx = new Change_varialeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_change_variale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(ASSIGNMENT_OP);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(110);
				function_call();
				}
				break;
			case 2:
				{
				setState(111);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(112);
				match(IDENTIFIER);
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
		enterRule(_localctx, 18, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(RETURN);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(116);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(117);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(118);
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
		enterRule(_localctx, 20, RULE_print_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 22, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(123);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(124);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(125);
				function_call();
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(129);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(130);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(131);
					function_call();
					}
					break;
				}
				}
				}
				setState(138);
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
		enterRule(_localctx, 24, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(T__2);
			setState(141);
			inputs();
			setState(142);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogicPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogicPLParser.IDENTIFIER, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FOR);
			setState(145);
			match(T__2);
			setState(146);
			match(IDENTIFIER);
			setState(147);
			match(T__4);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(T__3);
			setState(150);
			match(T__0);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1777672L) != 0)) {
				{
				{
				setState(151);
				line();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
		enterRule(_localctx, 28, RULE_predicate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(PRIDICATE);
			setState(160);
			match(T__2);
			setState(161);
			match(IDENTIFIER);
			setState(162);
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
	public static class And_expressionContext extends ParserRuleContext {
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class Or_expressionContext extends ParserRuleContext {
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class Logical_expressionContext extends ParserRuleContext {
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logical_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class Boolean_expressionContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			function_call();
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
	public static class Implication_statementContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
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
		enterRule(_localctx, 38, RULE_implication_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__2);
			setState(173);
			boolean_expression();
			setState(174);
			match(T__3);
			setState(175);
			match(T__5);
			setState(176);
			match(T__2);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1777672L) != 0)) {
				{
				{
				setState(177);
				line();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
		"\u0004\u0001\'\u00ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u00028\b\u0002"+
		"\n\u0002\f\u0002;\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007k\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\br\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\tx\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u007f\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0085\b\u000b\u0005\u000b\u0087\b\u000b\n\u000b"+
		"\f\u000b\u008a\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0099"+
		"\b\r\n\r\f\r\u009c\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00b3\b\u0013"+
		"\n\u0013\f\u0013\u00b6\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u00bc\u0000+\u0001\u0000\u0000"+
		"\u0000\u00021\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006"+
		"G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000"+
		"\u0000\f\\\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010"+
		"l\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014y\u0001"+
		"\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u008b\u0001\u0000"+
		"\u0000\u0000\u001a\u0090\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000"+
		"\u0000\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000"+
		"\u0000\"\u00a8\u0001\u0000\u0000\u0000$\u00aa\u0001\u0000\u0000\u0000"+
		"&\u00ac\u0001\u0000\u0000\u0000(*\u0003\b\u0004\u0000)(\u0001\u0000\u0000"+
		"\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0003"+
		"\u0002\u0001\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000"+
		"\u000012\u0005\f\u0000\u000023\u0005\u0001\u0000\u000034\u0003\u0004\u0002"+
		"\u000045\u0005\u0002\u0000\u00005\u0003\u0001\u0000\u0000\u000068\u0003"+
		"\u0006\u0003\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0005\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<B\u0003\u000e\u0007\u0000=B\u0003"+
		"\u0010\b\u0000>B\u0003\u001c\u000e\u0000?B\u0003\u0012\t\u0000@B\u0003"+
		"\u0018\f\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0005$\u0000\u0000DH\u0001\u0000\u0000\u0000"+
		"EH\u0003&\u0013\u0000FH\u0003\u001a\r\u0000GA\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0007\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u000b\u0000\u0000JK\u0005\u0013\u0000\u0000KL\u0005"+
		"\u0003\u0000\u0000LM\u0003\f\u0006\u0000MN\u0005\u0004\u0000\u0000NO\u0005"+
		"\u0005\u0000\u0000OP\u0005\r\u0000\u0000PT\u0005\u0001\u0000\u0000QS\u0003"+
		"\u0006\u0003\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WX\u0005\u0002\u0000\u0000X\t\u0001\u0000"+
		"\u0000\u0000YZ\u0005\r\u0000\u0000Z[\u0005\u0013\u0000\u0000[\u000b\u0001"+
		"\u0000\u0000\u0000\\a\u0003\n\u0005\u0000]^\u0005#\u0000\u0000^`\u0003"+
		"\n\u0005\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\r\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000de\u0005\r\u0000\u0000ef\u0005\u0013\u0000\u0000"+
		"fj\u0005\u001e\u0000\u0000gk\u0003\u0018\f\u0000hk\u0005\u0007\u0000\u0000"+
		"ik\u0005\u0013\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\u000f\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0013\u0000\u0000mq\u0005\u001e\u0000\u0000nr\u0003\u0018\f\u0000or\u0005"+
		"\u0007\u0000\u0000pr\u0005\u0013\u0000\u0000qn\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0011\u0001\u0000"+
		"\u0000\u0000sw\u0005\u0011\u0000\u0000tx\u0005\u0007\u0000\u0000ux\u0005"+
		"\u0013\u0000\u0000vx\u0003\u0018\f\u0000wt\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0013\u0001\u0000\u0000"+
		"\u0000yz\u0005\u000f\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{\u007f"+
		"\u0005\u0007\u0000\u0000|\u007f\u0005\u0013\u0000\u0000}\u007f\u0003\u0018"+
		"\f\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0088\u0001\u0000\u0000\u0000\u0080\u0084\u0005#\u0000"+
		"\u0000\u0081\u0085\u0005\u0007\u0000\u0000\u0082\u0085\u0005\u0013\u0000"+
		"\u0000\u0083\u0085\u0003\u0018\f\u0000\u0084\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0017\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0013\u0000\u0000"+
		"\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0003\u0016\u000b\u0000"+
		"\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0019\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005\u0010\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000"+
		"\u0092\u0093\u0005\u0013\u0000\u0000\u0093\u0094\u0005\u0005\u0000\u0000"+
		"\u0094\u0095\u0005\u0013\u0000\u0000\u0095\u0096\u0005\u0004\u0000\u0000"+
		"\u0096\u009a\u0005\u0001\u0000\u0000\u0097\u0099\u0003\u0006\u0003\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u0002\u0000\u0000\u009e\u001b\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u0014\u0000\u0000\u00a0\u00a1\u0005\u0003\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0013\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000"+
		"\u00a3\u001d\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7!\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"#\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0018\f\u0000\u00ab%\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0003"+
		"$\u0012\u0000\u00ae\u00af\u0005\u0004\u0000\u0000\u00af\u00b0\u0005\u0006"+
		"\u0000\u0000\u00b0\u00b4\u0005\u0003\u0000\u0000\u00b1\u00b3\u0003\u0006"+
		"\u0003\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\'\u0001\u0000\u0000"+
		"\u0000\u000e+9AGTajqw~\u0084\u0088\u009a\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}