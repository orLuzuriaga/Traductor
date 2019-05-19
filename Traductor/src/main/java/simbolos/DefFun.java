package simbolos;

import java.io.PrintWriter;

public class DefFun extends NoTerminal{

	
	
	private String function;
	private String identifier;
	private String fpl;
	private String dosPuntos;
	private String tbas;
	private String puntoYcoma1;
	private Blq blq;
	private String puntoYcoma2;
	

	private String funCompleta;
	
	private String cabecera = "";
	
	public DefFun(String function, String identifier, String fpl, String dosPuntos, String tbas,
			String puntoYcoma1, NoTerminal blq, String puntoYcoma2) {
		super();
		this.function = function;
		this.identifier = identifier;
		this.fpl = fpl;
		this.dosPuntos = dosPuntos;
		this.tbas = tbas;
		this.puntoYcoma1 = puntoYcoma1;
		this.blq = (Blq) blq;
		this.puntoYcoma2 = puntoYcoma2;
	}

	
	
	


	public DefFun(String function, String identifier, String dosPuntos, String tbas, String puntoYcoma1, NoTerminal blq,
			String puntoYcoma2) {
		super();
		this.function = function;
		this.identifier = identifier;
		this.dosPuntos = dosPuntos;
		this.tbas = tbas;
		this.puntoYcoma1 = puntoYcoma1;
		this.blq = (Blq) blq;
		this.puntoYcoma2 = puntoYcoma2;
	}





	  
    public String getFunction() {
		return function;
	}






	public String getIdentifier() {
		return identifier;
	}






	public String getFpl() {
		return fpl;
	}






	public String getDosPuntos() {
		return dosPuntos;
	}






	public String getTbas() {
		return tbas;
	}






	public String getPuntoYcoma1() {
		return puntoYcoma1;
	}






	public Blq getBlq() {
		return blq;
	}






	public String getPuntoYcoma2() {
		return puntoYcoma2;
	}










	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}






	public String getFunCompleta() {
		return funCompleta;
	}






	public void setFunCompleta(String funCompleta) {
		this.funCompleta = funCompleta;
	}






	//Añadimos las variables
	private String addVariables() {
		 //Añadimos las variables
		
		String var = "";
		if(blq.getDclList()!= null) {
			try {
				  for(Dcl dcl: blq.getDclList()){ 
			        	
			        	if(dcl.getTipoDcl() == 'v')var += dcl.getDefVar() + "\n";	
			        
			        }
			        	
			} catch (Exception e) {
				System.err.println("No hay ningun variable declarada: " + e.getMessage());
			}
	      
		}
		
        return var;
		
	}
	
	/*
	
  //Añadimos el resto de sentencias
	private String addSent() {
		  String devolver = "return ";
		  String cuerpo = "";
		  if(blq.getSentlist()!=null) {
			  try {
					
				  for(Sent sent: blq.getSentlist()){
					   //ASIG ";"
		               if(!sent.getAsig().getId().getIdentifier().equals(this.identifier)){
		                   cuerpo += sent.getAsig().asigCom() + sent.getPyC() + "\n";
		               //"if" EXPCOND "then" BLQ "else" BLQ
		               }else if(sent.getProc_call() != null){
		            	   cuerpo += sent.getProc_call() + sent.getPyC() + "\n";
		               }else {
		            	     devolver += sent.getAsig().asigInc()  + sent.getPyC() + "\n";
		               }
		          } 
			} catch (Exception e) {
				System.err.println("No hay ninguna sentencia declarada:" + e.getMessage());
			 
			  
		  }
		}
	     
           cuerpo += devolver;
           
        return cuerpo;
		
	}
*/

/*

    private String cabecera() {
    	
    	if(this.fpl!=null) {
    		return   this.tbas + " "+ this.identifier + " " + this.fpl + "\n";
    	}else {
    		return  this.tbas + " "+ this.identifier + " " + "( void )" + "\n";
    	}
		
    }
	
    
    
	private String cuerpo() {
		
        // Añadimos la llave de inicio
        String cuerpo = this.blq.getBegin() + "\n"; 
        cuerpo += addVariables();
		cuerpo += addSent();
		//Añadimos la llave de fin
		cuerpo += this.blq.getEnd() + "\n" ;
		return cuerpo;
		
		
		
	}

*/
	/*
	public String toString() {
		return cabecera() + cuerpo();
	}

	
	*/
	
	

}
