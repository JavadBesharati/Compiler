grammar LogicPL;

// SKIP COMMA AND SEMICOLON AND .....

logicPL
    :
        (function_declare)* main_call EOF
    ;

main_call
    :
        MAIN '{' (line)* '}'
    ;
/*body
    :
        (line* return line*)
    ;*/
line
    :
        ((variable_declare | predicate_statement | return) SEMICOLON) | implication_statement
        // retun
        //anything that end  with ;  or  implication
        //add some rule ...
    ;
function_declare
    :
        //edit ... daneshvar
        // check if we can have void func.
        // retun ham check she
        FUNCTION IDENTIFIER  '(' (arguments) ')' ':' TYPE '{' (line)* '}'
    ;
argument
    :
        TYPE IDENTIFIER
    ;
arguments
    :
        // edit  ...
       (argument (COMMA argument)*)
        //{ System.out.println(); }
    ;
variable_declare
    :
        // ADD ARRAY...SEMICOLON
        //PRINT OUT
        (TYPE IDENTIFIER ASSIGNMENT_OP (function_call | VALUE | IDENTIFIER ) )
    ;
return
    :
        //EDIT ...SEMICOLON
        RETURN (VALUE | IDENTIFIER | function_call)
        //{ system.out.println("Return"); }
    ;
print_call
    :
        // EDIT...
        PRINT //{ system.out.println("Built-in: print"); }
    ;
inputs
    :
        (VALUE | IDENTIFIER | function_call) (COMMA (VALUE | IDENTIFIER | function_call))*
    ;
function_call
    :
        IDENTIFIER '(' inputs ')'
    ;
for
    :
        //edit ...
        FOR //{ system.out.println("Loop: for"); }
    ;
predicate_statement
    :
        // SEMICOLON
        PRIDICATE '(' IDENTIFIER ')'
        //{ system.out.println("Predicare: "); }
    ;

implication_statement
    :
        //WE CAN HAVE FUNCTIONCALL
    ;


// Tokens:
// Keywords and Datas:
VALUE
    :
        INT | FLOAT | BOOLEAN
    ;
FLOAT
    :
        [0-9]*[.][0-9]+
    ;
INT
    :
        [1-9][0-9]* | '0'
    ;
NATURAL_NUMBERS
    :
        [1-9][0-9]*
    ;
FUNCTION
    :
        'function'
    ;
MAIN
    :
        'main'
    ;
TYPE
    :
        'int' | 'float' | 'boolean'
    ;
BOOLEAN
    :
        'true' | 'false'
    ;
PRINT
    :
        'print'
    ;
FOR
    :
        'for'
    ;
RETURN
    :
        'return'
    ;
KEYWORDS
    :
        FUNCTION | MAIN | TYPE | BOOLEAN | PRINT | FOR | RETURN
    ;

IDENTIFIER
    :
        [a-z][a-zA-Z0-9_]*
    ;
PRIDICATE
    :
        [A-Z][a-zA-Z0-9_]*
    ;

QUERY_1
    :
        '[' '?' PRIDICATE '(' IDENTIFIER ')' ']'
    ;
QUERY_2
    :
        '[' PRIDICATE '(' '?' ')' ']'
    ;

//Operator:
UNARY_OP
    :
        '+' | '-' | '!'
    ;
BINARY_ARITHMETIC_OP1
    :
        '*' | '/' | '%'
    ;
BINARY_ARITHMETIC_OP2
    :
        '+' | '-'
    ;
RELATIONAL_OP1
    :
        '<' | '<=' | '>' | '>='
    ;
RELATIONAL_OP2
    :
        '==' | '!='
    ;
LOGICAL_AND_OP
    :
        '&&'
    ;
LOGICAL_OR_OP
    :
        '||'
    ;
ASSIGNMENT_OP
    :
        '='
    ;
OPERATORS
    :
        UNARY_OP | BINARY_ARITHMETIC_OP1 | BINARY_ARITHMETIC_OP2 | RELATIONAL_OP1
        | RELATIONAL_OP2 | LOGICAL_AND_OP | LOGICAL_OR_OP | ASSIGNMENT_OP
    ;


ARRAY_TYPE
    :
        TYPE '[' NATURAL_NUMBERS ']' ' ' IDENTIFIER
    ;
ARRAY_VALUE
    :
        '[' VALUE (COMMA VALUE)* ']'
    ;
ARRAY_ELEMENT
    :
       IDENTIFIER '[' NATURAL_NUMBERS ']'
    ;

COMMA
    :
        (',')
    ;

SEMICOLON
    :
        ';'
    ;

// WhiteSpaces:
WHITESPACE
    :
        (' ' | '\t')+ -> skip
    ;
NEWLINE
    :
        ('\r' '\n'? | '\n')-> skip
    ;
COMMENT
    :
        '#' ~[\r\n]*-> skip
    ;