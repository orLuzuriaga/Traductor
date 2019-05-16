package simbolos;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Formal_param  extends NoTerminal{

	private List<String> varlist;
	private String dosPuntos;
	private String tbas;
	private String puntoycoma;
	private Formal_param fp;
	private HashMap<String, String>param;

	
	
	
	

	
	
	
	
	
	
	
	public Formal_param(List<String> varlist, String dosPuntos, String tbas) {
		super();
		this.varlist = varlist;
		this.dosPuntos = dosPuntos;
		this.tbas = tbas;
		this.param = new HashMap<>();
		;
	}


	

	public Formal_param(List<String> varlist, String dosPuntos, String tbas, String puntoycoma, NoTerminal fp) {
		super();
		this.varlist = varlist;
		this.dosPuntos = dosPuntos;
		this.tbas = tbas;
		this.puntoycoma = puntoycoma;
		this.fp = (Formal_param) fp;
		this.param = new HashMap<>();
		
	}



   /*Getters and Setters*/
    
    
    	
 
	
	
	public List<String> getVarlist() {
			return varlist;
		}




		public void setVarlist(List<String> varlist) {
			this.varlist = varlist;
		}




		public void setFp(Formal_param fp) {
			this.fp = fp;
		}




		public void setParam(HashMap<String, String> param) {
			this.param = param;
		}
	
		
		public void setTbas(String tbas) {
				this.tbas = tbas;
			}

		

	
	
	
	
	

	   	public void setDosPuntos(String dosPuntos) {
				this.dosPuntos = dosPuntos;
			}




		public void setPyC(String puntoycoma) {
			this.puntoycoma = puntoycoma;
		}




    public List<String> addType() {
    	
    	List<String> aux = new ArrayList<>();
    	if(!this.varlist.isEmpty()) {
    		this.varlist.forEach((String c)-> aux.add(this.tbas +  c));

    	}
    	
    	
		return aux;
    	
    	
    }
    
    
    
    
    
    
    
	public void ordParam() {
   	 
		String vars = "";   
        if(param.containsKey(this.tbas)) {
        	vars = param.get(this.tbas);
       
        	Collections.reverse(varlist);
        	for(String c: this.varlist) {
        		vars = this.tbas + " " + c + vars;
        	
        	}
        	
	        param.put(this.tbas,vars);
        	
        }else {
        	
        	Collections.reverse(varlist);
        	for(String c: this.varlist) {
        		vars = this.tbas + " " + c + vars;
        	}
        
	        param.put(this.tbas,vars);
        	
        }
       
}
   	
   	
   	
   	
   	

	







}
