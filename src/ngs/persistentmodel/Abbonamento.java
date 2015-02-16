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

public class Abbonamento extends ngs.persistentmodel.APersistentModel {
	public Abbonamento() {
	}
	
	private int ID;
	
	private ngs.persistentmodel.PreventivoAbbonamento preventivoAbb;
	
	private ngs.persistentmodel.Cliente cliente;
	
	private java.util.Date dataInizio;
	
	private java.util.Date dataFine;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDataInizio(java.util.Date value) {
		this.dataInizio = value;
	}
	
	public java.util.Date getDataInizio() {
		return dataInizio;
	}
	
	public void setDataFine(java.util.Date value) {
		this.dataFine = value;
	}
	
	public java.util.Date getDataFine() {
		return dataFine;
	}
	
	public void setCliente(ngs.persistentmodel.Cliente value) {
		this.cliente = value;
	}
	
	public ngs.persistentmodel.Cliente getCliente() {
		return cliente;
	}
	
	public void setPreventivoAbb(ngs.persistentmodel.PreventivoAbbonamento value) {
		this.preventivoAbb = value;
	}
	
	public ngs.persistentmodel.PreventivoAbbonamento getPreventivoAbb() {
		return preventivoAbb;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
