
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
            | or_expression | function_return | print_expression) SEMICOLON
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
           '[' (IDENTIFIER | NATURAL_NUMBERS | '0' | FLOAT | BOOLEAN)
           (COMMA (IDENTIFIER | NATURAL_NUMBERS | '0' | FLOAT | BOOLEAN))* ']'
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
        ASSIGNMENT_OP or_expression
       // { System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
    ;
float_declaration
    :
        FLOAT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   FLOAT_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        //ASSIGNMENT_OP additive_expression
        ASSIGNMENT_OP or_expression
        //{ System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
    ;
boolean_declaration
    :
        BOOLEAN_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
    |   BOOLEAN_TYPE IDENTIFIER { System.out.println("VarDec: " + $IDENTIFIER.getText()); }
        ASSIGNMENT_OP or_expression
        //{ System.out.println("Operator: " + $ASSIGNMENT_OP.getText()); }
    ;
function_call
    :
        IDENTIFIER '(' or_expression (COMMA or_expression)* ')'
        | IDENTIFIER '(' ')'
    ;
function_return
    :
        RETURN { System.out.println("Return"); }
        (NATURAL_NUMBERS | '0' | FLOAT | BOOLEAN) // UNARY????????????????????
        | RETURN { System.out.println("Return"); }
       //or_expression
    ;
print_expression
    :
        PRINT { System.out.println("Built-in: print"); }
        '(' ( (or_expression) (COMMA (or_expression))* ) ')'
    ;
or_expression
    :
        and_expression (LOGICAL_OR_OP and_expression
        {System.out.println("Operator: " + $LOGICAL_OR_OP.getText());})*
    ;
and_expression
    :
        equality_expression (LOGICAL_AND_OP equality_expression
        {System.out.println("Operator: " + $LOGICAL_AND_OP.getText());})*
    ;
equality_expression
    :
        relational_expression ((RELATIONAL_OP2 relational_expression
        {System.out.println("Operator: " + $RELATIONAL_OP2.getText());})*
        | (ASSIGNMENT_OP relational_expression)*)
        //{System.out.println("Operator: " + $ASSIGNMENT_OP.getText());})*)
    ;
relational_expression
    :
        additive_expression (RELATIONAL_OP1 additive_expression
         {System.out.println("Operator: " + $RELATIONAL_OP1.getText());})*

    ;
additive_expression
    :
    multiplicative_expression (BINARY_ARITHMETIC_OP2 multiplicative_expression
    {System.out.println("Operator: " + $BINARY_ARITHMETIC_OP2.getText());})*
    ;
multiplicative_expression
    :
        not_expression (BINARY_ARITHMETIC_OP1 not_expression
        {System.out.println("Operator: " + $BINARY_ARITHMETIC_OP1.getText());})*
    ;
not_expression
    :
        LOGICAL_NOT_OP not_expression
        {System.out.println("Operator: " + $LOGICAL_NOT_OP.getText());}
      |   primary_expression
    ;
primary_expression
    :
        IDENTIFIER
    |   (NATURAL_NUMBERS | '0') // same as int
    |   FLOAT
    |   BOOLEAN
    |   '(' or_expression ')'
    |   IDENTIFIER '[' (NATURAL_NUMBERS | additive_expression) ']' // to edit array elements
    |   query_1
    |   query_2
    |   array_elements
    |   function_call
    ;
predicate_expression
    :
        PRIDICATE
        {System.out.println("Predicate: " + $PRIDICATE.getText());}
        '(' IDENTIFIER ')' SEMICOLON
    ;
query_1
    :
        '[' '?' PRIDICATE
        {System.out.println("Predicate: " + $PRIDICATE.getText());}
        '(' IDENTIFIER ')' ']' // UNARY????????????????????

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