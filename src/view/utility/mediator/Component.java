package view.utility.mediator;

public interface Component {

	/**
	 * 
	 * @param messaggio
	 * @param destinatario
	 */
	void invia(String messaggio, String destinatario);

	/**
	 * 
	 * @param messaggio
	 * @param mittente
	 */
	void ricevi(String messaggio, String mittente);

	String getNome();

	void setNome(String nome);

}