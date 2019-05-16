package simbolos;

import java.io.PrintWriter;

public class FactorCond extends NoTerminal{

	private Exp exp1;
	private OpComp opComp;
	private Exp exp2;
	private String abre_parent;
	private String cierra_parent;
	private String not;
	private FactorCond fc;
	
	
	
	public FactorCond(NoTerminal exp1, NoTerminal opComp, NoTerminal exp2) {
		
		this.exp1 = (Exp) exp1;
		this.opComp = (OpComp) opComp;
		this.exp2 = (Exp) exp2;
	}


	
	

	public FactorCond(String not, NoTerminal fc) {
		super();
		this.not = not;
		this.fc = (FactorCond) fc;
	}

	
	




	public FactorCond(NoTerminal exp1, String abre_parent, String cierra_parent) {
		super();
		this.exp1 = (Exp) exp1;
		this.abre_parent = abre_parent;
		this.cierra_parent = cierra_parent;
	}











}
