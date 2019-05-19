package simbolos;

import java.io.PrintWriter;

public class Asig extends NoTerminal {

	
	private Id id;
	private String igual = "";
	private String exp = "";
	
	
	public Asig(NoTerminal id, String igual, String exp) {
		super();
		this.id = (Id) id;
		this.igual = igual;
		this.exp =  exp;
	}


	public Id getId() {
		return id;
	}



    
	public String  asigCom() {
		
		
		return id.getIdentifier() + igual + exp;

	}

	public String  asigInc() {
	
		return igual + exp;

	}

	

}
