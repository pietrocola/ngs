package view.utility.mediator;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Lista extends JList implements Component {

	private String nome;
	Mediator mediatore;

  	public Lista(Mediator mediatore, DefaultListModel defList, String nome) {
  		super(defList);
		this.setNome(nome);
  		
        this.mediatore=mediatore; 
        this.mediatore.aggiungi(this);
	}

	public Lista(Mediator mediatore, String nome) {
		super();
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
		else if(messaggio.equals(CostantMediator.FOCUS_LISTA_CATEGORIA))
		{
			this.setSelectionBackground(Color.WHITE);
		}
		else if(messaggio.equals(CostantMediator.FOCUS_LISTA_MESI))
		{
			this.setSelectionBackground(new Color(184,207,229));
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