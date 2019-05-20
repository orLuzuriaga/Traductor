package simbolos;

import java.io.PrintWriter;

public class DefFun extends NoTerminal{

	
	
	private String function;
	private String identifier;
	private String fpl;
	private String dosPuntos;
	private String tbas;
	private String puntoYcoma1;
	private Blq blq;
	private String puntoYcoma2;
	

	private String funCompleta;
	private String subrrutinas;
	private String consts;
	
	public DefFun(String function, String identifier, String fpl, String dosPuntos, String tbas,
			String puntoYcoma1, NoTerminal blq, String puntoYcoma2) {
		super();
		this.function = function;
		this.identifier = identifier;
		this.fpl = fpl;
		this.dosPuntos = dosPuntos;
		this.tbas = tbas;
		this.puntoYcoma1 = puntoYcoma1;
		this.blq = (Blq) blq;
		this.puntoYcoma2 = puntoYcoma2;
	}

	
	
	


	public DefFun(String function, String identifier, String dosPuntos, String tbas, String puntoYcoma1, NoTerminal blq,
			String puntoYcoma2) {
		super();
		this.function = function;
		this.identifier = identifier;
		this.dosPuntos = dosPuntos;
		this.tbas = tbas;
		this.puntoYcoma1 = puntoYcoma1;
		this.blq = (Blq) blq;
		this.puntoYcoma2 = puntoYcoma2;
	}






	public String getFunCompleta() {
		return funCompleta;
	}






	public void setFunCompleta(String funCompleta) {
		this.funCompleta = funCompleta;
	}






	public String getSubrrutinas() {
		return subrrutinas;
	}






	public void setSubrrutinas(String subrrutinas) {
		this.subrrutinas = subrrutinas;
	}






	public String getConsts() {
		return consts;
	}






	public void setConsts(String consts) {
		this.consts = consts;
	}




	
	

	
}
