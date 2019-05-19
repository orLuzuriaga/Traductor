package simbolos;

import java.io.PrintWriter;

public class Dcl extends NoTerminal{

	// DCL ::= DEFCTE | DEFVAR | DEFPROC | DEFFUN
	
	private String defCte = "";
	private String defVar = "";
	private DefProc defProc;
	private DefFun defFun;
	private char tipoDcl = 'x';

	

	
	public Dcl(NoTerminal defaux, char tipo) {
		
		switch (tipo) {

		case 'p':{
			this.defProc = (DefProc) defaux;
			this.tipoDcl = tipo;
			break;
			}
		
		case 'f':{
			this.defFun = (DefFun) defaux;
			this.tipoDcl = tipo;
			break;
			}
		}
	}

	
	
	
	public Dcl(String defaux, char tipo){
		switch (tipo) {
		case 'v':{
			this.defVar =  defaux;
			this.tipoDcl = tipo;
			break;}
			
		
		case 'c':{
			this.defCte =  defaux;
			this.tipoDcl = tipo;
			break;
			}
		}
		
	}

	
	
	


	public String getDefCte() {
		return defCte;
	}




	public String getDefVar() {
		return defVar;
	}




	public DefProc getDefProc() {
		return defProc;
	}




	public DefFun getDefFun() {
		return defFun;
	}




	public char getTipoDcl() {
		return tipoDcl;
	}


}
