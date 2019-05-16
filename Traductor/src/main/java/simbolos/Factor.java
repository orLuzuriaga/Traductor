package simbolos;

import java.io.PrintWriter;

public class Factor extends NoTerminal {

	
	private SimpValue simpValue;
	private String abre_parent;
	private Exp exp;
	private String cierra_parent;
	private String identifier;
	private SubpparamList subPanramList;
	
	
	
	public Factor(NoTerminal simpValue) {
		super();
		this.simpValue = (SimpValue) simpValue;
	}



	
	

	public Factor(String abre_parent, NoTerminal exp, String cierra_parent) {
		super();
		this.abre_parent = abre_parent;
		this.exp = (Exp) exp;
		this.cierra_parent = cierra_parent;
	}


	




	public Factor(String identifier, NoTerminal subPanramList) {
		super();
		this.identifier = identifier;
		this.subPanramList = (SubpparamList) subPanramList;
	}


	public Factor(String identifier) {
		
		this.identifier = identifier;
	
	}










	
	
	


}
