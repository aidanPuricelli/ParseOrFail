grammar DeliverableOne;

// Parser rules
parse
 : statement* EOF
 ;

statement
 : assignment
 | arithmetic_operation
 | array_assignment
 | variable_declaration
 ;

assignment
 : ID ASSIGN expression
 | ID assignment_operator expression
 ;

arithmetic_operation
 : expression arithmetic_operator expression
 ;

array_assignment
 : ID ASSIGN '[' values ']'
 ;

variable_declaration
 : ID ASSIGN value
 ;

values
 : value (',' value)*
 ;

value
 : NUMBER
 | STRING
 | BOOLEAN
 | CHAR // Added rule for character literals
 | ID // This allows identifiers to be used as values
 ;

// Expressions
expression
 : value
 | '(' expression ')'
 | expression arithmetic_operator expression
 ;

// Lexer rules
ID                : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER            : INT | FLOAT;
INT               : [0-9]+;
FLOAT             : [0-9]+'.'[0-9]+;
STRING            : '"' .*? '"';
BOOLEAN           : 'True' | 'False';
CHAR              : '\'' . '\''; 

ASSIGN            : '=';
assignment_operator : '+=' | '-=' | '*=' | '/=';
arithmetic_operator: '+' | '-' | '*' | '/' | '%';

WS                : [ \t\r\n]+ -> skip;