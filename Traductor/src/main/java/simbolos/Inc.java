package simbolos;

import java.io.PrintWriter;

public class Inc extends NoTerminal{
	
	// > || <
	private String mayorMenor = "";

	
	//-1 || +1
	private String decInc = "";
	

	
	
	public Inc(String decInc, String mayorMenor) {
		this.mayorMenor= mayorMenor;
		this.decInc = decInc;
		
	}






	public String getMayorMenor() {
		return mayorMenor;
	}




	public String getDecInc() {
		return decInc;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	

}
