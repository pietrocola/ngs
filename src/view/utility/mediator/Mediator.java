package view.utility.mediator;

public abstract class Mediator {

	
	public abstract void aggiungi(Component comp);
	
	/**
	 * 
	 * @param mittente
	 * @param messaggio
	 * @param destinatario
	 */
	public abstract void inviaRicevi(String mittente, String messaggio, String destinatario);

}