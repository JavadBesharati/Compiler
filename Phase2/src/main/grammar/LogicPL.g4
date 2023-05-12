grammar LogicPL;

@header{
import ast.node.*;
import ast.node.expression.*;
import ast.node.statement.*;
import ast.node.declaration.*;
import ast.node.expression.values.*;
import ast.node.expression.operators.*;
import ast.type.primitiveType.*;
import ast.type.*;
}

// comment

program returns[Program p]:
    {$p = new Program(); $p.setLine(0);}
    (f = functionDec {$p.addFunc($f.functionDeclaration);})*
    main = mainBlock {$p.setMain($main.main) ;}
    ;

functionDec returns[FuncDeclaration functionDeclaration]:
    {ArrayList<ArgDeclaration> args = new ArrayList<>();
    ArrayList<Statement> statements = new ArrayList<>();}

    FUNCTION name = identifier
    LPAR (arg1 = functionVarDec {args.add($arg1.argDeclaration);} (COMMA arg = functionVarDec {args.add($arg.argDeclaration);})*)? RPAR COLON returnType = type
    LBRACE ((stmt = statement {statements.add($stmt.statement_);})+) RBRACE
    {$functionDeclaration = new FuncDeclaration($name.identifier_, $returnType.type_, args, statements);
    $functionDeclaration.setLine($name.identifier_.getLine());}
    ;

functionVarDec returns [ArgDeclaration argDeclaration]:
    t = type arg_iden = identifier
    {$argDeclaration = new ArgDeclaration($arg_iden.identifier_, $t.type_);
    $argDeclaration.setLine($arg_iden.identifier_.getLine());}
    ;

mainBlock returns [MainDeclaration main]:
    {ArrayList<Statement> mainStmts = new ArrayList<>();}
    m = MAIN LBRACE (s = statement {mainStmts.add($s.statement_);})+ RBRACE
    {$main = new MainDeclaration(mainStmts); $main.setLine($m.getLine());}
    ;

statement returns [Statement statement_]:
    s1 = assignSmt {$statement_ = $s1.assignStmt_;}
    | (s2 = predicate SEMICOLON {$statement_ = $s2.predicate_;})
    | s3 = implication {$statement_ = $s3.implication_;}
    | s4 = returnSmt {$statement_ = $s4.return_;}
    | s5 = printSmt {$statement_ = $s5.PrintStmt_;}
    | s6 = forLoop {$statement_ = $s6.for_;}
    | s7 = localVarDeclaration {$statement_ = $s7.localvarDec_;}
    ;

assignSmt returns [AssignStmt assignStmt_]:
    lv = variable line = ASSIGN rv = expression SEMICOLON
    {$assignStmt_ = new AssignStmt($lv.v,  $rv.exp_); $assignStmt_.setLine($line.getLine());}
    ;

variable returns [Variable v]:
    i = identifier {$v = $i.identifier_;}
    | name = identifier LBRACKET exp = expression RBRACKET
    {$v = new ArrayAccess($name.identifier_.getName(), $exp.exp_); $v.setLine($name.identifier_.getLine()); }
    ;

localVarDeclaration returns [Statement localvarDec_]:
    s1 = varDeclaration {$localvarDec_ = $s1.varDec_;}
    | s2 = arrayDeclaration {$localvarDec_ = $s2.arrayDec_;}
    ;

varDeclaration returns [VarDecStmt varDec_]:
    t = type var_iden = identifier
    {$varDec_ = new VarDecStmt($var_iden.identifier_, $t.type_);
    $varDec_.setLine($var_iden.identifier_.getLine());}
    (ASSIGN exp_ = expression {$varDec_.setInitialExpression($exp_.exp_);} )? SEMICOLON
    ;

arrayDeclaration returns [ArrayDecStmt arrayDec_]:
    t = type LBRACKET INT_NUMBER RBRACKET var_iden = identifier
    {$arrayDec_ = new ArrayDecStmt($var_iden.identifier_, $t.type_, $INT_NUMBER.int);
    $arrayDec_.setLine($var_iden.identifier_.getLine());}
    (arrInit = arrayInitialValue {$arrayDec_.setInitialValues($arrInit.initialValues);})? SEMICOLON
    ;

