 programa de ejemplo 4 contiene:
 - variables
 - Funciones y procedimientos
 - sentencias de control de flujo como if, while, repeat y for
 *)
 
 
 unit libreria1 ;

   var
	reVol, imVol: INTEGER;
	voltaje, impedancia, intensidad: REAL;
	

	procedure CrearComplejo(re,im:INTEGER; c:REAL);
	begin
		cparteRe:=re;
		cparteImg:=im;
	end;

	function ParteReal(c:REAL):REAL;
	begin
		ParteReal:=cparteRe;
	end;

	function ParteImaginaria(c:REAL):REAL;
	begin
		ParteImaginaria:=cparteImg;
	end;

	procedure SumarComplejos(c1, c2, c3:REAL);
	begin
		CrearComplejo(parteReal(c1)+parteReal(c2),parteImaginaria(c1)+parteImaginaria(c2), c3);
	end;

	procedure RestarComplejos(c1, c2:INTEGER; c3:REAL);
	begin
		CrearComplejo(parteReal(c1)-parteReal(c2), parteImaginaria(c1)-parteImaginaria(c2), c3);
	end;

	procedure MultiplicarComplejos(c1, c2:INTEGER; c3: REAL);
	begin
		CrearComplejo(parteReal(c1)*parteReal(c2)-parteImaginaria(c1)*parteImaginaria(c2),
		parteReal(c1)*parteImaginaria(c2)+parteReal(c2)*
		parteImaginaria(c1), c3);
	end;

	procedure DividirComplejos(c1, c2:REAL; c3:INTEGER);
	begin
		CrearComplejo(ParteReal(c1) * ParteReal(c2));
	end;

	procedure Conjugado(c1:INTEGER; c2:REAL);
	begin
		CrearComplejo(ParteReal(c1), ParteImaginaria(c1), c2);
	end;

	function Modulo(c:REAL):REAL;
	begin
		Modulo:=sqr(c)+sqr(c);
	end;

	function Dividir ( I:REAL):REAL;
	var
		c:REAL;
	begin
		CrearComplejo(0.0, 1.0, c);
		I:=c;
	end;
	

	procedure CalcularImpedancia (imped: REAL);

	const
	PI = 3.1416;
	var
	R, L, C, F, imagImp: REAL;
	begin
	write('Resistencia (Ohms): ');
	readln(R);
	write('Inductancia (H): ');
	readln(L);
	write('Capacidad (f): ');
	readln(C);
	write('Frecuencia: (Hz)');
	readln(F);
	imagImp := (2*PI * F * L) - (1.0 div(2*PI*F*C));
	writeln(imagImp);
	CrearComplejo(R, imagImp, imped);
	end;

	procedure MostrarComplejo(c: REAL);

	var
	imag:REAL;
	begin
	WRITE(ParteReal(c));
	imag := ParteImaginaria(c);
	
	WRITELN(imag);
	end;

	procedure contarComplejos (maximo: INTEGER);
	begin
	  for complejo := maximo to 0 do
	    begin
	      escribe('Estoy por el complejo');
	      complejo := complejo - 1;
	      escribe(complejo);
	    end
	end;
	
.

 
 