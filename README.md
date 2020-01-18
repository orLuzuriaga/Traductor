## Traductor
> El proyectyo consiste en el diseño e implementación de un traductor de programas escritos en
> un lenguaje de programación similar a PASCAL (de ahora en adelante lenguaje fuente), a otro
> similar a C (de ahora en adelante lenguaje final), utilizando herramientas de Jflex y CUP

### Analizador léxico

> En esta práctica se pide implementar un procesador de lenguajes capaz de traducir un archivo fuente en Pascal al lenguaje C
> como lenguaje salida. Para ello comenzaremos con la implementación de un analizador léxico que reconozca los tokens que
> posteriormente enviará al analizador sintáctico. Los tokens que debe reconocer el analizador léxico, puesto que hay tantos
> tokens distintos como símbolos terminales.
>
> En primer lugar las palabras reservadas típicas del lenguaje. Después nos encontramos con las constantes enteras, reales y
> punto fijo, exponencial y mixto las cuales están definidas en el enunciado Además las constantes laterales y los comentarios
> de propósito general con dos formatos.
>
> A continuación tenemos el resto de símbolos : punto y coma (;) , paréntesis abierto ( “(“ ) , paréntesis cerrado ( “)” ), 
> coma (,), corchetes abierto ( { ) y corchetes cerrado ( } ).
>Por último están los identificadores, los cuales tienen un formato definido en la especificación léxica proporcionada en el
enunciado y los tokens que el analizador no reconoce a excepción del salto línea y el retorno de carro. Para empezar la
especificación léxica debemos tener en cuenta:

>#### Identificadores:
>Para representar los identificadores se ha utilizado la siguiente definición léxica esta define todas las ristras de símbolos
>compuestas por letras, dígitos y guiones bajos, donde obligatoriamente empieza.
>
> * Identifier = [a-zA-Z][0-9A-Za-z_]*

>#### Constantes numéricas enteras y reales
>Traductor reconoce constantes de dos tipos entera y reales, donde las entera puede ir precedida por un signo [+| [+|--] 
>las reales se pueden expresar en tipos distintos, Punto fijo, Exponencial, Mixto. Para identificarlas se ha utilizado las >siguientes >definiciones::

>#### Constantes literales
> Las constantes literales son del tipo 'contenido de la constante literal’ dado que puede contener comillas dentro, nos hemos apoyado >en >un estado, que nos permite realizar un análisis independiente una vez detectada la primera comilla, “ ‘ “ , para ello una vez
> detectada la comilla iniciamos el estado llamado
>“CONT_LITERALES"
>#### Comentarios de línea y multilínea
>Similar a la misma técnica empleada con las constantes literales, aqui empleamos estados que permitirá identificar los comentarios >completos para luego obviarlos, para ello una vez detectada el primer símbolo “{“ para comentarios de línea
>“(*” para comentarios multilínea.
>llamamos a los correspondientes estados, COMENTARIO_LINEA, COMENTARIO_MULTILINEA.

>#### Relas léxicas
>Estas identificaran los distintos elementos que compones el programa fuente, podemos ver un ejemplo donde se identificas las palabras
>reservadas propias del lenguaje fuente.


### Analizador Sintáctico
>Para el analizador sintáctico hemos utilizado la herramienta CUP, la cual permite generar la implementación del
> analizador a partir de la especificación sintáctica y el analizador léxico del apartado anterior.

>El formato de nuestro fichero de especificación sintáctica que utiliza la herramienta CUP consiste de dos secciones
>principales:
>**Preámbulo: Importamos los paquetes de Java necesarios (de java_cup.runtime ).
>**Especificación gramatical: Definimos los símbolos terminales (terminal) y no terminales (non terminal) y las
