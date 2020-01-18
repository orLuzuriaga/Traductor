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
>
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Constantes.png" width="500" height="300">
>
>#### Constantes literales
> Las constantes literales son del tipo 'contenido de la constante literal’ dado que puede contener comillas dentro, nos hemos apoyado >en >un estado, que nos permite realizar un análisis independiente una vez detectada la primera comilla, “ ‘ “ , para ello una vez
> detectada la comilla iniciamos el estado llamado
>“CONT_LITERALES"
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Constantes_literales.png" width="600" height="400">
>
>
>#### Comentarios de línea y multilínea
>Similar a la misma técnica empleada con las constantes literales, aqui empleamos estados que permitirá identificar los comentarios >completos para luego obviarlos, para ello una vez detectada el primer símbolo “{“ para comentarios de línea
>“(*” para comentarios multilínea.
>llamamos a los correspondientes estados, COMENTARIO_LINEA, COMENTARIO_MULTILINEA.
>
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Comentario%20de%20L%C3%ADnea.png" width="600" height="300">
>
>#### Relas léxicas
>Estas identificaran los distintos elementos que compones el programa fuente, podemos ver un ejemplo donde se identificas las palabras
>reservadas propias del lenguaje fuente.
>
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Reglas%20lexicas.png" width="650" height="300">
>
### Analizador Sintáctico
>Para el analizador sintáctico hemos utilizado la herramienta CUP, la cual permite generar la implementación del
> analizador a partir de la especificación sintáctica y el analizador léxico del apartado anterior.
>
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Esquema%20analizador%20sintactico.png" width="600" height="300">
>
### Traducción dirigida por la sintaxis
> Para completar el traductor y generar el archivo .c hemos seguido usando la herramienta CUP, la cual nos permite describir
>acciones semánticas en lenguaje java con la siguiente sintaxis:
>
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Traduccion_dirigida_sintaxis.png" width="650" height="300">
>
>*ANTECEDENTE ::= CONSECUENTE1 | … | CONSECUENTE N {: acciones semánticas:};
>
>En esta etapa de la práctica nos hemos apoyado en atributos sintetizados. Por lo que las acciones semánticas se encuentran
>al final del consecuente.
>En esta etapa de la práctica nos hemos apoyado en atributos sintetizados. Por lo que las acciones semánticas se encuentran
>al final del consecuente.
>
>Siguiendo la teoría para trabajar con CUP creamos una variable auxiliar y su valor lo obtenemos del del valor que se
>encuentra en la cima de la pila.
>
### Árbol de analisis
>
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Esquema_arbol.png" width="850" height="400">
>
### Como ejecutar el programa
>A la hora de realizar la evaluación del traductor se realizaría invocando la aplicación desde el entormo Eclipse y pasando
>como argumentos la ruta: P.ej. src main resources /prueba2.pas. En el caso de éxito se visualizaría el menú y se debe pulsar la opción > 1.
>
><img src="https://github.com/orluzuriaga/Traductor/blob/master/Imagenes/Casos%20de%20uso.png" width="880" height="450">
>
>A continuación la descripción de cada uno de los diferentes casos de prueba:
>>
>>- prueba1.pas. Comentarios multilínea: definición de constantes, variables y bloque principal de sentencias.
>>- prueba1_error.pas. Técnica de errores a nivel frase. Localiza los errores indicando línea y columna.
>>
>>- prueba2.pas. El analizador reconoce funciones y procedimientos.
>>
>>- prueba2_error.pas. Modo pánico y nivel frase.
>>
>>- prueba3.pas. El analizador reconoce sentencias de control de flujo como if , while , repeat y for
>>
>>- prueba3_error.pas. Error falta punto y coma.
>>
>>- prueba4.pas. El analizador reconoce la librería UNIT y sentencias anidadas.
>>
>>- Prueba4_error.pas. El analizador detecta error de comentario.
>