arrayInitialValue returns [ArrayList<Expression> initialValues]:
    ASSIGN arrList = arrayList {$initialValues = $arrList.values;}
    ;

arrayList returns [ArrayList<Expression> values]:
    {$values = new ArrayList<Expression>();}
    LBRACKET (v = value {$values.add($v.value_);}
    | id = identifier {$values.add($id.identifier_);}) (COMMA (v2 = value {$values.add($v2.value_);}
    | id2 = identifier {$values.add($id.identifier_);}))* RBRACKET
    ;

printSmt returns [PrintStmt PrintStmt_]:
    p = PRINT LPAR arg = printExpr RPAR SEMICOLON
    {$PrintStmt_ = new PrintStmt($arg.printExpr_);
    $PrintStmt_.setLine($p.getLine());}
    ;

printExpr returns [Expression printExpr_]:
    var = variable {$printExpr_ = $var.v;}
    | q = query {$printExpr_ = $q.query_;}
    ;

query returns [QueryExpression query_]:
    q1 = queryType1 {$query_ = $q1.query1_;}
    | q2 = queryType2 {$query_ = $q2.query2_;}
    ;

queryType1 returns [QueryExpression query1_]:
    LBRACKET line = QUARYMARK id = predicateIdentifier LPAR var = variable RPAR RBRACKET
    {$query1_ = new QueryExpression($id.predicateIdentifier_);
    $query1_.setLine($line.getLine()); $query1_.setVar($var.v);}
    ;

queryType2 returns [QueryExpression query2_]:
    LBRACKET id = predicateIdentifier LPAR line = QUARYMARK RPAR RBRACKET
    {$query2_ = new QueryExpression($id.predicateIdentifier_);
    $query2_.setLine($line.getLine()); }
    ;

returnSmt returns [ReturnStmt return_]:
    RETURN (v = value {$return_ = new ReturnStmt($v.value_);}
    | iden = identifier {$return_ = new ReturnStmt($iden.identifier_);})? SEMICOLON
    {if($return_ == null){$return_ = new ReturnStmt(null);}}
    {$return_.setLine($RETURN.getLine());}
    ;

forLoop returns [ForloopStmt for_]:
    {ArrayList<Statement> bodyStmts = new ArrayList<>();}
    line = FOR LPAR iterator = identifier COLON arrayName = identifier RPAR
    LBRACE ((stmt =statement {bodyStmts.add($stmt.statement_);})*) RBRACE
    {$for_ = new ForloopStmt($iterator.identifier_, $arrayName.identifier_, bodyStmts);
    $for_.setLine($line.getLine());}
    ;

predicate returns [PredicateStmt predicate_]:
    id = predicateIdentifier LPAR v = variable RPAR
    {$predicate_ = new PredicateStmt($id.predicateIdentifier_, $v.v);
    $predicate_.setLine($id.predicateIdentifier_.getLine());}
    ;


implication returns [ImplicationStmt implication_]:
    {ArrayList<Statement> results_arr = new ArrayList<Statement>();}
    LPAR exp_ = expression RPAR a = ARROW LPAR ((s = statement {results_arr.add($s.statement_);})+) RPAR
    {$implication_ = new ImplicationStmt($exp_.exp_, results_arr); $implication_.setLine($a.getLine());}
    ;

expression returns [Expression exp_]:
    l = andExpr r = expression2
    {if($r.exp_ != null) {$exp_ = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $exp_.setLine($r.exp_.getLine());} else {$exp_ = $l.exp_;}}
    ;

expression2 returns [BinaryExpression exp_] locals [BinaryExpression ee]:
    OR l = andExpr r = expression2
    {if($r.exp_ != null) {$ee = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $ee.setLine($r.exp_.getLine()); $exp_ = new BinaryExpression(null, $ee, BinaryOperator.or);} else{$exp_ = new BinaryExpression(null, $l.exp_, BinaryOperator.or);}}
    {$exp_.setLine($OR.getLine());}
    |
    {$exp_ = null;}
    ;

