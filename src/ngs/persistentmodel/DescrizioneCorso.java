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

public class DescrizioneCorso extends ngs.persistentmodel.APersistentModel {
	public DescrizioneCorso() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof DescrizioneCorso))
			return false;
		DescrizioneCorso descrizionecorso = (DescrizioneCorso)aObj;
		if ((getNomeCorso() != null && !getNomeCorso().equals(descrizionecorso.getNomeCorso())) || (getNomeCorso() == null && descrizionecorso.getNomeCorso() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNomeCorso() == null ? 0 : getNomeCorso().hashCode());
		return hashcode;
	}
	
	private String nomeCorso;
	
	private ngs.persistentmodel.TipologiaCorso tipCorso;
	
	private boolean prenotazione;
	
	public void setNomeCorso(String value) {
		this.nomeCorso = value;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	public String getORMID() {
		return getNomeCorso();
	}
	
	public void setPrenotazione(boolean value) {
		this.prenotazione = value;
	}
	
	public boolean getPrenotazione() {
		return prenotazione;
	}
	
	public void setTipCorso(ngs.persistentmodel.TipologiaCorso value) {
		this.tipCorso = value;
	}
	
	public ngs.persistentmodel.TipologiaCorso getTipCorso() {
		return tipCorso;
	}
	
	public String toString() {
		return String.valueOf(getNomeCorso());
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
