grammar test;
//Тело программы
program: (function ENDLINE)* statement+ ;

// Лексемы языка

// два тип
INT : 'int';
FLOAT : 'float';
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
SPACE:' ';
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

//Правилоа языка
type: INT|FLOAT;
arif:MULTIPLY|DIVIDE|PLUS|MINUS|PERCENT|DEGREE;
//Основные выражения
statement:(declaration ENDLINE| assigment ENDLINE | ifStatement | whileCycle | functionCall ENDLINE | print_expr ENDLINE) ;
//Конструкция if
ifHeader: IF OPEN_BRACKET boolExpr CLOSE_BRACKET;
ifStatement: ifHeader (ENDLINE (TAB)+ statement)+ (elseStatement)? ;
elseStatement:ELSE (ENDLINE (TAB)+ statement)+;
//Декларация переменной и присваивание значений
declaration : type SPACE+ ID SPACE* ASSIGN SPACE* (OPEN_BRACKET type CLOSE_BRACKET)? expressionMath ;
assigment:ID SPACE* ASSIGN SPACE* (OPEN_BRACKET type CLOSE_BRACKET)? expressionMath;
// мат.выражения и конструкци которые можно передавать как аргумент
expressionMath: expressionMath SPACE* arif SPACE* expressionMath
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
            |ID OPEN_BRACKET(expressionMath (COMMA SPACE expressionMath)*) CLOSE_BRACKET;
function:functionHeader ENDLINE ( TAB statement)* (TAB RETURN SPACE (expressionMath | VOID));
functionHeader:FUNCTION SPACE+ (type|VOID) SPACE+ ID OPEN_BRACKET functionParameters CLOSE_BRACKET;
functionParameters:(type SPACE+ ID (COMMA SPACE* type SPACE+ ID)*);
//Вывод инф.
print_expr : PRINT OPEN_BRACKET (expressionMath | boolExpr)  CLOSE_BRACKET ;
// Цикл while
whileCycle:whileHeader (ENDLINE (TAB)+ statement)+ ;
whileHeader:WHILE OPEN_BRACKET boolExpr CLOSE_BRACKET;
// логическое выражение
boolExpr:expressionMath SPACE* compare_op SPACE* expressionMath
| NEGATION OPEN_BRACKET boolExpr CLOSE_BRACKET
| TRUE
| FALSE
;

