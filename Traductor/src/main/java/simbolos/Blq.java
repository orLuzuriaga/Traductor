package simbolos;

import java.io.PrintWriter;
import java.util.ArrayDeque;



public class Blq extends NoTerminal{

	private ArrayDeque<Dcl> dclList;
	private String begin;
	private ArrayDeque<String> sentlist;
	private String end;
	


	
	public Blq(ArrayDeque<Dcl> dclList, String begin, ArrayDeque<String> sl, String end) {
		super();
		this.dclList =  dclList;
		this.begin = begin;
		this.sentlist =  sl;
		this.end = end;
	}

	
	
	


	public Blq(String begin,  ArrayDeque<String> sl, String end) {
		super();
		this.begin = begin;
		this.sentlist =  sl;
		this.end = end;
	}
	
	
	public Blq(String begin, String end) {
		super();
		this.begin = begin;
		this.end = end;
	}




    /* Getters an setters */

	public String getBegin() {
		return begin;
	}



	public String getEnd() {
		return end;
	}



	public ArrayDeque<Dcl> getDclList() {
		return dclList;
	}



	public ArrayDeque<String> getSentlist() {
		return sentlist;
	}
	
	
	




}
