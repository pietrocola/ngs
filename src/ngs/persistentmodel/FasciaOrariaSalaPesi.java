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

public class FasciaOrariaSalaPesi extends ngs.persistentmodel.APersistentModel {
	public FasciaOrariaSalaPesi() {
	}
	
	private int ID;
	
	private int oraInizio;
	
	private int oraFine;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setOraInizio(int value) {
		this.oraInizio = value;
	}
	
	public int getOraInizio() {
		return oraInizio;
	}
	
	public void setOraFine(int value) {
		this.oraFine = value;
	}
	
	public int getOraFine() {
		return oraFine;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
