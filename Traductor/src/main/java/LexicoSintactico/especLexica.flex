/* ------------------------------------ Codigo de Usuario ------------------------------------------ */
package lexicoSintactico;
import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java.io.FileReader;
  
%%
   
/* ------------------------------ Opciones y declaraciones de JFlex -------------------------------- */  
   
%public
%class AnalizadorLexico
%line
%column
%unicode
%cup

/* Código sera copiado integramente en la clase Analizador lexico*/

%{
    String const_Literal = "";
    ComplexSymbolFactory symbolFactory;
    private String auxLexema = "";
    public AnalizadorLexico(java.io.Reader in, ComplexSymbolFactory sf){
	this(in);
	symbolFactory = sf;
    }
    
	    
	  
	
	  private Symbol symbol(int sym) {
	       Location fila = new Location("Desde",yyline+1,yycolumn+ 1);
	       Location columna = new Location("Hasta",yyline+1,yycolumn+yylength());
	      
	      return symbolFactory.newSymbol("eof", sym,fila,columna );
	  }
	  
	  
	  private Symbol symbol(String name, int sym, Object val) {
	      Location fila = new Location("Desde",yyline+1,yycolumn+ 1);
	      Location columna= new Location("Hasta",yyline+1,yycolumn+ yylength());
	     
	      return symbolFactory.newSymbol(name, sym, fila, columna,val.toString());
	  }
	

private void concatenar(String lexema){
	               
	    const_Literal = const_Literal + lexema;  
 }


    



public String getLexema(){

return this.auxLexema;

}
private void appendLexema(String lexema){
                 
      auxLexema = auxLexema + lexema ;  
 }



%}





%state CONST_LITERALES
%state COMENTARIO_LINEA
%state COMENTARIO_MULTILINEA


  
//--------- Definición de macros --------------

Salto = ([\n])+
FinDelinea = \r|\n|\r\n
Espacio = [\s]+
Program = "program"|"PROGRAM"
Unit = "unit"|"UNIT"


/** Identificador ***/
Identifier = [a-zA-Z] [0-9A-Za-z_]*



/*** Constantes numericas ***/


PuntoFijo  = [+|-]?[:digit:]+["."][:digit:]+                      // Dos ristras de dígitos separadas por el punto decimal
Exponecial =[+|-]?[:digit:]+["e"|"E"][+|-]?[:digit:]+           // Un ristra de digitos seguida del carácter "e" o "E", un signo "+" 0 "-" opcional y otra ristra de digitos
Mixto      =  {PuntoFijo}["e"|"E"][+|-]?[:digit:]+              // Constante real con un punto fijo seguida del carácter "e" o "E", un signo "+" o "-" opcional y otra ristra de dígitos

/*** Constantes numerica de dos tipos enteras y reales ***/
integer_const   = [+|-]?[:digit:]+
real_const = {PuntoFijo} | {Exponecial} | {Mixto}

Cte = [Identifier][\s][=][\s][PuntoFijo|Exponencial|Mixto]





/* ------------------------------ Reglas lexicas -------------------------------- */  
%% 

