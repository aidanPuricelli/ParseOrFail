grammar deliverable3;

program
    : (statement | COMMENT)* EOF
    ;

statement
    : assign
    | ifStatement
    | whileLoop
    | forLoop
    | expr
    ;

assign
    : ID ('=' | COMPOUNDOP) expr
    ;

ifStatement
    : 'if' expr ':' block ('elif' expr ':' block)* ('else' ':' block)?
    ;

whileLoop
    : 'while' expr ':' block
    ;

forLoop
    : 'for' ID 'in' expr ':' block
    ;

block
    : NEWLINE INDENT statement+ DEDENT
    ;

expr
    : expr ('*' | '/' | '%' | '+' | '-') expr
    | expr COMPARISONOP expr
    | BOOLEANOP expr
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

BOOLEANOP
    : 'and'
    | 'or'
    | 'not'
    ;

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NUMBER
    : INT | FLOAT
    ;

INT
    : '-'? ('0'..'9')+
    ;

FLOAT
    : '-' ? INT '.'? INT?
    ;

STRING
    : '"' ~( '\r' | '\n' )* '"'
    ;

CHAR
    : '\'' . '\''
    ;

BOOLEAN
    : 'True' | 'False'
    ;

COMMENT         
    : '#' ~( '\r' | '\n' )* NEWLINE+
    | '\'\'\'' .*? '\'\'\'' NEWLINE+
    ;

WS
    : (' ' | '\t')+
    ;

NEWLINE
    : '\n'
    | '\r\n'
    ;

COMPARISONOP
    : '<'
    | '<='
    | '>'
    | '>='
    | '=='
    | '!='
    ;

COMPOUNDOP
    : '+='
    | '-='
    | '*='
    | '/='
    ;

INDENT
    : '\t' // assuming tab-based indentation
    ;

DEDENT
    : // handle via lexer/parser action
    ;