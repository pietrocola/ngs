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

public class CertificatoMedico extends ngs.persistentmodel.APersistentModel {
	public CertificatoMedico() {
	}
	
	private int ID;
	
	private ngs.persistentmodel.Cliente cliente;
	
	private java.util.Date scadenza;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setScadenza(java.util.Date value) {
		this.scadenza = value;
	}
	
	public java.util.Date getScadenza() {
		return scadenza;
	}
	
	public void setCliente(ngs.persistentmodel.Cliente value) {
		this.cliente = value;
	}
	
	public ngs.persistentmodel.Cliente getCliente() {
		return cliente;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
