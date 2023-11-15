grammar Deliverable2;

// Parser Rules
program
    : (NEWLINE)* (statement NEWLINE)* statement? EOF ;

statement
    : assignment
    | expr
    | ifStatement
    ;

assignment
    : ID (ASSIGN | compoundAssign) expr
    ;

expr
    : expr ('*' | '/' | '%' | '+' | '-') expr
    | expr comparisonOperator expr
    | booleanOperator expr
    | ID
    | NUMBER
    | STRING
    | CHAR
    | '[' elements ']'
    | '(' expr ')'
    | BOOLEAN
    ;

elements
    : expr (',' expr)*
    ;

ifStatement
    : 'if' expr ':' block (elifBlock)* (elseBlock)?
    ;

elifBlock
    : 'elif' expr ':' block
    ;

elseBlock
    : 'else' ':' block
    ;

block
    : (INDENT statement)+ DEDENT
    ;

compoundAssign
    : '+='
    | '-='
    | '*='
    | '/='
    ;

comparisonOperator
    : '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    ;

booleanOperator
    : 'and'
    | 'or'
    | 'not'
    ;

// Lexer Rules
ASSIGN : '=';

NUMBER
    : INT | FLOAT
    ;

INT
    : [0-9]+
    ;

FLOAT
    : [0-9]+'.'[0-9]*
    ;

STRING
    : '"' (ESC | ~["\\\r\n])* '"'
    | '\'' (ESC | ~['\\\r\n])* '\''
    ;

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NEWLINE
    : [\r\n]+
    ;

WS
    : [\t]+ -> skip
    ;

INDENT
    : [ \t]+ -> channel(HIDDEN)
    ;

DEDENT
    : [ \t]+ -> channel(HIDDEN)
    ;

fragment ESC: '\\' . ;

BOOLEAN
    : 'true' | 'false'
    ;