package simbolos;

import simbolos.*;
import java.io.PrintWriter;
import java.util.ArrayDeque;


public class Prg extends NoTerminal{

	
	
	//"program" identifier ";" BLQ "." | "UNIT" identifier ";" DCLLIST "."
	
	
	private String program = "";
	private String identifier = "";
	private String puntoYcoma = "";
	private Blq blq;
	private String punto;
	private String unit = "";
	private ArrayDeque<Dcl> dclList;
	
	
	

	//"program" identifier ";" BLQ "."
	
	public Prg(String program, String identifier, String puntoYcoma, NoTerminal blq, String punto) {
		
		this.program = program;
		this.identifier = identifier;
		this.puntoYcoma = puntoYcoma;
		this.blq = (Blq) blq;
		this.punto = punto;
	}

	



    //PRG ::= … | "UNIT" identifier ";" DCLLIST "."
	public Prg(String identifier, String puntoYcoma, String punto, String unit, ArrayDeque<Dcl> dclList) {

		this.identifier = identifier;
		this.puntoYcoma = puntoYcoma;
		this.punto = punto;
		this.unit = unit;
		this.dclList = dclList;
	}




/*
 * Devuelve todas las funciones, procedemientos, variables y constantes concatenas en un string
 */
private String cuerpoPrg() {
	String cuerpo = "";
	String consts = "";
	try {
		if(blq.getDclList() != null) {
		  for(Dcl dcl: blq.getDclList()){
               if((dcl.getTipoDcl() == 'f') && (dcl.getDefFun() != null) ){
                  cuerpo += dcl.getDefFun().toString() + "\n";;
                  
               }else if ((dcl.getTipoDcl() == 'p') &&  (dcl.getDefProc() != null) ){
                  cuerpo += dcl.getDefProc().toString() + "\n";
               
               }else if ((dcl.getTipoDcl() == 'c') && (dcl.getDefCte()!= null)){
                 consts= dcl.getDefCte() + consts ;
               
               }
          }
          
	}
	} catch (Exception e) {
	 System.err.println(e.getLocalizedMessage());
	}
	 
	
	return consts+ "\n" + cuerpo;
}

	
	

private String cuerpoUnit() {
	String cuerpo = "";
	String consts = "";
	String vars = "";
	try {
		if(this.dclList != null) {
			 for(Dcl dcl: this.dclList){
	               if((dcl.getTipoDcl() == 'f') && (dcl.getDefFun() != null) ){
	                  cuerpo += dcl.getDefFun().toString() + "\n";;
	                  
	               }else if ((dcl.getTipoDcl() == 'p') &&  (dcl.getDefProc() != null) ){
	                  cuerpo += dcl.getDefProc().toString() + "\n";
	               
	               }else if ((dcl.getTipoDcl() == 'c') && (dcl.getDefCte()!= null)){
	                 consts= dcl.getDefCte() + consts ;
	               
	               } if ((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null) ){
	                   vars += dcl.getDefVar()  + "\n";;
	               }
	          }
	          
			
		}
		 
	} catch (Exception e) {
	 System.err.println(e.getLocalizedMessage());
	}
	
	return consts+"\n" + vars + "\n"+ cuerpo;
	
	
}
	
	
	
	
	
	
private String funMain() {
	String funMain = "void " + "main (void)" +"\n";
	String vars = "";
	try {
		if(blq.getDclList() != null) {
		  for(Dcl dcl: blq.getDclList()){
               if ((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null) ){
                   vars+= dcl.getDefVar()  + "\n";;
               }
          }
		 
		funMain += this.blq.getBegin() + "\n";
		funMain += vars ;
	
		for(String sent: blq.getSentlist()) {
			funMain += sent;
		}
		
		funMain += this.blq.getEnd();
		
	}
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
	
	return funMain;
	
}


	
	
	
	
	//Devuelve el programa completo
public String toString() {
	String traducFinal = "";
	
	if(this.program.equalsIgnoreCase("program")) {
		//Concateno nombre del programa
		traducFinal += this.program + " " + this.identifier + this.puntoYcoma +"\n";
		
		//Cocateno la lista de funciones, procedimiento, variables y constantes
		traducFinal += this.cuerpoPrg();
		
		//Concateno la función principal
		traducFinal += this.funMain();
		
	}else if(this.unit.equalsIgnoreCase("unit")){
		//concateno nombre de la libreria
		traducFinal += this.unit + " " + this.identifier + this.puntoYcoma +"\n";
		traducFinal += this.cuerpoUnit();
		traducFinal += this.punto;
			
		}
		return traducFinal;
		
}
		



	

}
