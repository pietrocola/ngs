package ngs;

import ngs.controller.ConfAbbCorsiHandler;

import org.orm.PersistentException;

public class Main {
 
	
	public static void main(String[] args) throws PersistentException {
		
		
		ConfAbbCorsiHandler c= new ConfAbbCorsiHandler();
		c.impostaTipologiaCorso("sala");
		
		
		System.out.print("ciao");
	}
	
}
