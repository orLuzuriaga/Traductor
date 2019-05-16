package simbolos;

import simbolos.*;
import java.io.PrintWriter;


public class Prg extends NoTerminal{

	
	
	//"program" identifier ";" BLQ "." | "UNIT" identifier ";" DCLLIST "."
	
	
	private String program;
	private String identifier;
	private String puntoYcoma;
	private Blq blq;
	private String punto;
	private String unit;
	private DclList dclList;
	
	
	

	//"program" identifier ";" BLQ "."
	
	public Prg(String program, String identifier, String puntoYcoma, NoTerminal blq, String punto) {
		
		this.program = program;
		this.identifier = identifier;
		this.puntoYcoma = puntoYcoma;
		this.blq = (Blq) blq;
		this.punto = punto;
	}

	




	public Prg(String identifier, String puntoYcoma, String punto, String unit, NoTerminal dclList) {

		this.identifier = identifier;
		this.puntoYcoma = puntoYcoma;
		this.punto = punto;
		this.unit = unit;
		this.dclList = (DclList) dclList;
	}






	

}
