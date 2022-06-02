package clases;
import static clases.Tokens.*;

%%
%class claseLexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
ESPACIO=[ \t\r]+
%{
    public String lexeme;
%}
%%

{ESPACIO} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

"\n" {return SALTO_DE_LINEA;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return COMILLAS;}
( "\'" ) {lexeme=yytext(); return COMILLA_SIMPLE;}

/* Tipos de datos */
( void | bit | short | int | long | float | double ) {lexeme=yytext(); return TIPO_DE_DATO;}

( char ) {lexeme=yytext(); return CHAR;}

( if ) {lexeme=yytext(); return IF;}
( else ) {lexeme=yytext(); return ELSE;}
( do ) {lexeme=yytext(); return DO;}
( while ) {lexeme=yytext(); return WHILE;}
( for ) {lexeme=yytext(); return FOR;}
( switch ) {lexeme=yytext(); return SWITCH;}
( case ) {lexeme=yytext(); return CASE;}
( break ) {lexeme=yytext(); return BREAK;}
( continue ) {lexeme=yytext(); return CONTINUE;}
( default ) {lexeme=yytext(); return DEFAULT;}

( "+" ) {lexeme=yytext(); return MAS;}
( "-" ) {lexeme=yytext(); return MENOS;}
( "*" ) {lexeme=yytext(); return MULTIPLICACION;}
( "/" ) {lexeme=yytext(); return DIVISION;}
( "%" ) {lexeme=yytext(); return MODULO;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return OP_LOGICO;}

( "(" ) {lexeme=yytext(); return PARENTESIS_ABRIR;}
( ")" ) {lexeme=yytext(); return PARENTESIS_CERRAR;}
( "[" ) {lexeme=yytext(); return CORCHETE_ABRIR;}
( "]" ) {lexeme=yytext(); return CORCHETE_CERRAR;}
( "{" ) {lexeme=yytext(); return LLAVE_ABRIR;}
( "}" ) {lexeme=yytext(); return LLAVE_CERRAR;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return OP_RELACIONAL;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return OP_ATRIBUCION;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return OP_INCRE_DECRE;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return OP_BOOLEANO;}

( "." ) {lexeme=yytext(); return PUNTO;}
( "," ) {lexeme=yytext(); return COMA;}
( ":" ) {lexeme=yytext(); return DOS_PUNTOS;}
( ";" ) {lexeme=yytext(); return PUNTO_Y_COMA;}
( "=" ) {lexeme=yytext(); return ASIGNACION;}

/*Métodos RESERVADOS*/
( printf ) {lexeme=yytext(); return METODO_PRINTF;}
( scanf ) {lexeme=yytext(); return METODO_SCANF;}
( pow ) {lexeme=yytext(); return METODO_POW;}
( sqrt ) {lexeme=yytext(); return METODO_RAIZ;}
( getch ) {lexeme=yytext(); return METODO_ESPERA;}

( "main" ) {lexeme=yytext(); return MAIN;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return NUMERO;}
{L}({L}|{D})* {lexeme=yytext(); return IDENTIFICADOR;}
 . {lexeme=yytext(); return ERROR;}
