(* programa de ejemplo 3 contiene:
 - variables
 - bloque principal de sentencias
 - Funciones y procedimientos
 - sentencias de control de flujo como if, while, repeat y for
 *)
 
PROGRAM prueba_3;
 
const LIMITE = 1000;
var maximo:INTEGER;

function cuentaAtrasFor (maximo: INTEGER): INTEGER;
begin
  for contador := maximo downto 2 do
    begin
      escribe('Estoy por el numero');
      escribe(contador);
    end
  cuentaAtrasFor := contador;
end;

function contardorFor(maximo: INTEGER): INTEGER;
begin
  for contador := 0 to maximo do
    begin
      escribe('Estoy por el numero');
      escribe(contador);
    end
  contardorFor := contador;
end;

function contadorRepeat: INTEGER;
var maximo:INTEGER;
begin
  repeat
    begin
        escribe('Estoy por el numero');
        contador := contador + 1;
        escribe(contador);
    end
  until contador <= maximo or contador = LIMITE;
  contadorRepeat := contador;
end;


function contadorWhile(maximo: INTEGER): INTEGER;
var contador:INTEGER;
begin
  while contador <= maximo and  contador < LIMITE do
  begin
    escribe('Estoy por el numero');
    contador := contador + 1;
    escribe(contador);
  end
 contadorWhile := contador;
end;


begin
  escribe('Hasta donde tengo que contar');
  leer(maximo);
  
  if maximo < LIMITE  then
  begin
    escribe(contadorFor(maximo));
    escribe(contadoRepeat(maximo));
    escribe(contadoWhile(maximo));
    escribe(cuentaAtrasFor(maximo));
  end
  else
  begin
   escribe('Valor indicado no valido, limite maximo establecido en:');
   escribe(LIMITE);
  end

end.