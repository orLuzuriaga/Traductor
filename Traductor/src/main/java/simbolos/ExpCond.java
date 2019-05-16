package simbolos;

import java.io.PrintWriter;

public class ExpCond extends NoTerminal{
	
    private ExpCond ec1;
    private OpLog ol;
    private ExpCond ec2;
    private FactorCond fc;
    
    
   
	public ExpCond(NoTerminal ec1, NoTerminal ol, NoTerminal ec2) {
		super();
		this.ec1 = (ExpCond) ec1;
		this.ol = (OpLog) ol;
		this.ec2 = (ExpCond) ec2;
	}

	
	
	


	public ExpCond(NoTerminal fc) {
		super();
		this.fc = (FactorCond) fc;
	}







	
	
	








}
