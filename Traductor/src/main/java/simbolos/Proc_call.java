package simbolos;

import java.io.PrintWriter;

public class Proc_call extends NoTerminal {

	private String identifier;
	private SubpparamList subparamlist;
	
	
	
	
	
	public Proc_call(String identifier, NoTerminal spl) {
		this.identifier = identifier;
		this.subparamlist = (SubpparamList) spl;
	}


   public Proc_call(String identifier) {
	
	   this.identifier = identifier;
   }



   
   
   
   
   



	

}
