(* programa de ejemplo 3 contiene:
 - variables
 - bloque principal de sentencias
 - Funciones y procedimientos
 - sentencias de control de flujo como if, while, repeat y for
 *)
 
PROGRAM prueba_3;
 
const LIMITE = 1000;
var maximo:INTEGER;

procedure contardorFor (maximo: INTEGER);
begin
  for contador := 0 to maximo do
    begin
      escribe('Estoy por el numero');
      escribe(contador);
    end
end;

procedure contardorFor (maximo: INTEGER);
begin
  for contador := 0 to maximo do
    begin
      escribe('Estoy por el numero');
      escribe(contador);
    end
end;

procedure contadorRepeat(maximo: INTEGER);

begin
  repeat
    begin
        escribe('Estoy por el numero');
        contador := contador + 1;
        escribe(contador);
    end
  until contador <= maximo or contador = LIMITE;
end;


procedure contadorWhile(maximo: INTEGER);
var contador:INTEGER;
begin
  while contador <= maximo and  contador < LIMITE do
  begin
    escribe('Estoy por el numero');
    contador := contador + 1;
    escribe(contador);
  end
end;


begin
  escribe('Hasta donde tengo que contar');
  leer(maximo);
  
  if maximo < LIMITE  then
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

end.