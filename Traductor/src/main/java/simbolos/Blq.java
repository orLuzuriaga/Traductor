package simbolos;

import java.io.PrintWriter;
import java.util.ArrayDeque;



public class Blq extends NoTerminal{

	private ArrayDeque<Dcl> dclList;
	private String begin;
	private ArrayDeque<String> sentlist;
	private String end;
	private int conTab;


	
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
	
	
	
	
	






	public void setTab(int tab) {
		this.conTab= tab;
	}






public String tab(int cont) {
	String tab = "";
	switch(cont) {
		case 1:
		    {
			tab = " ";
			break;
			}
		case 2:
	    {
			tab = "  ";
			break;
		}
	
		case 3:
	    {
			tab = "   ";
			break;
		}
		case 4:
	    {
			tab = "    ";
			break;
		}
		case 5:
	    {
			tab = "     ";
			break;
		}
		case 6:
	    {
			tab = "      ";
			break;
		}
	    default:
	    	tab =" ";
	    	break;
	}
	
	
	return tab;
}




private String concatVar() {
	String vars = "";
	try {
		
		if(this.dclList!=null) {
			 for(Dcl dcl: this.dclList){
	               if ((dcl.getTipoDcl() == 'v') && (dcl.getDefVar()!= null) ){
	                   vars+= this.tab(this.conTab+1)+ dcl.getDefVar()  + "\n";
		               }
		          }	
				
			}
			 
			 
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		

	return vars;	
}


	
	
	
private String concatSent() {
	String sents = "";
	
	if(this.sentlist!= null)
	  for(String sent: this.sentlist){
          sents += this.tab(this.conTab+1) + sent;
         }
	return sents;
	
	
}







public String toString() {
	String bloque = "";
	bloque += this.tab(this.conTab ) + this.begin + "\n";
	bloque +=  this.concatVar();
	bloque +=  this.concatSent();
	bloque += this.tab(this.conTab) + this.end + "\n";
	
	
	
	return bloque;
	
	
}
	
	
	




}
