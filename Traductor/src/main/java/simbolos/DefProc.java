package simbolos;

import java.io.PrintWriter;


public class DefProc extends NoTerminal{

	
	private String procedure;
	private Blq blq;
	private String identifier;
	private String fpl;
	private String pyc1;
	private String pyc2;
	private String proCompleto;
    
	
	
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
		this.blq = (Blq) blq;
		this.pyc1 = pyc1;
		this.pyc2= pyc2;
		
	}
	










	

	
	
	
	
	public String getProCompleto() {
		return proCompleto;
	}






	public void setProCompleto(String proCompleto) {
		this.proCompleto = proCompleto;
	}






	private String concatVar() {
			String vars = "";
			try {
				
				if(blq.getDclList() !=null) {
					 for(Dcl dcl: blq.getDclList()){
			               if ((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null) ){
			                   vars+= "  "+ dcl.getDefVar()  + "\n";
			               }
			          }	
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			

		return vars;	
	}
	
	
	
	
	
	private String concatSent() {
		String sents = "";
		if(this.blq.getSentlist()!= null)
		  for(String sent: this.blq.getSentlist()){
              sents += "  "+  sent;
             }
		return sents;
		
		
	}
	
	

	
	
	
	
	
	
	
	public String toString() {
		String funcCom = "";
		String cabecera = "";
		
		if(this.fpl != null) {
			cabecera = "void" + " " + this.identifier + " "+ this.fpl + "\n";
		}else {
		    cabecera = "void" + " "+ this.identifier + " " + "( void )" + "\n";
		}
		funcCom += this.blq.getBegin() + "\n";
		funcCom += concatVar();
		funcCom += concatSent();
		funcCom += this.blq.getEnd() + "\n";
		
		return cabecera + funcCom ;	
	}


	

}
