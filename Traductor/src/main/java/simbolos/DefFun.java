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






	public String getFunCompleta() {
		return funCompleta;
	}






	public void setFunCompleta(String funCompleta) {
		this.funCompleta = funCompleta;
	}




	
	
	
	private String concatVar() {
			String vars = "";
			try {
				
				if(blq.getDclList() !=null) {
					 for(Dcl dcl: blq.getDclList()){
			               if ((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null) ){
			                   vars+= dcl.getDefVar()  + "\n";;
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
              sents += sent;
             }
		return sents;
		
		
	}
	
	
	public String toString() {
		String funcCom = "";
		String cabecera = "";
		
		if(this.fpl != null) {
			cabecera = this.tbas + " " + this.identifier + " "+ this.fpl + "\n";
		}else {
		    cabecera = this.tbas + " "+ this.identifier + " " + "( void )" + "\n";
		}
		funcCom += this.blq.getBegin() + "\n";
		funcCom += concatVar();
		funcCom += concatSent();
		funcCom += this.blq.getEnd() + "\n";
		
		return cabecera + funcCom ;	
	}

}