andExpr returns [Expression exp_]:
    l = eqExpr r = andExpr2
    {if($r.exp_ != null) {$exp_ = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $exp_.setLine($r.exp_.getLine());} else {$exp_ = $l.exp_;}}
    ;

andExpr2 returns [BinaryExpression exp_] locals [BinaryExpression ee]:
    AND l = eqExpr r = andExpr2
    {if($r.exp_ != null) {$ee = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $ee.setLine($r.exp_.getLine());
    $exp_ = new BinaryExpression(null, $ee, BinaryOperator.and);} else{$exp_ = new BinaryExpression(null, $l.exp_, BinaryOperator.and);}}
    {$exp_.setLine($AND.getLine());}
    |
    {$exp_ = null;}
    ;

eqExpr returns [Expression exp_]:
    l = compExpr r = eqExpr2
    {if($r.exp_ != null) {$exp_ = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $exp_.setLine($r.exp_.getLine());} else {$exp_ = $l.exp_;}}
    ;

eqExpr2 returns [BinaryExpression exp_] locals [BinaryOperator opt, BinaryExpression ee]:
    (op = EQ {$opt = BinaryOperator.eq;}| op = NEQ {$opt = BinaryOperator.neq;}) l = compExpr r = eqExpr2
    {if($r.exp_ != null) {$ee = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $ee.setLine($r.exp_.getLine()); $exp_ = new BinaryExpression(null, $ee, $opt);} else{$exp_ = new BinaryExpression(null, $l.exp_, $opt);}}
    {$exp_.setLine($op.getLine());}
    |
    {$exp_ = null;}
    ;

compExpr returns [Expression exp_]:
    l = additive r = compExpr2
    {if($r.exp_ != null) {$exp_ = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $exp_.setLine($r.exp_.getLine());} else {$exp_ = $l.exp_;}}
    ;

compExpr2 returns [BinaryExpression exp_] locals [BinaryOperator opt, BinaryExpression ee]:
    (op = LT {$opt = BinaryOperator.lt;}
    | op = LTE {$opt = BinaryOperator.lte;}
    | op = GT {$opt = BinaryOperator.gt;}
    | op = GTE{$opt = BinaryOperator.gte;}) l = additive r = compExpr2
    {if($r.exp_ != null) {$ee = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $ee.setLine($r.exp_.getLine()); $exp_ = new BinaryExpression(null, $ee, $opt);} else{$exp_ = new BinaryExpression(null, $l.exp_, $opt);}}
    {$exp_.setLine($op.getLine());}
    |
    {$exp_ = null;}
    ;

additive returns [Expression exp_]:
    l = multicative r = additive2
    {if($r.exp_ != null) {$exp_ = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $exp_.setLine($r.exp_.getLine());} else {$exp_ = $l.exp_;}}
    ;

additive2 returns [BinaryExpression exp_] locals [BinaryOperator opt, BinaryExpression ee]:
    (op = PLUS {$opt = BinaryOperator.add;}
    | op = MINUS {$opt = BinaryOperator.sub;}) l = multicative r = additive2
    {if($r.exp_ != null) {$ee = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $ee.setLine($r.exp_.getLine()); $exp_ = new BinaryExpression(null, $ee, $opt);} else{$exp_ = new BinaryExpression(null, $l.exp_, $opt);}}
    {$exp_.setLine($op.getLine());}
    |
    {$exp_ = null;}
    ;

multicative returns [Expression exp_]:
    l =  unary r = multicative2
    {if($r.exp_ != null) {$exp_ = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $exp_.setLine($r.exp_.getLine());} else {$exp_ = $l.exp_;}}
    ;