<YYINITIAL> {
   
    

    /*** Operadores Aritmeticos ***/
    "+"                        { return symbol("plus",sym.op_suma,yytext()); }
    "-"                        { return symbol("menos",sym.op_resta,yytext()); }
    "*"                        { return symbol("mul",sym.op_mult,yytext()); }
    "div"                      { return symbol("div",sym.op_div,yytext()); }
    "mod"                      { return symbol("modulo",sym.op_mod,yytext()); }
   


    /*** Simbolos ***/
    "("                        { return symbol("(",sym.abre_parent,yytext()); }
    ")"                        { return symbol(")",sym.cierra_parent,yytext()); }
    ";"                        { return symbol(";",sym.punto_y_coma, yytext()); }
    ","                        { return symbol(",",sym.coma ,yytext());}
    ":="                       { return symbol(":=",sym.asignacion,yytext());}
    "."                        { return symbol(".",sym.punto,yytext());}
    ":"                        { return symbol(":",sym.dospuntos,yytext());}


     /*** Palabras reservadas ***/                     
                  
    "INTEGER"                  { return symbol("int",sym.integer,yytext()); }                  
    "REAL"                     { return symbol("real",sym.real,yytext()); }
    "const"                    { return symbol("CONST",sym.word_const,yytext());}
    "begin"                    { return symbol("begin",sym.begin,yytext()); }
    "end"                      { return symbol("end",sym.end,yytext()); }
    "var"                      { return symbol("var",sym.var,yytext()); }
    "procedure"                { return symbol("procedure",sym.procedure,yytext()); }
    "function"                 { return symbol("function",sym.function,yytext()); }
    "not"                      { return symbol("neg",sym.not,yytext()); }  // FACTORCOND ::= "not FACTORCOND"
    {Unit}                     { return symbol("neg",sym.unit,yytext()); }
    {Program}                  { return symbol("program",sym.program,yytext()); }



     /*** Operadores logicos ***/
    "or"                       { return symbol("or",sym.opl_or,yytext()); }     // OPLOG ::= "or" | "and"              
    "and"                      { return symbol("and",sym.opl_and,yytext()); }



     /*** Operadores relacionales ***/
    "="                        { return symbol("=",sym.opr_iguales,yytext());}
    "<"                        { return symbol("<",sym.opr_menor,yytext());}
    ">"                        { return symbol(">",sym.opr_mayor,yytext()); }                   
    "<="                       { return symbol("<=",sym.opr_menor_igual,yytext()); }                  
    ">="                       { return symbol(">=",sym.opr_mayor_igual,yytext()); }
    
    
    
    
    /*** Sentencias de control de flujo ***/
    "if"                       { return symbol("if",sym.word_if,yytext()); }
    "then"                     { return symbol("then",sym.word_then,yytext()); }
    "else"                     { return symbol("else",sym.word_else,yytext());}
    "while"                    { return symbol("while",sym.word_while,yytext());}
    "repeat"                   { return symbol("repeat",sym.word_repeat,yytext()); }                   
    "until"                    { return symbol("until",sym.word_until,yytext()); }                  
    "for"                      { return symbol("for",sym.word_for,yytext()); }
    "do"                       { return symbol("do",sym.word_do,yytext()); }
    "to"                       { return symbol("to",sym.word_to,yytext()); }
    "downto"                   { return symbol("downto",sym.word_downto,yytext()); }
    
    

     /*** constantes ***/
    {integer_const}            { return symbol("integer_const",sym.numeric_integer_const, yytext()); }
    {real_const}               { return symbol("real_const",sym.numeric_real_const ,yytext());}



  
    /*** Inicio de constante literal ***/
    "'"                               {yybegin(CONST_LITERALES);}

    /*** Comentario linea ***/
    "{"                               {yybegin(COMENTARIO_LINEA);}
    
    
    
    /*** Comentario multilinea ***/
    "(*"                               {yybegin(COMENTARIO_MULTILINEA);}
    
    
    /*** identificador ***/
    {Identifier}                      {return symbol("Identificador",sym.identifier,yytext());}


    /*** Espacio ***/
    {Espacio}                        { /* ignoramos */ } 
    
    
    /*** Fin de linea ***/
    {FinDelinea}                     {/* ignoramos */}
    
    
    /*** Salto  ***/
    {Salto}                          {/* ignoramos */}
    
   
     
     
     
        

     [^]     {throw new Error ("Caracter ilegal: " + "["+ yytext() + "]"  + " Linea =" + (yyline+1) + " Columna =" + (yycolumn+1)); }
}



 <CONST_LITERALES> {

      [\w]                            { concatenar(yytext()); }
      [\s]                            { concatenar(yytext()); }
                                   

      [\r]                            { concatenar(yytext()); }
      "''"                            { concatenar("'"); }
    
      "'"                             {yybegin(YYINITIAL);
                                      String aux = const_Literal;
                                      const_Literal = "";
                                      
                                      return symbol("constLiteral",sym.string_const, new java.lang.String(aux)); 
                                                                 
                                      }
     [\W]                             {concatenar(yytext()); }
                                      
     {FinDelinea}                     { throw new Error ("No existe caracter de cierre ['] de constante literal " 
                                          + " Linea =" + (yyline+1) + " Columna =" + (yycolumn+1)); }
}




 <COMENTARIO_LINEA> {
 {Salto}                               {  yybegin(YYINITIAL);}
                                       
																   
																   
 [^]                                   {/* ignorar */ }
}

 <COMENTARIO_MULTILINEA> {
 "*)"                                  {  yybegin(YYINITIAL);}
                                       
																   
																   
 [^]                                   {/* ignorar */ }
}




<<EOF>>                                 { return symbol(sym.EOF); }



