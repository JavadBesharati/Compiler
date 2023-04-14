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
		RULE_function_call = 13, RULE_function_return = 14, RULE_print_expression = 15, 
		RULE_assign_expression = 16, RULE_or_expression = 17, RULE_and_expression = 18, 
		RULE_equality_expression = 19, RULE_relational_expression = 20, RULE_additive_expression = 21, 
		RULE_multiplicative_expression = 22, RULE_not_expression = 23, RULE_primary_expression = 24, 
		RULE_predicate_expression = 25, RULE_query_1 = 26, RULE_query_2 = 27, 
		RULE_implication_expression = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "main_call", "main_body", "line", "for_structure", "for_body", 
			"function_declaration", "array_declaration", "array_elements", "argument", 
			"int_declaration", "float_declaration", "boolean_declaration", "function_call", 
			"function_return", "print_expression", "assign_expression", "or_expression", 
			"and_expression", "equality_expression", "relational_expression", "additive_expression", 
			"multiplicative_expression", "not_expression", "primary_expression", 
			"predicate_expression", "query_1", "query_2", "implication_expression"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(58);
				function_declaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			main_call();
			setState(65);
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
			setState(67);
			match(MAIN);
			 System.out.println("MainBody"); 
			setState(69);
			match(T__0);
			setState(70);
			main_body();
			setState(71);
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
				{
				{
				setState(73);
				line();
				}
				}
				setState(78);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					{
					setState(79);
					function_call();
					}
					}
					break;
				case 2:
					{
					setState(80);
					array_declaration();
					}
					break;
				case 3:
					{
					setState(81);
					int_declaration();
					}
					break;
				case 4:
					{
					setState(82);
					float_declaration();
					}
					break;
				case 5:
					{
					setState(83);
					boolean_declaration();
					}
					break;
				case 6:
					{
					setState(84);
					assign_expression();
					}
					break;
				case 7:
					{
					setState(85);
					function_return();
					}
					break;
				case 8:
					{
					setState(86);
					print_expression();
					}
					break;
				}
				setState(89);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(91);
				for_structure();
				}
				break;
			case 3:
				{
				setState(92);
				predicate_expression();
				}
				break;
			case 4:
				{
				setState(93);
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
			setState(96);
			match(FOR);
			System.out.println("Loop: for");
			setState(98);
			match(T__2);
			setState(99);
			match(IDENTIFIER);
			setState(100);
			match(T__3);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(T__4);
			setState(103);
			match(T__0);
			setState(104);
			for_body();
			setState(105);
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
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
				{
				{
				setState(107);
				line();
				}
				}
				setState(112);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(FUNCTION);
				setState(114);
				((Function_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("FunctionDec: " + ((Function_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(116);
				match(T__2);
				{
				setState(117);
				argument();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					argument();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(125);
				match(T__4);
				setState(126);
				match(T__3);
				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				match(T__0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
					{
					{
					setState(129);
					line();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(FUNCTION);
				setState(138);
				((Function_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("FunctionDec: " + ((Function_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(140);
				match(T__2);
				setState(141);
				match(T__4);
				setState(142);
				match(T__3);
				setState(143);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				match(T__0);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0)) {
					{
					{
					setState(145);
					line();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(INT_TYPE);
				setState(155);
				match(T__5);
				setState(156);
				match(NATURAL_NUMBERS);
				setState(157);
				match(T__6);
				setState(158);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(INT_TYPE);
				setState(161);
				match(T__5);
				setState(162);
				match(NATURAL_NUMBERS);
				setState(163);
				match(T__6);
				setState(164);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(166);
				match(ASSIGNMENT_OP);
				setState(167);
				array_elements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(FLOAT_TYPE);
				setState(169);
				match(T__5);
				setState(170);
				match(NATURAL_NUMBERS);
				setState(171);
				match(T__6);
				setState(172);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(FLOAT_TYPE);
				setState(175);
				match(T__5);
				setState(176);
				match(NATURAL_NUMBERS);
				setState(177);
				match(T__6);
				setState(178);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(180);
				match(ASSIGNMENT_OP);
				setState(181);
				array_elements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(BOOLEAN_TYPE);
				setState(183);
				match(T__5);
				setState(184);
				match(NATURAL_NUMBERS);
				setState(185);
				match(T__6);
				setState(186);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(BOOLEAN_TYPE);
				setState(189);
				match(T__5);
				setState(190);
				match(NATURAL_NUMBERS);
				setState(191);
				match(T__6);
				setState(192);
				((Array_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Array_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(194);
				match(ASSIGNMENT_OP);
				setState(195);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(LogicPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LogicPLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NATURAL_NUMBERS() { return getTokens(LogicPLParser.NATURAL_NUMBERS); }
		public TerminalNode NATURAL_NUMBERS(int i) {
			return getToken(LogicPLParser.NATURAL_NUMBERS, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(LogicPLParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(LogicPLParser.FLOAT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(LogicPLParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(LogicPLParser.BOOLEAN, i);
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
			setState(198);
			match(T__5);
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34366062848L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
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
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(INT_TYPE);
				setState(214);
				((Int_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Int_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(INT_TYPE);
				setState(217);
				((Int_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Int_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(219);
				match(ASSIGNMENT_OP);
				setState(220);
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(FLOAT_TYPE);
				setState(224);
				((Float_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Float_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(FLOAT_TYPE);
				setState(227);
				((Float_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Float_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(229);
				match(ASSIGNMENT_OP);
				setState(230);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(BOOLEAN_TYPE);
				setState(234);
				((Boolean_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Boolean_declarationContext)_localctx).IDENTIFIER.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(BOOLEAN_TYPE);
				setState(237);
				((Boolean_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 System.out.println("VarDec: " + ((Boolean_declarationContext)_localctx).IDENTIFIER.getText()); 
				setState(239);
				match(ASSIGNMENT_OP);
				setState(240);
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
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(IDENTIFIER);
				setState(244);
				match(T__2);
				setState(245);
				assign_expression();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					assign_expression();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(IDENTIFIER);
				setState(256);
				match(T__2);
				setState(257);
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
		public TerminalNode NATURAL_NUMBERS() { return getToken(LogicPLParser.NATURAL_NUMBERS, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
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
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(RETURN);
				 System.out.println("Return"); 
				setState(262);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34361868544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
			setState(267);
			match(PRINT);
			 System.out.println("Built-in: print"); 
			setState(269);
			match(T__2);
			{
			{
			setState(270);
			assign_expression();
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271);
				match(COMMA);
				{
				setState(272);
				assign_expression();
				}
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(278);
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
		public List<Or_expressionContext> or_expression() {
			return getRuleContexts(Or_expressionContext.class);
		}
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT_OP() { return getTokens(LogicPLParser.ASSIGNMENT_OP); }
		public TerminalNode ASSIGNMENT_OP(int i) {
			return getToken(LogicPLParser.ASSIGNMENT_OP, i);
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
		enterRule(_localctx, 32, RULE_assign_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			or_expression();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGNMENT_OP) {
				{
				{
				setState(281);
				match(ASSIGNMENT_OP);
				setState(282);
				or_expression();
				}
				}
				setState(287);
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
		enterRule(_localctx, 34, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			and_expression();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR_OP) {
				{
				{
				setState(289);
				((Or_expressionContext)_localctx).LOGICAL_OR_OP = match(LOGICAL_OR_OP);
				setState(290);
				and_expression();
				System.out.println("Operator: " + ((Or_expressionContext)_localctx).LOGICAL_OR_OP.getText());
				}
				}
				setState(297);
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
		enterRule(_localctx, 36, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			equality_expression();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND_OP) {
				{
				{
				setState(299);
				((And_expressionContext)_localctx).LOGICAL_AND_OP = match(LOGICAL_AND_OP);
				setState(300);
				equality_expression();
				System.out.println("Operator: " + ((And_expressionContext)_localctx).LOGICAL_AND_OP.getText());
				}
				}
				setState(307);
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
		enterRule(_localctx, 38, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			relational_expression();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OP2) {
				{
				{
				setState(309);
				((Equality_expressionContext)_localctx).RELATIONAL_OP2 = match(RELATIONAL_OP2);
				setState(310);
				relational_expression();
				System.out.println("Operator: " + ((Equality_expressionContext)_localctx).RELATIONAL_OP2.getText());
				}
				}
				setState(317);
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
		enterRule(_localctx, 40, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			additive_expression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OP1) {
				{
				{
				setState(319);
				((Relational_expressionContext)_localctx).RELATIONAL_OP1 = match(RELATIONAL_OP1);
				setState(320);
				additive_expression();
				System.out.println("Operator: " + ((Relational_expressionContext)_localctx).RELATIONAL_OP1.getText());
				}
				}
				setState(327);
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
		public Token OP;
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(LogicPLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LogicPLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LogicPLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LogicPLParser.MINUS, i);
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
		enterRule(_localctx, 42, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			multiplicative_expression();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(329);
				((Additive_expressionContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Additive_expressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				multiplicative_expression();
				System.out.println("Operator: " + ((Additive_expressionContext)_localctx).OP.getText());
				}
				}
				setState(337);
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
		public Token MUL_DIV_MOD;
		public List<Not_expressionContext> not_expression() {
			return getRuleContexts(Not_expressionContext.class);
		}
		public Not_expressionContext not_expression(int i) {
			return getRuleContext(Not_expressionContext.class,i);
		}
		public List<TerminalNode> MUL_DIV_MOD() { return getTokens(LogicPLParser.MUL_DIV_MOD); }
		public TerminalNode MUL_DIV_MOD(int i) {
			return getToken(LogicPLParser.MUL_DIV_MOD, i);
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
		enterRule(_localctx, 44, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			not_expression();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL_DIV_MOD) {
				{
				{
				setState(339);
				((Multiplicative_expressionContext)_localctx).MUL_DIV_MOD = match(MUL_DIV_MOD);
				setState(340);
				not_expression();
				System.out.println("Operator: " + ((Multiplicative_expressionContext)_localctx).MUL_DIV_MOD.getText());
				}
				}
				setState(347);
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
		public Token OP;
		public Not_expressionContext not_expression() {
			return getRuleContext(Not_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode LOGICAL_NOT() { return getToken(LogicPLParser.LOGICAL_NOT, 0); }
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
		enterRule(_localctx, 46, RULE_not_expression);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				((Not_expressionContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
					((Not_expressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				not_expression();
				System.out.println("Operator: " + ((Not_expressionContext)_localctx).OP.getText());
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
				setState(352);
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
		enterRule(_localctx, 48, RULE_primary_expression);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
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
				setState(357);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(T__2);
				setState(360);
				or_expression();
				setState(361);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(363);
				match(IDENTIFIER);
				setState(364);
				match(T__5);
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(365);
					match(NATURAL_NUMBERS);
					}
					break;
				case 2:
					{
					setState(366);
					additive_expression();
					}
					break;
				}
				setState(369);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				query_1();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				query_2();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				array_elements();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
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
		enterRule(_localctx, 50, RULE_predicate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((Predicate_expressionContext)_localctx).PRIDICATE = match(PRIDICATE);
			System.out.println("Predicate: " + ((Predicate_expressionContext)_localctx).PRIDICATE.getText());
			setState(378);
			match(T__2);
			setState(379);
			match(IDENTIFIER);
			setState(380);
			match(T__4);
			setState(381);
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
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 52, RULE_query_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__5);
			setState(384);
			match(T__8);
			setState(385);
			((Query_1Context)_localctx).PRIDICATE = match(PRIDICATE);
			System.out.println("Predicate: " + ((Query_1Context)_localctx).PRIDICATE.getText());
			setState(387);
			match(T__2);
			setState(388);
			match(IDENTIFIER);
			setState(389);
			match(T__4);
			setState(390);
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
		enterRule(_localctx, 54, RULE_query_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__5);
			setState(393);
			((Query_2Context)_localctx).PRIDICATE = match(PRIDICATE);
			System.out.println("Predicate: " + ((Query_2Context)_localctx).PRIDICATE.getText());
			setState(395);
			match(T__2);
			setState(396);
			match(T__8);
			setState(397);
			match(T__4);
			setState(398);
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
		enterRule(_localctx, 56, RULE_implication_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("Implication"); 
			setState(401);
			match(T__2);
			setState(402);
			assign_expression();
			setState(403);
			match(T__4);
			setState(404);
			match(T__9);
			setState(405);
			match(T__2);
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(406);
				line();
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34610278728L) != 0) );
			setState(411);
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
		"\u0004\u0001&\u019e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"K\b\u0002\n\u0002\f\u0002N\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"X\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003_\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006y\b\u0006\n\u0006\f\u0006|\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0083\b\u0006"+
		"\n\u0006\f\u0006\u0086\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0093\b\u0006\n\u0006\f\u0006\u0096\t\u0006"+
		"\u0001\u0006\u0003\u0006\u0099\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c5\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00cb\b\b\n\b\f\b\u00ce\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00de\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e8\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00f2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00f9\b\r\n\r\f\r\u00fc\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u0103\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u010a\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0112\b\u000f\n\u000f\f\u000f"+
		"\u0115\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u011c\b\u0010\n\u0010\f\u0010\u011f\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0126\b\u0011\n"+
		"\u0011\f\u0011\u0129\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0130\b\u0012\n\u0012\f\u0012\u0133\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u013a\b\u0013\n\u0013\f\u0013\u013d\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0144\b\u0014\n\u0014\f\u0014"+
		"\u0147\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u014e\b\u0015\n\u0015\f\u0015\u0151\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0158\b\u0016\n"+
		"\u0016\f\u0016\u015b\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0162\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0170\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0177"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0004\u001c\u0198\b\u001c\u000b\u001c\f\u001c\u0199"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468\u0000\u0006\u0001\u0000\f\u000e\u0004\u0000\b\b\u000f\u000f"+
		"\u0015\u0016##\u0004\u0000\b\b\u000f\u000f\u0015\u0015##\u0001\u0000\u0019"+
		"\u001a\u0001\u0000\u0019\u001b\u0002\u0000\b\b\u0015\u0015\u01b1\u0000"+
		"=\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004L\u0001"+
		"\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000"+
		"\u0000\nn\u0001\u0000\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e"+
		"\u00c4\u0001\u0000\u0000\u0000\u0010\u00c6\u0001\u0000\u0000\u0000\u0012"+
		"\u00d1\u0001\u0000\u0000\u0000\u0014\u00dd\u0001\u0000\u0000\u0000\u0016"+
		"\u00e7\u0001\u0000\u0000\u0000\u0018\u00f1\u0001\u0000\u0000\u0000\u001a"+
		"\u0102\u0001\u0000\u0000\u0000\u001c\u0109\u0001\u0000\u0000\u0000\u001e"+
		"\u010b\u0001\u0000\u0000\u0000 \u0118\u0001\u0000\u0000\u0000\"\u0120"+
		"\u0001\u0000\u0000\u0000$\u012a\u0001\u0000\u0000\u0000&\u0134\u0001\u0000"+
		"\u0000\u0000(\u013e\u0001\u0000\u0000\u0000*\u0148\u0001\u0000\u0000\u0000"+
		",\u0152\u0001\u0000\u0000\u0000.\u0161\u0001\u0000\u0000\u00000\u0176"+
		"\u0001\u0000\u0000\u00002\u0178\u0001\u0000\u0000\u00004\u017f\u0001\u0000"+
		"\u0000\u00006\u0188\u0001\u0000\u0000\u00008\u0190\u0001\u0000\u0000\u0000"+
		":<\u0003\f\u0006\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@A\u0003\u0002\u0001\u0000AB\u0005\u0000"+
		"\u0000\u0001B\u0001\u0001\u0000\u0000\u0000CD\u0005\u000b\u0000\u0000"+
		"DE\u0006\u0001\uffff\uffff\u0000EF\u0005\u0001\u0000\u0000FG\u0003\u0004"+
		"\u0002\u0000GH\u0005\u0002\u0000\u0000H\u0003\u0001\u0000\u0000\u0000"+
		"IK\u0003\u0006\u0003\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0005\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OX\u0003\u001a\r\u0000PX\u0003"+
		"\u000e\u0007\u0000QX\u0003\u0014\n\u0000RX\u0003\u0016\u000b\u0000SX\u0003"+
		"\u0018\f\u0000TX\u0003 \u0010\u0000UX\u0003\u001c\u000e\u0000VX\u0003"+
		"\u001e\u000f\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000"+
		"WQ\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000"+
		"\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\"\u0000\u0000Z_\u0001\u0000"+
		"\u0000\u0000[_\u0003\b\u0004\u0000\\_\u00032\u0019\u0000]_\u00038\u001c"+
		"\u0000^W\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0007\u0001\u0000\u0000\u0000"+
		"`a\u0005\u0012\u0000\u0000ab\u0006\u0004\uffff\uffff\u0000bc\u0005\u0003"+
		"\u0000\u0000cd\u0005\u0016\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0005"+
		"\u0016\u0000\u0000fg\u0005\u0005\u0000\u0000gh\u0005\u0001\u0000\u0000"+
		"hi\u0003\n\u0005\u0000ij\u0005\u0002\u0000\u0000j\t\u0001\u0000\u0000"+
		"\u0000km\u0003\u0006\u0003\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u000b"+
		"\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\u0010\u0000"+
		"\u0000rs\u0005\u0016\u0000\u0000st\u0006\u0006\uffff\uffff\u0000tu\u0005"+
		"\u0003\u0000\u0000uz\u0003\u0012\t\u0000vw\u0005!\u0000\u0000wy\u0003"+
		"\u0012\t\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}~\u0005\u0005\u0000\u0000~\u007f\u0005\u0004"+
		"\u0000\u0000\u007f\u0080\u0007\u0000\u0000\u0000\u0080\u0084\u0005\u0001"+
		"\u0000\u0000\u0081\u0083\u0003\u0006\u0003\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0002"+
		"\u0000\u0000\u0088\u0099\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0010"+
		"\u0000\u0000\u008a\u008b\u0005\u0016\u0000\u0000\u008b\u008c\u0006\u0006"+
		"\uffff\uffff\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0005"+
		"\u0005\u0000\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0007"+
		"\u0000\u0000\u0000\u0090\u0094\u0005\u0001\u0000\u0000\u0091\u0093\u0003"+
		"\u0006\u0003\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0005\u0002\u0000\u0000\u0098q\u0001\u0000"+
		"\u0000\u0000\u0098\u0089\u0001\u0000\u0000\u0000\u0099\r\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\f\u0000\u0000\u009b\u009c\u0005\u0006\u0000\u0000"+
		"\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u009e\u0005\u0007\u0000\u0000"+
		"\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00c5\u0006\u0007\uffff\uffff"+
		"\u0000\u00a0\u00a1\u0005\f\u0000\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0015\u0000\u0000\u00a3\u00a4\u0005\u0007\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0016\u0000\u0000\u00a5\u00a6\u0006\u0007\uffff\uffff"+
		"\u0000\u00a6\u00a7\u0005 \u0000\u0000\u00a7\u00c5\u0003\u0010\b\u0000"+
		"\u00a8\u00a9\u0005\r\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0015\u0000\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0016\u0000\u0000\u00ad\u00c5\u0006\u0007\uffff\uffff\u0000"+
		"\u00ae\u00af\u0005\r\u0000\u0000\u00af\u00b0\u0005\u0006\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0015\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0016\u0000\u0000\u00b3\u00b4\u0006\u0007\uffff\uffff\u0000"+
		"\u00b4\u00b5\u0005 \u0000\u0000\u00b5\u00c5\u0003\u0010\b\u0000\u00b6"+
		"\u00b7\u0005\u000e\u0000\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0015\u0000\u0000\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0016\u0000\u0000\u00bb\u00c5\u0006\u0007\uffff\uffff\u0000"+
		"\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd\u00be\u0005\u0006\u0000\u0000"+
		"\u00be\u00bf\u0005\u0015\u0000\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0016\u0000\u0000\u00c1\u00c2\u0006\u0007\uffff\uffff"+
		"\u0000\u00c2\u00c3\u0005 \u0000\u0000\u00c3\u00c5\u0003\u0010\b\u0000"+
		"\u00c4\u009a\u0001\u0000\u0000\u0000\u00c4\u00a0\u0001\u0000\u0000\u0000"+
		"\u00c4\u00a8\u0001\u0000\u0000\u0000\u00c4\u00ae\u0001\u0000\u0000\u0000"+
		"\u00c4\u00b6\u0001\u0000\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c5\u000f\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0006\u0000\u0000"+
		"\u00c7\u00cc\u0007\u0001\u0000\u0000\u00c8\u00c9\u0005!\u0000\u0000\u00c9"+
		"\u00cb\u0007\u0001\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0007\u0000\u0000\u00d0"+
		"\u0011\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0016\u0000\u0000\u00d3\u00d4\u0006\t\uffff\uffff\u0000\u00d4"+
		"\u0013\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\f\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0016\u0000\u0000\u00d7\u00de\u0006\n\uffff\uffff\u0000\u00d8\u00d9"+
		"\u0005\f\u0000\u0000\u00d9\u00da\u0005\u0016\u0000\u0000\u00da\u00db\u0006"+
		"\n\uffff\uffff\u0000\u00db\u00dc\u0005 \u0000\u0000\u00dc\u00de\u0003"+
		" \u0010\u0000\u00dd\u00d5\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000"+
		"\u0000\u0000\u00de\u0015\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\r\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0016\u0000\u0000\u00e1\u00e8\u0006\u000b\uffff"+
		"\uffff\u0000\u00e2\u00e3\u0005\r\u0000\u0000\u00e3\u00e4\u0005\u0016\u0000"+
		"\u0000\u00e4\u00e5\u0006\u000b\uffff\uffff\u0000\u00e5\u00e6\u0005 \u0000"+
		"\u0000\u00e6\u00e8\u0003 \u0010\u0000\u00e7\u00df\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e8\u0017\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005\u000e\u0000\u0000\u00ea\u00eb\u0005\u0016\u0000\u0000"+
		"\u00eb\u00f2\u0006\f\uffff\uffff\u0000\u00ec\u00ed\u0005\u000e\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0016\u0000\u0000\u00ee\u00ef\u0006\f\uffff\uffff\u0000"+
		"\u00ef\u00f0\u0005 \u0000\u0000\u00f0\u00f2\u0003 \u0010\u0000\u00f1\u00e9"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f2\u0019"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0016\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0003\u0000\u0000\u00f5\u00fa\u0003 \u0010\u0000\u00f6\u00f7\u0005"+
		"!\u0000\u0000\u00f7\u00f9\u0003 \u0010\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0005\u0000"+
		"\u0000\u00fe\u0103\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0016\u0000"+
		"\u0000\u0100\u0101\u0005\u0003\u0000\u0000\u0101\u0103\u0005\u0005\u0000"+
		"\u0000\u0102\u00f3\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000"+
		"\u0000\u0103\u001b\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0013\u0000"+
		"\u0000\u0105\u0106\u0006\u000e\uffff\uffff\u0000\u0106\u010a\u0007\u0002"+
		"\u0000\u0000\u0107\u0108\u0005\u0013\u0000\u0000\u0108\u010a\u0006\u000e"+
		"\uffff\uffff\u0000\u0109\u0104\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u001d\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"\u0011\u0000\u0000\u010c\u010d\u0006\u000f\uffff\uffff\u0000\u010d\u010e"+
		"\u0005\u0003\u0000\u0000\u010e\u0113\u0003 \u0010\u0000\u010f\u0110\u0005"+
		"!\u0000\u0000\u0110\u0112\u0003 \u0010\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0005\u0000"+
		"\u0000\u0117\u001f\u0001\u0000\u0000\u0000\u0118\u011d\u0003\"\u0011\u0000"+
		"\u0119\u011a\u0005 \u0000\u0000\u011a\u011c\u0003\"\u0011\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"!\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0127"+
		"\u0003$\u0012\u0000\u0121\u0122\u0005\u001f\u0000\u0000\u0122\u0123\u0003"+
		"$\u0012\u0000\u0123\u0124\u0006\u0011\uffff\uffff\u0000\u0124\u0126\u0001"+
		"\u0000\u0000\u0000\u0125\u0121\u0001\u0000\u0000\u0000\u0126\u0129\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128#\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u0131\u0003&\u0013\u0000\u012b\u012c\u0005\u001e\u0000"+
		"\u0000\u012c\u012d\u0003&\u0013\u0000\u012d\u012e\u0006\u0012\uffff\uffff"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000"+
		"\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132%\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u013b\u0003(\u0014\u0000\u0135"+
		"\u0136\u0005\u001d\u0000\u0000\u0136\u0137\u0003(\u0014\u0000\u0137\u0138"+
		"\u0006\u0013\uffff\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139"+
		"\u0135\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\'\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0145"+
		"\u0003*\u0015\u0000\u013f\u0140\u0005\u001c\u0000\u0000\u0140\u0141\u0003"+
		"*\u0015\u0000\u0141\u0142\u0006\u0014\uffff\uffff\u0000\u0142\u0144\u0001"+
		"\u0000\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146)\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u014f\u0003,\u0016\u0000\u0149\u014a\u0007\u0003\u0000"+
		"\u0000\u014a\u014b\u0003,\u0016\u0000\u014b\u014c\u0006\u0015\uffff\uffff"+
		"\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0149\u0001\u0000\u0000"+
		"\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150+\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0159\u0003.\u0017\u0000\u0153"+
		"\u0154\u0005\u0018\u0000\u0000\u0154\u0155\u0003.\u0017\u0000\u0155\u0156"+
		"\u0006\u0016\uffff\uffff\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157"+
		"\u0153\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"-\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0007\u0004\u0000\u0000\u015d\u015e\u0003.\u0017\u0000\u015e\u015f\u0006"+
		"\u0017\uffff\uffff\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u00030\u0018\u0000\u0161\u015c\u0001\u0000\u0000\u0000\u0161\u0160\u0001"+
		"\u0000\u0000\u0000\u0162/\u0001\u0000\u0000\u0000\u0163\u0177\u0005\u0016"+
		"\u0000\u0000\u0164\u0177\u0007\u0005\u0000\u0000\u0165\u0177\u0005#\u0000"+
		"\u0000\u0166\u0177\u0005\u000f\u0000\u0000\u0167\u0168\u0005\u0003\u0000"+
		"\u0000\u0168\u0169\u0003\"\u0011\u0000\u0169\u016a\u0005\u0005\u0000\u0000"+
		"\u016a\u0177\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0016\u0000\u0000"+
		"\u016c\u016f\u0005\u0006\u0000\u0000\u016d\u0170\u0005\u0015\u0000\u0000"+
		"\u016e\u0170\u0003*\u0015\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"\u0177\u0005\u0007\u0000\u0000\u0172\u0177\u00034\u001a\u0000\u0173\u0177"+
		"\u00036\u001b\u0000\u0174\u0177\u0003\u0010\b\u0000\u0175\u0177\u0003"+
		"\u001a\r\u0000\u0176\u0163\u0001\u0000\u0000\u0000\u0176\u0164\u0001\u0000"+
		"\u0000\u0000\u0176\u0165\u0001\u0000\u0000\u0000\u0176\u0166\u0001\u0000"+
		"\u0000\u0000\u0176\u0167\u0001\u0000\u0000\u0000\u0176\u016b\u0001\u0000"+
		"\u0000\u0000\u0176\u0172\u0001\u0000\u0000\u0000\u0176\u0173\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000"+
		"\u0000\u0000\u01771\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0017\u0000"+
		"\u0000\u0179\u017a\u0006\u0019\uffff\uffff\u0000\u017a\u017b\u0005\u0003"+
		"\u0000\u0000\u017b\u017c\u0005\u0016\u0000\u0000\u017c\u017d\u0005\u0005"+
		"\u0000\u0000\u017d\u017e\u0005\"\u0000\u0000\u017e3\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005\u0006\u0000\u0000\u0180\u0181\u0005\t\u0000\u0000"+
		"\u0181\u0182\u0005\u0017\u0000\u0000\u0182\u0183\u0006\u001a\uffff\uffff"+
		"\u0000\u0183\u0184\u0005\u0003\u0000\u0000\u0184\u0185\u0005\u0016\u0000"+
		"\u0000\u0185\u0186\u0005\u0005\u0000\u0000\u0186\u0187\u0005\u0007\u0000"+
		"\u0000\u01875\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0006\u0000\u0000"+
		"\u0189\u018a\u0005\u0017\u0000\u0000\u018a\u018b\u0006\u001b\uffff\uffff"+
		"\u0000\u018b\u018c\u0005\u0003\u0000\u0000\u018c\u018d\u0005\t\u0000\u0000"+
		"\u018d\u018e\u0005\u0005\u0000\u0000\u018e\u018f\u0005\u0007\u0000\u0000"+
		"\u018f7\u0001\u0000\u0000\u0000\u0190\u0191\u0006\u001c\uffff\uffff\u0000"+
		"\u0191\u0192\u0005\u0003\u0000\u0000\u0192\u0193\u0003 \u0010\u0000\u0193"+
		"\u0194\u0005\u0005\u0000\u0000\u0194\u0195\u0005\n\u0000\u0000\u0195\u0197"+
		"\u0005\u0003\u0000\u0000\u0196\u0198\u0003\u0006\u0003\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0005\u0000\u0000\u019c9\u0001"+
		"\u0000\u0000\u0000\u001d=LW^nz\u0084\u0094\u0098\u00c4\u00cc\u00dd\u00e7"+
		"\u00f1\u00fa\u0102\u0109\u0113\u011d\u0127\u0131\u013b\u0145\u014f\u0159"+
		"\u0161\u016f\u0176\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}