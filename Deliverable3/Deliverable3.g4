// Partial parser for Python
// grammar that supports arithmetic and assignment operators,
// if/elif/else blocks, conditional statements,
// while and for loops, nested structures, and comments

grammar Deliverable3;

program
    : (controlStructure | variable | COMMENT)* EOF
    ;

// LEXER RULES --------------------------------------------------------->

// Keywords
IF      : 'if';
ELSE_IF : 'elif';
ELSE    : 'else';
WHILE : 'while';
FOR   : 'for';
LOGIC_NOT  : 'not';
LOGIC_AND  : 'and';
LOGIC_OR   : 'or';
BOOLEAN : 'True' | 'False';
RANGE : 'range' ;

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

LITERAL
    : STRING
    | CHAR
    | NUMBER
    | BOOLEAN
    ;

CHAR
    : '\'' . '\''
    ;

ARRAY
    : '[' WS* (LITERAL (WS* ',' WS* LITERAL)*) WS* ']'
    ;

STRING
    : '"' ~( '\r' | '\n' )* '"'
    ;

NUMBER
    : INT | FLOAT
    ;

INT
    : '-'? [0-9]+
    ;

FLOAT
    : '-'? [0-9]+'.'[0-9]*
    ;

COMPOUND
    : ('*' | '/' | '%' | '+' | '-')
    ;

COMMENT
    : '#' ~( '\r' | '\n' )* NEWLINE+
    | '\'\'\'' .*? '\'\'\'' NEWLINE+ 
    ;

INDENT
    : '\t'+
    ;

WS
    : ('\t'|' ')+
    ;

NEWLINE
    : [\r\n]+
    ;

LEFT_PARENTH
    : '('
    ;

RIGHT_PARENTH
    : ')'
    ;

// specifies the outline for the range() function
RANGEFUNC
    : RANGE LEFT_PARENTH WS* (ID | NUMBER) WS* ',' WS* (ID | INT) WS* RIGHT_PARENTH
    ;

// PARSER RULES --------------------------------------------------------->

comparisonOperator
    : '<'
    | '>'
    | '<='
    | '>='
    | '=='
    | '!='
    ;

controlStructure
    : ( ( (IF | ELSE_IF) WS* logicalExpression )
      | ELSE
      | WHILE WS* logicalExpression
      | FOR WS* ID WS* 'in' WS* (ID | RANGEFUNC)
      ) 
      ':' NEWLINE 
      ( INDENT block | INDENT controlStructure)+
    ;

block
    : (variable | controlStructure | NEWLINE*)
    ;

variable
    : ID WS* (assignmentExpression | arithmeticExpression)? NEWLINE*
    ;

// specific expression types

logicalExpression
    : ( ( LEFT_PARENTH logicalExpression RIGHT_PARENTH )
      | ( LOGIC_NOT* WS* (variable | LITERAL | BOOLEAN) )
      ) 
      WS* 
      ( (comparisonOperator logicalExpression) 
      | (LOGIC_AND | LOGIC_OR) WS* logicalExpression WS*
      )?
    ;

arithmeticExpression
    : (LITERAL | variable) 
      (WS* COMPOUND '='? WS* (LITERAL | variable))*
    ;

assignmentExpression
    : COMPOUND? '=' WS* 
      (variable | LITERAL | arithmeticExpression | ARRAY | BOOLEAN) 
      assignmentExpression? 
      NEWLINE*
    ;