package simbolos;

import java.io.PrintWriter;

public class SentList extends NoTerminal{

	private Sent sent;
	private SentList sl;
	
	
	
	public SentList(NoTerminal sent, NoTerminal sl) {
		super();
		this.sent = (Sent) sent;
		this.sl = (SentList) sl;
	}


	
	

	public SentList(NoTerminal sent) {
		super();
		this.sent = (Sent) sent;
	}






	
	






}
