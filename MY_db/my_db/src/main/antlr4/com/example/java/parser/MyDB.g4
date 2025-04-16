grammar MyDB;

parse
    : statement+ EOF
    ;

statement
    : createStatement
    | insertStatement
    | selectStatement
    | deleteStatement
    | updateStatement
    | exportStatement
    | dropStatement
    | saveStatement
    | loadStatement
    ;

createStatement
    : 'CREATE' 'TABLE' tblName=IDENTIFIER '(' columnDef (',' columnDef)* ')' ';'
    ;

columnDef
    : colName=IDENTIFIER colType=typeName
    ;

insertStatement
    : 'INSERT' 'INTO' tblName=IDENTIFIER '(' columnNameList ')' 'VALUES' '(' valueList ')' ';'
    ;

selectStatement
    : 'SELECT' columnNameList 'FROM' tblName=IDENTIFIER (whereClause)? ';'
    ;

deleteStatement
    : 'DELETE' 'FROM' tblName=IDENTIFIER whereClause ';'
    ;

updateStatement
    : 'UPDATE' tblName=IDENTIFIER 'SET' column=IDENTIFIER '=' newValue=STRING whereClause ';'
    ;

exportStatement
    : 'EXPORT' tblName=IDENTIFIER 'TO' filePath=STRING ';'
    ;

dropStatement
    : 'DROP' 'TABLE' tblName=IDENTIFIER ';'
    ;

saveStatement
    : 'SAVE' 'DATABASE' 'TO' filePath=STRING ';'
    ;

loadStatement
    : 'LOAD' 'DATABASE' 'FROM' filePath=STRING ';'
    ;

whereClause
    : 'WHERE' condition (('AND' | 'OR') condition)*
    ;

condition
    : column=IDENTIFIER '=' value=STRING
    ;

columnNameList
    : IDENTIFIER (',' IDENTIFIER)*
    ;

valueList
    : STRING (',' STRING)*
    ;

typeName
    : INT_TYPE
    | VARCHAR_TYPE
    | BOOLEAN_TYPE
    ;

// Token Definitions
IDENTIFIER     : [a-zA-Z_][a-zA-Z_0-9]* ;
STRING         : '\'' (~['\r\n'])* '\'' ;

INT_TYPE       : 'INT' ;
VARCHAR_TYPE   : 'VARCHAR' ;
BOOLEAN_TYPE   : 'BOOLEAN' ;

WS             : [ \t\r\n]+ -> skip ;