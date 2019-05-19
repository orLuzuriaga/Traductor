package simbolos;

import java.io.PrintWriter;


public class DefProc extends NoTerminal{

	
	private String procedure;
	private Blq blq;
	private String identifier;
	private String fpl;
	private String pyc1;
	private String pyc2;
	
	
	
	
	/*
	* DEFPROC ::= "procedure" identifier FORMAL_PARAMLIST ";" BLQ ";"
	*/
  
    public DefProc(String p, String id, String fpl,String pyc1, NoTerminal blq, String pyc2) {
    	super();
		this.procedure = procedure;
		this.identifier = id;
		this.fpl = fpl;
		this.pyc1 = pyc1;
		this.blq = (Blq) blq;
		this.pyc2= pyc2;
	}
    
    
    
    
    
    
	/*
	* DEFPROC ::= "procedure" identifier FORMAL_PARAMLIST ";"
	*/

	public DefProc(String procedure, String id, String pyc1, NoTerminal blq, String pyc2) {
		super();
		this.procedure = procedure;
		this.identifier = id;
		this.fpl = fpl;
		this.pyc1 = pyc1;
		this.pyc2= pyc2;
		
	}
	

	
	
	
	
	



	  


	//Añadimos las variables
	private String addVariables() {
		 //Añadimos las variables
		
		String var = "";
		try {
			if(blq.getDclList() != null) {
				 for(Dcl dcl: blq.getDclList()){ 
			        	if(dcl.getTipoDcl() == 'v')var += dcl.getDefVar() + "\n";
			        }
			}
			
		} catch (Exception e) {
			System.err.println("No hay ningun variable declarada: " + e.getMessage());
		}
       
        
        return var;
		
	}

	
	  //Añadimos el resto de sentencias
		private String addSent() {
			 
			  String cuerpo = "";
			  try {
				  if(blq.getSentlist() != null) {
					  for(Sent sent: blq.getSentlist()){
						  //ASIG ";"
						  if(sent.getProc_call() != null){
							  cuerpo += sent.getProc_call() + sent.getPyC() + "\n";
							  
				           //"if" EXPCOND "then" BLQ "else" BLQ
			               }else if(sent.getWord_if().equalsIgnoreCase("if")){
			            	   cuerpo +=  sent.getWord_if() + "(" + sent.getExpCond() + ")" +sent.getBlq1();
			         	
			              //PROC_CALL ";"   
			               }else {
			            	   cuerpo += sent.getAsig().asigCom() + sent.getPyC() + "\n";
			               }
						  
						
		          }  
				  }
				 
			} catch (Exception e) {
				System.err.println("No hay ninguna sentencia declarada:" + e.getMessage());
			}
		      
	         
	           
	        return cuerpo;
			
		}



		
	    private String cabecera() {
	    	
	    	if(this.fpl!=null) {
	    		return   "void" + " "+ this.identifier + " " + this.fpl + "\n";
	    	}else {
	    		return  "void"  + " "+ this.identifier + " " + "( void )" + "\n";
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

		
		
		
		
		public String toString() {
			return cabecera() + cuerpo();
		}



	

}
