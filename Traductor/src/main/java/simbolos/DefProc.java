package simbolos;

import java.io.PrintWriter;


public class DefProc extends NoTerminal{

	
	private String cabecera;
	private String cuerpo;
	private DefProc proc;
	private DefFun fun;
	private String consts;
	private String vars;
	
	
	
	
	
	

	public DefProc(String cabecera, String cuerpo, DefProc proc, DefFun fun, String consts, String vars) {
		super();
		this.cabecera = cabecera;
		this.cuerpo = cuerpo;
		this.proc = proc;
		this.fun = fun;
		this.consts = consts;
		this.vars = vars;
	}
	
	
	
	
	
	
	public String getCabecera() {
		return cabecera;
	}
	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public DefProc getProc() {
		return proc;
	}
	public void setProc(DefProc proc) {
		this.proc = proc;
	}
	public DefFun getFun() {
		return fun;
	}
	public void setFun(DefFun fun) {
		this.fun = fun;
	}
	public String getConsts() {
		return consts;
	}
	public void setConsts(String consts) {
		this.consts = consts;
	}
	public String getVars() {
		return vars;
	}
	public void setVars(String vars) {
		this.vars = vars;
	}
	
	
	






	

}
