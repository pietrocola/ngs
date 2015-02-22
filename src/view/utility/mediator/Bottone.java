package view.utility.mediator;

import javax.swing.JButton;

public class Bottone extends JButton implements Component {

	private String nome;
	private String etichetta;
	Mediator mediatore;

	   public Bottone(Mediator mediatore, String etichetta, String nome) {
	    	
	    	super(etichetta);
			this.setNome(nome);
					
	        this.mediatore=mediatore; 
	        this.mediatore.aggiungi(this);
	    }
	     
	  	@Override
		public void invia(String messaggio, String Destinatario) 
		{	  		
			mediatore.inviaRicevi(this.getNome(), messaggio, Destinatario);		
		}

		@Override
		public void ricevi(String messaggio, String Mittente) 
		{		
			if(messaggio.equals(CostantMediator.CALCOLA))
			{
				 this.setEnabled(true);
			}
			else if(messaggio.equals(CostantMediator.FOCUS_LISTA_ABBONAMENTI))
			{
				if(this.getNome().equals("btnSalva")) {	this.setEnabled(false);} 
				else if(this.getNome().equals("btnPrezzo")) {this.setEnabled(true);}
			}
			else if(messaggio.equals(CostantMediator.FOCUS_LISTA_CATEGORIA))
			{
				this.setEnabled(false);
			}
			else if(messaggio.equals(CostantMediator.FOCUS_LISTA_MESI))
			{
				if(this.getNome().equals("btnSalva")) {	this.setEnabled(false);} 
				else if(this.getNome().equals("btnPrezzo")) {this.setEnabled(true);}
			}
		}
		
		@Override
		public String getNome() {
			return this.nome;
		}

		@Override
		public void setNome(String nome) {
			this.nome=nome;	
		}

}