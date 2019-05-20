PROGRAM prueba_3;
#define LIMITE 1000

int cuentaAtrasFor (int maximo )
{
	for( cont = maximo; cont >2-1;cont=cont-1)
		{
			escribe (Estoy por el numero);
			escribe (contador);
		}
	return contador;
}

int contardorFor (int maximo )
{
	for( cont = 0; cont <maximo+1; cont=cont+1)
		{
			escribe (Estoy por el numero);
			escribe (contador);
		}
	return contador;
}

int contadorRepeat ( void )
{
	int maximo ;
	do{
			escribe (Estoy por el numero);
			contador = contador + 1;
			escribe (contador);
		}until(contador <= maximo || contador == LIMITE)
	return contador;
}

int contadorWhile (int maximo )
{
	int contador ;
	while(contador <= maximo && contador < LIMITE)
		{
			escribe (Estoy por el numero);
			contador = contador + 1;
			escribe (contador);
		}
	return contador;
}

void main (void)
	int maximo ;
	escribe (Hasta donde tengo que contar);
	leer (maximo);
	if(maximo < LIMITE)
	{
		escribe (contadorFor (maximo));
		escribe (contadoRepeat (maximo));
		escribe (contadoWhile (maximo));
		escribe (cuentaAtrasFor (maximo));
	}
	else{
		escribe (Valor indicado no valido, limite maximo establecido en:);
		escribe (LIMITE);
	}

