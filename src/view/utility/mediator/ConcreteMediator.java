package view.utility.mediator;

import java.awt.Color;
import java.util.*;

import view.utility.Message;
import view.utility.mediator.CostantMediator;

public class ConcreteMediator extends Mediator {

    BtnSalva btnsalva;
    BtnPrezzo btnprezzo;
    ListAbbonamenti listAbbonamenti;
    ListNumMesi listNumMesi;
    ListCatCliente listCatCliente;
    LabelPrezzo labelPrezzo;
    LabelConferma labelConferma;
    LabelFrecciaAbb labelFrecciaAbb;
    
    @Override
    public void registraBtnSalva(BtnSalva btnsalva1)
    {
    	btnsalva=btnsalva1;
    }
   
    @Override
    public void registraBtnPrezzo(BtnPrezzo btnprezzo1)
    {
    	btnprezzo=btnprezzo1;
    }
    
    @Override
	public void registraListAbbonamenti(ListAbbonamenti listAbbonamenti1) 
    {
    	listAbbonamenti = listAbbonamenti1;		
	}
    
    @Override
	public void registraListNumMesi(ListNumMesi listNumMesi1) 
    {
    	listNumMesi = listNumMesi1;		
	}
    
    @Override
	public void registraListCatCliente(ListCatCliente listCatCliente1) 
    {
    	listCatCliente=listCatCliente1;		
	}

	@Override
	public void registraLabelPrezzo(LabelPrezzo labelPrezzo1) 
	{
		labelPrezzo=labelPrezzo1;		
	}

	@Override
	public void registraLabelConferma(LabelConferma labelConferma1) 
	{
		labelConferma=labelConferma1;		
	}
	
	@Override
	public void registraLabelFrecciaAbb(LabelFrecciaAbb labelFrecciaAbb1) 
	{
		labelFrecciaAbb=labelFrecciaAbb1;		
	}
	
    @Override
    public void inviaRicevi(String messaggio) 
    {
    	if(messaggio.equals(CostantMediator.CALCOLA))
		{
    		btnsalva.setEnabled(true);  
    		labelConferma.setText("");
		}
    	else if(messaggio.equals(CostantMediator.FOCUS_LISTA_ABBONAMENTI))
		{
			btnsalva.setEnabled(false); 
			btnprezzo.setEnabled(true);
			labelPrezzo.setText("");
			labelConferma.setText("");
			labelFrecciaAbb.setVisible(true);
		}
		else if(messaggio.equals(CostantMediator.FOCUS_LISTA_CATEGORIA))
		{
			btnsalva.setEnabled(false);
			btnprezzo.setEnabled(false);
			labelPrezzo.setText("");
			labelConferma.setText("");
			listNumMesi.setSelectionBackground(Color.WHITE);
		}
		else if(messaggio.equals(CostantMediator.FOCUS_LISTA_MESI))
		{
			labelConferma.setText("");
			labelPrezzo.setText("");
			btnsalva.setEnabled(false);
			btnprezzo.setEnabled(true);
			listNumMesi.setSelectionBackground(new Color(184,207,229));
		}
		else if(messaggio.equals(CostantMediator.SALVA))
		{
			Message.confirmLabel("Preventivo salvato", true, labelConferma);
		}
    }
    
}