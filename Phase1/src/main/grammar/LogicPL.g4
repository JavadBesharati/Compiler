// Possible propositions:
// assignment -                                 done
// variable declaration -                       done
// predicate declaration -                      done
// implication declaration -                    done
// return in functions -                        done
// print                                        done
// (for example: query or variable value)       //
// function declaration -                       done
// array declaration -                          done
// array elements edition -                     done
// types declaration (int, float, boolean) -    done
// function call -                              done
// for loop strcuture -                         done
// queries                                      done
// print pre-order
// print post-order
// print parse tree

// Question: What do we have in "q" expression of implications(implication: (p) => (q))?
//           Just predications or all expressions are possible?

grammar LogicPL;
// grammar rules:
logicPL
    :
        (function_declaration)* main_call EOF
    ;
main_call
    :
        MAIN '{' main_body '}'
    ;
main_body
    :
        (line)*
    ;
line
    :
        ((array_declaration | int_declaration | float_declaration | boolean_declaration
            | function_return | or_expression | function_return | print_expression) SEMICOLON
            | for_structure | predicate_expression | implication_expression)
    ;
for_structure
    :
        FOR '(' IDENTIFIER ':' IDENTIFIER ')' '{' for_body '}'
    ;
for_body
    :
        (line)*
    ;
function_declaration
    :
        FUNCTION IDENTIFIER '(' (argument (COMMA argument)*) ')' ':' (INT_TYPE | FLOAT_TYPE | BOOLEAN_TYPE)
        '{' line* '}'
    ;
array_declaration
    :
        //     INT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
        // |   INT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER ASSIGNMENT_OP
        //     '[' primary_expression (COMMA primary_expression)* ']'
        // |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
        // |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER ASSIGNMENT_OP
        //     '[' primary_expression (COMMA primary_expression)* ']'
        // |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
        // |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER ASSIGNMENT_OP
        //     '[' primary_expression (COMMA primary_expression)* ']'
            INT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
        |   INT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER ASSIGNMENT_OP array_elements
        |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
        |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER ASSIGNMENT_OP array_elements
        |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
        |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER ASSIGNMENT_OP array_elements
    ;
array_elements
    :
        '[' primary_expression (COMMA primary_expression)* ']'
    ;
argument
    :
        ((INT_TYPE | FLOAT_TYPE | BOOLEAN_TYPE) IDENTIFIER) | QUERY_1
    ;
int_declaration
    :
        INT_TYPE IDENTIFIER ASSIGNMENT_OP additive_expression
    ;
float_declaration
    :
        FLOAT_TYPE IDENTIFIER ASSIGNMENT_OP additive_expression
    ;
boolean_declaration
    :
        BOOLEAN_TYPE IDENTIFIER ASSIGNMENT_OP or_expression
    ;
function_call
    :
        IDENTIFIER '(' or_expression (COMMA or_expression)* ')'
    ;
function_return
    :
        RETURN or_expression
    ;
print_expression
    :
        PRINT '(' ( (or_expression) (COMMA (or_expression))* ) ')'
    ;
or_expression
    :
        and_expression (LOGICAL_OR_OP and_expression)*
    ;
and_expression
    :
        equality_expression (LOGICAL_AND_OP equality_expression)*
    ;
equality_expression
    :
        relational_expression ((RELATIONAL_OP2 | ASSIGNMENT_OP) relational_expression)*
    ;
relational_expression
    :
        additive_expression (RELATIONAL_OP1 additive_expression)*
    ;
additive_expression
    :
    multiplicative_expression (BINARY_ARITHMETIC_OP2 multiplicative_expression)*
    ;
multiplicative_expression
    :
        not_expression (BINARY_ARITHMETIC_OP1 not_expression)*
    ;
not_expression
    :
        LOGICAL_NOT_OP not_expression
    |   primary_expression
    ;
primary_expression
    :
        IDENTIFIER
    |   (NATURAL_NUMBERS | '0') // same as int
    |   FLOAT
    |   BOOLEAN
    |   function_call
    |   '(' or_expression ')'
    |   IDENTIFIER '[' (NATURAL_NUMBERS | additive_expression) ']' // to edit array elements
    |   QUERY_1
    |   array_elements
    |   QUERY_2
    ;
predicate_expression
    :
        PRIDICATE '(' IDENTIFIER ')' SEMICOLON
    ;
implication_expression
    :
        // if q be just predications:
        // '(' or_expression ')' '=>' '(' (predicate_expression)+ ')'
        // if q be all expressions:
        // '(' (or_expression | (QUERY_2 RELATIONAL_OP2 array_elements))')' '=>' '(' (line)+ ')'
        '(' or_expression ')' '=>' '(' (line)+ ')'
    ;
// tokens:
MAIN
    :
        'main'
    ;
INT_TYPE
    :
        'int'
    ;
FLOAT_TYPE
    :
        'float'
    ;
BOOLEAN_TYPE
    :
        'boolean'
    ;
BOOLEAN
    :
        'true' | 'false'
    ;
FUNCTION
    :
        'function'
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
    FUNCTION | MAIN | INT_TYPE | FLOAT_TYPE | BOOLEAN_TYPE | BOOLEAN | PRINT | FOR | RETURN
    ;
NATURAL_NUMBERS
    :
        [1-9][0-9]*
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
LOGICAL_NOT_OP
    :
        '!'
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
        LOGICAL_NOT_OP | BINARY_ARITHMETIC_OP1 | BINARY_ARITHMETIC_OP2 | RELATIONAL_OP1
        | RELATIONAL_OP2 | LOGICAL_AND_OP | LOGICAL_OR_OP | ASSIGNMENT_OP
    ;
COMMA
    :
        ','
    ;
SEMICOLON
    :
        ';'
    ;
FLOAT
    :
        [0-9]+[.][0-9]+
    ;
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