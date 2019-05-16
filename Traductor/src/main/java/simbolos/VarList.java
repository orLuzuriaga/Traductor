package simbolos;

import java.io.PrintWriter;

public class VarList extends NoTerminal {

	
	private String identifier;
	private String coma;
	private VarList vl;
	
	
	public VarList(String identifier, String coma, NoTerminal vl) {
		super();
		this.identifier = identifier;
		this.coma = coma;
		this.vl = (VarList) vl;
	}

	
	

	public VarList(String identifier) {
		super();
		this.identifier = identifier;
	}





	
	
	





	
}
