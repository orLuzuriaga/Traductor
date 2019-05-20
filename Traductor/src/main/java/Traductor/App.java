/**
 * 
 * @author Oswaldo Renato Luzuriaga Luzuriaga.
 *
 */

package Traductor;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java_cup.runtime.ComplexSymbolFactory;
import LexicoSintactico.AnalizadorLexico;
import LexicoSintactico.AnalizadorSintactico;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import simbolos.*;




public class App {







private static Scanner teclado;




public  static void analizarSintaxis(String prueba) {
	
	
	 try{ 
		    
		 ComplexSymbolFactory csf = new ComplexSymbolFactory();
		 //creamos el analizador lexico 
		 
		// ScannerBuffer buffer = new ScannerBuffer(new AnalizadorLexico(new BufferedReader(new FileReader(prueba)), csf));
		 AnalizadorLexico lexico = new AnalizadorLexico(new BufferedReader(new FileReader(prueba)), csf);
	     AnalizadorSintactico sintactico = new AnalizadorSintactico(lexico,csf);
	     System.out.println("Sintactico run...");
	     System.out.println();
	     sintactico.parse();
	     
	     Prg prg = (Prg)sintactico.getProgram();
	     
	     if(prg.getProgram().equalsIgnoreCase("program")) {
	    	 escribirFichero(prg.toString(),prg.getIdentifier());
	    	 System.out.println("** Programa: " + prg.getIdentifier()+".pas" + " traducido con exito **");
	     }else if(prg.getUnit().equalsIgnoreCase("unit")){
	    	 escribirFichero(prg.toString(),prg.getIdentifier());
	    	 System.out.println("** Libreria: " + prg.getIdentifier()+".pas" + " traducida con exito **");
	     }else {
	    	 
	    	 System.out.println("** Error al realizar la traduccción **");
	     }
	 

		     
		     
		}
		catch (java.io.FileNotFoundException e) 
			{
				System.err.println();
				System.err.println("ERROR ARCHIVO NO ENCONTRADO");
				
			}
		catch (java.io.IOException e) 
			{
				System.err.println();
				System.err.println("ERROR DURANTE LA LECTURA DEL ARCHIVO");
				
			}
		catch (Exception e) 
			{
				System.err.println();
				System.err.println("ERROR AL REALIZAR LA TRADUCCIÓN: " +  e.getMessage());
				
			 
		 }
		
		 
		 
	
}
		




public static void escribirFichero(String outFile, String nombre) {
	
	  String[] lines = new String[] {outFile};
      Path path = Paths.get(nombre + "_final"+".c");
      try (BufferedWriter br = Files.newBufferedWriter(path,
            Charset.defaultCharset(), StandardOpenOption.CREATE)) {
    	  
        Arrays.stream(lines).forEach((s) -> {
            try {
               br.write(s);
               br.newLine();
            } catch (IOException e) {
               System.err.println(e.getMessage());
            }

         });
      } catch (Exception e) {
         e.printStackTrace();
      }
}




public static void crearAnalizadorLexico(String [] espFlex ){
	 try {
		 
		 jflex.Main.main(espFlex);
	    
	     System.out.println("** Analizador lexico generado con exito ***");

		
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
	
	
}




public static void crearAnalizadorSintactico(String espParser) {
	
	String[] asintactico = {"-locations","-parser", "AnalizadorSintactico", espParser};

    try {
      java_cup.Main.main(asintactico);
    } catch (Exception ex) {
        System.err.println(ex.getLocalizedMessage());
    }
}



public static void menu() {
	System.out.println();
	System.out.println("******************************************");
	System.out.println("***********     Traductor     ************");
	System.out.println("******************************************");
	/*System.out.println("1.Crear analizador lexico:");
	System.out.println("2.Crear analizador sintactico:");
	System.out.println("3.Analizar Lexico:");*/
	System.out.println("1.Traducir:");
	System.out.println("2.Salir: ");
	System.out.println("Opcion:");
}







public  static void analizarLexico(String prueba) {
	
	
	 try{ 
		    
		 //creamos el analizador lexico 
		 
		AnalizadorLexico scanner = new AnalizadorLexico(new java.io.FileReader(prueba));
		 
		System.out.println(scanner.next_token());
	
	  do {
		  
		System.out.println(scanner.next_token().value);
		 
	  }while(!(scanner.next_token()!= null));
          
	     System.out.println();
	     System.out.println();
	     System.out.println();
	     System.out.println("** Analisis lexico completado con exito **");
		     
		     
		}
		catch (java.io.FileNotFoundException e) 
			{
				System.err.println();
				System.err.println("ERROR ARCHIVO NO ENCONTRADO");
				
			}
		catch (java.io.IOException e) 
			{
				System.err.println();
				System.err.println("ERROR DURANTE LA LECTURA DEL ARCHIVO");
				
			}
		catch (Exception e) 
			{
				System.err.println();
				System.err.println("ERROR: " +  e.getMessage());
				
			 
		 }	
}
	



public static void main(String[] args) {
		   
		teclado = new Scanner(System.in);
	    int valor = 0;
	    String arPrueba = "";
	/*    
	    if (args.length == 0) {
            System.out.println("Inserta nombre de archivo\n");
            arPrueba = teclado.nextLine();
            analizarSintaxis(arPrueba);
        } else {
        	
     		
     		
     		for (int i = 0;  i < args.length; i++) 
					arPrueba += args[i];
			
     		analizarSintaxis(arPrueba);
                
           }*/
	    
	  
	   
	    do {
	    	menu();
	        valor = teclado.nextInt();
	        switch (valor) {
	           
	       /*s
	        case   1:{
	        	if(args.length == 0)System.out.println("\"Inserta nombre de archivo\" + \"( Use : java Analizador <inputfile> )\"");
	        	else crearAnalizadorLexico(args);
	        	break;
	        	
	        }
	           
	        case 2: {
	        	if(args.length == 0)System.out.println("\"Inserta nombre de archivo\" + \"( Use : java Analizador <inputfile> )\"");
	        	else {
	        		
	        		for (int i = 0;  i < args.length; i++) {
						arPrueba += args[i];
					}
	           crearAnalizadorSintactico(arPrueba);
	        	} 
	            	
	            	
	              
	            break;
	        }
	        
	        case 3: {
	        
	        	if(args.length == 0)System.out.println("\"Inserta nombre de archivo\" + \"( Use : java Analizador <inputfile> )\"");
	        	else {
	        		
	        		for (int i = 0;  i < args.length; i++) {
						arPrueba += args[i];
					}
	           analizarLexico(arPrueba);
	        	}  
	            break;
	        }*/
	        case 1: {
		        
	        	if(args.length == 0) {
	        		 System.out.println("\"Introduce el nombre del archivo que quieres traducir\" -> \"[ Utiliza: java -jar Traductor.jar <nombre archivo.pas> ]\"");
	        		 System.out.println();
	        		 valor = 2;
	        	}else {
	        		
	        		for (int i = 0;  i < args.length; i++) {
						arPrueba += args[i];
					}
	        		analizarSintaxis(arPrueba);
	        		valor = 2;
	        	}  
	        	break;
	        }
	       
	            case 2: {
	          	  System.out.println("No Vemos...");
	              break;
	          }
	            
	            default: {
	                System.out.println("Opcion no valida!");
	                break;
	            }
	        }
	    } while (valor != 2);
	      
	  
	            
	 }
	}		