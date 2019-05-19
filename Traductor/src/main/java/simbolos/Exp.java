package simbolos;

import java.io.PrintWriter;

import javax.management.openmbean.OpenDataException;

public class Exp extends NoTerminal{

	
	private Exp exp1;
	private Op op;
	private Exp exp2;
	private String factor;
	
	
	public Exp(NoTerminal exp1, NoTerminal op, NoTerminal exp2) {
		super();
		this.exp1 = (Exp) exp1;
		this.op = (Op) op;
		this.exp2 = (Exp) exp2;
	}
	
	
	
	
	
	
	public Exp(String factor) {
		super();
		this.factor =  factor;
	}






	
	
	
	
	




	
	
	


}
