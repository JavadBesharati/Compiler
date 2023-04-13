// Generated from /home/javad/My Folders/University/6th Term/Complier/CAs/Compiler-Projects-UT-Spring-2023/Phase1/src/main/grammar/LogicPL.g4 by ANTLR 4.12.0
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
		LOGICAL_OR_OP=31, ASSIGNMENT_OP=32, OPERATORS=33, COMMA=34, SEMICOLON=35, 
		FLOAT=36, WHITESPACE=37, NEWLINE=38, COMMENT=39;
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
			null, null, null, "'&&'", "'||'", "'='", null, "','", "';'"
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
			"ASSIGNMENT_OP", "OPERATORS", "COMMA", "SEMICOLON", "FLOAT", "WHITESPACE", 
			"NEWLINE", "COMMENT"
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
			setState(62);
			match(T__0);
			setState(63);
			main_body();
			setState(64);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68786026824L) != 0)) {
				{
				{
				setState(66);
				line();
				}
				}
				setState(71);
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
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Print_expressionContext print_expression() {
			return getRuleContext(Print_expressionContext.class,0);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(72);
					array_declaration();
					}
					break;
				case 2:
					{
					setState(73);
					int_declaration();
					}
					break;
				case 3:
					{
					setState(74);
					float_declaration();
					}
					break;
				case 4:
					{
					setState(75);
					boolean_declaration();
					}
					break;
				case 5:
					{
					setState(76);
					function_return();
					}
					break;
				case 6:
					{
					setState(77);
					or_expression();
					}
					break;
				case 7:
					{
					setState(78);
					function_return();
					}
					break;
				case 8:
					{
					setState(79);
					print_expression();
					}
					break;
				}
				setState(82);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(84);
				for_structure();
				}
				break;
			case 3:
				{
				setState(85);
				predicate_expression();
				}
				break;
			case 4:
				{
				setState(86);
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
			setState(89);
			match(FOR);
			setState(90);
			match(T__2);
			setState(91);
			match(IDENTIFIER);
			setState(92);
			match(T__3);
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(T__4);
			setState(95);
			match(T__0);
			setState(96);
			for_body();
			setState(97);
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
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68786026824L) != 0)) {
				{
				{
				setState(99);
				line();
				}
				}
				setState(104);
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
			setState(105);
			match(FUNCTION);
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(T__2);
			{
			setState(108);
			argument();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				argument();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(116);
			match(T__4);
			setState(117);
			match(T__3);
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			match(T__0);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68786026824L) != 0)) {
				{
				{
				setState(120);
				line();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(INT_TYPE);
				setState(129);
				match(T__5);
				setState(130);
				match(NATURAL_NUMBERS);
				setState(131);
				match(T__6);
				setState(132);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(INT_TYPE);
				setState(134);
				match(T__5);
				setState(135);
				match(NATURAL_NUMBERS);
				setState(136);
				match(T__6);
				setState(137);
				match(IDENTIFIER);
				setState(138);
				match(ASSIGNMENT_OP);
				setState(139);
				array_elements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(FLOAT_TYPE);
				setState(141);
				match(T__5);
				setState(142);
				match(NATURAL_NUMBERS);
				setState(143);
				match(T__6);
				setState(144);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(FLOAT_TYPE);
				setState(146);
				match(T__5);
				setState(147);
				match(NATURAL_NUMBERS);
				setState(148);
				match(T__6);
				setState(149);
				match(IDENTIFIER);
				setState(150);
				match(ASSIGNMENT_OP);
				setState(151);
				array_elements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(BOOLEAN_TYPE);
				setState(153);
				match(T__5);
				setState(154);
				match(NATURAL_NUMBERS);
				setState(155);
				match(T__6);
				setState(156);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(BOOLEAN_TYPE);
				setState(158);
				match(T__5);
				setState(159);
				match(NATURAL_NUMBERS);
				setState(160);
				match(T__6);
				setState(161);
				match(IDENTIFIER);
				setState(162);
				match(ASSIGNMENT_OP);
				setState(163);
				array_elements();
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
		public List<Primary_expressionContext> primary_expression() {
			return getRuleContexts(Primary_expressionContext.class);
		}
		public Primary_expressionContext primary_expression(int i) {
			return getRuleContext(Primary_expressionContext.class,i);
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
			setState(166);
			match(T__5);
			setState(167);
			primary_expression();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168);
				match(COMMA);
				setState(169);
				primary_expression();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(177);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				match(IDENTIFIER);
				}
				}
				break;
			case QUERY_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(INT_TYPE);
			setState(183);
			match(IDENTIFIER);
			setState(184);
			match(ASSIGNMENT_OP);
			setState(185);
			additive_expression();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FLOAT_TYPE);
			setState(188);
			match(IDENTIFIER);
			setState(189);
			match(ASSIGNMENT_OP);
			setState(190);
			additive_expression();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(BOOLEAN_TYPE);
			setState(193);
			match(IDENTIFIER);
			setState(194);
			match(ASSIGNMENT_OP);
			setState(195);
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
			setState(197);
			match(IDENTIFIER);
			setState(198);
			match(T__2);
			setState(199);
			or_expression();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				or_expression();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
			setState(209);
			match(RETURN);
			setState(210);
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
			setState(212);
			match(PRINT);
			setState(213);
			match(T__2);
			{
			{
			setState(214);
			or_expression();
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				{
				setState(216);
				or_expression();
				}
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(222);
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
			setState(224);
			and_expression();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR_OP) {
				{
				{
				setState(225);
				match(LOGICAL_OR_OP);
				setState(226);
				and_expression();
				}
				}
				setState(231);
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
			setState(232);
			equality_expression();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND_OP) {
				{
				{
				setState(233);
				match(LOGICAL_AND_OP);
				setState(234);
				equality_expression();
				}
				}
				setState(239);
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
			setState(240);
			relational_expression();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OP2 || _la==ASSIGNMENT_OP) {
				{
				{
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==RELATIONAL_OP2 || _la==ASSIGNMENT_OP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				relational_expression();
				}
				}
				setState(247);
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
	public static class Relational_expressionContext extends ParserRuleContext {
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
			setState(248);
			additive_expression();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OP1) {
				{
				{
				setState(249);
				match(RELATIONAL_OP1);
				setState(250);
				additive_expression();
				}
				}
				setState(255);
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
			setState(256);
			multiplicative_expression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINARY_ARITHMETIC_OP2) {
				{
				{
				setState(257);
				match(BINARY_ARITHMETIC_OP2);
				setState(258);
				multiplicative_expression();
				}
				}
				setState(263);
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
			setState(264);
			not_expression();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINARY_ARITHMETIC_OP1) {
				{
				{
				setState(265);
				match(BINARY_ARITHMETIC_OP1);
				setState(266);
				not_expression();
				}
				}
				setState(271);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_NOT_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(LOGICAL_NOT_OP);
				setState(273);
				not_expression();
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
				setState(274);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode QUERY_1() { return getToken(LogicPLParser.QUERY_1, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public TerminalNode QUERY_2() { return getToken(LogicPLParser.QUERY_2, 0); }
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
				setState(279);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				match(T__2);
				setState(283);
				or_expression();
				setState(284);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				match(IDENTIFIER);
				setState(287);
				match(T__5);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(288);
					match(NATURAL_NUMBERS);
					}
					break;
				case 2:
					{
					setState(289);
					additive_expression();
					}
					break;
				}
				setState(292);
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(QUERY_1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				array_elements();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(295);
				match(QUERY_2);
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
			setState(298);
			match(PRIDICATE);
			setState(299);
			match(T__2);
			setState(300);
			match(IDENTIFIER);
			setState(301);
			match(T__4);
			setState(302);
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
			setState(304);
			match(T__2);
			setState(305);
			or_expression();
			setState(306);
			match(T__4);
			setState(307);
			match(T__8);
			setState(308);
			match(T__2);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				line();
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68786026824L) != 0) );
			setState(314);
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
		"\u0004\u0001\'\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002D\b\u0002"+
		"\n\u0002\f\u0002G\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"X\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0005\u0005e\b\u0005\n\u0005\f\u0005h\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006p\b\u0006"+
		"\n\u0006\f\u0006s\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006z\b\u0006\n\u0006\f\u0006}\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00ab\b\b\n\b\f\b\u00ae\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00b5\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00cb"+
		"\b\r\n\r\f\r\u00ce\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00da\b\u000f\n\u000f\f\u000f\u00dd\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e4\b\u0010\n\u0010\f\u0010"+
		"\u00e7\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ec\b"+
		"\u0011\n\u0011\f\u0011\u00ef\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00f4\b\u0012\n\u0012\f\u0012\u00f7\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00fc\b\u0013\n\u0013\f\u0013\u00ff\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0104\b\u0014\n\u0014"+
		"\f\u0014\u0107\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u010c\b\u0015\n\u0015\f\u0015\u010f\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0114\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0123\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0129\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0004"+
		"\u0019\u0137\b\u0019\u000b\u0019\f\u0019\u0138\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0003\u0001"+
		"\u0000\u000b\r\u0002\u0000\u001d\u001d  \u0002\u0000\b\b\u0014\u0014\u014c"+
		"\u00007\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004E"+
		"\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\bY\u0001\u0000"+
		"\u0000\u0000\nf\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000e"+
		"\u00a4\u0001\u0000\u0000\u0000\u0010\u00a6\u0001\u0000\u0000\u0000\u0012"+
		"\u00b4\u0001\u0000\u0000\u0000\u0014\u00b6\u0001\u0000\u0000\u0000\u0016"+
		"\u00bb\u0001\u0000\u0000\u0000\u0018\u00c0\u0001\u0000\u0000\u0000\u001a"+
		"\u00c5\u0001\u0000\u0000\u0000\u001c\u00d1\u0001\u0000\u0000\u0000\u001e"+
		"\u00d4\u0001\u0000\u0000\u0000 \u00e0\u0001\u0000\u0000\u0000\"\u00e8"+
		"\u0001\u0000\u0000\u0000$\u00f0\u0001\u0000\u0000\u0000&\u00f8\u0001\u0000"+
		"\u0000\u0000(\u0100\u0001\u0000\u0000\u0000*\u0108\u0001\u0000\u0000\u0000"+
		",\u0113\u0001\u0000\u0000\u0000.\u0128\u0001\u0000\u0000\u00000\u012a"+
		"\u0001\u0000\u0000\u00002\u0130\u0001\u0000\u0000\u000046\u0003\f\u0006"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005\u0000\u0000\u0001"+
		"<\u0001\u0001\u0000\u0000\u0000=>\u0005\n\u0000\u0000>?\u0005\u0001\u0000"+
		"\u0000?@\u0003\u0004\u0002\u0000@A\u0005\u0002\u0000\u0000A\u0003\u0001"+
		"\u0000\u0000\u0000BD\u0003\u0006\u0003\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000F\u0005\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HQ\u0003"+
		"\u000e\u0007\u0000IQ\u0003\u0014\n\u0000JQ\u0003\u0016\u000b\u0000KQ\u0003"+
		"\u0018\f\u0000LQ\u0003\u001c\u000e\u0000MQ\u0003 \u0010\u0000NQ\u0003"+
		"\u001c\u000e\u0000OQ\u0003\u001e\u000f\u0000PH\u0001\u0000\u0000\u0000"+
		"PI\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000"+
		"\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005"+
		"#\u0000\u0000SX\u0001\u0000\u0000\u0000TX\u0003\b\u0004\u0000UX\u0003"+
		"0\u0018\u0000VX\u00032\u0019\u0000WP\u0001\u0000\u0000\u0000WT\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X\u0007"+
		"\u0001\u0000\u0000\u0000YZ\u0005\u0011\u0000\u0000Z[\u0005\u0003\u0000"+
		"\u0000[\\\u0005\u0015\u0000\u0000\\]\u0005\u0004\u0000\u0000]^\u0005\u0015"+
		"\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0003"+
		"\n\u0005\u0000ab\u0005\u0002\u0000\u0000b\t\u0001\u0000\u0000\u0000ce"+
		"\u0003\u0006\u0003\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000b\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u000f\u0000\u0000"+
		"jk\u0005\u0015\u0000\u0000kl\u0005\u0003\u0000\u0000lq\u0003\u0012\t\u0000"+
		"mn\u0005\"\u0000\u0000np\u0003\u0012\t\u0000om\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0005"+
		"\u0000\u0000uv\u0005\u0004\u0000\u0000vw\u0007\u0000\u0000\u0000w{\u0005"+
		"\u0001\u0000\u0000xz\u0003\u0006\u0003\u0000yx\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u0002\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000b"+
		"\u0000\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0005\u0014"+
		"\u0000\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084\u00a5\u0005\u0015"+
		"\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0087\u0005\u0006"+
		"\u0000\u0000\u0087\u0088\u0005\u0014\u0000\u0000\u0088\u0089\u0005\u0007"+
		"\u0000\u0000\u0089\u008a\u0005\u0015\u0000\u0000\u008a\u008b\u0005 \u0000"+
		"\u0000\u008b\u00a5\u0003\u0010\b\u0000\u008c\u008d\u0005\f\u0000\u0000"+
		"\u008d\u008e\u0005\u0006\u0000\u0000\u008e\u008f\u0005\u0014\u0000\u0000"+
		"\u008f\u0090\u0005\u0007\u0000\u0000\u0090\u00a5\u0005\u0015\u0000\u0000"+
		"\u0091\u0092\u0005\f\u0000\u0000\u0092\u0093\u0005\u0006\u0000\u0000\u0093"+
		"\u0094\u0005\u0014\u0000\u0000\u0094\u0095\u0005\u0007\u0000\u0000\u0095"+
		"\u0096\u0005\u0015\u0000\u0000\u0096\u0097\u0005 \u0000\u0000\u0097\u00a5"+
		"\u0003\u0010\b\u0000\u0098\u0099\u0005\r\u0000\u0000\u0099\u009a\u0005"+
		"\u0006\u0000\u0000\u009a\u009b\u0005\u0014\u0000\u0000\u009b\u009c\u0005"+
		"\u0007\u0000\u0000\u009c\u00a5\u0005\u0015\u0000\u0000\u009d\u009e\u0005"+
		"\r\u0000\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f\u00a0\u0005\u0014"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a2\u0005\u0015"+
		"\u0000\u0000\u00a2\u00a3\u0005 \u0000\u0000\u00a3\u00a5\u0003\u0010\b"+
		"\u0000\u00a4\u0080\u0001\u0000\u0000\u0000\u00a4\u0085\u0001\u0000\u0000"+
		"\u0000\u00a4\u008c\u0001\u0000\u0000\u0000\u00a4\u0091\u0001\u0000\u0000"+
		"\u0000\u00a4\u0098\u0001\u0000\u0000\u0000\u00a4\u009d\u0001\u0000\u0000"+
		"\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0006\u0000"+
		"\u0000\u00a7\u00ac\u0003.\u0017\u0000\u00a8\u00a9\u0005\"\u0000\u0000"+
		"\u00a9\u00ab\u0003.\u0017\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0"+
		"\u0011\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0005\u0015\u0000\u0000\u00b3\u00b5\u0005\u0017\u0000\u0000\u00b4"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u0013\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u000b\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0015\u0000\u0000\u00b8\u00b9\u0005 \u0000\u0000\u00b9\u00ba"+
		"\u0003(\u0014\u0000\u00ba\u0015\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\f\u0000\u0000\u00bc\u00bd\u0005\u0015\u0000\u0000\u00bd\u00be\u0005 "+
		"\u0000\u0000\u00be\u00bf\u0003(\u0014\u0000\u00bf\u0017\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\r\u0000\u0000\u00c1\u00c2\u0005\u0015\u0000\u0000"+
		"\u00c2\u00c3\u0005 \u0000\u0000\u00c3\u00c4\u0003 \u0010\u0000\u00c4\u0019"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0003\u0000\u0000\u00c7\u00cc\u0003 \u0010\u0000\u00c8\u00c9\u0005"+
		"\"\u0000\u0000\u00c9\u00cb\u0003 \u0010\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0005"+
		"\u0000\u0000\u00d0\u001b\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0012"+
		"\u0000\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3\u001d\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u0010\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000"+
		"\u0000\u00d6\u00db\u0003 \u0010\u0000\u00d7\u00d8\u0005\"\u0000\u0000"+
		"\u00d8\u00da\u0003 \u0010\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0005\u0000\u0000\u00df"+
		"\u001f\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003\"\u0011\u0000\u00e1\u00e2"+
		"\u0005\u001f\u0000\u0000\u00e2\u00e4\u0003\"\u0011\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6!\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ed\u0003$\u0012"+
		"\u0000\u00e9\u00ea\u0005\u001e\u0000\u0000\u00ea\u00ec\u0003$\u0012\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee#\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f5\u0003&\u0013\u0000\u00f1\u00f2\u0007\u0001\u0000\u0000\u00f2\u00f4"+
		"\u0003&\u0013\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6%\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fd\u0003(\u0014\u0000\u00f9\u00fa\u0005\u001c\u0000"+
		"\u0000\u00fa\u00fc\u0003(\u0014\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\'\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u0105\u0003*\u0015\u0000\u0101\u0102"+
		"\u0005\u001b\u0000\u0000\u0102\u0104\u0003*\u0015\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106)\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010d\u0003,\u0016"+
		"\u0000\u0109\u010a\u0005\u001a\u0000\u0000\u010a\u010c\u0003,\u0016\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e+\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\u0019\u0000\u0000\u0111\u0114\u0003,\u0016\u0000\u0112\u0114"+
		"\u0003.\u0017\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0114-\u0001\u0000\u0000\u0000\u0115\u0129\u0005\u0015"+
		"\u0000\u0000\u0116\u0129\u0007\u0002\u0000\u0000\u0117\u0129\u0005$\u0000"+
		"\u0000\u0118\u0129\u0005\u000e\u0000\u0000\u0119\u0129\u0003\u001a\r\u0000"+
		"\u011a\u011b\u0005\u0003\u0000\u0000\u011b\u011c\u0003 \u0010\u0000\u011c"+
		"\u011d\u0005\u0005\u0000\u0000\u011d\u0129\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005\u0015\u0000\u0000\u011f\u0122\u0005\u0006\u0000\u0000\u0120"+
		"\u0123\u0005\u0014\u0000\u0000\u0121\u0123\u0003(\u0014\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0129\u0005\u0007\u0000\u0000\u0125\u0129"+
		"\u0005\u0017\u0000\u0000\u0126\u0129\u0003\u0010\b\u0000\u0127\u0129\u0005"+
		"\u0018\u0000\u0000\u0128\u0115\u0001\u0000\u0000\u0000\u0128\u0116\u0001"+
		"\u0000\u0000\u0000\u0128\u0117\u0001\u0000\u0000\u0000\u0128\u0118\u0001"+
		"\u0000\u0000\u0000\u0128\u0119\u0001\u0000\u0000\u0000\u0128\u011a\u0001"+
		"\u0000\u0000\u0000\u0128\u011e\u0001\u0000\u0000\u0000\u0128\u0125\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129/\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0016"+
		"\u0000\u0000\u012b\u012c\u0005\u0003\u0000\u0000\u012c\u012d\u0005\u0015"+
		"\u0000\u0000\u012d\u012e\u0005\u0005\u0000\u0000\u012e\u012f\u0005#\u0000"+
		"\u0000\u012f1\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0003\u0000\u0000"+
		"\u0131\u0132\u0003 \u0010\u0000\u0132\u0133\u0005\u0005\u0000\u0000\u0133"+
		"\u0134\u0005\t\u0000\u0000\u0134\u0136\u0005\u0003\u0000\u0000\u0135\u0137"+
		"\u0003\u0006\u0003\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005\u0005\u0000\u0000\u013b3\u0001\u0000\u0000\u0000\u00167EPWfq{\u00a4"+
		"\u00ac\u00b4\u00cc\u00db\u00e5\u00ed\u00f5\u00fd\u0105\u010d\u0113\u0122"+
		"\u0128\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}