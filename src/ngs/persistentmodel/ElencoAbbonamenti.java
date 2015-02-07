/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ngs.persistentmodel;

public class ElencoAbbonamenti extends ngs.persistentmodel.APersistentModel {
	public ElencoAbbonamenti() {
	}
	
	private int ID;
	
	private java.util.Set elencoAbb = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setElencoAbb(java.util.Set value) {
		this.elencoAbb = value;
	}
	
	public java.util.Set getElencoAbb() {
		return elencoAbb;
	}
	
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
