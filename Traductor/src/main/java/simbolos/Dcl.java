package simbolos;

import java.io.PrintWriter;

public class Dcl extends NoTerminal{

	// DCL ::= DEFCTE | DEFVAR | DEFPROC | DEFFUN
	private String dcl;
	private char tipoDcl;

	

	
	public Dcl(String dcl, char tipo) {
		
	 this.dcl = dcl;
	 this.tipoDcl = tipo;
	}




	public String getDcl() {
		return dcl;
	}

	public char getTipoDcl() {
		return tipoDcl;
	}


}
