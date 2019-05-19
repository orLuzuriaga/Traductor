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


procedure proConParam (vInt1, vInt2: INTEGER);
var ident_var_1, ident_var_2 : INTEGER; varReal2 : REAL;
begin
  ident_var_1 := const_Exponencial * const_Entera;
  ident_var_2 := (399 div 20 ) + vInt2;
  ident_var_3 := vInt1 + ( ident_var_1 * ident_var_2);
  varReal2 := funcion1 (ident_var_1, ident_var_2, varReal2);
  total := varReal2 div vReal1;
end;


function funConParam (vInt1, vInt2, vInt3: INTEGER; vReal1, vReal2: REAL): REAL;
var ident_var_1: INTEGER;
begin
   ident_var_1 := (vInt1 + vInt2) div vReal1;
   funConParam := indet_var_1;
end;


procedure proSinParam;
var ident_var_1, ident_var_2, total: INTEGER; varReal2 : REAL;
begin
  ident_var_1 := const_Exponencial * const_Entera;
  ident_var_2 := (39 div 20 ) + vInt2;
  varReal2 := funcionConParam (ident_var_1, ident_var_2, varReal2);
  total := varReal2 div ident_var_1;
end;

function funSinParam: REAL;
var ident_var_1,ident_var_2 : INTEGER;
begin
   ident_var_1 := (400 + 123) div 10;
   ident_var_2 := (1000 div 100 );
   funSinParam := indet_var_1 + ident_var_2;
end;

.