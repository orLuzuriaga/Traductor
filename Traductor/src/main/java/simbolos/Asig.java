package simbolos;

import java.io.PrintWriter;

public class Asig extends NoTerminal {

	
	private Id id;
	private String asig;
	private Exp exp;
	
	
	public Asig(NoTerminal id, String asig, NoTerminal exp) {
		super();
		this.id = (Id) id;
		this.asig = asig;
		this.exp = (Exp) exp;
	}





	

}
