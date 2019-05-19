package simbolos;

import java.io.PrintWriter;


public class DefProc extends NoTerminal{

	
	private String procedure;
	private Blq blq;
	private String identifier;
	private String fpl;
	private String pyc1;
	private String pyc2;
	
	
	private String proCompleta;
	
	
	/*
	* DEFPROC ::= "procedure" identifier FORMAL_PARAMLIST ";" BLQ ";"
	*/
  
    public DefProc(String p, String id, String fpl,String pyc1, NoTerminal blq, String pyc2) {
    	super();
		this.procedure = p;
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
	



	public String getProCompleta() {
		return proCompleta;
	}






	public void setProCompleto(String proCompleto) {
		this.proCompleta = proCompleto;
	}



	

}
