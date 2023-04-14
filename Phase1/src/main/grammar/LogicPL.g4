// Group : 7
// Fatemeh Mohammadi                            810199489
// Mohammad Javad Besharati                     810199386

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
        ((( function_call )
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
        |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        |   FLOAT_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
            ASSIGNMENT_OP array_elements
        |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        |   BOOLEAN_TYPE '[' NATURAL_NUMBERS ']' IDENTIFIER
            { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
            ASSIGNMENT_OP array_elements
    ;
array_elements
    :
        '[' (unary_value)
            (COMMA (unary_value))* ']'
    ;
argument
    :
        ((INT_TYPE | FLOAT_TYPE | BOOLEAN_TYPE) IDENTIFIER
        { System.out.println("ArgumentDec: " + $IDENTIFIER.getText()); } )
    ;
int_declaration
    :
        INT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   INT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        ASSIGNMENT_OP assign_expression

    ;
float_declaration
    :
        FLOAT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   FLOAT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        ASSIGNMENT_OP assign_expression
    ;
boolean_declaration
    :
        BOOLEAN_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   BOOLEAN_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        ASSIGNMENT_OP assign_expression
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
        (unary_value)
        | RETURN { System.out.println("Return"); }
    ;
print_expression
    :
        PRINT { System.out.println("Built-in: print"); }
        '(' ( (query_2 | query_1 | IDENTIFIER) (COMMA (query_1 | query_2 | IDENTIFIER))* ) ')'
    ;
assign_expression
    :
        or_expression assign_expression2
    ;
assign_expression2
    :
        OP = LOGICAL_OR_OP or_expression assign_expression2  {System.out.println("Operator: " + $OP.getText());}
        |
    ;
or_expression
    :
        and_expression or_expression2
    ;
or_expression2
    :
        OP = LOGICAL_AND_OP and_expression or_expression2  {System.out.println("Operator: " + $OP.getText());}
        |
    ;
and_expression
    :
        relational2_expression and_expression2
    ;
and_expression2
    :
        OP = RELATIONAL_OP2 relational2_expression and_expression2  {System.out.println("Operator: " + $OP.getText());}
        |
    ;
relational2_expression
    :
        relational1_expression relational2_expression2
    ;
relational2_expression2
    :
        OP = RELATIONAL_OP1 relational1_expression relational2_expression2  {System.out.println("Operator: " + $OP.getText());}
        |
    ;
relational1_expression
    :
        arithmatic2_expression relational1_expression2
    ;
relational1_expression2
    :
        OP = (PLUS | MINUS) arithmatic2_expression relational1_expression2 {System.out.println("Operator: " + $OP.getText());}
        |
    ;
arithmatic2_expression
    :
        arithmatic1_expression arithmatic2_expression2
    ;
arithmatic2_expression2
    :
        OP = MUL_DIV_MOD arithmatic1_expression arithmatic2_expression2  {System.out.println("Operator: " + $OP.getText());}
        |
    ;
arithmatic1_expression
    :
        OP = (PLUS | MINUS | LOGICAL_NOT) primary_expression  {System.out.println("Operator: " + $OP.getText());}
        | primary_expression
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
        '(' assign_expression')' ']'

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
//unary_value type 1 -> can handle -(-(+1))
/*unary_value
    :
        OP = (PLUS | MINUS | LOGICAL_NOT)  (NATURAL_NUMBERS | '0' | FLOAT | BOOLEAN)
         {System.out.println("Operator: " + $OP.getText());}
        | OP = (PLUS | MINUS | LOGICAL_NOT) '(' unary_value ')'
         {System.out.println("Operator: " + $OP.getText());}
    ; */
//unary_value type 2-> only const value and identifier!
unary_value
    :
        OP = (PLUS | MINUS)  (NATURAL_NUMBERS | '0' | FLOAT)
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