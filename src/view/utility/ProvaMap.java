package view.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;




import ngs.peristentmodel.TipologiaCorso;

public class ProvaMap {
	
	
	public void prova(){
	
		TreeMap<String, ArrayList<String>> m = new TreeMap<String, ArrayList<String>>();
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("pietro");
		al.add("daniele");
		m.put("ciao", al);
		
		Set<String> s=m.keySet();
		for(String aux:s){
			ArrayList<String> aux1=m.get(aux);
			for(String c:aux1)
				System.out.println(aux+c);
		}
			
	
	
	}
	

}
