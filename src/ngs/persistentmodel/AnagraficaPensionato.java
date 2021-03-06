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

public class AnagraficaPensionato {
	public AnagraficaPensionato() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof AnagraficaPensionato))
			return false;
		AnagraficaPensionato anagraficapensionato = (AnagraficaPensionato)aObj;
		if ((getCodiceFiscale() != null && !getCodiceFiscale().equals(anagraficapensionato.getCodiceFiscale())) || (getCodiceFiscale() == null && anagraficapensionato.getCodiceFiscale() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCodiceFiscale() == null ? 0 : getCodiceFiscale().hashCode());
		return hashcode;
	}
	
	private String codiceFiscale;
	
	private String nome;
	
	private String cognome;
	
	private boolean pensione;
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCognome(String value) {
		this.cognome = value;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setPensione(boolean value) {
		this.pensione = value;
	}
	
	public boolean getPensione() {
		return pensione;
	}
	
	public void setCodiceFiscale(String value) {
		this.codiceFiscale = value;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public String getORMID() {
		return getCodiceFiscale();
	}
	
	public String toString() {
		return String.valueOf(getCodiceFiscale());
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
