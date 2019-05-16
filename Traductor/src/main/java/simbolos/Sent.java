package simbolos;

import java.io.PrintWriter;

public class Sent extends NoTerminal {

	
	private Asig asig;
	private String punto_y_coma;
	private Proc_call proc_call;
	private String word_if;
	private String word_then;
	private String word_else;
	private Blq blq1;
	private Blq blq2;
	private ExpCond ec;
	private String word_while;
	private String word_do;
	private String word_until;
	private String word_repeat;
	private String word_for;
	private String asignacion;
	private String identifier;
	private Exp exp1;
	private Exp exp2;
	private Inc inc;
	
	
	
	public Sent(NoTerminal asig, String punto_y_coma) {
		super();
		this.asig = (Asig) asig;
		this.punto_y_coma = punto_y_coma;
	}

	
	


   public Sent(String punto_y_coma, NoTerminal proc_call) {
		super();
		this.punto_y_coma = punto_y_coma;
		this.proc_call = (Proc_call) proc_call;
	}




// "if" EXPCOND "then" BLQ "else" BLQ
	public Sent(String word_if, NoTerminal ec, String word_then, NoTerminal blq1, String word_else, NoTerminal blq2) {
		this.ec = (ExpCond) ec;
		this.word_if = word_if;
		this.word_then = word_then;
		this.word_else = word_else;
		this.blq1 = (Blq) blq1;
		this.blq2 = (Blq) blq2;
	}

 // "while" EXPCOND "do" BLQ
    public Sent(String ww, NoTerminal ec, String wd, NoTerminal blq) {
    	this.word_while = ww;
    	this.ec = (ExpCond) ec;
    	this.word_do = wd;
    	this.blq1 = (Blq)blq;
    	
    	
    }

    //"repeat" BLQ "until" EXPCOND ";"
    public Sent(String wp, NoTerminal blq,String wu, NoTerminal expCond, String pyc) {
    	
    	this.word_repeat = wp;
    	this.blq1 = (Blq)blq;
    	this.word_until = wu;
    	this.ec = (ExpCond)expCond;
    	this.punto_y_coma = pyc;
    }
    
    



	public Sent(NoTerminal blq, String wd, String wf, String a, String id, NoTerminal exp1, NoTerminal i, NoTerminal exp2) {
		this.blq1 = (Blq) blq;
		this.word_do = wd;
		this.word_for = wf;
		this.asignacion = a;
		this.identifier = id;
		this.exp1 = (Exp) exp1;
		this.exp2 = (Exp) exp2;
		this.inc = (Inc) i;
	}
	
	
	
	
	
	
	










}
