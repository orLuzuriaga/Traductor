package simbolos;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DefCte  extends NoTerminal{

	
	private String w_const; // = #define
	private List<String> cteList;
	private List<String> cteOrd;
	
	
	public DefCte(String word_const, List<String> cteList) {
		super();
		this.w_const = word_const;
		this.cteList = cteList;
		this.cteOrd = new ArrayList<>();
	}



	public void orderConst() {
		this.cteList.forEach((String c)-> this.cteOrd.add(this.w_const + " " + c.toString()) );
	}
	
	
	
	
	
	
	public List<String> getCteOrd() {
		return cteOrd;
	}




	
}
