unit libreria1;
#define PI 3.1416

simbolos.DefVar@5e2de80c

float ParteReal (float c )
{
		ParteReal = cparteRe;
}

void CrearComplejo (int re, int im , float c )
{
	cparteRe = re;
	cparteImg = im;
}

float ParteImaginaria (float c )
{
		ParteImaginaria = cparteImg;
}

void SumarComplejos (float c1, float c2, float c3 )
{
	CrearComplejo (parteReal (c1) + parteReal (c2),parteImaginaria (c1) + parteImaginaria (c2),c3);
}

void MultiplicarComplejos (int c1, int c2 , float c3 )
{
	CrearComplejo (parteReal (c1) * parteReal (c2) - parteImaginaria (c1) * parteImaginaria (c2),parteReal (c1) * parteImaginaria (c2) + parteReal (c2) * parteImaginaria (c1),c3);
}

void RestarComplejos (int c1, int c2 , float c3 )
{
		CrearComplejo (parteReal (c1) - parteReal (c2),parteImaginaria (c1) - parteImaginaria (c2),c3);
}

void DividirComplejos (float c1, float c2 , int c3 )
{
	CrearComplejo (ParteReal (c1) * ParteReal (c2));
}

void Conjugado ( void )
{
		int c1, C2 ;
		CrearComplejo (ParteReal (c1),ParteImaginaria (c1),c2);
}

float Modulo (float c )
{
	return sqr (c) + sqr (c);
}

float Dividir (float I )
{
	float c ;
	CrearComplejo (0.0,1.0,c);
	I = c;
}

void CalcularImpedancia (float imped )
{
	float R, L, C, F, imagImp ;
	write (Resistencia (Ohms): );
	readln (R);
	write (Inductancia (H): );
	readln (L);
	write (Capacidad (f): );
	readln (C);
	write (Frecuencia: (Hz));
	readln (F);
	imagImp = (2 * PI * F * L) - (1.0 / (2 * PI * F * C));
	writeln (imagImp);
	CrearComplejo (R,imagImp,imped);
}

void MostrarComplejo (float c )
{
	float imag ;
	WRITE (ParteReal (c));
	imag = ParteImaginaria (c);
	WRITELN (imag);
}

void contarComplejos (int maximo )
{
	for( cont = maximo; cont <0+1; cont=cont+1)
		{
			escribe (Estoy por el complejo);
			complejo = complejo - 1;
			escribe (complejo);
		}
}

.
