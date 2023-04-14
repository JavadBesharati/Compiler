// Generated from E:/Uni/Uni06/3. compiler/2. CAs/Compiler-Projects-UT-Spring-2023/phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
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
		T__9=10, MAIN=11, INT_TYPE=12, FLOAT_TYPE=13, BOOLEAN_TYPE=14, BOOLEAN=15, 
		FUNCTION=16, PRINT=17, FOR=18, RETURN=19, KEYWORDS=20, NATURAL_NUMBERS=21, 
		IDENTIFIER=22, PRIDICATE=23, MUL_DIV_MOD=24, PLUS=25, MINUS=26, LOGICAL_NOT=27, 
		RELATIONAL_OP1=28, RELATIONAL_OP2=29, LOGICAL_AND_OP=30, LOGICAL_OR_OP=31, 
		ASSIGNMENT_OP=32, COMMA=33, SEMICOLON=34, FLOAT=35, WHITESPACE=36, NEWLINE=37, 
		COMMENT=38;
	public static final int
		RULE_logicPL = 0, RULE_main_call = 1, RULE_main_body = 2, RULE_line = 3, 
		RULE_for_structure = 4, RULE_for_body = 5, RULE_function_declaration = 6, 
		RULE_array_declaration = 7, RULE_array_elements = 8, RULE_argument = 9, 
		RULE_int_declaration = 10, RULE_float_declaration = 11, RULE_boolean_declaration = 12, 
		RULE_chane_var = 13, RULE_function_call = 14, RULE_function_return = 15, 
		RULE_print_expression = 16, RULE_assign_expression = 17, RULE_assign_expression2 = 18, 
		RULE_or_expression = 19, RULE_or_expression2 = 20, RULE_and_expression = 21, 
		RULE_and_expression2 = 22, RULE_relational2_expression = 23, RULE_relational2_expression2 = 24, 
		RULE_relational1_expression = 25, RULE_relational1_expression2 = 26, RULE_arithmatic2_expression = 27, 
		RULE_arithmatic2_expression2 = 28, RULE_arithmatic1_expression = 29, RULE_primary_expression = 30, 
		RULE_predicate_expression = 31, RULE_query_1 = 32, RULE_query_2 = 33, 
		RULE_implication_expression = 34, RULE_unary_value = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "main_call", "main_body", "line", "for_structure", "for_body", 
			"function_declaration", "array_declaration", "array_elements", "argument", 
			"int_declaration", "float_declaration", "boolean_declaration", "chane_var", 
			"function_call", "function_return", "print_expression", "assign_expression", 
			"assign_expression2", "or_expression", "or_expression2", "and_expression", 
			"and_expression2", "relational2_expression", "relational2_expression2", 
			"relational1_expression", "relational1_expression2", "arithmatic2_expression", 
			"arithmatic2_expression2", "arithmatic1_expression", "primary_expression", 
			"predicate_expression", "query_1", "query_2", "implication_expression", 
			"unary_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "':'", "')'", "'['", "']'", "'0'", "'?'", 
			"'=>'", "'main'", "'int'", "'float'", "'boolean'", null, "'function'", 
			"'print'", "'for'", "'return'", null, null, null, null, null, "'+'", 
			"'-'", "'!'", null, null, "'&&'", "'||'", "'='", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "MAIN", 
			"INT_TYPE", "FLOAT_TYPE", "BOOLEAN_TYPE", "BOOLEAN", "FUNCTION", "PRINT", 
			"FOR", "RETURN", "KEYWORDS", "NATURAL_NUMBERS", "IDENTIFIER", "PRIDICATE", 
			"MUL_DIV_MOD", "PLUS", "MINUS", "LOGICAL_NOT", "RELATIONAL_OP1", "RELATIONAL_OP2", 
			"LOGICAL_AND_OP", "LOGICAL_OR_OP", "ASSIGNMENT_OP", "COMMA", "SEMICOLON", 
			"FLOAT", "WHITESPACE", "NEWLINE", "COMMENT"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(72);
				function_declaration();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			main_call();
			setState(79);
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
			setState(81);
			match(MAIN);
			 System.out.println("MainBody"); 
			setState(83);
			match(T__0);
			setState(84);
			main_body();
			setState(85);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
				{
				{
				setState(87);
				line();
				}
				}
				setState(92);
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
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Print_expressionContext print_expression() {
			return getRuleContext(Print_expressionContext.class,0);
		}
		public Chane_varContext chane_var() {
			return getRuleContext(Chane_varContext.class,0);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					{
					setState(93);
					function_call();
					}
					}
					break;
				case 2:
					{
					setState(94);
					array_declaration();
					}
					break;
				case 3:
					{
					setState(95);
					int_declaration();
					}
					break;
				case 4:
					{
					setState(96);
					float_declaration();
					}
					break;
				case 5:
					{
					setState(97);
					boolean_declaration();
					}
					break;
				case 6:
					{
					setState(98);
					assign_expression();
					}
					break;
				case 7:
					{
					setState(99);
					function_return();
					}
					break;
				case 8:
					{
					setState(100);
					print_expression();
					}
					break;
				case 9:
					{
					setState(101);
					chane_var();
					}
					break;
				}
				setState(104);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(106);
				for_structure();
				}
				break;
			case 3:
				{
				setState(107);
				predicate_expression();
				}
				break;
			case 4:
				{
				setState(108);
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
			setState(111);
			match(FOR);
			System.out.println("Loop: for");
			setState(113);
			match(T__2);
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(T__3);
			setState(116);
			match(IDENTIFIER);
			setState(117);
			match(T__4);
			setState(118);
			match(T__0);
			setState(119);
			for_body();
			setState(120);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
				{
				{
				setState(122);
				line();
				}
				}
				setState(127);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(FUNCTION);
				setState(129);
				((Function_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("FunctionDec: " + ((Function_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(131);
				match(T__2);
				{
				setState(132);
				argument();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133);
					match(COMMA);
					setState(134);
					argument();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(140);
				match(T__4);
				setState(141);
				match(T__3);
				setState(142);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				match(T__0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
					{
					{
					setState(144);
					line();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(FUNCTION);
				setState(153);
				((Function_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("FunctionDec: " + ((Function_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(155);
				match(T__2);
				setState(156);
				match(T__4);
				setState(157);
				match(T__3);
				setState(158);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				match(T__0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
					{
					{
					setState(160);
					line();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__1);
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
	public static class Array_declarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(INT_TYPE);
				setState(170);
				match(T__5);
				setState(171);
				match(NATURAL_NUMBERS);
				setState(172);
				match(T__6);
				setState(173);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(INT_TYPE);
				setState(176);
				match(T__5);
				setState(177);
				match(NATURAL_NUMBERS);
				setState(178);
				match(T__6);
				setState(179);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(181);
				match(ASSIGNMENT_OP);
				setState(182);
				array_elements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(FLOAT_TYPE);
				setState(184);
				match(T__5);
				setState(185);
				match(NATURAL_NUMBERS);
				setState(186);
				match(T__6);
				setState(187);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(FLOAT_TYPE);
				setState(190);
				match(T__5);
				setState(191);
				match(NATURAL_NUMBERS);
				setState(192);
				match(T__6);
				setState(193);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(195);
				match(ASSIGNMENT_OP);
				setState(196);
				array_elements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(BOOLEAN_TYPE);
				setState(198);
				match(T__5);
				setState(199);
				match(NATURAL_NUMBERS);
				setState(200);
				match(T__6);
				setState(201);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(BOOLEAN_TYPE);
				setState(204);
				match(T__5);
				setState(205);
				match(NATURAL_NUMBERS);
				setState(206);
				match(T__6);
				setState(207);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(209);
				match(ASSIGNMENT_OP);
				setState(210);
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
		public List<Unary_valueContext> unary_value() {
			return getRuleContexts(Unary_valueContext.class);
		}
		public Unary_valueContext unary_value(int i) {
			return getRuleContext(Unary_valueContext.class,i);
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
			setState(213);
			match(T__5);
			{
			setState(214);
			unary_value();
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
				unary_value();
				}
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(225);
			((ArgumentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 System.out.println("ArgumentDec: " + ((ArgumentContext)_localctx).IDENTIFIER.getText()); 
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
	public static class Int_declarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode INT_TYPE() { return getToken(LogicPLParser.INT_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(INT_TYPE);
				setState(229);
				((Int_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Int_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(INT_TYPE);
				setState(232);
				((Int_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Int_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(234);
				match(ASSIGNMENT_OP);
				setState(235);
				assign_expression();
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
		public TerminalNode FLOAT_TYPE() { return getToken(LogicPLParser.FLOAT_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(FLOAT_TYPE);
				setState(239);
				((Float_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Float_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(FLOAT_TYPE);
				setState(242);
				((Float_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Float_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(244);
				match(ASSIGNMENT_OP);
				setState(245);
				assign_expression();
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
		public TerminalNode BOOLEAN_TYPE() { return getToken(LogicPLParser.BOOLEAN_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(BOOLEAN_TYPE);
				setState(249);
				((Boolean_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Boolean_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(BOOLEAN_TYPE);
				setState(252);
				((Boolean_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Boolean_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(254);
				match(ASSIGNMENT_OP);
				setState(255);
				assign_expression();
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
	public static class Chane_varContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(LogicPLParser.ASSIGNMENT_OP, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public Chane_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chane_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterChane_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitChane_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitChane_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chane_varContext chane_var() throws RecognitionException {
		Chane_varContext _localctx = new Chane_varContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chane_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IDENTIFIER);
			setState(259);
			match(ASSIGNMENT_OP);
			setState(260);
			assign_expression();
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
		public List<Assign_expressionContext> assign_expression() {
			return getRuleContexts(Assign_expressionContext.class);
		}
		public Assign_expressionContext assign_expression(int i) {
			return getRuleContext(Assign_expressionContext.class,i);
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
		enterRule(_localctx, 28, RULE_function_call);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(IDENTIFIER);
				setState(263);
				match(T__2);
				setState(264);
				assign_expression();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					assign_expression();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(IDENTIFIER);
				setState(275);
				match(T__2);
				setState(276);
				match(T__4);
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
	public static class Function_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LogicPLParser.RETURN, 0); }
		public Unary_valueContext unary_value() {
			return getRuleContext(Unary_valueContext.class,0);
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
		enterRule(_localctx, 30, RULE_function_return);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(RETURN);
				 System.out.println("Return"); 
				{
				setState(281);
				unary_value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(RETURN);
				 System.out.println("Return"); 
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
	public static class Print_expressionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LogicPLParser.PRINT, 0); }
		public List<Query_2Context> query_2() {
			return getRuleContexts(Query_2Context.class);
		}
		public Query_2Context query_2(int i) {
			return getRuleContext(Query_2Context.class,i);
		}
		public List<Query_1Context> query_1() {
			return getRuleContexts(Query_1Context.class);
		}
		public Query_1Context query_1(int i) {
			return getRuleContext(Query_1Context.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogicPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogicPLParser.IDENTIFIER, i);
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
		enterRule(_localctx, 32, RULE_print_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(PRINT);
			 System.out.println("Built-in: print"); 
			setState(288);
			match(T__2);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(289);
				query_2();
				}
				break;
			case 2:
				{
				setState(290);
				query_1();
				}
				break;
			case 3:
				{
				setState(291);
				match(IDENTIFIER);
				}
				break;
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(295);
					query_1();
					}
					break;
				case 2:
					{
					setState(296);
					query_2();
					}
					break;
				case 3:
					{
					setState(297);
					match(IDENTIFIER);
					}
					break;
				}
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(305);
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
	public static class Assign_expressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Assign_expression2Context assign_expression2() {
			return getRuleContext(Assign_expression2Context.class,0);
		}
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAssign_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAssign_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAssign_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			or_expression();
			setState(308);
			assign_expression2();
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
	public static class Assign_expression2Context extends ParserRuleContext {
		public Token OP;
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Assign_expression2Context assign_expression2() {
			return getRuleContext(Assign_expression2Context.class,0);
		}
		public TerminalNode LOGICAL_OR_OP() { return getToken(LogicPLParser.LOGICAL_OR_OP, 0); }
		public Assign_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAssign_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAssign_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAssign_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expression2Context assign_expression2() throws RecognitionException {
		Assign_expression2Context _localctx = new Assign_expression2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_expression2);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_OR_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((Assign_expression2Context)_localctx).OP = match(LOGICAL_OR_OP);
				setState(311);
				or_expression();
				setState(312);
				assign_expression2();
				System.out.println("Operator: " + ((Assign_expression2Context)_localctx).OP.getText());
				}
				break;
			case T__4:
			case T__6:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expression2Context or_expression2() {
			return getRuleContext(Or_expression2Context.class,0);
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
		enterRule(_localctx, 38, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			and_expression();
			setState(319);
			or_expression2();
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
	public static class Or_expression2Context extends ParserRuleContext {
		public Token OP;
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expression2Context or_expression2() {
			return getRuleContext(Or_expression2Context.class,0);
		}
		public TerminalNode LOGICAL_AND_OP() { return getToken(LogicPLParser.LOGICAL_AND_OP, 0); }
		public Or_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterOr_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitOr_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitOr_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expression2Context or_expression2() throws RecognitionException {
		Or_expression2Context _localctx = new Or_expression2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_or_expression2);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_AND_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((Or_expression2Context)_localctx).OP = match(LOGICAL_AND_OP);
				setState(322);
				and_expression();
				setState(323);
				or_expression2();
				System.out.println("Operator: " + ((Or_expression2Context)_localctx).OP.getText());
				}
				break;
			case T__4:
			case T__6:
			case LOGICAL_OR_OP:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class And_expressionContext extends ParserRuleContext {
		public Relational2_expressionContext relational2_expression() {
			return getRuleContext(Relational2_expressionContext.class,0);
		}
		public And_expression2Context and_expression2() {
			return getRuleContext(And_expression2Context.class,0);
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
		enterRule(_localctx, 42, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			relational2_expression();
			setState(330);
			and_expression2();
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
	public static class And_expression2Context extends ParserRuleContext {
		public Token OP;
		public Relational2_expressionContext relational2_expression() {
			return getRuleContext(Relational2_expressionContext.class,0);
		}
		public And_expression2Context and_expression2() {
			return getRuleContext(And_expression2Context.class,0);
		}
		public TerminalNode RELATIONAL_OP2() { return getToken(LogicPLParser.RELATIONAL_OP2, 0); }
		public And_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAnd_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAnd_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAnd_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expression2Context and_expression2() throws RecognitionException {
		And_expression2Context _localctx = new And_expression2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_and_expression2);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONAL_OP2:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((And_expression2Context)_localctx).OP = match(RELATIONAL_OP2);
				setState(333);
				relational2_expression();
				setState(334);
				and_expression2();
				System.out.println("Operator: " + ((And_expression2Context)_localctx).OP.getText());
				}
				break;
			case T__4:
			case T__6:
			case LOGICAL_AND_OP:
			case LOGICAL_OR_OP:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Relational2_expressionContext extends ParserRuleContext {
		public Relational1_expressionContext relational1_expression() {
			return getRuleContext(Relational1_expressionContext.class,0);
		}
		public Relational2_expression2Context relational2_expression2() {
			return getRuleContext(Relational2_expression2Context.class,0);
		}
		public Relational2_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational2_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelational2_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelational2_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelational2_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational2_expressionContext relational2_expression() throws RecognitionException {
		Relational2_expressionContext _localctx = new Relational2_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relational2_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			relational1_expression();
			setState(341);
			relational2_expression2();
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
	public static class Relational2_expression2Context extends ParserRuleContext {
		public Token OP;
		public Relational1_expressionContext relational1_expression() {
			return getRuleContext(Relational1_expressionContext.class,0);
		}
		public Relational2_expression2Context relational2_expression2() {
			return getRuleContext(Relational2_expression2Context.class,0);
		}
		public TerminalNode RELATIONAL_OP1() { return getToken(LogicPLParser.RELATIONAL_OP1, 0); }
		public Relational2_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational2_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelational2_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelational2_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelational2_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational2_expression2Context relational2_expression2() throws RecognitionException {
		Relational2_expression2Context _localctx = new Relational2_expression2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_relational2_expression2);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONAL_OP1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				((Relational2_expression2Context)_localctx).OP = match(RELATIONAL_OP1);
				setState(344);
				relational1_expression();
				setState(345);
				relational2_expression2();
				System.out.println("Operator: " + ((Relational2_expression2Context)_localctx).OP.getText());
				}
				break;
			case T__4:
			case T__6:
			case RELATIONAL_OP2:
			case LOGICAL_AND_OP:
			case LOGICAL_OR_OP:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Relational1_expressionContext extends ParserRuleContext {
		public Arithmatic2_expressionContext arithmatic2_expression() {
			return getRuleContext(Arithmatic2_expressionContext.class,0);
		}
		public Relational1_expression2Context relational1_expression2() {
			return getRuleContext(Relational1_expression2Context.class,0);
		}
		public Relational1_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational1_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelational1_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelational1_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelational1_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational1_expressionContext relational1_expression() throws RecognitionException {
		Relational1_expressionContext _localctx = new Relational1_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relational1_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			arithmatic2_expression();
			setState(352);
			relational1_expression2();
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
	public static class Relational1_expression2Context extends ParserRuleContext {
		public Token OP;
		public Arithmatic2_expressionContext arithmatic2_expression() {
			return getRuleContext(Arithmatic2_expressionContext.class,0);
		}
		public Relational1_expression2Context relational1_expression2() {
			return getRuleContext(Relational1_expression2Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public Relational1_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational1_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelational1_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelational1_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelational1_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational1_expression2Context relational1_expression2() throws RecognitionException {
		Relational1_expression2Context _localctx = new Relational1_expression2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_relational1_expression2);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				((Relational1_expression2Context)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Relational1_expression2Context)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				arithmatic2_expression();
				setState(356);
				relational1_expression2();
				System.out.println("Operator: " + ((Relational1_expression2Context)_localctx).OP.getText());
				}
				break;
			case T__4:
			case T__6:
			case RELATIONAL_OP1:
			case RELATIONAL_OP2:
			case LOGICAL_AND_OP:
			case LOGICAL_OR_OP:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Arithmatic2_expressionContext extends ParserRuleContext {
		public Arithmatic1_expressionContext arithmatic1_expression() {
			return getRuleContext(Arithmatic1_expressionContext.class,0);
		}
		public Arithmatic2_expression2Context arithmatic2_expression2() {
			return getRuleContext(Arithmatic2_expression2Context.class,0);
		}
		public Arithmatic2_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmatic2_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArithmatic2_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArithmatic2_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArithmatic2_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmatic2_expressionContext arithmatic2_expression() throws RecognitionException {
		Arithmatic2_expressionContext _localctx = new Arithmatic2_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmatic2_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			arithmatic1_expression();
			setState(363);
			arithmatic2_expression2();
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
	public static class Arithmatic2_expression2Context extends ParserRuleContext {
		public Token OP;
		public Arithmatic1_expressionContext arithmatic1_expression() {
			return getRuleContext(Arithmatic1_expressionContext.class,0);
		}
		public Arithmatic2_expression2Context arithmatic2_expression2() {
			return getRuleContext(Arithmatic2_expression2Context.class,0);
		}
		public TerminalNode MUL_DIV_MOD() { return getToken(LogicPLParser.MUL_DIV_MOD, 0); }
		public Arithmatic2_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmatic2_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArithmatic2_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArithmatic2_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArithmatic2_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmatic2_expression2Context arithmatic2_expression2() throws RecognitionException {
		Arithmatic2_expression2Context _localctx = new Arithmatic2_expression2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_arithmatic2_expression2);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL_DIV_MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				((Arithmatic2_expression2Context)_localctx).OP = match(MUL_DIV_MOD);
				setState(366);
				arithmatic1_expression();
				setState(367);
				arithmatic2_expression2();
				System.out.println("Operator: " + ((Arithmatic2_expression2Context)_localctx).OP.getText());
				}
				break;
			case T__4:
			case T__6:
			case PLUS:
			case MINUS:
			case RELATIONAL_OP1:
			case RELATIONAL_OP2:
			case LOGICAL_AND_OP:
			case LOGICAL_OR_OP:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Arithmatic1_expressionContext extends ParserRuleContext {
		public Token OP;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode LOGICAL_NOT() { return getToken(LogicPLParser.LOGICAL_NOT, 0); }
		public Arithmatic1_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmatic1_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArithmatic1_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArithmatic1_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArithmatic1_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmatic1_expressionContext arithmatic1_expression() throws RecognitionException {
		Arithmatic1_expressionContext _localctx = new Arithmatic1_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arithmatic1_expression);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				((Arithmatic1_expressionContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
					((Arithmatic1_expressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(374);
				primary_expression();
				System.out.println("Operator: " + ((Arithmatic1_expressionContext)_localctx).OP.getText());
				}
				break;
			case T__2:
			case T__5:
			case T__7:
			case BOOLEAN:
			case NATURAL_NUMBERS:
			case IDENTIFIER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
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
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public Query_1Context query_1() {
			return getRuleContext(Query_1Context.class,0);
		}
		public Query_2Context query_2() {
			return getRuleContext(Query_2Context.class,0);
		}
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
		enterRule(_localctx, 60, RULE_primary_expression);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(IDENTIFIER);
				setState(381);
				match(T__5);
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(382);
					match(NATURAL_NUMBERS);
					}
					break;
				case 2:
					{
					setState(383);
					assign_expression();
					}
					break;
				}
				setState(386);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
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
				setState(388);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				match(T__2);
				setState(391);
				assign_expression();
				setState(392);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(395);
				query_1();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(396);
				query_2();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(397);
				array_elements();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(398);
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
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_predicate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((Predicate_expressionContext)_localctx).PRIDICATE = match(PRIDICATE);
			System.out.println("Predicate: " + ((Predicate_expressionContext)_localctx).PRIDICATE.getText());
			setState(403);
			match(T__2);
			setState(404);
			assign_expression();
			setState(405);
			match(T__4);
			setState(406);
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
	public static class Query_1Context extends ParserRuleContext {
		public Token PRIDICATE;
		public TerminalNode PRIDICATE() { return getToken(LogicPLParser.PRIDICATE, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public Query_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQuery_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQuery_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQuery_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_1Context query_1() throws RecognitionException {
		Query_1Context _localctx = new Query_1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_query_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__5);
			setState(409);
			match(T__8);
			setState(410);
			((Query_1Context)_localctx).PRIDICATE = match(PRIDICATE);
			System.out.println("Predicate: " + ((Query_1Context)_localctx).PRIDICATE.getText());
			setState(412);
			match(T__2);
			setState(413);
			assign_expression();
			setState(414);
			match(T__4);
			setState(415);
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
	public static class Query_2Context extends ParserRuleContext {
		public Token PRIDICATE;
		public TerminalNode PRIDICATE() { return getToken(LogicPLParser.PRIDICATE, 0); }
		public Query_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQuery_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQuery_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQuery_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_2Context query_2() throws RecognitionException {
		Query_2Context _localctx = new Query_2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_query_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__5);
			setState(418);
			((Query_2Context)_localctx).PRIDICATE = match(PRIDICATE);
			System.out.println("Predicate: " + ((Query_2Context)_localctx).PRIDICATE.getText());
			setState(420);
			match(T__2);
			setState(421);
			match(T__8);
			setState(422);
			match(T__4);
			setState(423);
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
	public static class Implication_expressionContext extends ParserRuleContext {
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
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
		enterRule(_localctx, 68, RULE_implication_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("Implication"); 
			setState(426);
			match(T__2);
			setState(427);
			assign_expression();
			setState(428);
			match(T__4);
			setState(429);
			match(T__9);
			setState(430);
			match(T__2);
			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(431);
				line();
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0) );
			setState(436);
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
	public static class Unary_valueContext extends ParserRuleContext {
		public Token OP;
		public TerminalNode NATURAL_NUMBERS() { return getToken(LogicPLParser.NATURAL_NUMBERS, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public Unary_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterUnary_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitUnary_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitUnary_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_valueContext unary_value() throws RecognitionException {
		Unary_valueContext _localctx = new Unary_valueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unary_value);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				((Unary_valueContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Unary_valueContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34361835776L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				System.out.println("Operator: " + ((Unary_valueContext)_localctx).OP.getText());
				}
				break;
			case T__7:
			case BOOLEAN:
			case NATURAL_NUMBERS:
			case IDENTIFIER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34366062848L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static final String _serializedATN =
		"\u0004\u0001&\u01bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002"+
		"\f\u0002\\\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003g\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003n\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0088\b\u0006\n\u0006\f\u0006\u008b\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0092"+
		"\b\u0006\n\u0006\f\u0006\u0095\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00a2\b\u0006\n\u0006\f\u0006\u00a5"+
		"\t\u0006\u0001\u0006\u0003\u0006\u00a8\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d4\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00da\b\b\n\b\f\b\u00dd\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ed\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00f7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0101\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u010c\b\u000e\n\u000e\f\u000e\u010f\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0116\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u011d\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0125\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u012b\b\u0010\u0005\u0010\u012d\b\u0010\n\u0010\f\u0010\u0130\t"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u013d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0148"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0153\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u015e\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0169\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0174\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u017b\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0181\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0190"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0004\"\u01b1\b\"\u000b"+
		"\"\f\"\u01b2\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u01bb"+
		"\b#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0006"+
		"\u0001\u0000\f\u000e\u0001\u0000\u0019\u001a\u0001\u0000\u0019\u001b\u0002"+
		"\u0000\b\b\u0015\u0015\u0003\u0000\b\b\u0015\u0015##\u0004\u0000\b\b\u000f"+
		"\u000f\u0015\u0016##\u01ce\u0000K\u0001\u0000\u0000\u0000\u0002Q\u0001"+
		"\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006m\u0001\u0000\u0000"+
		"\u0000\bo\u0001\u0000\u0000\u0000\n}\u0001\u0000\u0000\u0000\f\u00a7\u0001"+
		"\u0000\u0000\u0000\u000e\u00d3\u0001\u0000\u0000\u0000\u0010\u00d5\u0001"+
		"\u0000\u0000\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00ec\u0001"+
		"\u0000\u0000\u0000\u0016\u00f6\u0001\u0000\u0000\u0000\u0018\u0100\u0001"+
		"\u0000\u0000\u0000\u001a\u0102\u0001\u0000\u0000\u0000\u001c\u0115\u0001"+
		"\u0000\u0000\u0000\u001e\u011c\u0001\u0000\u0000\u0000 \u011e\u0001\u0000"+
		"\u0000\u0000\"\u0133\u0001\u0000\u0000\u0000$\u013c\u0001\u0000\u0000"+
		"\u0000&\u013e\u0001\u0000\u0000\u0000(\u0147\u0001\u0000\u0000\u0000*"+
		"\u0149\u0001\u0000\u0000\u0000,\u0152\u0001\u0000\u0000\u0000.\u0154\u0001"+
		"\u0000\u0000\u00000\u015d\u0001\u0000\u0000\u00002\u015f\u0001\u0000\u0000"+
		"\u00004\u0168\u0001\u0000\u0000\u00006\u016a\u0001\u0000\u0000\u00008"+
		"\u0173\u0001\u0000\u0000\u0000:\u017a\u0001\u0000\u0000\u0000<\u018f\u0001"+
		"\u0000\u0000\u0000>\u0191\u0001\u0000\u0000\u0000@\u0198\u0001\u0000\u0000"+
		"\u0000B\u01a1\u0001\u0000\u0000\u0000D\u01a9\u0001\u0000\u0000\u0000F"+
		"\u01ba\u0001\u0000\u0000\u0000HJ\u0003\f\u0006\u0000IH\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0003"+
		"\u0002\u0001\u0000OP\u0005\u0000\u0000\u0001P\u0001\u0001\u0000\u0000"+
		"\u0000QR\u0005\u000b\u0000\u0000RS\u0006\u0001\uffff\uffff\u0000ST\u0005"+
		"\u0001\u0000\u0000TU\u0003\u0004\u0002\u0000UV\u0005\u0002\u0000\u0000"+
		"V\u0003\u0001\u0000\u0000\u0000WY\u0003\u0006\u0003\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]g\u0003\u001c\u000e\u0000^g\u0003\u000e\u0007\u0000_g\u0003\u0014"+
		"\n\u0000`g\u0003\u0016\u000b\u0000ag\u0003\u0018\f\u0000bg\u0003\"\u0011"+
		"\u0000cg\u0003\u001e\u000f\u0000dg\u0003 \u0010\u0000eg\u0003\u001a\r"+
		"\u0000f]\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000f_\u0001\u0000"+
		"\u0000\u0000f`\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000fb\u0001"+
		"\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\"\u0000\u0000"+
		"in\u0001\u0000\u0000\u0000jn\u0003\b\u0004\u0000kn\u0003>\u001f\u0000"+
		"ln\u0003D\"\u0000mf\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0007\u0001\u0000"+
		"\u0000\u0000op\u0005\u0012\u0000\u0000pq\u0006\u0004\uffff\uffff\u0000"+
		"qr\u0005\u0003\u0000\u0000rs\u0005\u0016\u0000\u0000st\u0005\u0004\u0000"+
		"\u0000tu\u0005\u0016\u0000\u0000uv\u0005\u0005\u0000\u0000vw\u0005\u0001"+
		"\u0000\u0000wx\u0003\n\u0005\u0000xy\u0005\u0002\u0000\u0000y\t\u0001"+
		"\u0000\u0000\u0000z|\u0003\u0006\u0003\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0082\u0005\u0016\u0000\u0000"+
		"\u0082\u0083\u0006\u0006\uffff\uffff\u0000\u0083\u0084\u0005\u0003\u0000"+
		"\u0000\u0084\u0089\u0003\u0012\t\u0000\u0085\u0086\u0005!\u0000\u0000"+
		"\u0086\u0088\u0003\u0012\t\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d"+
		"\u008e\u0005\u0004\u0000\u0000\u008e\u008f\u0007\u0000\u0000\u0000\u008f"+
		"\u0093\u0005\u0001\u0000\u0000\u0090\u0092\u0003\u0006\u0003\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\u0002\u0000\u0000\u0097\u00a8\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u0010\u0000\u0000\u0099\u009a\u0005\u0016\u0000\u0000\u009a"+
		"\u009b\u0006\u0006\uffff\uffff\u0000\u009b\u009c\u0005\u0003\u0000\u0000"+
		"\u009c\u009d\u0005\u0005\u0000\u0000\u009d\u009e\u0005\u0004\u0000\u0000"+
		"\u009e\u009f\u0007\u0000\u0000\u0000\u009f\u00a3\u0005\u0001\u0000\u0000"+
		"\u00a0\u00a2\u0003\u0006\u0003\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0002\u0000\u0000"+
		"\u00a7\u0080\u0001\u0000\u0000\u0000\u00a7\u0098\u0001\u0000\u0000\u0000"+
		"\u00a8\r\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\f\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0006\u0000\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0007\u0000\u0000\u00ad\u00ae\u0005\u0016\u0000\u0000\u00ae"+
		"\u00d4\u0006\u0007\uffff\uffff\u0000\u00af\u00b0\u0005\f\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0006\u0000\u0000\u00b1\u00b2\u0005\u0015\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b4\u0005\u0016\u0000\u0000\u00b4"+
		"\u00b5\u0006\u0007\uffff\uffff\u0000\u00b5\u00b6\u0005 \u0000\u0000\u00b6"+
		"\u00d4\u0003\u0010\b\u0000\u00b7\u00b8\u0005\r\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0006\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0007\u0000\u0000\u00bb\u00bc\u0005\u0016\u0000\u0000\u00bc\u00d4"+
		"\u0006\u0007\uffff\uffff\u0000\u00bd\u00be\u0005\r\u0000\u0000\u00be\u00bf"+
		"\u0005\u0006\u0000\u0000\u00bf\u00c0\u0005\u0015\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0007\u0000\u0000\u00c1\u00c2\u0005\u0016\u0000\u0000\u00c2\u00c3"+
		"\u0006\u0007\uffff\uffff\u0000\u00c3\u00c4\u0005 \u0000\u0000\u00c4\u00d4"+
		"\u0003\u0010\b\u0000\u00c5\u00c6\u0005\u000e\u0000\u0000\u00c6\u00c7\u0005"+
		"\u0006\u0000\u0000\u00c7\u00c8\u0005\u0015\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0007\u0000\u0000\u00c9\u00ca\u0005\u0016\u0000\u0000\u00ca\u00d4\u0006"+
		"\u0007\uffff\uffff\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0006\u0000\u0000\u00cd\u00ce\u0005\u0015\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0007\u0000\u0000\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u00d1"+
		"\u0006\u0007\uffff\uffff\u0000\u00d1\u00d2\u0005 \u0000\u0000\u00d2\u00d4"+
		"\u0003\u0010\b\u0000\u00d3\u00a9\u0001\u0000\u0000\u0000\u00d3\u00af\u0001"+
		"\u0000\u0000\u0000\u00d3\u00b7\u0001\u0000\u0000\u0000\u00d3\u00bd\u0001"+
		"\u0000\u0000\u0000\u00d3\u00c5\u0001\u0000\u0000\u0000\u00d3\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d4\u000f\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0006\u0000\u0000\u00d6\u00db\u0003F#\u0000\u00d7\u00d8\u0005!\u0000"+
		"\u0000\u00d8\u00da\u0003F#\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0007\u0000\u0000\u00df"+
		"\u0011\u0001\u0000\u0000\u0000\u00e0\u00e1\u0007\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005\u0016\u0000\u0000\u00e2\u00e3\u0006\t\uffff\uffff\u0000\u00e3"+
		"\u0013\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\f\u0000\u0000\u00e5\u00e6"+
		"\u0005\u0016\u0000\u0000\u00e6\u00ed\u0006\n\uffff\uffff\u0000\u00e7\u00e8"+
		"\u0005\f\u0000\u0000\u00e8\u00e9\u0005\u0016\u0000\u0000\u00e9\u00ea\u0006"+
		"\n\uffff\uffff\u0000\u00ea\u00eb\u0005 \u0000\u0000\u00eb\u00ed\u0003"+
		"\"\u0011\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ed\u0015\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\r\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0016\u0000\u0000\u00f0\u00f7\u0006\u000b\uffff"+
		"\uffff\u0000\u00f1\u00f2\u0005\r\u0000\u0000\u00f2\u00f3\u0005\u0016\u0000"+
		"\u0000\u00f3\u00f4\u0006\u000b\uffff\uffff\u0000\u00f4\u00f5\u0005 \u0000"+
		"\u0000\u00f5\u00f7\u0003\"\u0011\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f7\u0017\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\u000e\u0000\u0000\u00f9\u00fa\u0005\u0016\u0000\u0000"+
		"\u00fa\u0101\u0006\f\uffff\uffff\u0000\u00fb\u00fc\u0005\u000e\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0016\u0000\u0000\u00fd\u00fe\u0006\f\uffff\uffff\u0000"+
		"\u00fe\u00ff\u0005 \u0000\u0000\u00ff\u0101\u0003\"\u0011\u0000\u0100"+
		"\u00f8\u0001\u0000\u0000\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0101"+
		"\u0019\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0016\u0000\u0000\u0103"+
		"\u0104\u0005 \u0000\u0000\u0104\u0105\u0003\"\u0011\u0000\u0105\u001b"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0016\u0000\u0000\u0107\u0108"+
		"\u0005\u0003\u0000\u0000\u0108\u010d\u0003\"\u0011\u0000\u0109\u010a\u0005"+
		"!\u0000\u0000\u010a\u010c\u0003\"\u0011\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0005"+
		"\u0000\u0000\u0111\u0116\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0016"+
		"\u0000\u0000\u0113\u0114\u0005\u0003\u0000\u0000\u0114\u0116\u0005\u0005"+
		"\u0000\u0000\u0115\u0106\u0001\u0000\u0000\u0000\u0115\u0112\u0001\u0000"+
		"\u0000\u0000\u0116\u001d\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0013"+
		"\u0000\u0000\u0118\u0119\u0006\u000f\uffff\uffff\u0000\u0119\u011d\u0003"+
		"F#\u0000\u011a\u011b\u0005\u0013\u0000\u0000\u011b\u011d\u0006\u000f\uffff"+
		"\uffff\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u001f\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0011"+
		"\u0000\u0000\u011f\u0120\u0006\u0010\uffff\uffff\u0000\u0120\u0124\u0005"+
		"\u0003\u0000\u0000\u0121\u0125\u0003B!\u0000\u0122\u0125\u0003@ \u0000"+
		"\u0123\u0125\u0005\u0016\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u012e\u0001\u0000\u0000\u0000\u0126\u012a\u0005!\u0000\u0000\u0127"+
		"\u012b\u0003@ \u0000\u0128\u012b\u0003B!\u0000\u0129\u012b\u0005\u0016"+
		"\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000"+
		"\u0000\u0000\u012c\u0126\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005\u0005\u0000\u0000\u0132!\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0003&\u0013\u0000\u0134\u0135\u0003$\u0012\u0000\u0135"+
		"#\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u001f\u0000\u0000\u0137\u0138"+
		"\u0003&\u0013\u0000\u0138\u0139\u0003$\u0012\u0000\u0139\u013a\u0006\u0012"+
		"\uffff\uffff\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u013d\u0001"+
		"\u0000\u0000\u0000\u013c\u0136\u0001\u0000\u0000\u0000\u013c\u013b\u0001"+
		"\u0000\u0000\u0000\u013d%\u0001\u0000\u0000\u0000\u013e\u013f\u0003*\u0015"+
		"\u0000\u013f\u0140\u0003(\u0014\u0000\u0140\'\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0005\u001e\u0000\u0000\u0142\u0143\u0003*\u0015\u0000\u0143"+
		"\u0144\u0003(\u0014\u0000\u0144\u0145\u0006\u0014\uffff\uffff\u0000\u0145"+
		"\u0148\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147"+
		"\u0141\u0001\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148"+
		")\u0001\u0000\u0000\u0000\u0149\u014a\u0003.\u0017\u0000\u014a\u014b\u0003"+
		",\u0016\u0000\u014b+\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u001d\u0000"+
		"\u0000\u014d\u014e\u0003.\u0017\u0000\u014e\u014f\u0003,\u0016\u0000\u014f"+
		"\u0150\u0006\u0016\uffff\uffff\u0000\u0150\u0153\u0001\u0000\u0000\u0000"+
		"\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u014c\u0001\u0000\u0000\u0000"+
		"\u0152\u0151\u0001\u0000\u0000\u0000\u0153-\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u00032\u0019\u0000\u0155\u0156\u00030\u0018\u0000\u0156/\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005\u001c\u0000\u0000\u0158\u0159\u0003"+
		"2\u0019\u0000\u0159\u015a\u00030\u0018\u0000\u015a\u015b\u0006\u0018\uffff"+
		"\uffff\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000"+
		"\u0000\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015e1\u0001\u0000\u0000\u0000\u015f\u0160\u00036\u001b\u0000"+
		"\u0160\u0161\u00034\u001a\u0000\u01613\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0007\u0001\u0000\u0000\u0163\u0164\u00036\u001b\u0000\u0164\u0165\u0003"+
		"4\u001a\u0000\u0165\u0166\u0006\u001a\uffff\uffff\u0000\u0166\u0169\u0001"+
		"\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0162\u0001"+
		"\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u01695\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0003:\u001d\u0000\u016b\u016c\u00038\u001c\u0000"+
		"\u016c7\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0018\u0000\u0000\u016e"+
		"\u016f\u0003:\u001d\u0000\u016f\u0170\u00038\u001c\u0000\u0170\u0171\u0006"+
		"\u001c\uffff\uffff\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u0001\u0000\u0000\u0000\u0173\u016d\u0001\u0000\u0000\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u01749\u0001\u0000\u0000\u0000\u0175\u0176\u0007"+
		"\u0002\u0000\u0000\u0176\u0177\u0003<\u001e\u0000\u0177\u0178\u0006\u001d"+
		"\uffff\uffff\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u017b\u0003"+
		"<\u001e\u0000\u017a\u0175\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000"+
		"\u0000\u0000\u017b;\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0016\u0000"+
		"\u0000\u017d\u0180\u0005\u0006\u0000\u0000\u017e\u0181\u0005\u0015\u0000"+
		"\u0000\u017f\u0181\u0003\"\u0011\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0190\u0005\u0007\u0000\u0000\u0183\u0190\u0007\u0003\u0000\u0000"+
		"\u0184\u0190\u0005#\u0000\u0000\u0185\u0190\u0005\u000f\u0000\u0000\u0186"+
		"\u0187\u0005\u0003\u0000\u0000\u0187\u0188\u0003\"\u0011\u0000\u0188\u0189"+
		"\u0005\u0005\u0000\u0000\u0189\u0190\u0001\u0000\u0000\u0000\u018a\u0190"+
		"\u0005\u0016\u0000\u0000\u018b\u0190\u0003@ \u0000\u018c\u0190\u0003B"+
		"!\u0000\u018d\u0190\u0003\u0010\b\u0000\u018e\u0190\u0003\u001c\u000e"+
		"\u0000\u018f\u017c\u0001\u0000\u0000\u0000\u018f\u0183\u0001\u0000\u0000"+
		"\u0000\u018f\u0184\u0001\u0000\u0000\u0000\u018f\u0185\u0001\u0000\u0000"+
		"\u0000\u018f\u0186\u0001\u0000\u0000\u0000\u018f\u018a\u0001\u0000\u0000"+
		"\u0000\u018f\u018b\u0001\u0000\u0000\u0000\u018f\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u018e\u0001\u0000\u0000"+
		"\u0000\u0190=\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0017\u0000\u0000"+
		"\u0192\u0193\u0006\u001f\uffff\uffff\u0000\u0193\u0194\u0005\u0003\u0000"+
		"\u0000\u0194\u0195\u0003\"\u0011\u0000\u0195\u0196\u0005\u0005\u0000\u0000"+
		"\u0196\u0197\u0005\"\u0000\u0000\u0197?\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0005\u0006\u0000\u0000\u0199\u019a\u0005\t\u0000\u0000\u019a\u019b"+
		"\u0005\u0017\u0000\u0000\u019b\u019c\u0006 \uffff\uffff\u0000\u019c\u019d"+
		"\u0005\u0003\u0000\u0000\u019d\u019e\u0003\"\u0011\u0000\u019e\u019f\u0005"+
		"\u0005\u0000\u0000\u019f\u01a0\u0005\u0007\u0000\u0000\u01a0A\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0005\u0006\u0000\u0000\u01a2\u01a3\u0005\u0017"+
		"\u0000\u0000\u01a3\u01a4\u0006!\uffff\uffff\u0000\u01a4\u01a5\u0005\u0003"+
		"\u0000\u0000\u01a5\u01a6\u0005\t\u0000\u0000\u01a6\u01a7\u0005\u0005\u0000"+
		"\u0000\u01a7\u01a8\u0005\u0007\u0000\u0000\u01a8C\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0006\"\uffff\uffff\u0000\u01aa\u01ab\u0005\u0003\u0000\u0000"+
		"\u01ab\u01ac\u0003\"\u0011\u0000\u01ac\u01ad\u0005\u0005\u0000\u0000\u01ad"+
		"\u01ae\u0005\n\u0000\u0000\u01ae\u01b0\u0005\u0003\u0000\u0000\u01af\u01b1"+
		"\u0003\u0006\u0003\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0005\u0005\u0000\u0000\u01b5E\u0001\u0000\u0000\u0000\u01b6\u01b7\u0007"+
		"\u0001\u0000\u0000\u01b7\u01b8\u0007\u0004\u0000\u0000\u01b8\u01bb\u0006"+
		"#\uffff\uffff\u0000\u01b9\u01bb\u0007\u0005\u0000\u0000\u01ba\u01b6\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bbG\u0001\u0000"+
		"\u0000\u0000\u001fKZfm}\u0089\u0093\u00a3\u00a7\u00d3\u00db\u00ec\u00f6"+
		"\u0100\u010d\u0115\u011c\u0124\u012a\u012e\u013c\u0147\u0152\u015d\u0168"+
		"\u0173\u017a\u0180\u018f\u01b2\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}