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

public class PreventivoAbbonamento extends ngs.persistentmodel.APersistentModel {
	public PreventivoAbbonamento() {
	}
	
	private int ID;
	
	private ngs.persistentmodel.PoliticaScontoAbbonamento politicaSconto;
	
	private ngs.persistentmodel.DescrizioneAbbonamento descAbb;
	
	private float prezzo;
	
	private int numeroMesi;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPrezzo(float value) {
		this.prezzo = value;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	
	public void setNumeroMesi(int value) {
		this.numeroMesi = value;
	}
	
	public int getNumeroMesi() {
		return numeroMesi;
	}
	
	public void setDescAbb(ngs.persistentmodel.DescrizioneAbbonamento value) {
		this.descAbb = value;
	}
	
	public ngs.persistentmodel.DescrizioneAbbonamento getDescAbb() {
		return descAbb;
	}
	
	public void setPoliticaSconto(ngs.persistentmodel.PoliticaScontoAbbonamento value) {
		this.politicaSconto = value;
	}
	
	public ngs.persistentmodel.PoliticaScontoAbbonamento getPoliticaSconto() {
		return politicaSconto;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
