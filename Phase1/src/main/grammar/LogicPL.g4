grammar LogicPL;

logicPL
    :
        (function)* main EOF
    ;

main
    :
        MAIN '{' (line)* '}'
    ;
line
    :
        variable_declare | return
        // retun
        //anything that end  with ;  or  implication
        //add some rule ...
    ;
function
    :
        //edit ... daneshvar
        // check if we can have void func.
        // retun ham check she
        FUNCTION IDENTIFIER  '(' (argument) ')' ':' TYPE '{' (line)* '}'
    ;
argument
    :
        // edit  type name,
        // (Type Identifier)(, type id)*
        //{ System.out.println(); }
    ;
variable_declare
    :
        // ADD ARRAY...
        //PRINT OUT
        TYPE IDENTIFIER ASSIGNMENT_OP VALUE SEMICOLON
    ;
return
    :
        //EDIT ...
        RETURN //{ system.out.println("Return"); }
    ;
print
    :
        // EDIT...
        PRINT //{ system.out.println("Built-in: print"); }
    ;
functionCall
    :
        //EDIT...
    ;
for
    :
        //edit ...
        FOR //{ system.out.println("Loop: for"); }
    ;
predicate
    :
        PRIDICATE //{ system.out.println("Predicare: "); }
    ;

implication
    :
        //WE CAN HAVE FUNCTIONCALL
    ;


// Tokens:
// Keywords:
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

// Numbers:

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

VALUE
    :
        INT | FLOAT | BOOLEAN
    ;
ARRAY_TYPE
    :
        TYPE '[' NATURAL_NUMBERS ']' ' ' IDENTIFIER
    ;
ARRAY_VALUE
    :
        '[' VALUE (',' VALUE)* ']'
    ;
ARRAY_ELEMENT
    :
       IDENTIFIER '[' NATURAL_NUMBERS ']'
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