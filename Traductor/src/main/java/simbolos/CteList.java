package simbolos;

import java.io.PrintWriter;

public class CteList extends NoTerminal {

	private String identifier;
	private String igual;
	private SimpValue simpValue;
	private CteList cteList;
	private String puntoYcoma;
	
	
	
	
	
	
	
	public CteList(String identifier, String igual, NoTerminal sv, NoTerminal cl, String puntoYcoma) {
		super();
		this.identifier = identifier;
		this.igual = igual;
		this.simpValue = (SimpValue) sv;
		this.cteList = (CteList) cl;
		this.puntoYcoma = puntoYcoma;
	}







	public CteList(String identifier, String igual, NoTerminal sv, String puntoYcoma) {
		super();
		this.identifier = identifier;
		this.igual = igual;
		this.simpValue = (SimpValue) sv;
		this.puntoYcoma = puntoYcoma;
	}











}
