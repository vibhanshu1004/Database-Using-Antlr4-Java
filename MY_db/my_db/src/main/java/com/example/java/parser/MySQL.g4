grammar MySQL;

// ✅ Entry rule — this must match what you call in DB.java
parse
    : statement+ EOF
    ;

statement
    : createStatement
    | insertStatement
    | selectStatement
    ;

createStatement
    : 'CREATE' 'TABLE' tblName=IDENTIFIER '(' columnDef (',' columnDef)* ')' ';'
    ;

insertStatement
    : 'INSERT' 'INTO' tblName=IDENTIFIER '(' columnNameList ')' 'VALUES' '(' valueList ')' ';'
    ;

selectStatement
    : 'SELECT' columnNameList 'FROM' tblName=IDENTIFIER ';'
    ;

columnDef
    : colName=IDENTIFIER colType=IDENTIFIER
    ;

columnNameList
    : IDENTIFIER (',' IDENTIFIER)*
    ;

valueList
    : STRING (',' STRING)*
    ;

// ✅ Tokens
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
STRING: '\'' (~['\r\n'])* '\'' ;
WS: [ \t\r\n]+ -> skip ;