/**
 * 
 * @author Oswaldo Renato Luzuriaga Luzuriaga.
 *
 */

package Traductor;



import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import java_cup.runtime.ComplexSymbolFactory;
import LexicoSintactico.AnalizadorLexico;
import LexicoSintactico.AnalizadorSintactico;






public class App {







private static Scanner teclado;




public  static void analizarSintaxis(String prueba) {
	
	
	 try{ 
		    
		 ComplexSymbolFactory csf = new ComplexSymbolFactory();
		 //creamos el analizador lexico 
		 
		// ScannerBuffer buffer = new ScannerBuffer(new AnalizadorLexico(new BufferedReader(new FileReader(prueba)), csf));
		 AnalizadorLexico lexico = new AnalizadorLexico(new BufferedReader(new FileReader(prueba)), csf);
	     AnalizadorSintactico sintactico = new AnalizadorSintactico(lexico,csf);
	     
	     
	     System.out.println("Sintactico run:");
	     sintactico.parse();
	     
	     //System.out.println (buffer.getBuffered ());
	     System.out.println();
	     System.out.println();
	     System.out.println("** Analisis sintactico completado con exito **");
		     
		     
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
	System.out.println("1.Crear analizador lexico:");
	System.out.println("2.Crear analizador sintactico:");
	System.out.println("3.Analizar Lexico:");
	System.out.println("4.Analizar sintactico:");
	System.out.println("5.Salir: ");
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
	        }
	        case 4: {
		        
	        	if(args.length == 0)System.out.println("\"Inserta nombre de archivo\" + \"( Use : java Analizador <inputfile> )\"");
	        	else {
	        		
	        		for (int i = 0;  i < args.length; i++) {
						arPrueba += args[i];
					}
	        		analizarSintaxis(arPrueba);
	        	}  
	        }
	       
	            case 5: {
	          	  System.out.println("Fin de programa.");
	              break;
	          }
	            
	            default: {
	                System.out.println("Opcion no valida!");
	                break;
	            }
	        }
	    } while (valor != 3);
	      
	  
	            
	 }
	}		