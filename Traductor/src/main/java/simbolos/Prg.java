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
	
	private String funcs = "";
	private String procs = "";
	private String consts = "";
	

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

	public Blq getBlq() {
		return blq;
	}





	public void setBlq(Blq blq) {
		this.blq = blq;
	}


	
	
	
	
public String getIdentifier() {
		return identifier;
	}





	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}





public String getProgram() {
		return program;
	}





	public void setProgram(String program) {
		this.program = program;
	}





	public String getUnit() {
		return unit;
	}





	public void setUnit(String unit) {
		this.unit = unit;
	}





/*
 * Devuelve todas las funciones, procedemientos, variables y constantes concatenas en un string
 */
private String cuerpoPrg() {
	String cuerpo = "";
	String consts = "";
	String vars = "";
	try {
		if(blq.getDclList() != null) {
		  for(Dcl dcl: blq.getDclList()){
               if((dcl.getTipoDcl() == 'f') && (dcl.getDefFun() != null) ){
                  cuerpo = dcl.getDefFun().getFunCompleta() + "\n" + cuerpo;
                  if(dcl.getDefFun().getSubrrutinas()!=null)cuerpo =dcl.getDefFun().getSubrrutinas() + cuerpo;
                  if(dcl.getDefFun().getConsts()!=null)consts =dcl.getDefFun().getConsts() + consts;
                  
               }else if ((dcl.getTipoDcl() == 'p') &&  (dcl.getDefProc() != null) ){
                  cuerpo = dcl.getDefProc().getProCompleta() + "\n"+ cuerpo;
                  if(dcl.getDefProc().getSubrrutinas()!=null)cuerpo = dcl.getDefProc().getSubrrutinas() + cuerpo;
                  if(dcl.getDefProc().getConsts()!=null)consts =dcl.getDefProc().getConsts() + consts;
                  
                  
               }else if ((dcl.getTipoDcl() == 'c') && (dcl.getDefCte()!= null)){
                 consts= dcl.getDefCte() + consts ;
                 
               }else if((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null)) {
            	   for(String var:dcl.getDefVar().getDvl() ) {
            		   vars += var + "\n";
            	   }
               }
          }
          
	}
	} catch (Exception e) {
	 System.err.println(e.getLocalizedMessage());
	}
	 
	
	return consts+ vars + "\n" + cuerpo;
}

	
	







private String cuerpoUnit() {
	String cuerpo = "";
	String consts = "";
	String vars = "";
	try {
		if(this.dclList != null) {
			 for(Dcl dcl: this.dclList){
	               if((dcl.getTipoDcl() == 'f') && (dcl.getDefFun() != null) ){
	                  cuerpo = dcl.getDefFun().getFunCompleta() + "\n" + cuerpo;
	                  if(dcl.getDefFun().getSubrrutinas()!=null)cuerpo =dcl.getDefFun().getSubrrutinas() +cuerpo;
	                  if(dcl.getDefFun().getConsts()!=null)consts =dcl.getDefFun().getConsts() + consts;
	                  
	               }else if ((dcl.getTipoDcl() == 'p') &&  (dcl.getDefProc() != null) ){
	                  cuerpo = dcl.getDefProc().getProCompleta() + "\n" +cuerpo;
	                  if(dcl.getDefProc().getSubrrutinas()!=null)cuerpo = dcl.getDefProc().getSubrrutinas() +cuerpo;
	                  if(dcl.getDefProc().getConsts()!=null)consts =dcl.getDefProc().getConsts() + consts;
	                  
	               }else if ((dcl.getTipoDcl() == 'c') && (dcl.getDefCte()!= null)){
	                 consts= dcl.getDefCte() + consts ;
	               
	               } if ((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null) ){
	                   vars += dcl.getDefVar()  + "\n";;
	               }
	          }
	          
			
		}
		 
	} catch (Exception e) {
	 System.err.println("estoy aquis en prg" +e.getLocalizedMessage());
	}
	
	return consts+"\n" + vars + "\n"+ cuerpo;
	
	
}
	
	
	



	
	

	
	
	//Devuelve el programa completo
public String toString() {
	String traducFinal = "";
	
	if(this.program.equalsIgnoreCase("program")) {
		//Concateno nombre del programa
		traducFinal += this.program + " " + this.identifier + this.puntoYcoma +"\n";
		
		//Cocateno la lista de funciones, procedimiento, variables y constantes
		traducFinal += this.cuerpoPrg();
		//this.blq.setTab(1);
		//Concateno la función principal
		
		traducFinal += "void " + "main (void)" +"\n";
		traducFinal += this.blq.getBegin() + "\n";
		traducFinal += this.blq.concatSent() + "\n";
		traducFinal += this.blq.getEnd() + "\n";
		//this.blq.setTab(-1);
		
	}else if(this.unit.equalsIgnoreCase("unit")){
		//concateno nombre de la libreria
		traducFinal += this.unit + " " + this.identifier + this.puntoYcoma +"\n";
		traducFinal += this.cuerpoUnit();
		traducFinal += this.punto;
			
		}
		return traducFinal;
		
}
		



	

}
