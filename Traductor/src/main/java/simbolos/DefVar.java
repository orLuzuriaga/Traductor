package simbolos;

import java.io.PrintWriter;
import java.util.ArrayDeque;

public class DefVar extends NoTerminal {

	private String var;
	private ArrayDeque<String>  dvl;
	private String pyc;
	
	
	
	public DefVar(String var, ArrayDeque<String> dvl, String puntoYcoma) {
		super();
		this.var = var;
		this.dvl =  dvl;
		this.pyc = puntoYcoma;
	}



	public String getPyc() {
		return pyc;
	}



	public void setPyc(String pyc) {
		this.pyc = pyc;
	}



	public ArrayDeque<String> getDvl() {
		return dvl;
	}



	public void setDvl(ArrayDeque<String> dvl) {
		this.dvl = dvl;
	}



	
	
	
	
	
	
	
	




}
