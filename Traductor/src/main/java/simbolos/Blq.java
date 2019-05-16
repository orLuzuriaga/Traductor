package simbolos;

import java.io.PrintWriter;



public class Blq extends NoTerminal{

	private DclList dclList;
	private String begin;
	private SentList sl;
	private String end;
	
	

	
	
	public Blq(NoTerminal dclList, String begin, NoTerminal sl, String end) {
		super();
		this.dclList = (DclList) dclList;
		this.begin = begin;
		this.sl = (SentList) sl;
		this.end = end;
	}

	
	
	


	public Blq(String begin, NoTerminal sl, String end) {
		super();
		this.begin = begin;
		this.sl = (SentList) sl;
		this.end = end;
	}
	
	
	public Blq(String begin, String end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	
	







}
