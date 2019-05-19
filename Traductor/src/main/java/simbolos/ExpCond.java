package simbolos;

import java.io.PrintWriter;

public class ExpCond extends NoTerminal{
	
    private ExpCond ec1;
    private String ol;
    private ExpCond ec2;
    private FactorCond fc;
    
    
   
	public ExpCond(NoTerminal ec1, String ol2, NoTerminal ec2) {
		super();
		this.ec1 = (ExpCond) ec1;
		this.ol = ol2;
		this.ec2 = (ExpCond) ec2;
	}

	
	
	


	public ExpCond(NoTerminal fc) {
		super();
		this.fc = (FactorCond) fc;
	}







	
	
	








}
