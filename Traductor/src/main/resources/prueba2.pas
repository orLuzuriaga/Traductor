(* programa de ejemplo 2 contiene:
 - definicion de constantes
 - variables
 - bloque principal de sentencias
 - Funciones y procedimientos
 *)

program prueba_2;
{ comentario de linea: declaracion de constantes

const  const_Exponencial = 123E456;
const  const_Entera = +876;

var total:REAL; mes1,mes2 : INTEGER;


procedure procedimiento1 (vInt1, vInt2: INTEGER);
var ident_var_1, ident_var_2 : INTEGER; varReal2 : REAL;
begin
  ident_var_1 := const_Exponencial * const_Entera;
  ident_var_2 := (399 div 20 ) + vInt2;
  ident_var_2 := vInt1 + ( ident_var_1 * ident_var_2);
  varReal2 := funcion1 (ident_var_1, ident_var_2, varReal2);
  total := varReal2 div vReal1;
end;


function funcion1 (vInt1, vInt2, vInt3: INTEGER; vReal1, vReal2: REAL): REAL;
var ident_var_1: INTEGER;
begin
   ident_var_1 := (vInt1 + vInt2) div vReal1;
   funcion1 := indet_var_1;
end;





begin 
  string_const_1 := 'el resultado''Total'' es: ';
  procedimiento1(( vReal1 * vInt3) +  const_Entera, 34, (3 mod 5) div 10 );
  string_const_2 := const_literal;
end.