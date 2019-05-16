package simbolos;

import java.io.PrintWriter;

public class ExpList extends NoTerminal
{


	private Exp exp;
	private String coma;
	private ExpList expList;
	
	
	public ExpList(NoTerminal  exp, String coma, NoTerminal expList) {
		this.exp = (Exp) exp;
		this.coma = coma;
		this.expList = (ExpList) expList;
	}
	
	
	 public ExpList(NoTerminal exp) {
		this.exp = (Exp) exp;
	}




	 
	 


	 
	

}
