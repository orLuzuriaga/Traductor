package simbolos;

import java.io.PrintWriter;

public class Formal_paramlist extends NoTerminal {

	
	private String abre_parent;
	private String fP;
	private String cierra_parent;
	private String sinParam;
	
	
	
	
	public Formal_paramlist(String abre_parent, String fP, String cierra_parent) {
		super();
		this.abre_parent = abre_parent;
		this.fP = fP;
		this.cierra_parent = cierra_parent;
	}

	
	public Formal_paramlist(String abre_parent, String cierra_parent) {
		super();
		this.abre_parent = abre_parent;
		this.sinParam = "void";
		this.cierra_parent = cierra_parent;
	}




	

	
	
	






	
	
	
}
