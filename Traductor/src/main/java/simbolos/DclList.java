package simbolos;

import java.io.PrintWriter;

public class DclList extends NoTerminal {

	private Dcl dcl;
	private DclList dclList;
	
	
	
	public DclList(NoTerminal dcl, NoTerminal dclList) {
		super();
		this.dcl = (Dcl) dcl;
		this.dclList = (DclList) dclList;
	}



	public DclList(NoTerminal dcl) {
		super();
		this.dcl = (Dcl) dcl;
	}



	public Dcl getDcl() {
		return dcl;
	}



	public DclList getDclList() {
		return dclList;
	}



	
	
	





}
