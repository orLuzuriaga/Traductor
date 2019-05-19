(* programa de ejemplo 3 contiene:
 - variables
 - bloque principal de sentencias
 - Funciones y procedimientos
 - sentencias de control de flujo como if, while, repeat y for
 *)
 
PROGRAM prueba_3;
 
const LIMITE = 1000;
var maximo:INTEGER;



procedure contadorWhile(maximo: INTEGER);
var contador:INTEGER;
begin
  
  if 3 < 5  then
  begin
    contadorFor(maximo);
    contadoRepeat(maximo);
    contadoWhile(maximo);
  end
  else
  begin
   escribe('Valor indicado no valido, limite maximo establecido en:');
   escribe(LIMITE);
  end
end;


begin
  escribe('Hasta donde tengo que contar');
  leer(maximo);
end.