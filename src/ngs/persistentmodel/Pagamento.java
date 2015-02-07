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

public class Pagamento extends ngs.persistentmodel.APersistentModel {
	public Pagamento() {
	}
	
	private int ID;
	
	private java.util.Date data;
	
	private float importo;
	
	private boolean stato;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setData(java.util.Date value) {
		this.data = value;
	}
	
	public java.util.Date getData() {
		return data;
	}
	
	public void setImporto(float value) {
		this.importo = value;
	}
	
	public float getImporto() {
		return importo;
	}
	
	public void setStato(boolean value) {
		this.stato = value;
	}
	
	public boolean getStato() {
		return stato;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
