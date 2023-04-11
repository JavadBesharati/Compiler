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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, VALUE=6, FLOAT=7, INT=8, NATURAL_NUMBERS=9, 
		FUNCTION=10, MAIN=11, TYPE=12, BOOLEAN=13, PRINT=14, FOR=15, RETURN=16, 
		KEYWORDS=17, IDENTIFIER=18, PRIDICATE=19, QUERY_1=20, QUERY_2=21, UNARY_OP=22, 
		BINARY_ARITHMETIC_OP1=23, BINARY_ARITHMETIC_OP2=24, RELATIONAL_OP1=25, 
		RELATIONAL_OP2=26, LOGICAL_AND_OP=27, LOGICAL_OR_OP=28, ASSIGNMENT_OP=29, 
		OPERATORS=30, ARRAY_TYPE=31, ARRAY_VALUE=32, ARRAY_ELEMENT=33, COMMA=34, 
		SEMICOLON=35, WHITESPACE=36, NEWLINE=37, COMMENT=38;
	public static final int
		RULE_logicPL = 0, RULE_main_call = 1, RULE_body = 2, RULE_line = 3, RULE_function_declare = 4, 
		RULE_argument = 5, RULE_arguments = 6, RULE_array_declare = 7, RULE_element_declare = 8, 
		RULE_variable_declare = 9, RULE_change_variale = 10, RULE_return = 11, 
		RULE_print_call = 12, RULE_inputs = 13, RULE_function_call = 14, RULE_for = 15, 
		RULE_predicate_statement = 16, RULE_boolean_expression = 17, RULE_implication_statement = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "main_call", "body", "line", "function_declare", "argument", 
			"arguments", "array_declare", "element_declare", "variable_declare", 
			"change_variale", "return", "print_call", "inputs", "function_call", 
			"for", "predicate_statement", "boolean_expression", "implication_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "':'", null, null, null, null, "'function'", 
			"'main'", null, null, "'print'", "'for'", "'return'", null, null, null, 
			null, null, null, null, null, null, null, "'&&'", "'||'", "'='", null, 
			null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "VALUE", "FLOAT", "INT", "NATURAL_NUMBERS", 
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(38);
				function_declare();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			main_call();
			setState(45);
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
			setState(47);
			match(MAIN);
			setState(48);
			match(T__0);
			setState(49);
			body();
			setState(50);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34360627200L) != 0)) {
				{
				{
				setState(52);
				line();
				}
				}
				setState(57);
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
		public Array_declareContext array_declare() {
			return getRuleContext(Array_declareContext.class,0);
		}
		public Element_declareContext element_declare() {
			return getRuleContext(Element_declareContext.class,0);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case RETURN:
			case IDENTIFIER:
			case PRIDICATE:
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(58);
					variable_declare();
					}
					break;
				case 2:
					{
					setState(59);
					change_variale();
					}
					break;
				case 3:
					{
					setState(60);
					array_declare();
					}
					break;
				case 4:
					{
					setState(61);
					element_declare();
					}
					break;
				case 5:
					{
					setState(62);
					predicate_statement();
					}
					break;
				case 6:
					{
					setState(63);
					return_();
					}
					break;
				case 7:
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
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
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
			setState(72);
			match(FUNCTION);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(T__2);
			{
			setState(75);
			arguments();
			}
			setState(76);
			match(T__3);
			setState(77);
			match(T__4);
			setState(78);
			match(TYPE);
			setState(79);
			match(T__0);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34360627200L) != 0)) {
				{
				{
				setState(80);
				line();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(88);
			match(TYPE);
			setState(89);
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
			setState(91);
			argument();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				argument();
				}
				}
				setState(98);
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
	public static class Array_declareContext extends ParserRuleContext {
		public Array_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArray_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArray_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArray_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declareContext array_declare() throws RecognitionException {
		Array_declareContext _localctx = new Array_declareContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_declare);
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
	public static class Element_declareContext extends ParserRuleContext {
		public Element_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterElement_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitElement_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitElement_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_declareContext element_declare() throws RecognitionException {
		Element_declareContext _localctx = new Element_declareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_element_declare);
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
		public TerminalNode ARRAY_ELEMENT() { return getToken(LogicPLParser.ARRAY_ELEMENT, 0); }
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
		enterRule(_localctx, 18, RULE_variable_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(103);
			match(TYPE);
			setState(104);
			match(IDENTIFIER);
			setState(105);
			match(ASSIGNMENT_OP);
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(106);
				function_call();
				}
				break;
			case 2:
				{
				setState(107);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(108);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(109);
				match(ARRAY_ELEMENT);
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
		enterRule(_localctx, 20, RULE_change_variale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(ASSIGNMENT_OP);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(114);
				function_call();
				}
				break;
			case 2:
				{
				setState(115);
				match(VALUE);
				}
				break;
			case 3:
				{
				setState(116);
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
		enterRule(_localctx, 22, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RETURN);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(120);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(121);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(122);
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
		enterRule(_localctx, 24, RULE_print_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 26, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				match(VALUE);
				}
				break;
			case 2:
				{
				setState(128);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(129);
				function_call();
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(133);
					match(VALUE);
					}
					break;
				case 2:
					{
					setState(134);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(135);
					function_call();
					}
					break;
				}
				}
				}
				setState(142);
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
		enterRule(_localctx, 28, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDENTIFIER);
			setState(144);
			match(T__2);
			setState(145);
			inputs();
			setState(146);
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
		enterRule(_localctx, 30, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FOR);
			setState(149);
			match(T__2);
			setState(150);
			match(IDENTIFIER);
			setState(151);
			match(T__4);
			setState(152);
			match(IDENTIFIER);
			setState(153);
			match(T__3);
			setState(154);
			match(T__0);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34360627200L) != 0)) {
				{
				{
				setState(155);
				line();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		enterRule(_localctx, 32, RULE_predicate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PRIDICATE);
			setState(164);
			match(T__2);
			setState(165);
			match(IDENTIFIER);
			setState(166);
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
	public static class Boolean_expressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_boolean_expression);
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
		enterRule(_localctx, 36, RULE_implication_statement);
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

	public static final String _serializedATN =
		"\u0004\u0001&\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u00029\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"_\b\u0006\n\u0006\f\u0006b\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\to\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nv\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b|\b\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0083\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0089\b\r\u0005\r\u008b\b\r\n\r\f\r\u008e\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u009d\b\u000f\n\u000f\f\u000f\u00a0\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0000\u00b1\u0000)\u0001\u0000\u0000\u0000\u0002/\u0001\u0000"+
		"\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000"+
		"\bH\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000\f[\u0001\u0000"+
		"\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012g\u0001\u0000\u0000\u0000\u0014p\u0001\u0000\u0000\u0000\u0016w"+
		"\u0001\u0000\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0082\u0001"+
		"\u0000\u0000\u0000\u001c\u008f\u0001\u0000\u0000\u0000\u001e\u0094\u0001"+
		"\u0000\u0000\u0000 \u00a3\u0001\u0000\u0000\u0000\"\u00a8\u0001\u0000"+
		"\u0000\u0000$\u00aa\u0001\u0000\u0000\u0000&(\u0003\b\u0004\u0000\'&\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0003\u0002\u0001\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001"+
		"\u0000\u0000\u0000/0\u0005\u000b\u0000\u000001\u0005\u0001\u0000\u0000"+
		"12\u0003\u0004\u0002\u000023\u0005\u0002\u0000\u00003\u0003\u0001\u0000"+
		"\u0000\u000046\u0003\u0006\u0003\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u0005\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:B\u0003\u0012"+
		"\t\u0000;B\u0003\u0014\n\u0000<B\u0003\u000e\u0007\u0000=B\u0003\u0010"+
		"\b\u0000>B\u0003 \u0010\u0000?B\u0003\u0016\u000b\u0000@B\u0003\u001c"+
		"\u000e\u0000A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A<\u0001"+
		"\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0005#\u0000\u0000DG\u0001\u0000\u0000\u0000EG\u0003\u001e\u000f"+
		"\u0000FA\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HI\u0005\n\u0000\u0000IJ\u0005\u0012\u0000\u0000JK\u0005"+
		"\u0003\u0000\u0000KL\u0003\f\u0006\u0000LM\u0005\u0004\u0000\u0000MN\u0005"+
		"\u0005\u0000\u0000NO\u0005\f\u0000\u0000OS\u0005\u0001\u0000\u0000PR\u0003"+
		"\u0006\u0003\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VW\u0005\u0002\u0000\u0000W\t\u0001\u0000"+
		"\u0000\u0000XY\u0005\f\u0000\u0000YZ\u0005\u0012\u0000\u0000Z\u000b\u0001"+
		"\u0000\u0000\u0000[`\u0003\n\u0005\u0000\\]\u0005\"\u0000\u0000]_\u0003"+
		"\n\u0005\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^"+
		"\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\r\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000f\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0011\u0001\u0000\u0000"+
		"\u0000gh\u0005\f\u0000\u0000hi\u0005\u0012\u0000\u0000in\u0005\u001d\u0000"+
		"\u0000jo\u0003\u001c\u000e\u0000ko\u0005\u0006\u0000\u0000lo\u0005\u0012"+
		"\u0000\u0000mo\u0005!\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0013"+
		"\u0001\u0000\u0000\u0000pq\u0005\u0012\u0000\u0000qu\u0005\u001d\u0000"+
		"\u0000rv\u0003\u001c\u000e\u0000sv\u0005\u0006\u0000\u0000tv\u0005\u0012"+
		"\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000v\u0015\u0001\u0000\u0000\u0000w{\u0005\u0010\u0000"+
		"\u0000x|\u0005\u0006\u0000\u0000y|\u0005\u0012\u0000\u0000z|\u0003\u001c"+
		"\u000e\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u0017\u0001\u0000\u0000\u0000}~\u0005\u000e\u0000"+
		"\u0000~\u0019\u0001\u0000\u0000\u0000\u007f\u0083\u0005\u0006\u0000\u0000"+
		"\u0080\u0083\u0005\u0012\u0000\u0000\u0081\u0083\u0003\u001c\u000e\u0000"+
		"\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u008c\u0001\u0000\u0000\u0000"+
		"\u0084\u0088\u0005\"\u0000\u0000\u0085\u0089\u0005\u0006\u0000\u0000\u0086"+
		"\u0089\u0005\u0012\u0000\u0000\u0087\u0089\u0003\u001c\u000e\u0000\u0088"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0084\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u001b\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0012\u0000\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091"+
		"\u0092\u0003\u001a\r\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u001d"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u000f\u0000\u0000\u0095\u0096"+
		"\u0005\u0003\u0000\u0000\u0096\u0097\u0005\u0012\u0000\u0000\u0097\u0098"+
		"\u0005\u0005\u0000\u0000\u0098\u0099\u0005\u0012\u0000\u0000\u0099\u009a"+
		"\u0005\u0004\u0000\u0000\u009a\u009e\u0005\u0001\u0000\u0000\u009b\u009d"+
		"\u0003\u0006\u0003\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u001f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0003\u0000\u0000\u00a5\u00a6\u0005\u0012\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0004\u0000\u0000\u00a7!\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9#\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab%\u0001\u0000\u0000\u0000\r)7AFS`nu{\u0082\u0088\u008c"+
		"\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}