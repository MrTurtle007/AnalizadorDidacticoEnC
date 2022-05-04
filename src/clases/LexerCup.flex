package clases;
import java.io.*;
import java_cup.runtime.Symbol;

%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
ESPACIO=[ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

{ESPACIO} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.COMILLAS, yychar, yyline, yytext());}
( "\'" ) {return new Symbol(sym.COMILLA_SIMPLE, yychar, yyline, yytext());}

/* Tipos de datos */
( void | bit | short | int | long | float | double | char ) {return new Symbol(sym.TIPO_DE_DATO, yychar, yyline, yytext());}

( char ) {return new Symbol(sym.CHAR, yychar, yyline, yytext());}

( if ) {return new Symbol(sym.IF, yychar, yyline, yytext());}
( else ) {return new Symbol(sym.ELSE, yychar, yyline, yytext());}
( do ) {return new Symbol(sym.DO, yychar, yyline, yytext());}
( while ) {return new Symbol(sym.WHILE, yychar, yyline, yytext());}
( for ) {return new Symbol(sym.FOR, yychar, yyline, yytext());}
( switch ) {return new Symbol(sym.SWITCH, yychar, yyline, yytext());}
( case ) {return new Symbol(sym.CASE, yychar, yyline, yytext());}
( break ) {return new Symbol(sym.BREAK, yychar, yyline, yytext());}
( continue ) {return new Symbol(sym.CONTINUE, yychar, yyline, yytext());}
( default ) {return new Symbol(sym.DEFAULT, yychar, yyline, yytext());}

( "+" ) {return new Symbol(sym.MAS, yychar, yyline, yytext());}
( "-" ) {return new Symbol(sym.MENOS, yychar, yyline, yytext());}
( "*" ) {return new Symbol(sym.MULTIPLICACION, yychar, yyline, yytext());}
( "/" ) {return new Symbol(sym.DIVISION, yychar, yyline, yytext());}
( "%" ) {return new Symbol(sym.MODULO, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.OP_LOGICO, yychar, yyline, yytext());}

( "(" ) {return new Symbol(sym.PARENTESIS_ABRIR, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.PARENTESIS_CERRAR, yychar, yyline, yytext());}
( "[" ) {return new Symbol(sym.CORCHETE_ABRIR, yychar, yyline, yytext());}
( "]" ) {return new Symbol(sym.CORCHETE_CERRAR, yychar, yyline, yytext());}
( "{" ) {return new Symbol(sym.LLAVE_ABRIR, yychar, yyline, yytext());}
( "}" ) {return new Symbol(sym.LLAVE_CERRAR, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.OP_RELACIONAL, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {return new Symbol(sym.OP_ATRIBUCION, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.OP_INCRE_DECRE, yychar, yyline, yytext());}

/*Operadores Booleanos*/
(true | false)      {return new Symbol(sym.OP_BOOLEANO, yychar, yyline, yytext());}

( "." ) {return new Symbol(sym.PUNTO, yychar, yyline, yytext());}
( "," ) {return new Symbol(sym.COMA, yychar, yyline, yytext());}
( ":" ) {return new Symbol(sym.DOS_PUNTOS, yychar, yyline, yytext());}
( ";" ) {return new Symbol(sym.PUNTO_Y_COMA, yychar, yyline, yytext());}
( "=" ) {return new Symbol(sym.ASIGNACION, yychar, yyline, yytext());}

/*Métodos RESERVADOS*/
(printf | scanf | pow | sqrt | getch) {return new Symbol(sym.METODO_RESERVADO, yychar, yyline, yytext());}

( "main" ) {return new Symbol(sym.MAIN, yychar, yyline, yytext());}
<YYINITIAL> ("(-"{D}+")")|{D}+ {return new Symbol(sym.NUMERO, yychar, yyline, yytext());}
<YYINITIAL> {L}({L}|{D})* {return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());}
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}