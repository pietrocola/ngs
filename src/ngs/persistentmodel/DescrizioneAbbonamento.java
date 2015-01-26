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

public class DescrizioneAbbonamento extends ngs.persistentmodel.APersistentModel {
	public DescrizioneAbbonamento() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof DescrizioneAbbonamento))
			return false;
		DescrizioneAbbonamento descrizioneabbonamento = (DescrizioneAbbonamento)aObj;
		if ((getNomeAbbonamento() != null && !getNomeAbbonamento().equals(descrizioneabbonamento.getNomeAbbonamento())) || (getNomeAbbonamento() == null && descrizioneabbonamento.getNomeAbbonamento() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNomeAbbonamento() == null ? 0 : getNomeAbbonamento().hashCode());
		return hashcode;
	}
	
	private String nomeAbbonamento;
	
	private float prezzoBaseMensile;
	
	private java.util.Set elencoSalePesi = new java.util.HashSet();
	
	private java.util.Set elencoCorsi = new java.util.HashSet();
	
	public void setNomeAbbonamento(String value) {
		this.nomeAbbonamento = value;
	}
	
	public String getNomeAbbonamento() {
		return nomeAbbonamento;
	}
	
	public String getORMID() {
		return getNomeAbbonamento();
	}
	
	public void setPrezzoBaseMensile(float value) {
		this.prezzoBaseMensile = value;
	}
	
	public float getPrezzoBaseMensile() {
		return prezzoBaseMensile;
	}
	
	public void setElencoSalePesi(java.util.Set value) {
		this.elencoSalePesi = value;
	}
	
	public java.util.Set getElencoSalePesi() {
		return elencoSalePesi;
	}
	
	
	public void setElencoCorsi(java.util.Set value) {
		this.elencoCorsi = value;
	}
	
	public java.util.Set getElencoCorsi() {
		return elencoCorsi;
	}
	
	
	public String toString() {
		return String.valueOf(getNomeAbbonamento());
	}
	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
