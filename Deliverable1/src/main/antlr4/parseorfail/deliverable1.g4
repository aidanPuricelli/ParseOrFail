grammar deliverable1;

program: (statement NEWLINE)* statement? EOF ; // 0 or more statements, allow for EOF with no NEWLINE

statement
    : assignment
    | expr
    ;

assignment
    : ID (ASSIGN | compoundAssign) expr
    ;

expr
    : expr ('*' | '/' | '%' | '+' | '-') expr
    | ID
    | NUMBER
    | STRING
    | CHAR
    | '[' elements ']'   // for list
    | '(' expr ')'
    | BOOLEAN
    ;

elements
    : expr (',' expr)*
    ;

compoundAssign
    : '+='
    | '-='
    | '*='
    | '/='
    ;

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
    ;

CHAR
    : '\'' (ESC | ~['\\\r\n])* '\''
    ;

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NEWLINE
    : [\r\n]+
    ;

WS
    : [ \t]+ -> skip
    ;

fragment ESC: '\\' . ;
