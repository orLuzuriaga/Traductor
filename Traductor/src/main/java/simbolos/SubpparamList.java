package simbolos;

import java.io.PrintWriter;

public class SubpparamList extends NoTerminal {

	
	private String abre_parent;
	private ExpList expList;
	private String cierra_parent;
	
	
	
	public SubpparamList(String abre_parent, NoTerminal expList, String cierra_parent) {
		super();
		this.abre_parent = abre_parent;
		this.expList = (ExpList) expList;
		this.cierra_parent = cierra_parent;
	}



	
	
	
	
	
	



	

}
