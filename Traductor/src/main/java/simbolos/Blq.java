package simbolos;

import java.io.PrintWriter;
import java.util.ArrayDeque;



public class Blq extends NoTerminal{

	private ArrayDeque<Dcl> dclList;
	private String begin;
	private ArrayDeque<Sent> sentlist;
	private String end;
	
	//Contiene todas las variables concatenadas en un string
	private String vars = "";
	//contiene todas las sentencias concatenadas en un string
	private String sents = "";
	//Contiene todos las constantes concatenadas en un string
	private String consts = "";
    //Contiene todas las funciones concatenadas en un string
	private String  func = "";
	//contiene todas las procedimientos concatenadas en un string
	private String proc = "";
	
	
	private String nombreFuncion = "";
	
	public Blq(ArrayDeque<Dcl> dclList, String begin, ArrayDeque<Sent> sl, String end) {
		super();
		this.dclList =  dclList;
		this.begin = begin;
		this.sentlist =  sl;
		this.end = end;
	}

	
	
	


	public Blq(String begin,  ArrayDeque<Sent> sl, String end) {
		super();
		this.begin = begin;
		this.sentlist =  sl;
		this.end = end;
	}
	
	
	public Blq(String begin, String end) {
		super();
		this.begin = begin;
		this.end = end;
	}




    /* Getters an setters */

	public String getBegin() {
		return begin;
	}



	public String getEnd() {
		return end;
	}



	public ArrayDeque<Dcl> getDclList() {
		return dclList;
	}



	public ArrayDeque<Sent> getSentlist() {
		return sentlist;
	}
	
	
	

	  
    public String getNombreFuncion() {
		return nombreFuncion;
	}






	public void setNombreFuncion(String nombreFuncion) {
		this.nombreFuncion = nombreFuncion;
	}






	//Añadimos las variables
	private String conVars() {
		 //Añadimos las variables
		
		String var = "";
		if(this.dclList!= null) {
			try {
				  for(Dcl dcl: this.dclList){ 
			        	if(dcl.getTipoDcl() == 'v')var += dcl.getDefVar() + "\n";	
			        }
			        	
			} catch (Exception e) {
				System.err.println("No hay ningun variable declarada: " + e.getMessage());
			}
		}
		
        return vars;
		
	}
	
	
	
	
	  //Añadimos el resto de sentencias
 private String conSents() {
		 
		  String cuerpo = "";
		  if(this.dclList!=null) {
			  try {
					
				  for(Sent sent: this.sentlist){
		               if(sent.getProc_call() != null){
		            	   cuerpo += sent.getProc_call() + sent.getPyC() + "\n";
		               }else {
		            	   cuerpo += sent.getAsig().asigCom() + sent.getPyC() + "\n";
		               }
		          } 
			} catch (Exception e) {
				System.err.println("No hay ninguna sentencia declarada:" + e.getMessage());
			 
			  
		  }
		} 
        return cuerpo;
}
 
 
	
  /*
   * Devuelve la concatenación de variables y todas las sentencias que pertenezcan al bloque
   */
  public String toString() {

	return this.begin + "\n" + conVars() +  conSents() + this.end + "\n";
	  
  }





}
