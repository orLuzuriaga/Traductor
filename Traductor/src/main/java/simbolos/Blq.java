package simbolos;

import java.io.PrintWriter;
import java.util.ArrayDeque;



public class Blq extends NoTerminal{

	private ArrayDeque<Dcl> dclList;
	private String begin;
	private ArrayDeque<String> sentlist;
	private String end;
	private int contTabu;
    private boolean repeat = false;

	
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
	
	
	public void setContTab(int tab) {
		this.contTabu= tab;
	}
	











	public boolean isRepeat() {
		return repeat;
	}






	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}






public String tabulador(int cont) {
	String tab = "";
	switch(cont) {
		case 1:
		    {
			tab = "\t";
			break;
			}
		case 2:
	    {
			tab = "\t\t";
			break;
		}
		case 3:
	    {
			tab = "\t\t\t";
			break;
		}
	
	
	    default:
	    	tab ="\t";
	    	break;
	}
	
	
	return tab;
}
	
	
	public String concatVar() {
		String vars = "";
		try {
			
			if(this.dclList!=null) {
				 for(Dcl dcl: this.dclList){
		               if ((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null) ){
		            	   
		            	        for(String var : dcl.getDefVar().getDvl()) {
		            	        	vars+= this.tabulador(this.contTabu) +var+dcl.getDefVar().getPyc() + "\n" ;
		            	        }
		                   
			               }
			          }	
					
				}
				 
				 
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
	
		return vars;	
	}

	public String concatSent() {
		String sents = "";
		
		if(this.sentlist!= null)
		  for(String sent: this.sentlist){
	          sents += this.tabulador(this.contTabu) + sent;
	         }
		return sents;
		
		
	}





    public String concatConst() {
    	String consts = "";
    	
	try {
			
			if(this.dclList!=null) {
				 for(Dcl dcl: this.dclList){
		               if ((dcl.getTipoDcl() == 'c') && (dcl.getDefCte() != null) ){
		                   consts = dcl.getDefCte() + consts;
			               }
			          }	
					
				}
				 
				 
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		return consts;
    	
    	
    }
    
    
    
    
	public String concatSub() {
	String sub = "";
	
	try {
		if(this.dclList != null) {
			 for(Dcl dcl: this.dclList){
	               if((dcl.getTipoDcl() == 'f') && (dcl.getDefFun() != null) ){
	                  sub += dcl.getDefFun().getFunCompleta() + "\n";;
	                  
	               }else if ((dcl.getTipoDcl() == 'p') &&  (dcl.getDefProc() != null) ){
	                  sub += dcl.getDefProc().getProCompleta() + "\n";
	               }
		}
	  }	 
	} catch (Exception e) {
	 System.err.println(e.getLocalizedMessage());
	}
     return sub;
	
   }
	
	
	
	public String toString() {
	String bloque = "";
	//bloque +=  this.tabulador(this.contTabu)+ this.begin + "\n";
	bloque +=  this.concatVar();
	bloque +=  this.concatSent();
	//if(!this.isRepeat())bloque += this.tabulador(this.contTabu)+ this.end + "\n";
	return bloque;
	
}
	
	
	




}
