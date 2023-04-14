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
// print pre-order                              done
// print post-order                             done

// Question: What do we have in "q" expression of implications(implication: (p) => (q))?
//           Just predications or all expressions are possible?
// little_changed

grammar LogicPL;
// grammar rules:
logicPL
    :
        (function_declaration)* main_call EOF
    ;
main_call
    :
        MAIN { System.out.println("MainBody"); }
        '{' main_body '}'
    ;
main_body
    :
        (line)*
    ;
line
    :
        (((/*{System.out.println("FunctionCall");}*/ function_call )
            | array_declaration | int_declaration | float_declaration | boolean_declaration
            | assign_expression | function_return | print_expression | chane_var) SEMICOLON
            | for_structure | predicate_expression | implication_expression)
    ;
for_structure
    :
        FOR
        {System.out.println("Loop: for");}
        '(' IDENTIFIER ':' IDENTIFIER ')' '{' for_body '}'
    ;
for_body
    :
        (line)*
    ;
function_declaration
    :
        FUNCTION IDENTIFIER { System.out.println("FunctionDec: " + $IDENTIFIER.getText()); }
        '(' (argument (COMMA argument)*) ')' ':' (INT_TYPE | FLOAT_TYPE | BOOLEAN_TYPE)
        '{' line* '}'
        | FUNCTION IDENTIFIER { System.out.println("FunctionDec: " + $IDENTIFIER.getText()); }
        '(' ')' ':' (INT_TYPE | FLOAT_TYPE | BOOLEAN_TYPE) '{' line* '}'
    ;
array_declaration
    :
            INT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        |   INT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
            ASSIGNMENT_OP array_elements
             //{ System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
        |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
            ASSIGNMENT_OP array_elements
           // { System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
        |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
            ASSIGNMENT_OP array_elements
            //{ System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }

    ;
array_elements
    :
           //'[' primary_expression (COMMA primary_expression)* ']'
           //'[' or_expression (COMMA or_expression)* ']'
        '[' (unary_value)
            (COMMA (unary_value))* ']'
           //---------------> UNARY?
    ;
argument
    :
        ((INT_TYPE | FLOAT_TYPE | BOOLEAN_TYPE) IDENTIFIER
        { System.out.println("ArgumentDec: " + $IDENTIFIER.getText()); } )
        //why? | QUERY_1
    ;
int_declaration
    :
        INT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   INT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        //ASSIGNMENT_OP additive_expression
        ASSIGNMENT_OP assign_expression
       // { System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
    ;
float_declaration
    :
        FLOAT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   FLOAT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        //ASSIGNMENT_OP additive_expression
        ASSIGNMENT_OP assign_expression
        //{ System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
    ;
boolean_declaration
    :
        BOOLEAN_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   BOOLEAN_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        ASSIGNMENT_OP assign_expression
        //{ System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
    ;
chane_var
    :
        IDENTIFIER ASSIGNMENT_OP assign_expression
    ;
function_call
    :
        IDENTIFIER '(' assign_expression (COMMA assign_expression)* ')'
        | IDENTIFIER '(' ')'
    ;
function_return
    :
        RETURN { System.out.println("Return"); }
        (unary_value) // UNARY????????????????????
        | RETURN { System.out.println("Return"); }
       //or_expression
    ;
print_expression
    :
        PRINT { System.out.println("Built-in: print"); }
        '(' ( (query_2 | query_1 | IDENTIFIER) (COMMA (query_1 | query_2 | IDENTIFIER))* ) ')'
    ;
assign_expression
    :
        or_exp assign_exp2
    ;
assign_exp2
    :
        LOGICAL_OR_OP or_exp assign_exp2 |
    ;
or_exp
    :
        and_exp or_exp2
    ;
or_exp2
    :
        LOGICAL_AND_OP and_exp or_exp2 |
    ;
and_exp
    :
        relational2_exp and_exp2
    ;
and_exp2
    :
        RELATIONAL_OP2 relational2_exp and_exp2 |
    ;
relational2_exp
    :
        relational1_exp relational2_exp2
    ;
relational2_exp2
    :
        RELATIONAL_OP1 relational1_exp relational2_exp2|
    ;
relational1_exp
    :
        arithmatic2_exp relational1_exp2
    ;
relational1_exp2
    :
        OP = (PLUS | MINUS) arithmatic2_exp relational1_exp2|
    ;
arithmatic2_exp
    :
        arithmatic1_exp arithmatic2_exp2
    ;
arithmatic2_exp2
    :
        MUL_DIV_MOD arithmatic1_exp arithmatic2_exp2 |
    ;
arithmatic1_exp
    :
        OP = (PLUS | MINUS | LOGICAL_NOT) primary_expression | primary_expression
    ;
primary_expression
    :
        IDENTIFIER '[' (NATURAL_NUMBERS | assign_expression) ']' // to edit array elements
    |   (NATURAL_NUMBERS | '0') // same as int
    |   FLOAT
    |   BOOLEAN
    |   '(' assign_expression ')'
    |   IDENTIFIER
    |   query_1
    |   query_2
    |   array_elements
    |   function_call
    ;
predicate_expression
    :
        PRIDICATE
        {System.out.println("Predicate: " + $PRIDICATE.getText());}
        '(' assign_expression')' SEMICOLON
    ;
query_1
    :
        '[' '?' PRIDICATE
        {System.out.println("Predicate: " + $PRIDICATE.getText());}
        '(' assign_expression')' ']' // UNARY????????????????????

    ;
query_2
    :
        '[' PRIDICATE
        {System.out.println("Predicate: " + $PRIDICATE.getText());}
        '(' '?' ')' ']'
    ;
implication_expression
    :
        // if q be just predications:
        // '(' or_expression ')' '=>' '(' (predicate_expression)+ ')'
        // if q be all expressions:
        // '(' (or_expression | (QUERY_2 RELATIONAL_OP2 array_elements))')' '=>' '(' (line)+ ')'
        { System.out.println("Implication"); }
        '(' assign_expression ')' '=>' '(' (line)+ ')'
    ;
/*unary_value
    :
        OP = (PLUS | MINUS | LOGICAL_NOT)  (NATURAL_NUMBERS | '0' | FLOAT | BOOLEAN)
         {System.out.println("Operator: " + $OP.getText());}
        | OP = (PLUS | MINUS | LOGICAL_NOT) '(' unary_value ')'
         {System.out.println("Operator: " + $OP.getText());}
    ; */
unary_value
    :
        OP = (PLUS | MINUS | LOGICAL_NOT)  (NATURAL_NUMBERS | '0' | FLOAT | BOOLEAN)
                 {System.out.println("Operator: " + $OP.getText());}
        | (IDENTIFIER | NATURAL_NUMBERS | '0' | FLOAT | BOOLEAN)
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
// LOGICAL_NOT_OP
//     :
//         '!'
//     ;
MUL_DIV_MOD
    :
        '*' | '/' | '%'
    ;
// UNARY_OPERATOR
//     :
//         '+' | '-' | '!'
//     ;
PLUS
    :
        '+'
    ;
MINUS
    :
        '-'
    ;
LOGICAL_NOT
    :
        '!'
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