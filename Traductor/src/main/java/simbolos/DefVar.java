package simbolos;

import java.io.PrintWriter;

public class DefVar extends NoTerminal {

	private String var;
	private DefVarList dvl;
	private String puntoYcoma;
	
	
	
	public DefVar(String var, NoTerminal dvl, String puntoYcoma) {
		super();
		this.var = var;
		this.dvl = (DefVarList) dvl;
		this.puntoYcoma = puntoYcoma;
	}



	
	
	
	
	
	
	
	




}
