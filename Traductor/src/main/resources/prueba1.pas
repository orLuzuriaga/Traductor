(* comentarios multilinea:
   programa de ejemplo 1 contiene:
 - definicion de constantes
 - variables
 - bloque principal de sentencias
 *)
program prueba_1;
{ comentario de linea: declaracion de constantes

const  const_Exponencial = 123E456;
const  const_Entera = +876;
const  const_Mixto = -000.64E-77;
const  const_literal = 'constante literal';

{ Comentario de linea: declaracion de variables

var ident_var_1 : INTEGER;
var ident_var_2, ident_var_3 : REAL;
var ident_var_4, ident_var_5 : INTEGER; ident_var_6 : REAL;


begin
  ident_var_1 := ( 4 * 5) +  const_Entera;
  ident_var_4 :=  (3 mod 5) div 10;
  ident_var_2 := (const_Exponencial * const_Entera) - const_Mixto;
  string_const_1 := 'constante literal con ''comillas'' en el contenido';
  string_const_2 := const_literal;
end.