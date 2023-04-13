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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		MAIN=10, INT_TYPE=11, FLOAT_TYPE=12, BOOLEAN_TYPE=13, BOOLEAN=14, FUNCTION=15, 
		PRINT=16, FOR=17, RETURN=18, KEYWORDS=19, NATURAL_NUMBERS=20, IDENTIFIER=21, 
		PRIDICATE=22, QUERY_1=23, QUERY_2=24, LOGICAL_NOT_OP=25, BINARY_ARITHMETIC_OP1=26, 
		BINARY_ARITHMETIC_OP2=27, RELATIONAL_OP1=28, RELATIONAL_OP2=29, LOGICAL_AND_OP=30, 
		LOGICAL_OR_OP=31, ASSIGNMENT_OP=32, COMMA=33, SEMICOLON=34, FLOAT=35, 
		WHITESPACE=36, NEWLINE=37, COMMENT=38;
	public static final int
		RULE_logicPL = 0, RULE_main_call = 1, RULE_main_body = 2, RULE_line = 3, 
		RULE_for_structure = 4, RULE_for_body = 5, RULE_function_declaration = 6, 
		RULE_array_declaration = 7, RULE_array_elements = 8, RULE_argument = 9, 
		RULE_int_declaration = 10, RULE_float_declaration = 11, RULE_boolean_declaration = 12, 
		RULE_function_call = 13, RULE_function_return = 14, RULE_print_expression = 15, 
		RULE_or_expression = 16, RULE_and_expression = 17, RULE_equality_expression = 18, 
		RULE_relational_expression = 19, RULE_additive_expression = 20, RULE_multiplicative_expression = 21, 
		RULE_not_expression = 22, RULE_primary_expression = 23, RULE_predicate_expression = 24, 
		RULE_implication_expression = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "main_call", "main_body", "line", "for_structure", "for_body", 
			"function_declaration", "array_declaration", "array_elements", "argument", 
			"int_declaration", "float_declaration", "boolean_declaration", "function_call", 
			"function_return", "print_expression", "or_expression", "and_expression", 
			"equality_expression", "relational_expression", "additive_expression", 
			"multiplicative_expression", "not_expression", "primary_expression", 
			"predicate_expression", "implication_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "':'", "')'", "'['", "']'", "'0'", "'=>'", 
			"'main'", "'int'", "'float'", "'boolean'", null, "'function'", "'print'", 
			"'for'", "'return'", null, null, null, null, null, null, "'!'", null, 
			null, null, null, "'&&'", "'||'", "'='", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "MAIN", "INT_TYPE", 
			"FLOAT_TYPE", "BOOLEAN_TYPE", "BOOLEAN", "FUNCTION", "PRINT", "FOR", 
			"RETURN", "KEYWORDS", "NATURAL_NUMBERS", "IDENTIFIER", "PRIDICATE", "QUERY_1", 
			"QUERY_2", "LOGICAL_NOT_OP", "BINARY_ARITHMETIC_OP1", "BINARY_ARITHMETIC_OP2", 
			"RELATIONAL_OP1", "RELATIONAL_OP2", "LOGICAL_AND_OP", "LOGICAL_OR_OP", 
			"ASSIGNMENT_OP", "COMMA", "SEMICOLON", "FLOAT", "WHITESPACE", "NEWLINE", 
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
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(52);
				function_declaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			main_call();
			setState(59);
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
		public Main_bodyContext main_body() {
			return getRuleContext(Main_bodyContext.class,0);
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
			setState(61);
			match(MAIN);
			 System.out.println("MainBody"); 
			setState(63);
			match(T__0);
			setState(64);
			main_body();
			setState(65);
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
	public static class Main_bodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Main_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMain_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMain_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMain_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_bodyContext main_body() throws RecognitionException {
		Main_bodyContext _localctx = new Main_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34426288456L) != 0)) {
				{
				{
				setState(67);
				line();
				}
				}
				setState(72);
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
	public static class LineContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public For_structureContext for_structure() {
			return getRuleContext(For_structureContext.class,0);
		}
		public Predicate_expressionContext predicate_expression() {
			return getRuleContext(Predicate_expressionContext.class,0);
		}
		public Implication_expressionContext implication_expression() {
			return getRuleContext(Implication_expressionContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public Float_declarationContext float_declaration() {
			return getRuleContext(Float_declarationContext.class,0);
		}
		public Boolean_declarationContext boolean_declaration() {
			return getRuleContext(Boolean_declarationContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Print_expressionContext print_expression() {
			return getRuleContext(Print_expressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					{
					System.out.println("FunctionCall");
					setState(74);
					function_call();
					}
					}
					break;
				case 2:
					{
					setState(75);
					array_declaration();
					}
					break;
				case 3:
					{
					setState(76);
					int_declaration();
					}
					break;
				case 4:
					{
					setState(77);
					float_declaration();
					}
					break;
				case 5:
					{
					setState(78);
					boolean_declaration();
					}
					break;
				case 6:
					{
					setState(79);
					or_expression();
					}
					break;
				case 7:
					{
					setState(80);
					function_return();
					}
					break;
				case 8:
					{
					setState(81);
					print_expression();
					}
					break;
				}
				setState(84);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(86);
				for_structure();
				}
				break;
			case 3:
				{
				setState(87);
				predicate_expression();
				}
				break;
			case 4:
				{
				setState(88);
				implication_expression();
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
	public static class For_structureContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LogicPLParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogicPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogicPLParser.IDENTIFIER, i);
		}
		public For_bodyContext for_body() {
			return getRuleContext(For_bodyContext.class,0);
		}
		public For_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFor_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFor_structure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFor_structure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_structureContext for_structure() throws RecognitionException {
		For_structureContext _localctx = new For_structureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FOR);
			System.out.println("Loop: for");
			setState(93);
			match(T__2);
			setState(94);
			match(IDENTIFIER);
			setState(95);
			match(T__3);
			setState(96);
			match(IDENTIFIER);
			setState(97);
			match(T__4);
			setState(98);
			match(T__0);
			setState(99);
			for_body();
			setState(100);
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
	public static class For_bodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public For_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFor_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFor_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_bodyContext for_body() throws RecognitionException {
		For_bodyContext _localctx = new For_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34426288456L) != 0)) {
				{
				{
				setState(102);
				line();
				}
				}
				setState(107);
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
	public static class Function_declarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode FUNCTION() { return getToken(LogicPLParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode INT_TYPE() { return getToken(LogicPLParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(LogicPLParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(LogicPLParser.BOOLEAN_TYPE, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FUNCTION);
			setState(109);
			((Function_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 System.out.println("FunctionDec: " + ((Function_declarationContext)_localctx).IDENTIFIER.getText()); 
			setState(111);
			match(T__2);
			{
			setState(112);
			argument();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113);
				match(COMMA);
				setState(114);
				argument();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(120);
			match(T__4);
			setState(121);
			match(T__3);
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			match(T__0);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34426288456L) != 0)) {
				{
				{
				setState(124);
				line();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
	public static class Array_declarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public Token ASSIGNMENT_OP;
		public TerminalNode INT_TYPE() { return getToken(LogicPLParser.INT_TYPE, 0); }
		public TerminalNode NATURAL_NUMBERS() { return getToken(LogicPLParser.NATURAL_NUMBERS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public TerminalNode FLOAT_TYPE() { return getToken(LogicPLParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(LogicPLParser.BOOLEAN_TYPE, 0); }
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArray_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_declaration);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(INT_TYPE);
				setState(133);
				match(T__5);
				setState(134);
				match(NATURAL_NUMBERS);
				setState(135);
				match(T__6);
				setState(136);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(INT_TYPE);
				setState(139);
				match(T__5);
				setState(140);
				match(NATURAL_NUMBERS);
				setState(141);
				match(T__6);
				setState(142);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(144);
				((Array_declarationContext)_localctx).ASSIGNMENT_OP = match(ASSIGNMENT_OP);
				setState(145);
				array_elements();
				 System.out.println("Operator: " + ((Array_declarationContext)_localctx).ASSIGNMENT_OP.getText()); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(FLOAT_TYPE);
				setState(149);
				match(T__5);
				setState(150);
				match(NATURAL_NUMBERS);
				setState(151);
				match(T__6);
				setState(152);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(FLOAT_TYPE);
				setState(155);
				match(T__5);
				setState(156);
				match(NATURAL_NUMBERS);
				setState(157);
				match(T__6);
				setState(158);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(160);
				((Array_declarationContext)_localctx).ASSIGNMENT_OP = match(ASSIGNMENT_OP);
				setState(161);
				array_elements();
				 System.out.println("Operator: " + ((Array_declarationContext)_localctx).ASSIGNMENT_OP.getText()); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(BOOLEAN_TYPE);
				setState(165);
				match(T__5);
				setState(166);
				match(NATURAL_NUMBERS);
				setState(167);
				match(T__6);
				setState(168);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(BOOLEAN_TYPE);
				setState(171);
				match(T__5);
				setState(172);
				match(NATURAL_NUMBERS);
				setState(173);
				match(T__6);
				setState(174);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(176);
				((Array_declarationContext)_localctx).ASSIGNMENT_OP = match(ASSIGNMENT_OP);
				setState(177);
				array_elements();
				 System.out.println("Operator: " + ((Array_declarationContext)_localctx).ASSIGNMENT_OP.getText()); 
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
	public static class Array_elementsContext extends ParserRuleContext {
		public List<Or_expressionContext> or_expression() {
			return getRuleContexts(Or_expressionContext.class);
		}
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public Array_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArray_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArray_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArray_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elementsContext array_elements() throws RecognitionException {
		Array_elementsContext _localctx = new Array_elementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__5);
			setState(183);
			or_expression();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(184);
				match(COMMA);
				setState(185);
				or_expression();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__6);
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
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode INT_TYPE() { return getToken(LogicPLParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(LogicPLParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(LogicPLParser.BOOLEAN_TYPE, 0); }
		public TerminalNode QUERY_1() { return getToken(LogicPLParser.QUERY_1, 0); }
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
		enterRule(_localctx, 18, RULE_argument);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(193);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				((ArgumentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("ArgumentDec: " + ((ArgumentContext)_localctx).IDENTIFIER.getText()); 
				}
				}
				break;
			case QUERY_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(QUERY_1);
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
	public static class Int_declarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public Token ASSIGNMENT_OP;
		public TerminalNode INT_TYPE() { return getToken(LogicPLParser.INT_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Int_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterInt_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitInt_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitInt_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_int_declaration);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(INT_TYPE);
				setState(200);
				((Int_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Int_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(INT_TYPE);
				setState(203);
				((Int_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Int_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(205);
				((Int_declarationContext)_localctx).ASSIGNMENT_OP = match(ASSIGNMENT_OP);
				setState(206);
				additive_expression();
				 System.out.println("Operator: " + ((Int_declarationContext)_localctx).ASSIGNMENT_OP.getText()); 
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
	public static class Float_declarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public Token ASSIGNMENT_OP;
		public TerminalNode FLOAT_TYPE() { return getToken(LogicPLParser.FLOAT_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Float_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFloat_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFloat_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFloat_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_declarationContext float_declaration() throws RecognitionException {
		Float_declarationContext _localctx = new Float_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_float_declaration);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(FLOAT_TYPE);
				setState(212);
				((Float_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Float_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(FLOAT_TYPE);
				setState(215);
				((Float_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Float_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(217);
				((Float_declarationContext)_localctx).ASSIGNMENT_OP = match(ASSIGNMENT_OP);
				setState(218);
				additive_expression();
				 System.out.println("Operator: " + ((Float_declarationContext)_localctx).ASSIGNMENT_OP.getText()); 
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
	public static class Boolean_declarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public Token ASSIGNMENT_OP;
		public TerminalNode BOOLEAN_TYPE() { return getToken(LogicPLParser.BOOLEAN_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Boolean_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterBoolean_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitBoolean_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitBoolean_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolean_declaration);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(BOOLEAN_TYPE);
				setState(224);
				((Boolean_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Boolean_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(BOOLEAN_TYPE);
				setState(227);
				((Boolean_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Boolean_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(229);
				((Boolean_declarationContext)_localctx).ASSIGNMENT_OP = match(ASSIGNMENT_OP);
				setState(230);
				or_expression();
				 System.out.println("Operator: " + ((Boolean_declarationContext)_localctx).ASSIGNMENT_OP.getText()); 
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public List<Or_expressionContext> or_expression() {
			return getRuleContexts(Or_expressionContext.class);
		}
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
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
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IDENTIFIER);
			setState(236);
			match(T__2);
			setState(237);
			or_expression();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				or_expression();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__4);
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
	public static class Function_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LogicPLParser.RETURN, 0); }
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunction_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunction_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(RETURN);
			 System.out.println("Return"); 
			setState(249);
			or_expression();
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
	public static class Print_expressionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LogicPLParser.PRINT, 0); }
		public List<Or_expressionContext> or_expression() {
			return getRuleContexts(Or_expressionContext.class);
		}
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public Print_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrint_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrint_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrint_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_expressionContext print_expression() throws RecognitionException {
		Print_expressionContext _localctx = new Print_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(PRINT);
			 System.out.println("Built-in: print"); 
			setState(253);
			match(T__2);
			{
			{
			setState(254);
			or_expression();
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				{
				setState(256);
				or_expression();
				}
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(262);
			match(T__4);
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
		public Token LOGICAL_OR_OP;
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OR_OP() { return getTokens(LogicPLParser.LOGICAL_OR_OP); }
		public TerminalNode LOGICAL_OR_OP(int i) {
			return getToken(LogicPLParser.LOGICAL_OR_OP, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			and_expression();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR_OP) {
				{
				{
				setState(265);
				((Or_expressionContext)_localctx).LOGICAL_OR_OP = match(LOGICAL_OR_OP);
				setState(266);
				and_expression();
				System.out.println("Operator: " + ((Or_expressionContext)_localctx).LOGICAL_OR_OP.getText());
				}
				}
				setState(273);
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
	public static class And_expressionContext extends ParserRuleContext {
		public Token LOGICAL_AND_OP;
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND_OP() { return getTokens(LogicPLParser.LOGICAL_AND_OP); }
		public TerminalNode LOGICAL_AND_OP(int i) {
			return getToken(LogicPLParser.LOGICAL_AND_OP, i);
		}
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
		enterRule(_localctx, 34, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			equality_expression();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND_OP) {
				{
				{
				setState(275);
				((And_expressionContext)_localctx).LOGICAL_AND_OP = match(LOGICAL_AND_OP);
				setState(276);
				equality_expression();
				System.out.println("Operator: " + ((And_expressionContext)_localctx).LOGICAL_AND_OP.getText());
				}
				}
				setState(283);
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
	public static class Equality_expressionContext extends ParserRuleContext {
		public Token RELATIONAL_OP2;
		public Token ASSIGNMENT_OP;
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> RELATIONAL_OP2() { return getTokens(LogicPLParser.RELATIONAL_OP2); }
		public TerminalNode RELATIONAL_OP2(int i) {
			return getToken(LogicPLParser.RELATIONAL_OP2, i);
		}
		public List<TerminalNode> ASSIGNMENT_OP() { return getTokens(LogicPLParser.ASSIGNMENT_OP); }
		public TerminalNode ASSIGNMENT_OP(int i) {
			return getToken(LogicPLParser.ASSIGNMENT_OP, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			relational_expression();
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RELATIONAL_OP2) {
					{
					{
					setState(285);
					((Equality_expressionContext)_localctx).RELATIONAL_OP2 = match(RELATIONAL_OP2);
					setState(286);
					relational_expression();
					System.out.println("Operator: " + ((Equality_expressionContext)_localctx).RELATIONAL_OP2.getText());
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGNMENT_OP) {
					{
					{
					setState(294);
					((Equality_expressionContext)_localctx).ASSIGNMENT_OP = match(ASSIGNMENT_OP);
					setState(295);
					relational_expression();
					System.out.println("Operator: " + ((Equality_expressionContext)_localctx).ASSIGNMENT_OP.getText());
					}
					}
					setState(302);
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public Token RELATIONAL_OP1;
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> RELATIONAL_OP1() { return getTokens(LogicPLParser.RELATIONAL_OP1); }
		public TerminalNode RELATIONAL_OP1(int i) {
			return getToken(LogicPLParser.RELATIONAL_OP1, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			additive_expression();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OP1) {
				{
				{
				setState(306);
				((Relational_expressionContext)_localctx).RELATIONAL_OP1 = match(RELATIONAL_OP1);
				setState(307);
				additive_expression();
				System.out.println("Operator: " + ((Relational_expressionContext)_localctx).RELATIONAL_OP1.getText());
				}
				}
				setState(314);
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
	public static class Additive_expressionContext extends ParserRuleContext {
		public Token BINARY_ARITHMETIC_OP2;
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> BINARY_ARITHMETIC_OP2() { return getTokens(LogicPLParser.BINARY_ARITHMETIC_OP2); }
		public TerminalNode BINARY_ARITHMETIC_OP2(int i) {
			return getToken(LogicPLParser.BINARY_ARITHMETIC_OP2, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			multiplicative_expression();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINARY_ARITHMETIC_OP2) {
				{
				{
				setState(316);
				((Additive_expressionContext)_localctx).BINARY_ARITHMETIC_OP2 = match(BINARY_ARITHMETIC_OP2);
				setState(317);
				multiplicative_expression();
				System.out.println("Operator: " + ((Additive_expressionContext)_localctx).BINARY_ARITHMETIC_OP2.getText());
				}
				}
				setState(324);
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
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Token BINARY_ARITHMETIC_OP1;
		public List<Not_expressionContext> not_expression() {
			return getRuleContexts(Not_expressionContext.class);
		}
		public Not_expressionContext not_expression(int i) {
			return getRuleContext(Not_expressionContext.class,i);
		}
		public List<TerminalNode> BINARY_ARITHMETIC_OP1() { return getTokens(LogicPLParser.BINARY_ARITHMETIC_OP1); }
		public TerminalNode BINARY_ARITHMETIC_OP1(int i) {
			return getToken(LogicPLParser.BINARY_ARITHMETIC_OP1, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			not_expression();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINARY_ARITHMETIC_OP1) {
				{
				{
				setState(326);
				((Multiplicative_expressionContext)_localctx).BINARY_ARITHMETIC_OP1 = match(BINARY_ARITHMETIC_OP1);
				setState(327);
				not_expression();
				System.out.println("Operator: " + ((Multiplicative_expressionContext)_localctx).BINARY_ARITHMETIC_OP1.getText());
				}
				}
				setState(334);
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
	public static class Not_expressionContext extends ParserRuleContext {
		public Token LOGICAL_NOT_OP;
		public TerminalNode LOGICAL_NOT_OP() { return getToken(LogicPLParser.LOGICAL_NOT_OP, 0); }
		public Not_expressionContext not_expression() {
			return getRuleContext(Not_expressionContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Not_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterNot_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitNot_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitNot_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_expressionContext not_expression() throws RecognitionException {
		Not_expressionContext _localctx = new Not_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_not_expression);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_NOT_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((Not_expressionContext)_localctx).LOGICAL_NOT_OP = match(LOGICAL_NOT_OP);
				setState(336);
				not_expression();
				System.out.println("Operator: " + ((Not_expressionContext)_localctx).LOGICAL_NOT_OP.getText());
				}
				break;
			case T__2:
			case T__5:
			case T__7:
			case BOOLEAN:
			case NATURAL_NUMBERS:
			case IDENTIFIER:
			case QUERY_1:
			case QUERY_2:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				primary_expression();
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
	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode NATURAL_NUMBERS() { return getToken(LogicPLParser.NATURAL_NUMBERS, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode QUERY_1() { return getToken(LogicPLParser.QUERY_1, 0); }
		public TerminalNode QUERY_2() { return getToken(LogicPLParser.QUERY_2, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary_expression);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==NATURAL_NUMBERS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				match(T__2);
				setState(347);
				or_expression();
				setState(348);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				match(IDENTIFIER);
				setState(351);
				match(T__5);
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(352);
					match(NATURAL_NUMBERS);
					}
					break;
				case 2:
					{
					setState(353);
					additive_expression();
					}
					break;
				}
				setState(356);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				match(QUERY_1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(358);
				match(QUERY_2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(359);
				array_elements();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(360);
				function_call();
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
	public static class Predicate_expressionContext extends ParserRuleContext {
		public Token PRIDICATE;
		public TerminalNode PRIDICATE() { return getToken(LogicPLParser.PRIDICATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public Predicate_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicate_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicate_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicate_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_expressionContext predicate_expression() throws RecognitionException {
		Predicate_expressionContext _localctx = new Predicate_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_predicate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((Predicate_expressionContext)_localctx).PRIDICATE = match(PRIDICATE);
			System.out.println("Predicate: " + ((Predicate_expressionContext)_localctx).PRIDICATE.getText());
			setState(365);
			match(T__2);
			setState(366);
			match(IDENTIFIER);
			setState(367);
			match(T__4);
			setState(368);
			match(SEMICOLON);
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
	public static class Implication_expressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Implication_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterImplication_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitImplication_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitImplication_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implication_expressionContext implication_expression() throws RecognitionException {
		Implication_expressionContext _localctx = new Implication_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_implication_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("Implication"); 
			setState(371);
			match(T__2);
			setState(372);
			or_expression();
			setState(373);
			match(T__4);
			setState(374);
			match(T__8);
			setState(375);
			match(T__2);
			setState(377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(376);
				line();
				}
				}
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34426288456L) != 0) );
			setState(381);
			match(T__4);
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
		"\u0004\u0001&\u0180\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003S\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005h\b\u0005\n\u0005\f\u0005"+
		"k\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006t\b\u0006\n\u0006\f\u0006w\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"~\b\u0006\n\u0006\f\u0006\u0081\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00b5\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00bb\b\b"+
		"\n\b\f\b\u00be\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00c6\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00d2\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00de\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ea\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f1\b\r\n\r\f\r\u00f4\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0102\b\u000f\n\u000f\f\u000f\u0105\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u010e\b\u0010\n\u0010\f\u0010\u0111\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0118\b\u0011\n\u0011\f\u0011"+
		"\u011b\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0122\b\u0012\n\u0012\f\u0012\u0125\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u012b\b\u0012\n\u0012\f\u0012"+
		"\u012e\t\u0012\u0003\u0012\u0130\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0137\b\u0013\n\u0013\f\u0013"+
		"\u013a\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0141\b\u0014\n\u0014\f\u0014\u0144\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u014b\b\u0015\n"+
		"\u0015\f\u0015\u014e\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0155\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0163\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u016a"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u017a\b\u0019\u000b\u0019\f"+
		"\u0019\u017b\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0002\u0001\u0000\u000b\r\u0002\u0000\b\b\u0014"+
		"\u0014\u0194\u00007\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000"+
		"\u0004F\u0001\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b[\u0001"+
		"\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000"+
		"\u000e\u00b4\u0001\u0000\u0000\u0000\u0010\u00b6\u0001\u0000\u0000\u0000"+
		"\u0012\u00c5\u0001\u0000\u0000\u0000\u0014\u00d1\u0001\u0000\u0000\u0000"+
		"\u0016\u00dd\u0001\u0000\u0000\u0000\u0018\u00e9\u0001\u0000\u0000\u0000"+
		"\u001a\u00eb\u0001\u0000\u0000\u0000\u001c\u00f7\u0001\u0000\u0000\u0000"+
		"\u001e\u00fb\u0001\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000\""+
		"\u0112\u0001\u0000\u0000\u0000$\u011c\u0001\u0000\u0000\u0000&\u0131\u0001"+
		"\u0000\u0000\u0000(\u013b\u0001\u0000\u0000\u0000*\u0145\u0001\u0000\u0000"+
		"\u0000,\u0154\u0001\u0000\u0000\u0000.\u0169\u0001\u0000\u0000\u00000"+
		"\u016b\u0001\u0000\u0000\u00002\u0172\u0001\u0000\u0000\u000046\u0003"+
		"\f\u0006\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005\u0000\u0000"+
		"\u0001<\u0001\u0001\u0000\u0000\u0000=>\u0005\n\u0000\u0000>?\u0006\u0001"+
		"\uffff\uffff\u0000?@\u0005\u0001\u0000\u0000@A\u0003\u0004\u0002\u0000"+
		"AB\u0005\u0002\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CE\u0003\u0006"+
		"\u0003\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0005\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0006\u0003\uffff\uffff\u0000JS\u0003"+
		"\u001a\r\u0000KS\u0003\u000e\u0007\u0000LS\u0003\u0014\n\u0000MS\u0003"+
		"\u0016\u000b\u0000NS\u0003\u0018\f\u0000OS\u0003 \u0010\u0000PS\u0003"+
		"\u001c\u000e\u0000QS\u0003\u001e\u000f\u0000RI\u0001\u0000\u0000\u0000"+
		"RK\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000"+
		"\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005"+
		"\"\u0000\u0000UZ\u0001\u0000\u0000\u0000VZ\u0003\b\u0004\u0000WZ\u0003"+
		"0\u0018\u0000XZ\u00032\u0019\u0000YR\u0001\u0000\u0000\u0000YV\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u0007"+
		"\u0001\u0000\u0000\u0000[\\\u0005\u0011\u0000\u0000\\]\u0006\u0004\uffff"+
		"\uffff\u0000]^\u0005\u0003\u0000\u0000^_\u0005\u0015\u0000\u0000_`\u0005"+
		"\u0004\u0000\u0000`a\u0005\u0015\u0000\u0000ab\u0005\u0005\u0000\u0000"+
		"bc\u0005\u0001\u0000\u0000cd\u0003\n\u0005\u0000de\u0005\u0002\u0000\u0000"+
		"e\t\u0001\u0000\u0000\u0000fh\u0003\u0006\u0003\u0000gf\u0001\u0000\u0000"+
		"\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000j\u000b\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005\u000f\u0000\u0000mn\u0005\u0015\u0000\u0000no\u0006\u0006\uffff"+
		"\uffff\u0000op\u0005\u0003\u0000\u0000pu\u0003\u0012\t\u0000qr\u0005!"+
		"\u0000\u0000rt\u0003\u0012\t\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0005\u0000\u0000"+
		"yz\u0005\u0004\u0000\u0000z{\u0007\u0000\u0000\u0000{\u007f\u0005\u0001"+
		"\u0000\u0000|~\u0003\u0006\u0003\u0000}|\u0001\u0000\u0000\u0000~\u0081"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083\r\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\u000b\u0000\u0000\u0085\u0086\u0005\u0006"+
		"\u0000\u0000\u0086\u0087\u0005\u0014\u0000\u0000\u0087\u0088\u0005\u0007"+
		"\u0000\u0000\u0088\u0089\u0005\u0015\u0000\u0000\u0089\u00b5\u0006\u0007"+
		"\uffff\uffff\u0000\u008a\u008b\u0005\u000b\u0000\u0000\u008b\u008c\u0005"+
		"\u0006\u0000\u0000\u008c\u008d\u0005\u0014\u0000\u0000\u008d\u008e\u0005"+
		"\u0007\u0000\u0000\u008e\u008f\u0005\u0015\u0000\u0000\u008f\u0090\u0006"+
		"\u0007\uffff\uffff\u0000\u0090\u0091\u0005 \u0000\u0000\u0091\u0092\u0003"+
		"\u0010\b\u0000\u0092\u0093\u0006\u0007\uffff\uffff\u0000\u0093\u00b5\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u0096\u0005\u0006"+
		"\u0000\u0000\u0096\u0097\u0005\u0014\u0000\u0000\u0097\u0098\u0005\u0007"+
		"\u0000\u0000\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u00b5\u0006\u0007"+
		"\uffff\uffff\u0000\u009a\u009b\u0005\f\u0000\u0000\u009b\u009c\u0005\u0006"+
		"\u0000\u0000\u009c\u009d\u0005\u0014\u0000\u0000\u009d\u009e\u0005\u0007"+
		"\u0000\u0000\u009e\u009f\u0005\u0015\u0000\u0000\u009f\u00a0\u0006\u0007"+
		"\uffff\uffff\u0000\u00a0\u00a1\u0005 \u0000\u0000\u00a1\u00a2\u0003\u0010"+
		"\b\u0000\u00a2\u00a3\u0006\u0007\uffff\uffff\u0000\u00a3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00a6\u0005\u0006\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0014\u0000\u0000\u00a7\u00a8\u0005\u0007\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0015\u0000\u0000\u00a9\u00b5\u0006\u0007\uffff"+
		"\uffff\u0000\u00aa\u00ab\u0005\r\u0000\u0000\u00ab\u00ac\u0005\u0006\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000\u00ad\u00ae\u0005\u0007\u0000"+
		"\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u00b0\u0006\u0007\uffff"+
		"\uffff\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u00b2\u0003\u0010\b"+
		"\u0000\u00b2\u00b3\u0006\u0007\uffff\uffff\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u0084\u0001\u0000\u0000\u0000\u00b4\u008a\u0001\u0000"+
		"\u0000\u0000\u00b4\u0094\u0001\u0000\u0000\u0000\u00b4\u009a\u0001\u0000"+
		"\u0000\u0000\u00b4\u00a4\u0001\u0000\u0000\u0000\u00b4\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b5\u000f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0006"+
		"\u0000\u0000\u00b7\u00bc\u0003 \u0010\u0000\u00b8\u00b9\u0005!\u0000\u0000"+
		"\u00b9\u00bb\u0003 \u0010\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0"+
		"\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0007\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0015\u0000\u0000\u00c3\u00c6\u0006\t\uffff\uffff\u0000\u00c4"+
		"\u00c6\u0005\u0017\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u0013\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005\u000b\u0000\u0000\u00c8\u00c9\u0005\u0015\u0000\u0000\u00c9"+
		"\u00d2\u0006\n\uffff\uffff\u0000\u00ca\u00cb\u0005\u000b\u0000\u0000\u00cb"+
		"\u00cc\u0005\u0015\u0000\u0000\u00cc\u00cd\u0006\n\uffff\uffff\u0000\u00cd"+
		"\u00ce\u0005 \u0000\u0000\u00ce\u00cf\u0003(\u0014\u0000\u00cf\u00d0\u0006"+
		"\n\uffff\uffff\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c7\u0001"+
		"\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d2\u0015\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\f\u0000\u0000\u00d4\u00d5\u0005\u0015"+
		"\u0000\u0000\u00d5\u00de\u0006\u000b\uffff\uffff\u0000\u00d6\u00d7\u0005"+
		"\f\u0000\u0000\u00d7\u00d8\u0005\u0015\u0000\u0000\u00d8\u00d9\u0006\u000b"+
		"\uffff\uffff\u0000\u00d9\u00da\u0005 \u0000\u0000\u00da\u00db\u0003(\u0014"+
		"\u0000\u00db\u00dc\u0006\u000b\uffff\uffff\u0000\u00dc\u00de\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d3\u0001\u0000\u0000\u0000\u00dd\u00d6\u0001\u0000"+
		"\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\r\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0015\u0000\u0000\u00e1\u00ea\u0006\f\uffff\uffff"+
		"\u0000\u00e2\u00e3\u0005\r\u0000\u0000\u00e3\u00e4\u0005\u0015\u0000\u0000"+
		"\u00e4\u00e5\u0006\f\uffff\uffff\u0000\u00e5\u00e6\u0005 \u0000\u0000"+
		"\u00e6\u00e7\u0003 \u0010\u0000\u00e7\u00e8\u0006\f\uffff\uffff\u0000"+
		"\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00df\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e2\u0001\u0000\u0000\u0000\u00ea\u0019\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005\u0015\u0000\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000"+
		"\u00ed\u00f2\u0003 \u0010\u0000\u00ee\u00ef\u0005!\u0000\u0000\u00ef\u00f1"+
		"\u0003 \u0010\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0005\u0000\u0000\u00f6\u001b\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u0012\u0000\u0000\u00f8\u00f9\u0006"+
		"\u000e\uffff\uffff\u0000\u00f9\u00fa\u0003 \u0010\u0000\u00fa\u001d\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005\u0010\u0000\u0000\u00fc\u00fd\u0006"+
		"\u000f\uffff\uffff\u0000\u00fd\u00fe\u0005\u0003\u0000\u0000\u00fe\u0103"+
		"\u0003 \u0010\u0000\u00ff\u0100\u0005!\u0000\u0000\u0100\u0102\u0003 "+
		"\u0010\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005\u0005\u0000\u0000\u0107\u001f\u0001\u0000"+
		"\u0000\u0000\u0108\u010f\u0003\"\u0011\u0000\u0109\u010a\u0005\u001f\u0000"+
		"\u0000\u010a\u010b\u0003\"\u0011\u0000\u010b\u010c\u0006\u0010\uffff\uffff"+
		"\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000"+
		"\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110!\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0119\u0003$\u0012\u0000\u0113"+
		"\u0114\u0005\u001e\u0000\u0000\u0114\u0115\u0003$\u0012\u0000\u0115\u0116"+
		"\u0006\u0011\uffff\uffff\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117"+
		"\u0113\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"#\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u012f"+
		"\u0003&\u0013\u0000\u011d\u011e\u0005\u001d\u0000\u0000\u011e\u011f\u0003"+
		"&\u0013\u0000\u011f\u0120\u0006\u0012\uffff\uffff\u0000\u0120\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0122\u0125\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0130\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005 \u0000\u0000\u0127\u0128\u0003&\u0013"+
		"\u0000\u0128\u0129\u0006\u0012\uffff\uffff\u0000\u0129\u012b\u0001\u0000"+
		"\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000"+
		"\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012f\u0123\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000"+
		"\u0000\u0000\u0130%\u0001\u0000\u0000\u0000\u0131\u0138\u0003(\u0014\u0000"+
		"\u0132\u0133\u0005\u001c\u0000\u0000\u0133\u0134\u0003(\u0014\u0000\u0134"+
		"\u0135\u0006\u0013\uffff\uffff\u0000\u0135\u0137\u0001\u0000\u0000\u0000"+
		"\u0136\u0132\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\'\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u0142\u0003*\u0015\u0000\u013c\u013d\u0005\u001b\u0000\u0000\u013d\u013e"+
		"\u0003*\u0015\u0000\u013e\u013f\u0006\u0014\uffff\uffff\u0000\u013f\u0141"+
		"\u0001\u0000\u0000\u0000\u0140\u013c\u0001\u0000\u0000\u0000\u0141\u0144"+
		"\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143)\u0001\u0000\u0000\u0000\u0144\u0142\u0001"+
		"\u0000\u0000\u0000\u0145\u014c\u0003,\u0016\u0000\u0146\u0147\u0005\u001a"+
		"\u0000\u0000\u0147\u0148\u0003,\u0016\u0000\u0148\u0149\u0006\u0015\uffff"+
		"\uffff\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0146\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d+\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0019\u0000"+
		"\u0000\u0150\u0151\u0003,\u0016\u0000\u0151\u0152\u0006\u0016\uffff\uffff"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0155\u0003.\u0017\u0000"+
		"\u0154\u014f\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0155-\u0001\u0000\u0000\u0000\u0156\u016a\u0005\u0015\u0000\u0000\u0157"+
		"\u016a\u0007\u0001\u0000\u0000\u0158\u016a\u0005#\u0000\u0000\u0159\u016a"+
		"\u0005\u000e\u0000\u0000\u015a\u015b\u0005\u0003\u0000\u0000\u015b\u015c"+
		"\u0003 \u0010\u0000\u015c\u015d\u0005\u0005\u0000\u0000\u015d\u016a\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005\u0015\u0000\u0000\u015f\u0162\u0005"+
		"\u0006\u0000\u0000\u0160\u0163\u0005\u0014\u0000\u0000\u0161\u0163\u0003"+
		"(\u0014\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u016a\u0005\u0007"+
		"\u0000\u0000\u0165\u016a\u0005\u0017\u0000\u0000\u0166\u016a\u0005\u0018"+
		"\u0000\u0000\u0167\u016a\u0003\u0010\b\u0000\u0168\u016a\u0003\u001a\r"+
		"\u0000\u0169\u0156\u0001\u0000\u0000\u0000\u0169\u0157\u0001\u0000\u0000"+
		"\u0000\u0169\u0158\u0001\u0000\u0000\u0000\u0169\u0159\u0001\u0000\u0000"+
		"\u0000\u0169\u015a\u0001\u0000\u0000\u0000\u0169\u015e\u0001\u0000\u0000"+
		"\u0000\u0169\u0165\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016a/\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0016\u0000\u0000"+
		"\u016c\u016d\u0006\u0018\uffff\uffff\u0000\u016d\u016e\u0005\u0003\u0000"+
		"\u0000\u016e\u016f\u0005\u0015\u0000\u0000\u016f\u0170\u0005\u0005\u0000"+
		"\u0000\u0170\u0171\u0005\"\u0000\u0000\u01711\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0006\u0019\uffff\uffff\u0000\u0173\u0174\u0005\u0003\u0000"+
		"\u0000\u0174\u0175\u0003 \u0010\u0000\u0175\u0176\u0005\u0005\u0000\u0000"+
		"\u0176\u0177\u0005\t\u0000\u0000\u0177\u0179\u0005\u0003\u0000\u0000\u0178"+
		"\u017a\u0003\u0006\u0003\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0005\u0005\u0000\u0000\u017e3\u0001\u0000\u0000\u0000\u001b7F"+
		"RYiu\u007f\u00b4\u00bc\u00c5\u00d1\u00dd\u00e9\u00f2\u0103\u010f\u0119"+
		"\u0123\u012c\u012f\u0138\u0142\u014c\u0154\u0162\u0169\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}