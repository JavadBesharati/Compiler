package main.grammar.antlr;// Generated from /home/javad/My Folders/University/6th Term/Complier/CAs/Compiler-Projects-UT-Spring-2023/Phase2/src/main/grammar/LogicPL.g4 by ANTLR 4.9.2

import ast.node.*;
import ast.node.expression.*;
import ast.node.statement.*;
import ast.node.declaration.*;
import ast.node.expression.values.*;
import ast.node.expression.operators.*;
import ast.type.primitiveType.*;
import ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicPLParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_functionDec = 1, RULE_functionVarDec = 2, RULE_mainBlock = 3, 
		RULE_statement = 4, RULE_assignSmt = 5, RULE_variable = 6, RULE_localVarDeclaration = 7, 
		RULE_varDeclaration = 8, RULE_arrayDeclaration = 9, RULE_arrayInitialValue = 10, 
		RULE_arrayList = 11, RULE_printSmt = 12, RULE_printExpr = 13, RULE_query = 14, 
		RULE_queryType1 = 15, RULE_queryType2 = 16, RULE_returnSmt = 17, RULE_forLoop = 18, 
		RULE_predicate = 19, RULE_implication = 20, RULE_expression = 21, RULE_expression2 = 22, 
		RULE_andExpr = 23, RULE_andExpr2 = 24, RULE_eqExpr = 25, RULE_eqExpr2 = 26, 
		RULE_compExpr = 27, RULE_compExpr2 = 28, RULE_additive = 29, RULE_additive2 = 30, 
		RULE_multicative = 31, RULE_multicative2 = 32, RULE_unary = 33, RULE_other = 34, 
		RULE_functionCall = 35, RULE_value = 36, RULE_numericValue = 37, RULE_identifier = 38, 
		RULE_predicateIdentifier = 39, RULE_type = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDec", "functionVarDec", "mainBlock", "statement", 
			"assignSmt", "variable", "localVarDeclaration", "varDeclaration", "arrayDeclaration", 
			"arrayInitialValue", "arrayList", "printSmt", "printExpr", "query", "queryType1", 
			"queryType2", "returnSmt", "forLoop", "predicate", "implication", "expression", 
			"expression2", "andExpr", "andExpr2", "eqExpr", "eqExpr2", "compExpr", 
			"compExpr2", "additive", "additive2", "multicative", "multicative2", 
			"unary", "other", "functionCall", "value", "numericValue", "identifier", 
			"predicateIdentifier", "type"
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

	public static class ProgramContext extends ParserRuleContext {
		public Program p;
		public FunctionDecContext f;
		public MainBlockContext main;
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public List<FunctionDecContext> functionDec() {
			return getRuleContexts(FunctionDecContext.class);
		}
		public FunctionDecContext functionDec(int i) {
			return getRuleContext(FunctionDecContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).p =  new Program(); _localctx.p.setLine(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(83);
				((ProgramContext)_localctx).f = functionDec();
				_localctx.p.addFunc(((ProgramContext)_localctx).f.functionDeclaration);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			((ProgramContext)_localctx).main = mainBlock();
			_localctx.p.setMain(((ProgramContext)_localctx).main.main) ;
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

	public static class FunctionDecContext extends ParserRuleContext {
		public FuncDeclaration functionDeclaration;
		public IdentifierContext name;
		public FunctionVarDecContext arg1;
		public FunctionVarDecContext arg;
		public TypeContext returnType;
		public StatementContext stmt;
		public TerminalNode FUNCTION() { return getToken(LogicPLParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionVarDecContext> functionVarDec() {
			return getRuleContexts(FunctionVarDecContext.class);
		}
		public FunctionVarDecContext functionVarDec(int i) {
			return getRuleContext(FunctionVarDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDec; }
	}

	public final FunctionDecContext functionDec() throws RecognitionException {
		FunctionDecContext _localctx = new FunctionDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<ArgDeclaration> args = new ArrayList<>();
			    ArrayList<Statement> statements = new ArrayList<>();
			setState(95);
			match(FUNCTION);
			setState(96);
			((FunctionDecContext)_localctx).name = identifier();
			setState(97);
			match(LPAR);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(98);
				((FunctionDecContext)_localctx).arg1 = functionVarDec();
				args.add(((FunctionDecContext)_localctx).arg1.argDeclaration);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					((FunctionDecContext)_localctx).arg = functionVarDec();
					args.add(((FunctionDecContext)_localctx).arg.argDeclaration);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(111);
			match(RPAR);
			setState(112);
			match(COLON);
			setState(113);
			((FunctionDecContext)_localctx).returnType = type();
			setState(114);
			match(LBRACE);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				((FunctionDecContext)_localctx).stmt = statement();
				statements.add(((FunctionDecContext)_localctx).stmt.statementRet);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << RETURN) | (1L << FOR) | (1L << LPAR) | (1L << IDENTIFIER) | (1L << PREDICATE_IDENTIFIER))) != 0) );
			}
			setState(122);
			match(RBRACE);
			((FunctionDecContext)_localctx).functionDeclaration =  new FuncDeclaration(((FunctionDecContext)_localctx).name.identifierRet, ((FunctionDecContext)_localctx).returnType.typeRet, args, statements);
			    _localctx.functionDeclaration.setLine(((FunctionDecContext)_localctx).name.identifierRet.getLine());
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

	public static class FunctionVarDecContext extends ParserRuleContext {
		public ArgDeclaration argDeclaration;
		public TypeContext t;
		public IdentifierContext arg_iden;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVarDec; }
	}

	public final FunctionVarDecContext functionVarDec() throws RecognitionException {
		FunctionVarDecContext _localctx = new FunctionVarDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionVarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((FunctionVarDecContext)_localctx).t = type();
			setState(126);
			((FunctionVarDecContext)_localctx).arg_iden = identifier();
			((FunctionVarDecContext)_localctx).argDeclaration =  new ArgDeclaration(((FunctionVarDecContext)_localctx).arg_iden.identifierRet, ((FunctionVarDecContext)_localctx).t.typeRet);
			    _localctx.argDeclaration.setLine(((FunctionVarDecContext)_localctx).arg_iden.identifierRet.getLine());
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

	public static class MainBlockContext extends ParserRuleContext {
		public MainDeclaration main;
		public Token m;
		public StatementContext s;
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public TerminalNode MAIN() { return getToken(LogicPLParser.MAIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> mainStmts = new ArrayList<>();
			setState(130);
			((MainBlockContext)_localctx).m = match(MAIN);
			setState(131);
			match(LBRACE);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				((MainBlockContext)_localctx).s = statement();
				mainStmts.add(((MainBlockContext)_localctx).s.statementRet);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << RETURN) | (1L << FOR) | (1L << LPAR) | (1L << IDENTIFIER) | (1L << PREDICATE_IDENTIFIER))) != 0) );
			setState(139);
			match(RBRACE);
			((MainBlockContext)_localctx).main =  new MainDeclaration(mainStmts); _localctx.main.setLine(((MainBlockContext)_localctx).m.getLine());
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

	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public AssignSmtContext s1;
		public PredicateContext s2;
		public ImplicationContext s3;
		public ReturnSmtContext s4;
		public PrintSmtContext s5;
		public ForLoopContext s6;
		public LocalVarDeclarationContext s7;
		public AssignSmtContext assignSmt() {
			return getRuleContext(AssignSmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public ReturnSmtContext returnSmt() {
			return getRuleContext(ReturnSmtContext.class,0);
		}
		public PrintSmtContext printSmt() {
			return getRuleContext(PrintSmtContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LocalVarDeclarationContext localVarDeclaration() {
			return getRuleContext(LocalVarDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((StatementContext)_localctx).s1 = assignSmt();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s1.assignStmtRet;
				}
				break;
			case PREDICATE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				((StatementContext)_localctx).s2 = predicate();
				setState(146);
				match(SEMICOLON);
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s2.predicateRet;
				}
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				((StatementContext)_localctx).s3 = implication();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s3.implicationRet;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				((StatementContext)_localctx).s4 = returnSmt();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s4.returnRet;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				((StatementContext)_localctx).s5 = printSmt();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s5.PrintStmtRet;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				((StatementContext)_localctx).s6 = forLoop();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s6.forRet;
				}
				break;
			case BOOLEAN:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				((StatementContext)_localctx).s7 = localVarDeclaration();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s7.localvarDecRet;
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

	public static class AssignSmtContext extends ParserRuleContext {
		public AssignStmt assignStmtRet;
		public VariableContext lv;
		public Token line;
		public ExpressionContext rv;
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSmt; }
	}

	public final AssignSmtContext assignSmt() throws RecognitionException {
		AssignSmtContext _localctx = new AssignSmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((AssignSmtContext)_localctx).lv = variable();
			setState(167);
			((AssignSmtContext)_localctx).line = match(ASSIGN);
			setState(168);
			((AssignSmtContext)_localctx).rv = expression();
			setState(169);
			match(SEMICOLON);
			((AssignSmtContext)_localctx).assignStmtRet =  new AssignStmt(((AssignSmtContext)_localctx).lv.v,  ((AssignSmtContext)_localctx).rv.e); _localctx.assignStmtRet.setLine(((AssignSmtContext)_localctx).line.getLine());
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

	public static class VariableContext extends ParserRuleContext {
		public Variable v;
		public IdentifierContext i;
		public IdentifierContext name;
		public ExpressionContext exp;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((VariableContext)_localctx).i = identifier();
				((VariableContext)_localctx).v =  ((VariableContext)_localctx).i.identifierRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((VariableContext)_localctx).name = identifier();
				setState(176);
				match(LBRACKET);
				setState(177);
				((VariableContext)_localctx).exp = expression();
				setState(178);
				match(RBRACKET);
				((VariableContext)_localctx).v =  new ArrayAccess(((VariableContext)_localctx).name.identifierRet.getName(), ((VariableContext)_localctx).exp.e); _localctx.v.setLine(((VariableContext)_localctx).name.identifierRet.getLine()); 
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

	public static class LocalVarDeclarationContext extends ParserRuleContext {
		public Statement localvarDecRet;
		public VarDeclarationContext s1;
		public ArrayDeclarationContext s2;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public LocalVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclaration; }
	}

	public final LocalVarDeclarationContext localVarDeclaration() throws RecognitionException {
		LocalVarDeclarationContext _localctx = new LocalVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVarDeclaration);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((LocalVarDeclarationContext)_localctx).s1 = varDeclaration();
				((LocalVarDeclarationContext)_localctx).localvarDecRet =  ((LocalVarDeclarationContext)_localctx).s1.varDecRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((LocalVarDeclarationContext)_localctx).s2 = arrayDeclaration();
				((LocalVarDeclarationContext)_localctx).localvarDecRet =  ((LocalVarDeclarationContext)_localctx).s2.arrayDecRet;
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDecStmt varDecRet;
		public TypeContext t;
		public IdentifierContext var_iden;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((VarDeclarationContext)_localctx).t = type();
			setState(192);
			((VarDeclarationContext)_localctx).var_iden = identifier();
			((VarDeclarationContext)_localctx).varDecRet =  new VarDecStmt(((VarDeclarationContext)_localctx).var_iden.identifierRet, ((VarDeclarationContext)_localctx).t.typeRet);
			    _localctx.varDecRet.setLine(((VarDeclarationContext)_localctx).var_iden.identifierRet.getLine());
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(194);
				match(ASSIGN);
				setState(195);
				((VarDeclarationContext)_localctx).e = expression();
				_localctx.varDecRet.setInitialExpression(((VarDeclarationContext)_localctx).e.e);
				}
			}

			setState(200);
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDecStmt arrayDecRet;
		public TypeContext t;
		public Token INT_NUMBER;
		public IdentifierContext var_iden;
		public ArrayInitialValueContext initial;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode INT_NUMBER() { return getToken(LogicPLParser.INT_NUMBER, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayInitialValueContext arrayInitialValue() {
			return getRuleContext(ArrayInitialValueContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((ArrayDeclarationContext)_localctx).t = type();
			setState(203);
			match(LBRACKET);
			setState(204);
			((ArrayDeclarationContext)_localctx).INT_NUMBER = match(INT_NUMBER);
			setState(205);
			match(RBRACKET);
			setState(206);
			((ArrayDeclarationContext)_localctx).var_iden = identifier();
			((ArrayDeclarationContext)_localctx).arrayDecRet =  new ArrayDecStmt(((ArrayDeclarationContext)_localctx).var_iden.identifierRet, ((ArrayDeclarationContext)_localctx).t.typeRet, (((ArrayDeclarationContext)_localctx).INT_NUMBER!=null?Integer.valueOf(((ArrayDeclarationContext)_localctx).INT_NUMBER.getText()):0));
			    _localctx.arrayDecRet.setLine(((ArrayDeclarationContext)_localctx).var_iden.identifierRet.getLine());
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(208);
				((ArrayDeclarationContext)_localctx).initial = arrayInitialValue();
				_localctx.arrayDecRet.setInitialValues(((ArrayDeclarationContext)_localctx).initial.initialValues);
				}
			}

			setState(213);
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

	public static class ArrayInitialValueContext extends ParserRuleContext {
		public ArrayList<Expression> initialValues;
		public ArrayListContext arrList;
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ArrayListContext arrayList() {
			return getRuleContext(ArrayListContext.class,0);
		}
		public ArrayInitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialValue; }
	}

	public final ArrayInitialValueContext arrayInitialValue() throws RecognitionException {
		ArrayInitialValueContext _localctx = new ArrayInitialValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayInitialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ASSIGN);
			setState(216);
			((ArrayInitialValueContext)_localctx).arrList = arrayList();
			((ArrayInitialValueContext)_localctx).initialValues =  ((ArrayInitialValueContext)_localctx).arrList.values;
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

	public static class ArrayListContext extends ParserRuleContext {
		public ArrayList<Expression> values;
		public ValueContext v;
		public IdentifierContext id;
		public ValueContext v2;
		public IdentifierContext id2;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayListContext)_localctx).values =  new ArrayList<Expression>();
			setState(220);
			match(LBRACKET);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case MINUS:
			case INT_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(221);
				((ArrayListContext)_localctx).v = value();
				_localctx.values.add(((ArrayListContext)_localctx).v.valueRet);
				}
				break;
			case IDENTIFIER:
				{
				setState(224);
				((ArrayListContext)_localctx).id = identifier();
				_localctx.values.add(((ArrayListContext)_localctx).id.identifierRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case MINUS:
				case INT_NUMBER:
				case FLOAT_NUMBER:
					{
					setState(230);
					((ArrayListContext)_localctx).v2 = value();
					_localctx.values.add(((ArrayListContext)_localctx).v2.valueRet);
					}
					break;
				case IDENTIFIER:
					{
					setState(233);
					((ArrayListContext)_localctx).id2 = identifier();
					_localctx.values.add(((ArrayListContext)_localctx).id.identifierRet);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(RBRACKET);
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

	public static class PrintSmtContext extends ParserRuleContext {
		public PrintStmt PrintStmtRet;
		public Token p;
		public PrintExprContext arg;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(LogicPLParser.PRINT, 0); }
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public PrintSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSmt; }
	}

	public final PrintSmtContext printSmt() throws RecognitionException {
		PrintSmtContext _localctx = new PrintSmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((PrintSmtContext)_localctx).p = match(PRINT);
			setState(246);
			match(LPAR);
			setState(247);
			((PrintSmtContext)_localctx).arg = printExpr();
			setState(248);
			match(RPAR);
			setState(249);
			match(SEMICOLON);
			((PrintSmtContext)_localctx).PrintStmtRet =  new PrintStmt(((PrintSmtContext)_localctx).arg.printExprRet);
			    _localctx.PrintStmtRet.setLine(((PrintSmtContext)_localctx).p.getLine());
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

	public static class PrintExprContext extends ParserRuleContext {
		public Expression printExprRet;
		public VariableContext var;
		public QueryContext q;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printExpr);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				((PrintExprContext)_localctx).var = variable();
				((PrintExprContext)_localctx).printExprRet =  ((PrintExprContext)_localctx).var.v;
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((PrintExprContext)_localctx).q = query();
				((PrintExprContext)_localctx).printExprRet =  ((PrintExprContext)_localctx).q.queryRet;
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

	public static class QueryContext extends ParserRuleContext {
		public QueryExpression queryRet;
		public QueryType1Context q1;
		public QueryType2Context q2;
		public QueryType1Context queryType1() {
			return getRuleContext(QueryType1Context.class,0);
		}
		public QueryType2Context queryType2() {
			return getRuleContext(QueryType2Context.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_query);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((QueryContext)_localctx).q1 = queryType1();
				((QueryContext)_localctx).queryRet =  ((QueryContext)_localctx).q1.query1Ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((QueryContext)_localctx).q2 = queryType2();
				((QueryContext)_localctx).queryRet =  ((QueryContext)_localctx).q2.query2Ret;
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

	public static class QueryType1Context extends ParserRuleContext {
		public QueryExpression query1Ret;
		public Token line;
		public PredicateIdentifierContext id;
		public VariableContext var;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public TerminalNode QUARYMARK() { return getToken(LogicPLParser.QUARYMARK, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QueryType1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryType1; }
	}

	public final QueryType1Context queryType1() throws RecognitionException {
		QueryType1Context _localctx = new QueryType1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_queryType1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LBRACKET);
			setState(269);
			((QueryType1Context)_localctx).line = match(QUARYMARK);
			setState(270);
			((QueryType1Context)_localctx).id = predicateIdentifier();
			setState(271);
			match(LPAR);
			setState(272);
			((QueryType1Context)_localctx).var = variable();
			setState(273);
			match(RPAR);
			setState(274);
			match(RBRACKET);
			((QueryType1Context)_localctx).query1Ret =  new QueryExpression(((QueryType1Context)_localctx).id.predicateIdentifierRet);
			    _localctx.query1Ret.setLine(((QueryType1Context)_localctx).line.getLine()); _localctx.query1Ret.setVar(((QueryType1Context)_localctx).var.v);
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

	public static class QueryType2Context extends ParserRuleContext {
		public QueryExpression query2Ret;
		public PredicateIdentifierContext id;
		public Token line;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public TerminalNode QUARYMARK() { return getToken(LogicPLParser.QUARYMARK, 0); }
		public QueryType2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryType2; }
	}

	public final QueryType2Context queryType2() throws RecognitionException {
		QueryType2Context _localctx = new QueryType2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_queryType2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBRACKET);
			setState(278);
			((QueryType2Context)_localctx).id = predicateIdentifier();
			setState(279);
			match(LPAR);
			setState(280);
			((QueryType2Context)_localctx).line = match(QUARYMARK);
			setState(281);
			match(RPAR);
			setState(282);
			match(RBRACKET);
			((QueryType2Context)_localctx).query2Ret =  new QueryExpression(((QueryType2Context)_localctx).id.predicateIdentifierRet);
			    _localctx.query2Ret.setLine(((QueryType2Context)_localctx).line.getLine()); 
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

	public static class ReturnSmtContext extends ParserRuleContext {
		public ReturnStmt returnRet;
		public Token RETURN;
		public ValueContext v;
		public IdentifierContext iden;
		public TerminalNode RETURN() { return getToken(LogicPLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSmt; }
	}

	public final ReturnSmtContext returnSmt() throws RecognitionException {
		ReturnSmtContext _localctx = new ReturnSmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((ReturnSmtContext)_localctx).RETURN = match(RETURN);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case MINUS:
			case INT_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(286);
				((ReturnSmtContext)_localctx).v = value();
				((ReturnSmtContext)_localctx).returnRet =  new ReturnStmt(((ReturnSmtContext)_localctx).v.valueRet);
				}
				break;
			case IDENTIFIER:
				{
				setState(289);
				((ReturnSmtContext)_localctx).iden = identifier();
				((ReturnSmtContext)_localctx).returnRet =  new ReturnStmt(((ReturnSmtContext)_localctx).iden.identifierRet);
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(294);
			match(SEMICOLON);
			if(_localctx.returnRet == null){((ReturnSmtContext)_localctx).returnRet =  new ReturnStmt(null);}
			_localctx.returnRet.setLine(((ReturnSmtContext)_localctx).RETURN.getLine());
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

	public static class ForLoopContext extends ParserRuleContext {
		public ForloopStmt forRet;
		public Token line;
		public IdentifierContext iterator;
		public IdentifierContext arrayName;
		public StatementContext stmt;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public TerminalNode FOR() { return getToken(LogicPLParser.FOR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> bodyStmts = new ArrayList<>();
			setState(299);
			((ForLoopContext)_localctx).line = match(FOR);
			setState(300);
			match(LPAR);
			setState(301);
			((ForLoopContext)_localctx).iterator = identifier();
			setState(302);
			match(COLON);
			setState(303);
			((ForLoopContext)_localctx).arrayName = identifier();
			setState(304);
			match(RPAR);
			setState(305);
			match(LBRACE);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << RETURN) | (1L << FOR) | (1L << LPAR) | (1L << IDENTIFIER) | (1L << PREDICATE_IDENTIFIER))) != 0)) {
				{
				{
				setState(306);
				((ForLoopContext)_localctx).stmt = statement();
				bodyStmts.add(((ForLoopContext)_localctx).stmt.statementRet);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(314);
			match(RBRACE);
			((ForLoopContext)_localctx).forRet =  new ForloopStmt(((ForLoopContext)_localctx).iterator.identifierRet, ((ForLoopContext)_localctx).arrayName.identifierRet, bodyStmts);
			    _localctx.forRet.setLine(((ForLoopContext)_localctx).line.getLine());
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

	public static class PredicateContext extends ParserRuleContext {
		public PredicateStmt predicateRet;
		public PredicateIdentifierContext id;
		public VariableContext v;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((PredicateContext)_localctx).id = predicateIdentifier();
			setState(318);
			match(LPAR);
			setState(319);
			((PredicateContext)_localctx).v = variable();
			setState(320);
			match(RPAR);
			((PredicateContext)_localctx).predicateRet =  new PredicateStmt(((PredicateContext)_localctx).id.predicateIdentifierRet, ((PredicateContext)_localctx).v.v);
			    _localctx.predicateRet.setLine(((PredicateContext)_localctx).id.predicateIdentifierRet.getLine());
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

	public static class ImplicationContext extends ParserRuleContext {
		public ImplicationStmt implicationRet;
		public ExpressionContext e;
		public Token a;
		public StatementContext s;
		public List<TerminalNode> LPAR() { return getTokens(LogicPLParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(LogicPLParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(LogicPLParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(LogicPLParser.RPAR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(LogicPLParser.ARROW, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_implication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> results = new ArrayList<Statement>();
			setState(324);
			match(LPAR);
			setState(325);
			((ImplicationContext)_localctx).e = expression();
			setState(326);
			match(RPAR);
			setState(327);
			((ImplicationContext)_localctx).a = match(ARROW);
			setState(328);
			match(LPAR);
			{
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				((ImplicationContext)_localctx).s = statement();
				results.add(((ImplicationContext)_localctx).s.statementRet);
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << RETURN) | (1L << FOR) | (1L << LPAR) | (1L << IDENTIFIER) | (1L << PREDICATE_IDENTIFIER))) != 0) );
			}
			setState(336);
			match(RPAR);
			((ImplicationContext)_localctx).implicationRet =  new ImplicationStmt(((ImplicationContext)_localctx).e.e, results); _localctx.implicationRet.setLine(((ImplicationContext)_localctx).a.getLine());
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression e;
		public AndExprContext l;
		public Expression2Context r;
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((ExpressionContext)_localctx).l = andExpr();
			setState(340);
			((ExpressionContext)_localctx).r = expression2();
			if(((ExpressionContext)_localctx).r.e != null) {((ExpressionContext)_localctx).e =  new BinaryExpression(((ExpressionContext)_localctx).l.e, ((ExpressionContext)_localctx).r.e.getRight(), ((ExpressionContext)_localctx).r.e.getBinaryOperator());
			    _localctx.e.setLine(((ExpressionContext)_localctx).r.e.getLine());} else {((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).l.e;}
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

	public static class Expression2Context extends ParserRuleContext {
		public BinaryExpression e;
		public BinaryExpression ee;
		public Token OR;
		public AndExprContext l;
		public Expression2Context r;
		public TerminalNode OR() { return getToken(LogicPLParser.OR, 0); }
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression2);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				((Expression2Context)_localctx).OR = match(OR);
				setState(344);
				((Expression2Context)_localctx).l = andExpr();
				setState(345);
				((Expression2Context)_localctx).r = expression2();
				if(((Expression2Context)_localctx).r.e != null) {((Expression2Context)_localctx).ee =  new BinaryExpression(((Expression2Context)_localctx).l.e, ((Expression2Context)_localctx).r.e.getRight(), ((Expression2Context)_localctx).r.e.getBinaryOperator());
				    _localctx.ee.setLine(((Expression2Context)_localctx).r.e.getLine()); ((Expression2Context)_localctx).e =  new BinaryExpression(null, _localctx.ee, BinaryOperator.or);} else{((Expression2Context)_localctx).e =  new BinaryExpression(null, ((Expression2Context)_localctx).l.e, BinaryOperator.or);}
				_localctx.e.setLine(((Expression2Context)_localctx).OR.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				((Expression2Context)_localctx).e =  null;
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

	public static class AndExprContext extends ParserRuleContext {
		public Expression e;
		public EqExprContext l;
		public AndExpr2Context r;
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExpr2Context andExpr2() {
			return getRuleContext(AndExpr2Context.class,0);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_andExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((AndExprContext)_localctx).l = eqExpr();
			setState(353);
			((AndExprContext)_localctx).r = andExpr2();
			if(((AndExprContext)_localctx).r.e != null) {((AndExprContext)_localctx).e =  new BinaryExpression(((AndExprContext)_localctx).l.e, ((AndExprContext)_localctx).r.e.getRight(), ((AndExprContext)_localctx).r.e.getBinaryOperator());
			    _localctx.e.setLine(((AndExprContext)_localctx).r.e.getLine());} else {((AndExprContext)_localctx).e =  ((AndExprContext)_localctx).l.e;}
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

	public static class AndExpr2Context extends ParserRuleContext {
		public BinaryExpression e;
		public BinaryExpression ee;
		public Token AND;
		public EqExprContext l;
		public AndExpr2Context r;
		public TerminalNode AND() { return getToken(LogicPLParser.AND, 0); }
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExpr2Context andExpr2() {
			return getRuleContext(AndExpr2Context.class,0);
		}
		public AndExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr2; }
	}

	public final AndExpr2Context andExpr2() throws RecognitionException {
		AndExpr2Context _localctx = new AndExpr2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_andExpr2);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				((AndExpr2Context)_localctx).AND = match(AND);
				setState(357);
				((AndExpr2Context)_localctx).l = eqExpr();
				setState(358);
				((AndExpr2Context)_localctx).r = andExpr2();
				if(((AndExpr2Context)_localctx).r.e != null) {((AndExpr2Context)_localctx).ee =  new BinaryExpression(((AndExpr2Context)_localctx).l.e, ((AndExpr2Context)_localctx).r.e.getRight(), ((AndExpr2Context)_localctx).r.e.getBinaryOperator());
				    _localctx.ee.setLine(((AndExpr2Context)_localctx).r.e.getLine());
				    ((AndExpr2Context)_localctx).e =  new BinaryExpression(null, _localctx.ee, BinaryOperator.and);} else{((AndExpr2Context)_localctx).e =  new BinaryExpression(null, ((AndExpr2Context)_localctx).l.e, BinaryOperator.and);}
				_localctx.e.setLine(((AndExpr2Context)_localctx).AND.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				((AndExpr2Context)_localctx).e =  null;
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

	public static class EqExprContext extends ParserRuleContext {
		public Expression e;
		public CompExprContext l;
		public EqExpr2Context r;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqExpr2Context eqExpr2() {
			return getRuleContext(EqExpr2Context.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eqExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((EqExprContext)_localctx).l = compExpr();
			setState(366);
			((EqExprContext)_localctx).r = eqExpr2();
			if(((EqExprContext)_localctx).r.e != null) {((EqExprContext)_localctx).e =  new BinaryExpression(((EqExprContext)_localctx).l.e, ((EqExprContext)_localctx).r.e.getRight(), ((EqExprContext)_localctx).r.e.getBinaryOperator());
			    _localctx.e.setLine(((EqExprContext)_localctx).r.e.getLine());} else {((EqExprContext)_localctx).e =  ((EqExprContext)_localctx).l.e;}
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

	public static class EqExpr2Context extends ParserRuleContext {
		public BinaryExpression e;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public CompExprContext l;
		public EqExpr2Context r;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqExpr2Context eqExpr2() {
			return getRuleContext(EqExpr2Context.class,0);
		}
		public TerminalNode EQ() { return getToken(LogicPLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LogicPLParser.NEQ, 0); }
		public EqExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr2; }
	}

	public final EqExpr2Context eqExpr2() throws RecognitionException {
		EqExpr2Context _localctx = new EqExpr2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_eqExpr2);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case NEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(369);
					((EqExpr2Context)_localctx).op = match(EQ);
					((EqExpr2Context)_localctx).opt =  BinaryOperator.eq;
					}
					break;
				case NEQ:
					{
					setState(371);
					((EqExpr2Context)_localctx).op = match(NEQ);
					((EqExpr2Context)_localctx).opt =  BinaryOperator.neq;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(375);
				((EqExpr2Context)_localctx).l = compExpr();
				setState(376);
				((EqExpr2Context)_localctx).r = eqExpr2();
				if(((EqExpr2Context)_localctx).r.e != null) {((EqExpr2Context)_localctx).ee =  new BinaryExpression(((EqExpr2Context)_localctx).l.e, ((EqExpr2Context)_localctx).r.e.getRight(), ((EqExpr2Context)_localctx).r.e.getBinaryOperator());
				    _localctx.ee.setLine(((EqExpr2Context)_localctx).r.e.getLine()); ((EqExpr2Context)_localctx).e =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((EqExpr2Context)_localctx).e =  new BinaryExpression(null, ((EqExpr2Context)_localctx).l.e, _localctx.opt);}
				_localctx.e.setLine(((EqExpr2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				((EqExpr2Context)_localctx).e =  null;
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

	public static class CompExprContext extends ParserRuleContext {
		public Expression e;
		public AdditiveContext l;
		public CompExpr2Context r;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public CompExpr2Context compExpr2() {
			return getRuleContext(CompExpr2Context.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((CompExprContext)_localctx).l = additive();
			setState(384);
			((CompExprContext)_localctx).r = compExpr2();
			if(((CompExprContext)_localctx).r.e != null) {((CompExprContext)_localctx).e =  new BinaryExpression(((CompExprContext)_localctx).l.e, ((CompExprContext)_localctx).r.e.getRight(), ((CompExprContext)_localctx).r.e.getBinaryOperator());
			    _localctx.e.setLine(((CompExprContext)_localctx).r.e.getLine());} else {((CompExprContext)_localctx).e =  ((CompExprContext)_localctx).l.e;}
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

	public static class CompExpr2Context extends ParserRuleContext {
		public BinaryExpression e;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public AdditiveContext l;
		public CompExpr2Context r;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public CompExpr2Context compExpr2() {
			return getRuleContext(CompExpr2Context.class,0);
		}
		public TerminalNode LT() { return getToken(LogicPLParser.LT, 0); }
		public TerminalNode LTE() { return getToken(LogicPLParser.LTE, 0); }
		public TerminalNode GT() { return getToken(LogicPLParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LogicPLParser.GTE, 0); }
		public CompExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr2; }
	}

	public final CompExpr2Context compExpr2() throws RecognitionException {
		CompExpr2Context _localctx = new CompExpr2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_compExpr2);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
			case LT:
			case GTE:
			case LTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(387);
					((CompExpr2Context)_localctx).op = match(LT);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.lt;
					}
					break;
				case LTE:
					{
					setState(389);
					((CompExpr2Context)_localctx).op = match(LTE);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.lte;
					}
					break;
				case GT:
					{
					setState(391);
					((CompExpr2Context)_localctx).op = match(GT);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.gt;
					}
					break;
				case GTE:
					{
					setState(393);
					((CompExpr2Context)_localctx).op = match(GTE);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.gte;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(397);
				((CompExpr2Context)_localctx).l = additive();
				setState(398);
				((CompExpr2Context)_localctx).r = compExpr2();
				if(((CompExpr2Context)_localctx).r.e != null) {((CompExpr2Context)_localctx).ee =  new BinaryExpression(((CompExpr2Context)_localctx).l.e, ((CompExpr2Context)_localctx).r.e.getRight(), ((CompExpr2Context)_localctx).r.e.getBinaryOperator());
				    _localctx.ee.setLine(((CompExpr2Context)_localctx).r.e.getLine()); ((CompExpr2Context)_localctx).e =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((CompExpr2Context)_localctx).e =  new BinaryExpression(null, ((CompExpr2Context)_localctx).l.e, _localctx.opt);}
				_localctx.e.setLine(((CompExpr2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((CompExpr2Context)_localctx).e =  null;
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

	public static class AdditiveContext extends ParserRuleContext {
		public Expression e;
		public MulticativeContext l;
		public Additive2Context r;
		public MulticativeContext multicative() {
			return getRuleContext(MulticativeContext.class,0);
		}
		public Additive2Context additive2() {
			return getRuleContext(Additive2Context.class,0);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_additive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			((AdditiveContext)_localctx).l = multicative();
			setState(406);
			((AdditiveContext)_localctx).r = additive2();
			if(((AdditiveContext)_localctx).r.e != null) {((AdditiveContext)_localctx).e =  new BinaryExpression(((AdditiveContext)_localctx).l.e, ((AdditiveContext)_localctx).r.e.getRight(), ((AdditiveContext)_localctx).r.e.getBinaryOperator());
			    _localctx.e.setLine(((AdditiveContext)_localctx).r.e.getLine());} else {((AdditiveContext)_localctx).e =  ((AdditiveContext)_localctx).l.e;}
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

	public static class Additive2Context extends ParserRuleContext {
		public BinaryExpression e;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public MulticativeContext l;
		public Additive2Context r;
		public MulticativeContext multicative() {
			return getRuleContext(MulticativeContext.class,0);
		}
		public Additive2Context additive2() {
			return getRuleContext(Additive2Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public Additive2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive2; }
	}

	public final Additive2Context additive2() throws RecognitionException {
		Additive2Context _localctx = new Additive2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_additive2);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(409);
					((Additive2Context)_localctx).op = match(PLUS);
					((Additive2Context)_localctx).opt =  BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(411);
					((Additive2Context)_localctx).op = match(MINUS);
					((Additive2Context)_localctx).opt =  BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415);
				((Additive2Context)_localctx).l = multicative();
				setState(416);
				((Additive2Context)_localctx).r = additive2();
				if(((Additive2Context)_localctx).r.e != null) {((Additive2Context)_localctx).ee =  new BinaryExpression(((Additive2Context)_localctx).l.e, ((Additive2Context)_localctx).r.e.getRight(), ((Additive2Context)_localctx).r.e.getBinaryOperator());
				    _localctx.ee.setLine(((Additive2Context)_localctx).r.e.getLine()); ((Additive2Context)_localctx).e =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((Additive2Context)_localctx).e =  new BinaryExpression(null, ((Additive2Context)_localctx).l.e, _localctx.opt);}
				_localctx.e.setLine(((Additive2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((Additive2Context)_localctx).e =  null;
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

	public static class MulticativeContext extends ParserRuleContext {
		public Expression e;
		public UnaryContext l;
		public Multicative2Context r;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Multicative2Context multicative2() {
			return getRuleContext(Multicative2Context.class,0);
		}
		public MulticativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicative; }
	}

	public final MulticativeContext multicative() throws RecognitionException {
		MulticativeContext _localctx = new MulticativeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multicative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			((MulticativeContext)_localctx).l = unary();
			setState(424);
			((MulticativeContext)_localctx).r = multicative2();
			if(((MulticativeContext)_localctx).r.e != null) {((MulticativeContext)_localctx).e =  new BinaryExpression(((MulticativeContext)_localctx).l.e, ((MulticativeContext)_localctx).r.e.getRight(), ((MulticativeContext)_localctx).r.e.getBinaryOperator());
			    _localctx.e.setLine(((MulticativeContext)_localctx).r.e.getLine());} else {((MulticativeContext)_localctx).e =  ((MulticativeContext)_localctx).l.e;}
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

	public static class Multicative2Context extends ParserRuleContext {
		public BinaryExpression e;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public UnaryContext l;
		public Multicative2Context r;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Multicative2Context multicative2() {
			return getRuleContext(Multicative2Context.class,0);
		}
		public TerminalNode MULT() { return getToken(LogicPLParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(LogicPLParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(LogicPLParser.DIV, 0); }
		public Multicative2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicative2; }
	}

	public final Multicative2Context multicative2() throws RecognitionException {
		Multicative2Context _localctx = new Multicative2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_multicative2);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(427);
					((Multicative2Context)_localctx).op = match(MULT);
					((Multicative2Context)_localctx).opt =  BinaryOperator.mult;
					}
					break;
				case MOD:
					{
					setState(429);
					((Multicative2Context)_localctx).op = match(MOD);
					((Multicative2Context)_localctx).opt =  BinaryOperator.mod;
					}
					break;
				case DIV:
					{
					setState(431);
					((Multicative2Context)_localctx).op = match(DIV);
					((Multicative2Context)_localctx).opt =  BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(435);
				((Multicative2Context)_localctx).l = unary();
				setState(436);
				((Multicative2Context)_localctx).r = multicative2();
				if(((Multicative2Context)_localctx).r.e != null) {((Multicative2Context)_localctx).ee =  new BinaryExpression(((Multicative2Context)_localctx).l.e, ((Multicative2Context)_localctx).r.e.getRight(), ((Multicative2Context)_localctx).r.e.getBinaryOperator());
				    _localctx.ee.setLine(((Multicative2Context)_localctx).r.e.getLine()); ((Multicative2Context)_localctx).e =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((Multicative2Context)_localctx).e =  new BinaryExpression(null, ((Multicative2Context)_localctx).l.e, _localctx.opt);}
				_localctx.e.setLine(((Multicative2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case PLUS:
			case MINUS:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((Multicative2Context)_localctx).e =  null;
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

	public static class UnaryContext extends ParserRuleContext {
		public Expression e;
		public UnaryOperator opt;
		public OtherContext otherRet;
		public Token op;
		public OtherContext expr;
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(LogicPLParser.NOT, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unary);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				((UnaryContext)_localctx).otherRet = other();
				((UnaryContext)_localctx).e =  ((UnaryContext)_localctx).otherRet.e;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(446);
					((UnaryContext)_localctx).op = match(PLUS);
					((UnaryContext)_localctx).opt =  UnaryOperator.plus;
					}
					break;
				case MINUS:
					{
					setState(448);
					((UnaryContext)_localctx).op = match(MINUS);
					((UnaryContext)_localctx).opt =  UnaryOperator.minus;
					}
					break;
				case NOT:
					{
					setState(450);
					((UnaryContext)_localctx).op = match(NOT);
					((UnaryContext)_localctx).opt =  UnaryOperator.not;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(454);
				((UnaryContext)_localctx).expr = other();
				((UnaryContext)_localctx).e =  new UnaryExpression(_localctx.opt, ((UnaryContext)_localctx).expr.e); _localctx.e.setLine(((UnaryContext)_localctx).op.getLine());
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

	public static class OtherContext extends ParserRuleContext {
		public Expression e;
		public ExpressionContext expr;
		public VariableContext var;
		public ValueContext val;
		public QueryType1Context q1;
		public FunctionCallContext funcCall;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public QueryType1Context queryType1() {
			return getRuleContext(QueryType1Context.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_other);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(LPAR);
				setState(460);
				((OtherContext)_localctx).expr = expression();
				setState(461);
				match(RPAR);
				((OtherContext)_localctx).e =  ((OtherContext)_localctx).expr.e;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				((OtherContext)_localctx).var = variable();
				((OtherContext)_localctx).e =  ((OtherContext)_localctx).var.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				((OtherContext)_localctx).val = value();
				((OtherContext)_localctx).e =  ((OtherContext)_localctx).val.valueRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				((OtherContext)_localctx).q1 = queryType1();
				((OtherContext)_localctx).e =  ((OtherContext)_localctx).q1.query1Ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				((OtherContext)_localctx).funcCall = functionCall();
				((OtherContext)_localctx).e =  ((OtherContext)_localctx).funcCall.fCallRet;
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall fCallRet;
		public IdentifierContext name;
		public ExpressionContext arg1;
		public ExpressionContext newArg;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Expression> args = new ArrayList<Expression>();
			setState(479);
			((FunctionCallContext)_localctx).name = identifier();
			setState(480);
			match(LPAR);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << LBRACKET) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << INT_NUMBER) | (1L << FLOAT_NUMBER))) != 0)) {
				{
				setState(481);
				((FunctionCallContext)_localctx).arg1 = expression();
				args.add(((FunctionCallContext)_localctx).arg1.e);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(483);
					match(COMMA);
					setState(484);
					((FunctionCallContext)_localctx).newArg = expression();
					args.add(((FunctionCallContext)_localctx).newArg.e);
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(494);
			match(RPAR);
			((FunctionCallContext)_localctx).fCallRet =  new FunctionCall(args, ((FunctionCallContext)_localctx).name.identifierRet); _localctx.fCallRet.setLine(((FunctionCallContext)_localctx).name.identifierRet.getLine());
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

	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public NumericValueContext v;
		public Token t;
		public Token f;
		public NumericValueContext v2;
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(LogicPLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LogicPLParser.FALSE, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				((ValueContext)_localctx).v = numericValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).v.v;
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				((ValueContext)_localctx).t = match(TRUE);
				((ValueContext)_localctx).valueRet =  new BooleanValue(true);
				_localctx.valueRet.setLine(((ValueContext)_localctx).t.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				((ValueContext)_localctx).f = match(FALSE);
				((ValueContext)_localctx).valueRet =  new BooleanValue(false);
				_localctx.valueRet.setLine(((ValueContext)_localctx).f.getLine());
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				match(MINUS);
				setState(507);
				((ValueContext)_localctx).v2 = numericValue();
				((ValueContext)_localctx).v2.v.negateConstant(); ((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).v2.v;
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

	public static class NumericValueContext extends ParserRuleContext {
		public Value v;
		public Token i;
		public Token f;
		public TerminalNode INT_NUMBER() { return getToken(LogicPLParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(LogicPLParser.FLOAT_NUMBER, 0); }
		public NumericValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericValue; }
	}

	public final NumericValueContext numericValue() throws RecognitionException {
		NumericValueContext _localctx = new NumericValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numericValue);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				((NumericValueContext)_localctx).i = match(INT_NUMBER);
				((NumericValueContext)_localctx).v =  new IntValue((((NumericValueContext)_localctx).i!=null?Integer.valueOf(((NumericValueContext)_localctx).i.getText()):0));
				_localctx.v.setLine(((NumericValueContext)_localctx).i.getLine());
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				((NumericValueContext)_localctx).f = match(FLOAT_NUMBER);
				((NumericValueContext)_localctx).v =  new FloatValue(Float.parseFloat((((NumericValueContext)_localctx).f!=null?((NumericValueContext)_localctx).f.getText():null)));
				_localctx.v.setLine(((NumericValueContext)_localctx).f.getLine());
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token idnfr;
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			((IdentifierContext)_localctx).idnfr = match(IDENTIFIER);
			((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).idnfr!=null?((IdentifierContext)_localctx).idnfr.getText():null)); _localctx.identifierRet.setLine(((IdentifierContext)_localctx).idnfr.getLine());
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

	public static class PredicateIdentifierContext extends ParserRuleContext {
		public Identifier predicateIdentifierRet;
		public Token predicate_idnfr;
		public TerminalNode PREDICATE_IDENTIFIER() { return getToken(LogicPLParser.PREDICATE_IDENTIFIER, 0); }
		public PredicateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateIdentifier; }
	}

	public final PredicateIdentifierContext predicateIdentifier() throws RecognitionException {
		PredicateIdentifierContext _localctx = new PredicateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predicateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((PredicateIdentifierContext)_localctx).predicate_idnfr = match(PREDICATE_IDENTIFIER);
			((PredicateIdentifierContext)_localctx).predicateIdentifierRet =  new Identifier((((PredicateIdentifierContext)_localctx).predicate_idnfr!=null?((PredicateIdentifierContext)_localctx).predicate_idnfr.getText():null));
			    _localctx.predicateIdentifierRet.setLine(((PredicateIdentifierContext)_localctx).predicate_idnfr.getLine());
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(BOOLEAN);
				((TypeContext)_localctx).typeRet =  new BooleanType();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(FLOAT);
				((TypeContext)_localctx).typeRet =  new FloatType();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0219\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3k\n\3\f\3\16\3n\13\3\5\3p\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\6\3y\n\3\r\3\16\3z\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\6\5\u008a\n\5\r\5\16\5\u008b\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00a7\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00b8\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00c9\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00d6\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00e6\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ef\n\r"+
		"\7\r\u00f1\n\r\f\r\16\r\u00f4\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u010d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0127\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0138\n\24\f\24\16\24\u013b\13\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\6\26\u014f\n\26\r\26\16\26\u0150\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0161\n\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u016e\n\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0178\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0180\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u018e\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0196\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u01a0\n \3 \3 \3 \3 \3"+
		" \3 \5 \u01a8\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01b4\n\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u01bc\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01c7"+
		"\n#\3#\3#\3#\5#\u01cc\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\5$\u01df\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01ea\n%\f%\16%\u01ed"+
		"\13%\5%\u01ef\n%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0201"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0209\n\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\5*\u0217\n*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\2\2\u0223\2T\3\2\2\2\4`\3\2\2\2\6\177"+
		"\3\2\2\2\b\u0083\3\2\2\2\n\u00a6\3\2\2\2\f\u00a8\3\2\2\2\16\u00b7\3\2"+
		"\2\2\20\u00bf\3\2\2\2\22\u00c1\3\2\2\2\24\u00cc\3\2\2\2\26\u00d9\3\2\2"+
		"\2\30\u00dd\3\2\2\2\32\u00f7\3\2\2\2\34\u0104\3\2\2\2\36\u010c\3\2\2\2"+
		" \u010e\3\2\2\2\"\u0117\3\2\2\2$\u011f\3\2\2\2&\u012c\3\2\2\2(\u013f\3"+
		"\2\2\2*\u0145\3\2\2\2,\u0155\3\2\2\2.\u0160\3\2\2\2\60\u0162\3\2\2\2\62"+
		"\u016d\3\2\2\2\64\u016f\3\2\2\2\66\u017f\3\2\2\28\u0181\3\2\2\2:\u0195"+
		"\3\2\2\2<\u0197\3\2\2\2>\u01a7\3\2\2\2@\u01a9\3\2\2\2B\u01bb\3\2\2\2D"+
		"\u01cb\3\2\2\2F\u01de\3\2\2\2H\u01e0\3\2\2\2J\u0200\3\2\2\2L\u0208\3\2"+
		"\2\2N\u020a\3\2\2\2P\u020d\3\2\2\2R\u0216\3\2\2\2TZ\b\2\1\2UV\5\4\3\2"+
		"VW\b\2\1\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2"+
		"\2\\Z\3\2\2\2]^\5\b\5\2^_\b\2\1\2_\3\3\2\2\2`a\b\3\1\2ab\7\3\2\2bc\5N"+
		"(\2co\7\r\2\2de\5\6\4\2el\b\3\1\2fg\7\20\2\2gh\5\6\4\2hi\b\3\1\2ik\3\2"+
		"\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2od\3\2"+
		"\2\2op\3\2\2\2pq\3\2\2\2qr\7\16\2\2rs\7\17\2\2st\5R*\2tx\7\21\2\2uv\5"+
		"\n\6\2vw\b\3\1\2wy\3\2\2\2xu\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3"+
		"\2\2\2|}\7\22\2\2}~\b\3\1\2~\5\3\2\2\2\177\u0080\5R*\2\u0080\u0081\5N"+
		"(\2\u0081\u0082\b\4\1\2\u0082\7\3\2\2\2\u0083\u0084\b\5\1\2\u0084\u0085"+
		"\7\7\2\2\u0085\u0089\7\21\2\2\u0086\u0087\5\n\6\2\u0087\u0088\b\5\1\2"+
		"\u0088\u008a\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\22\2\2"+
		"\u008e\u008f\b\5\1\2\u008f\t\3\2\2\2\u0090\u0091\5\f\7\2\u0091\u0092\b"+
		"\6\1\2\u0092\u00a7\3\2\2\2\u0093\u0094\5(\25\2\u0094\u0095\7\23\2\2\u0095"+
		"\u0096\b\6\1\2\u0096\u00a7\3\2\2\2\u0097\u0098\5*\26\2\u0098\u0099\b\6"+
		"\1\2\u0099\u00a7\3\2\2\2\u009a\u009b\5$\23\2\u009b\u009c\b\6\1\2\u009c"+
		"\u00a7\3\2\2\2\u009d\u009e\5\32\16\2\u009e\u009f\b\6\1\2\u009f\u00a7\3"+
		"\2\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a2\b\6\1\2\u00a2\u00a7\3\2\2\2\u00a3"+
		"\u00a4\5\20\t\2\u00a4\u00a5\b\6\1\2\u00a5\u00a7\3\2\2\2\u00a6\u0090\3"+
		"\2\2\2\u00a6\u0093\3\2\2\2\u00a6\u0097\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6"+
		"\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\13\3\2\2"+
		"\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\5,\27\2\u00ab"+
		"\u00ac\7\23\2\2\u00ac\u00ad\b\7\1\2\u00ad\r\3\2\2\2\u00ae\u00af\5N(\2"+
		"\u00af\u00b0\b\b\1\2\u00b0\u00b8\3\2\2\2\u00b1\u00b2\5N(\2\u00b2\u00b3"+
		"\7\25\2\2\u00b3\u00b4\5,\27\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6\b\b\1\2"+
		"\u00b6\u00b8\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8\17"+
		"\3\2\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\b\t\1\2\u00bb\u00c0\3\2\2\2"+
		"\u00bc\u00bd\5\24\13\2\u00bd\u00be\b\t\1\2\u00be\u00c0\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\5R*\2\u00c2"+
		"\u00c3\5N(\2\u00c3\u00c8\b\n\1\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\5,\27"+
		"\2\u00c6\u00c7\b\n\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\23\2\2\u00cb\23\3\2\2\2\u00cc"+
		"\u00cd\5R*\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\7+\2\2\u00cf\u00d0\7\26"+
		"\2\2\u00d0\u00d1\5N(\2\u00d1\u00d5\b\13\1\2\u00d2\u00d3\5\26\f\2\u00d3"+
		"\u00d4\b\13\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\23\2\2\u00d8\25\3\2\2\2\u00d9"+
		"\u00da\7\24\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\b\f\1\2\u00dc\27\3\2"+
		"\2\2\u00dd\u00de\b\r\1\2\u00de\u00e5\7\25\2\2\u00df\u00e0\5J&\2\u00e0"+
		"\u00e1\b\r\1\2\u00e1\u00e6\3\2\2\2\u00e2\u00e3\5N(\2\u00e3\u00e4\b\r\1"+
		"\2\u00e4\u00e6\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00f2"+
		"\3\2\2\2\u00e7\u00ee\7\20\2\2\u00e8\u00e9\5J&\2\u00e9\u00ea\b\r\1\2\u00ea"+
		"\u00ef\3\2\2\2\u00eb\u00ec\5N(\2\u00ec\u00ed\b\r\1\2\u00ed\u00ef\3\2\2"+
		"\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e7"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\26\2\2\u00f6\31\3\2\2"+
		"\2\u00f7\u00f8\7\b\2\2\u00f8\u00f9\7\r\2\2\u00f9\u00fa\5\34\17\2\u00fa"+
		"\u00fb\7\16\2\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd\b\16\1\2\u00fd\33\3\2"+
		"\2\2\u00fe\u00ff\5\16\b\2\u00ff\u0100\b\17\1\2\u0100\u0105\3\2\2\2\u0101"+
		"\u0102\5\36\20\2\u0102\u0103\b\17\1\2\u0103\u0105\3\2\2\2\u0104\u00fe"+
		"\3\2\2\2\u0104\u0101\3\2\2\2\u0105\35\3\2\2\2\u0106\u0107\5 \21\2\u0107"+
		"\u0108\b\20\1\2\u0108\u010d\3\2\2\2\u0109\u010a\5\"\22\2\u010a\u010b\b"+
		"\20\1\2\u010b\u010d\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"\37\3\2\2\2\u010e\u010f\7\25\2\2\u010f\u0110\7\27\2\2\u0110\u0111\5P)"+
		"\2\u0111\u0112\7\r\2\2\u0112\u0113\5\16\b\2\u0113\u0114\7\16\2\2\u0114"+
		"\u0115\7\26\2\2\u0115\u0116\b\21\1\2\u0116!\3\2\2\2\u0117\u0118\7\25\2"+
		"\2\u0118\u0119\5P)\2\u0119\u011a\7\r\2\2\u011a\u011b\7\27\2\2\u011b\u011c"+
		"\7\16\2\2\u011c\u011d\7\26\2\2\u011d\u011e\b\22\1\2\u011e#\3\2\2\2\u011f"+
		"\u0126\7\t\2\2\u0120\u0121\5J&\2\u0121\u0122\b\23\1\2\u0122\u0127\3\2"+
		"\2\2\u0123\u0124\5N(\2\u0124\u0125\b\23\1\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0120\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0129\7\23\2\2\u0129\u012a\b\23\1\2\u012a\u012b\b\23\1\2\u012b"+
		"%\3\2\2\2\u012c\u012d\b\24\1\2\u012d\u012e\7\n\2\2\u012e\u012f\7\r\2\2"+
		"\u012f\u0130\5N(\2\u0130\u0131\7\17\2\2\u0131\u0132\5N(\2\u0132\u0133"+
		"\7\16\2\2\u0133\u0139\7\21\2\2\u0134\u0135\5\n\6\2\u0135\u0136\b\24\1"+
		"\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\7\22\2\2\u013d\u013e\b\24\1\2\u013e\'\3\2\2\2\u013f\u0140\5P)\2"+
		"\u0140\u0141\7\r\2\2\u0141\u0142\5\16\b\2\u0142\u0143\7\16\2\2\u0143\u0144"+
		"\b\25\1\2\u0144)\3\2\2\2\u0145\u0146\b\26\1\2\u0146\u0147\7\r\2\2\u0147"+
		"\u0148\5,\27\2\u0148\u0149\7\16\2\2\u0149\u014a\7\30\2\2\u014a\u014e\7"+
		"\r\2\2\u014b\u014c\5\n\6\2\u014c\u014d\b\26\1\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014b\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\16\2\2\u0153\u0154\b\26\1\2\u0154"+
		"+\3\2\2\2\u0155\u0156\5\60\31\2\u0156\u0157\5.\30\2\u0157\u0158\b\27\1"+
		"\2\u0158-\3\2\2\2\u0159\u015a\7\31\2\2\u015a\u015b\5\60\31\2\u015b\u015c"+
		"\5.\30\2\u015c\u015d\b\30\1\2\u015d\u015e\b\30\1\2\u015e\u0161\3\2\2\2"+
		"\u015f\u0161\b\30\1\2\u0160\u0159\3\2\2\2\u0160\u015f\3\2\2\2\u0161/\3"+
		"\2\2\2\u0162\u0163\5\64\33\2\u0163\u0164\5\62\32\2\u0164\u0165\b\31\1"+
		"\2\u0165\61\3\2\2\2\u0166\u0167\7\32\2\2\u0167\u0168\5\64\33\2\u0168\u0169"+
		"\5\62\32\2\u0169\u016a\b\32\1\2\u016a\u016b\b\32\1\2\u016b\u016e\3\2\2"+
		"\2\u016c\u016e\b\32\1\2\u016d\u0166\3\2\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\63\3\2\2\2\u016f\u0170\58\35\2\u0170\u0171\5\66\34\2\u0171\u0172\b\33"+
		"\1\2\u0172\65\3\2\2\2\u0173\u0174\7\33\2\2\u0174\u0178\b\34\1\2\u0175"+
		"\u0176\7%\2\2\u0176\u0178\b\34\1\2\u0177\u0173\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017a\58\35\2\u017a\u017b\5\66\34\2\u017b"+
		"\u017c\b\34\1\2\u017c\u017d\b\34\1\2\u017d\u0180\3\2\2\2\u017e\u0180\b"+
		"\34\1\2\u017f\u0177\3\2\2\2\u017f\u017e\3\2\2\2\u0180\67\3\2\2\2\u0181"+
		"\u0182\5<\37\2\u0182\u0183\5:\36\2\u0183\u0184\b\35\1\2\u01849\3\2\2\2"+
		"\u0185\u0186\7\35\2\2\u0186\u018e\b\36\1\2\u0187\u0188\7\37\2\2\u0188"+
		"\u018e\b\36\1\2\u0189\u018a\7\34\2\2\u018a\u018e\b\36\1\2\u018b\u018c"+
		"\7\36\2\2\u018c\u018e\b\36\1\2\u018d\u0185\3\2\2\2\u018d\u0187\3\2\2\2"+
		"\u018d\u0189\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\5<\37\2\u0190\u0191\5:\36\2\u0191\u0192\b\36\1\2\u0192\u0193\b\36\1\2"+
		"\u0193\u0196\3\2\2\2\u0194\u0196\b\36\1\2\u0195\u018d\3\2\2\2\u0195\u0194"+
		"\3\2\2\2\u0196;\3\2\2\2\u0197\u0198\5@!\2\u0198\u0199\5> \2\u0199\u019a"+
		"\b\37\1\2\u019a=\3\2\2\2\u019b\u019c\7 \2\2\u019c\u01a0\b \1\2\u019d\u019e"+
		"\7!\2\2\u019e\u01a0\b \1\2\u019f\u019b\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\5@!\2\u01a2\u01a3\5> \2\u01a3\u01a4\b \1\2"+
		"\u01a4\u01a5\b \1\2\u01a5\u01a8\3\2\2\2\u01a6\u01a8\b \1\2\u01a7\u019f"+
		"\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8?\3\2\2\2\u01a9\u01aa\5D#\2\u01aa\u01ab"+
		"\5B\"\2\u01ab\u01ac\b!\1\2\u01acA\3\2\2\2\u01ad\u01ae\7\"\2\2\u01ae\u01b4"+
		"\b\"\1\2\u01af\u01b0\7$\2\2\u01b0\u01b4\b\"\1\2\u01b1\u01b2\7#\2\2\u01b2"+
		"\u01b4\b\"\1\2\u01b3\u01ad\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5D#\2\u01b6\u01b7\5B\"\2\u01b7\u01b8"+
		"\b\"\1\2\u01b8\u01b9\b\"\1\2\u01b9\u01bc\3\2\2\2\u01ba\u01bc\b\"\1\2\u01bb"+
		"\u01b3\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcC\3\2\2\2\u01bd\u01be\5F$\2\u01be"+
		"\u01bf\b#\1\2\u01bf\u01cc\3\2\2\2\u01c0\u01c1\7 \2\2\u01c1\u01c7\b#\1"+
		"\2\u01c2\u01c3\7!\2\2\u01c3\u01c7\b#\1\2\u01c4\u01c5\7&\2\2\u01c5\u01c7"+
		"\b#\1\2\u01c6\u01c0\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01c9\5F$\2\u01c9\u01ca\b#\1\2\u01ca\u01cc\3\2\2"+
		"\2\u01cb\u01bd\3\2\2\2\u01cb\u01c6\3\2\2\2\u01ccE\3\2\2\2\u01cd\u01ce"+
		"\7\r\2\2\u01ce\u01cf\5,\27\2\u01cf\u01d0\7\16\2\2\u01d0\u01d1\b$\1\2\u01d1"+
		"\u01df\3\2\2\2\u01d2\u01d3\5\16\b\2\u01d3\u01d4\b$\1\2\u01d4\u01df\3\2"+
		"\2\2\u01d5\u01d6\5J&\2\u01d6\u01d7\b$\1\2\u01d7\u01df\3\2\2\2\u01d8\u01d9"+
		"\5 \21\2\u01d9\u01da\b$\1\2\u01da\u01df\3\2\2\2\u01db\u01dc\5H%\2\u01dc"+
		"\u01dd\b$\1\2\u01dd\u01df\3\2\2\2\u01de\u01cd\3\2\2\2\u01de\u01d2\3\2"+
		"\2\2\u01de\u01d5\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01db\3\2\2\2\u01df"+
		"G\3\2\2\2\u01e0\u01e1\b%\1\2\u01e1\u01e2\5N(\2\u01e2\u01ee\7\r\2\2\u01e3"+
		"\u01e4\5,\27\2\u01e4\u01eb\b%\1\2\u01e5\u01e6\7\20\2\2\u01e6\u01e7\5,"+
		"\27\2\u01e7\u01e8\b%\1\2\u01e8\u01ea\3\2\2\2\u01e9\u01e5\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01e3\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\7\16\2\2\u01f1\u01f2\b%\1\2\u01f2I\3\2\2\2"+
		"\u01f3\u01f4\5L\'\2\u01f4\u01f5\b&\1\2\u01f5\u0201\3\2\2\2\u01f6\u01f7"+
		"\7\13\2\2\u01f7\u01f8\b&\1\2\u01f8\u0201\b&\1\2\u01f9\u01fa\7\f\2\2\u01fa"+
		"\u01fb\b&\1\2\u01fb\u0201\b&\1\2\u01fc\u01fd\7!\2\2\u01fd\u01fe\5L\'\2"+
		"\u01fe\u01ff\b&\1\2\u01ff\u0201\3\2\2\2\u0200\u01f3\3\2\2\2\u0200\u01f6"+
		"\3\2\2\2\u0200\u01f9\3\2\2\2\u0200\u01fc\3\2\2\2\u0201K\3\2\2\2\u0202"+
		"\u0203\7+\2\2\u0203\u0204\b\'\1\2\u0204\u0209\b\'\1\2\u0205\u0206\7,\2"+
		"\2\u0206\u0207\b\'\1\2\u0207\u0209\b\'\1\2\u0208\u0202\3\2\2\2\u0208\u0205"+
		"\3\2\2\2\u0209M\3\2\2\2\u020a\u020b\7)\2\2\u020b\u020c\b(\1\2\u020cO\3"+
		"\2\2\2\u020d\u020e\7*\2\2\u020e\u020f\b)\1\2\u020fQ\3\2\2\2\u0210\u0211"+
		"\7\4\2\2\u0211\u0217\b*\1\2\u0212\u0213\7\5\2\2\u0213\u0217\b*\1\2\u0214"+
		"\u0215\7\6\2\2\u0215\u0217\b*\1\2\u0216\u0210\3\2\2\2\u0216\u0212\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217S\3\2\2\2&Zloz\u008b\u00a6\u00b7\u00bf\u00c8"+
		"\u00d5\u00e5\u00ee\u00f2\u0104\u010c\u0126\u0139\u0150\u0160\u016d\u0177"+
		"\u017f\u018d\u0195\u019f\u01a7\u01b3\u01bb\u01c6\u01cb\u01de\u01eb\u01ee"+
		"\u0200\u0208\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}