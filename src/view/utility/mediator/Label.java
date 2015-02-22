package view.utility.mediator;

import javax.swing.JLabel;

import view.utility.Message;

public class Label extends JLabel implements Component {

	private String nome;
	private String testo;
	Mediator mediatore;

	   public Label(Mediator mediatore, String testo, String nome) {
	        
	    	super(testo);
	    	this.setNome(nome);
	    	
	    	this.mediatore = mediatore;
	        this.mediatore.aggiungi(this);
	    }
	 
	    

		@Override
		public void invia(String messaggio, String Destinatario) 
		{
			 mediatore.inviaRicevi(this.getNome(), messaggio, Destinatario);	
		}

		@Override
		public void ricevi(String messaggio, String Mittente) {
			
			if(messaggio.equals(CostantMediator.SALVA))
			{
				Message.confirmLabel("Preventivo salvato", true, this);
			}else if(messaggio.equals(CostantMediator.FOCUS_LISTA_ABBONAMENTI))
			{
				
				if(this.getNome().equals("lblFrecciaAbb")){this.setVisible(true);}
				else{this.setText("");}
				
			}
			else if(messaggio.equals(CostantMediator.FOCUS_LISTA_CATEGORIA))
			{
				this.setText("");				
			}
			else if(messaggio.equals(CostantMediator.FOCUS_LISTA_MESI))
			{
				this.setText("");
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