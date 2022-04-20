grammar test;
//Тело программы
program: (function ENDLINE)* statement+ ;

// Лексемы языка

// два тип
INT : 'int';
FLOAT : 'float';
//модификаторы
GLOBAL:'global';
CONST: 'const';
// логические операции
NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
LESS_OR_EQUALS: '<=';
GREATER: '>';
GREATER_OR_EQUALS: '>=';
TRUE:'true';
FALSE:'false';
RETURN: 'return';
TAB:'    ';
ENDLINE:[\n];
NUMBER : [0-9]+;
FLOATNUMBER:[0-9]+'.'[0-9]+;
// ключевые слова
PRINT: 'print';
WHILE: 'while';
IF: 'if';
ELSE:'else';
FUNCTION:'def';
VOID:'void';
// арифметические операции
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
PERCENT: '%';
DEGREE:'^';

COMMA:',';
ASSIGN:'=';
OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
ID :  [a-zA-Z_][a-zA-Z_0-9]* ;
WS:                 [ \r\u000C]+ -> channel(HIDDEN);
//Правилоа языка
type: INT|FLOAT;
arif:MULTIPLY|DIVIDE|PLUS|MINUS|PERCENT|DEGREE;
//Основные выражения
statement:(declaration ENDLINE| assigment ENDLINE | ifStatement | whileCycle | functionCall ENDLINE | print_expr ENDLINE) ;
//Конструкция if
ifHeader: IF OPEN_BRACKET boolExpr CLOSE_BRACKET;
ifStatement: ifHeader ENDLINE (  (TAB)*  statement)+  (elseStatement)? ;
elseStatement:ELSE (ENDLINE (TAB)+ (statement))+;
//Декларация переменной и присваивание значений
declaration : (GLOBAL)? (CONST)? type   ID  ASSIGN  (OPEN_BRACKET type CLOSE_BRACKET)? expressionMath ;
assigment:ID  ASSIGN  (OPEN_BRACKET type CLOSE_BRACKET)? expressionMath;
// мат.выражения и конструкци которые можно передавать как аргумент
expressionMath: expressionMath  arif  expressionMath
|ID
|br_expr
|NUMBER
|FLOATNUMBER
|functionCall
;
br_expr:OPEN_BRACKET expressionMath CLOSE_BRACKET;
compare_op :
EQUAL|NON_EQUAL|LESS|GREATER|LESS_OR_EQUALS|GREATER_OR_EQUALS;
//Констркуции для функции
functionCall:ID OPEN_BRACKET CLOSE_BRACKET
            |ID OPEN_BRACKET(expressionMath (COMMA  expressionMath)*) CLOSE_BRACKET;
function:functionHeader ENDLINE (TAB statement)* (TAB RETURN  (expressionMath | VOID));
functionHeader:FUNCTION  (type|VOID)  ID OPEN_BRACKET functionParameters CLOSE_BRACKET;
functionParameters:(type  ID (COMMA type ID)*)* ;
//Вывод инф.
print_expr : PRINT OPEN_BRACKET (expressionMath | boolExpr)  CLOSE_BRACKET ;
// Цикл while
whileCycle:whileHeader ENDLINE (  (TAB)*  statement)+ ;
whileHeader:WHILE OPEN_BRACKET boolExpr CLOSE_BRACKET;
// логическое выражение
boolExpr:expressionMath  compare_op  expressionMath
| NEGATION OPEN_BRACKET boolExpr CLOSE_BRACKET
| TRUE
| FALSE
;
//INCREMENT:'++';
//incrementOper:ID INCREMENT;
//forHeader:OPEN_BRACKET (declaration | assigment)? ';' boolExpr ';' expressionMath CLOSE_BRACKET;
//forCycle:forHeader ENDLINE (  (TAB)*  statement)+;