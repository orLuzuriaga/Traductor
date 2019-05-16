package simbolos;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class DefVarList extends NoTerminal{

	private ArrayDeque<String> vl;
	private String dospuntos;
	private String tbs;
	private DefVarList dvl;
	private String puntoYcoma;
	
	
	
	
	
	
	
	
	public DefVarList(ArrayDeque<String> vl2, String dospuntos, String tbs) {
		super();
		this.vl = vl2;
		this.dospuntos = dospuntos;
		this.tbs = tbs;
	}








	public DefVarList(ArrayDeque<String> vl, String dospuntos, String tbs, NoTerminal dvl, String puntoYcoma) {
		super();
		this.vl = vl;
		this.dospuntos = dospuntos;
		this.tbs = tbs;
		this.dvl = (DefVarList) dvl;
		this.puntoYcoma = puntoYcoma;
	}








	
	
	








}
