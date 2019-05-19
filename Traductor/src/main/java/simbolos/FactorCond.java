package simbolos;

import java.io.PrintWriter;

public class FactorCond extends NoTerminal{

	private String exp1;
	private String opComp;
	private String exp2;
	private String abre_parent;
	private String cierra_parent;
	private String not;
	private FactorCond fc;
	
	
	
	public FactorCond(String exp1, String opComp2, String exp2) {
		
		this.exp1 =  exp1;
		this.opComp = opComp2;
		this.exp2 =  exp2;
	}


	
	

	public FactorCond(String not, NoTerminal fc) {
		super();
		this.not = not;
		this.fc = (FactorCond) fc;
	}

	
	




	public FactorCond(NoTerminal exp1, String abre_parent, String cierra_parent) {
		super();
		//this.exp1 = exp1;
		this.abre_parent = abre_parent;
		this.cierra_parent = cierra_parent;
	}











}
