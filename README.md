## Traductor
> El proyectyo consiste en el diseño e implementación de un traductor de programas escritos en
> un lenguaje de programación similar a PASCAL (de ahora en adelante lenguaje fuente), a otro
> similar a C (de ahora en adelante lenguaje final), utilizando herramientas de Jflex y CUP

### Analizador léxico
> Analizador Léxico
> En esta práctica se pide implementar un procesador de lenguajes capaz de traducir un archivo fuente en Pascal al lenguaje C
> como lenguaje salida. Para ello comenzaremos con la implementación de un analizador léxico que reconozca los tokens que
> posteriormente enviará al analizador sintáctico. Los tokens que debe reconocer el analizador léxico, puesto que hay tantos
> tokens distintos como símbolos terminales.
> En primer lugar las palabras reservadas típicas del lenguaje. Después nos encontramos con las constantes enteras, reales y
> punto fijo, exponencial y mixto las cuales están definidas en el enunciado Además las constantes laterales y los comentarios
>mde propósito general con dos formatos.
> A continuación tenemos el resto de símbolos : punto y coma (;) , paréntesis abierto ( “(“ ) , paréntesis cerrado ( “)” ), 
> coma (,), corchetes abierto ( { ) y corchetes cerrado ( } ).
>Por último están los identificadores, los cuales tienen un formato definido en la especificación léxica proporcionada en el
enunciado y los tokens que el analizador no reconoce a excepción del salto línea y el retorno de carro. Para empezar la
especificación léxica debemos tener en cuenta:

> Identificadores:
Para representar los identificadores se ha utilizado la siguiente definición léxica esta define todas las ristras de símbolos
compuestas por letras, dígitos y guiones bajos, donde obligatoriamente empieza.

* Identifier = [a-zA-Z][0-9A-Za-z_]*