multicative2 returns [BinaryExpression exp_] locals [BinaryOperator opt, BinaryExpression ee]:
    (op = MULT {$opt = BinaryOperator.mult;}
    | op = MOD {$opt = BinaryOperator.mod;}
    | op = DIV {$opt = BinaryOperator.div;}) l = unary r = multicative2
    {if($r.exp_ != null) {$ee = new BinaryExpression($l.exp_, $r.exp_.getRight(), $r.exp_.getBinaryOperator());
    $ee.setLine($r.exp_.getLine()); $exp_ = new BinaryExpression(null, $ee, $opt);} else{$exp_ = new BinaryExpression(null, $l.exp_, $opt);}}
    {$exp_.setLine($op.getLine());}
    |
    {$exp_ = null;}
    ;

unary returns [Expression exp_] locals [UnaryOperator opt]:
    otherRet = other {$exp_ = $otherRet.exp_;}
    | (op = PLUS {$opt = UnaryOperator.plus;}
    | op = MINUS {$opt = UnaryOperator.minus;}
    | op = NOT {$opt = UnaryOperator.not;}) expr = other
    {$exp_ = new UnaryExpression($opt, $expr.exp_); $exp_.setLine($op.getLine());}
    ;


other returns [Expression exp_]:
    LPAR expr = expression RPAR {$exp_ = $expr.exp_;}
    | var = variable {$exp_ = $var.v;}
    | val = value {$exp_ = $val.value_;}
    | q1 = queryType1 {$exp_ = $q1.query1_;}
    | funcCall = functionCall {$exp_ = $funcCall.functionCall_;}
    ;

functionCall returns [FunctionCall functionCall_]:
    {ArrayList<Expression> args = new ArrayList<Expression>();}
    func_name = identifier LPAR (essential_arg = expression {args.add($essential_arg.exp_);} (COMMA additional_arg = expression {args.add($additional_arg.exp_);})*)? RPAR
    {$functionCall_ = new FunctionCall(args, $func_name.identifier_); $functionCall_.setLine($func_name.identifier_.getLine());}

    ;

value returns [Value value_]:
    pv = numericValue {$value_ = $pv.val_;}
    | t = TRUE {$value_ = new BooleanValue(true);} {$value_.setLine($t.getLine());}
    | f = FALSE {$value_ = new BooleanValue(false);} {$value_.setLine($f.getLine());}
    | MINUS mv = numericValue {$mv.val_.negateConstant(); $value_ = $mv.val_;}
    ;

numericValue returns [Value val_]:
    i = INT_NUMBER {$val_ = new IntValue($i.int);}
    {$val_.setLine($i.getLine());}
    | f = FLOAT_NUMBER {$val_ = new FloatValue(Float.parseFloat($f.text));}
    {$val_.setLine($f.getLine());}
    ;

identifier returns [Identifier identifier_]:
    id = IDENTIFIER {$identifier_ = new Identifier($id.text); $identifier_.setLine($id.getLine());}
    ;

predicateIdentifier returns [Identifier predicateIdentifier_]:
    predicate_id = PREDICATE_IDENTIFIER
	{$predicateIdentifier_ = new Identifier($predicate_id.text);
	 $predicateIdentifier_.setLine($predicate_id.getLine());}
    ;

type returns [Type type_]:
    BOOLEAN {$type_ = new BooleanType();}
    | INT {$type_ = new IntType();}
    | FLOAT {$type_ = new FloatType();}
    ;




FUNCTION : 'function';
BOOLEAN : 'boolean';
INT : 'int';
FLOAT: 'float';
MAIN: 'main';
PRINT: 'print';
RETURN: 'return';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';

LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
ASSIGN: '=';
LBRACKET: '[';
RBRACKET: ']';
QUARYMARK: '?';
ARROW: '=>';
OR: '||';
AND: '&&';
EQ: '==';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NEQ: '!=';
NOT: '!';


WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

IDENTIFIER : [a-z][a-zA-Z0-9_]* ;
PREDICATE_IDENTIFIER : [A-Z][a-zA-Z0-9]* ;
INT_NUMBER : [0-9]+;
FLOAT_NUMBER: ([0-9]*[.])?[0-9]+;
