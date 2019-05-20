package simbolos;

import java.io.PrintWriter;

public class Dcl extends NoTerminal{

	// DCL ::= DEFCTE | DEFVAR | DEFPROC | DEFFUN
	
	private String defCte = "";
	private DefVar defVar;
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
		case 'v':{
			this.defVar = (DefVar) defaux;
			this.tipoDcl = tipo;
			break;}
		}
	}

	
	
	
	public Dcl(String defaux, char tipo){
		
			this.defCte =  defaux;
			this.tipoDcl = tipo;
		
		
		
	}

	
	
	


	public String getDefCte() {
		return defCte;
	}




	public DefVar getDefVar() {
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
