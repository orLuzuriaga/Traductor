package simbolos;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class Sent extends NoTerminal {

	
	private Asig asig;
	private String punto_y_coma;
	private String proc_call;
	private String word_if;
	private String word_then;
	private String word_else;
	private Blq blq1;
	private Blq blq2;
	private String expCond;
	private String word_while;
	private String word_do;
	private String word_until;
	private String word_repeat;
	private String word_for;
	private String asignacion;
	private String identifier;
	private String exp1;
	private String exp2;
	private Inc inc;
	
	private String nombreFuncion;
	
	public Sent(NoTerminal asig, String punto_y_coma) {
		super();
		this.asig = (Asig) asig;
		this.punto_y_coma = punto_y_coma;
	}

	
	


   public Sent(String pyc, String proc_call) {
		super();
		this.punto_y_coma = pyc;
		this.proc_call = proc_call;
	}




// "if" EXPCOND "then" BLQ "else" BLQ
	public Sent(String word_if, String ec, String word_then, NoTerminal blq1, String word_else, NoTerminal blq2) {
		this.expCond = ec;
		this.word_if = word_if;
		this.word_then = word_then;
		this.word_else = word_else;
		this.blq1 = (Blq) blq1;
		this.blq2 = (Blq) blq2;
	}

 // "while" EXPCOND "do" BLQ
    public Sent(String ww, String ec, String wd, NoTerminal blq) {
    	this.word_while = ww;
    	this.expCond =  ec;
    	this.word_do = wd;
    	this.blq1 = (Blq)blq;
    	
    	
    }

    //"repeat" BLQ "until" EXPCOND ";"
    public Sent(String wp, NoTerminal blq,String wu, String expCond, String pyc) {
    	
    	this.word_repeat = wp;
    	this.blq1 = (Blq)blq;
    	this.word_until = wu;
    	this.expCond = expCond;
    	this.punto_y_coma = pyc;
    }
    
    



	public Sent(NoTerminal blq, String wd, String wf, String a, String id, String exp1, NoTerminal i, String exp2) {
		this.blq1 = (Blq) blq;
		this.word_do = wd;
		this.word_for = wf;
		this.asignacion = a;
		this.identifier = id;
		this.exp1 = exp1;
		this.exp2 = exp2;
		this.inc = (Inc) i;
	}





	public String getNombreFuncion() {
		return nombreFuncion;
	}





	public void setNombreFuncion(String nombreFuncion) {
		this.nombreFuncion = nombreFuncion;
	}





	public Asig getAsig() {
		return asig;
	}





	public String getPyC() {
		return punto_y_coma;
	}





	public String getProc_call() {
		return proc_call;
	}






   public String getWord_if() {
		return word_if;
	}





public String getPunto_y_coma() {
	return punto_y_coma;
}





public String getWord_then() {
	return word_then;
}





public String getWord_else() {
	return word_else;
}





public Blq getBlq1() {
	return blq1;
}





public Blq getBlq2() {
	return blq2;
}





public String getExpCond() {
	return expCond;
}





public String getWord_while() {
	return word_while;
}





public String getWord_do() {
	return word_do;
}





public String getWord_until() {
	return word_until;
}





public String getWord_repeat() {
	return word_repeat;
}





public String getWord_for() {
	return word_for;
}





public String getAsignacion() {
	return asignacion;
}





public String getIdentifier() {
	return identifier;
}





public String getExp1() {
	return exp1;
}





public String getExp2() {
	return exp2;
}





public Inc getInc() {
	return inc;
}








/*
public String cuerpoIf() {
	   
	   String auxIf = "";
	   
	   auxIf += this.word_if + "(" + this.expCond + ")" +"\n";
	   auxIf += this.blq1.getBegin() + "\n";
	   auxIf +=  this.blq1.cuerpo("");
	   auxIf += this.word_else + "\n";
	   auxIf += this.blq2.cuerpo("");
	 
	return auxIf;
	   
	   
   }

*/






	
	
	
	
	
	
	
	
	
	










}
