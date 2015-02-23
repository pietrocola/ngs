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
    LabelNoAbbonamento labelNoAbbonamento;
    LabelNoCategorieClienti labelNoCategorieClienti;
    LabelNoPoliticheSconto labelNoPoliticheSconto;
    RadioButtonProCliente radioButtonProCliente;
    RadioButtonProCentro radioButtonProCentro;
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
		}else if(messaggio.equals(CostantMediator.LISTA_ABBONAMENTI_VUOTA)){
			Message.confirmLabel("Nessun abbonamento presente", false, labelNoAbbonamento);
		}else if(messaggio.equals(CostantMediator.LISTA_CATEGORIE_VUOTA)){
			Message.confirmLabel("Nessuna categoria presente", false, labelNoCategorieClienti);
		}else if(messaggio.equals(CostantMediator.NO_POLITICHE_SCONTO)){
			Message.confirmLabel("<html>Nessuna politica sconto presente <br />per la categoria cliente selezionata</html>", false, labelNoPoliticheSconto);
		}else if(messaggio.equals(CostantMediator.AZZERA_LABEL_POLITICHE)){
			labelNoPoliticheSconto.setText("");
		}else if(messaggio.equals(CostantMediator.FOCUS_RADIO)){
			labelPrezzo.setText("");
			labelConferma.setText("");
			btnsalva.setEnabled(false);
		}else if(messaggio.equals(CostantMediator.CALCOLO_NON_POSSIBILE)){
			Message.errorMessage("ERRORE", "Inserire tutte le scelte");
		}
    }

	@Override
	public void registraLabelNoAbbonamento(LabelNoAbbonamento labelNoAbbonamento) {
		
		this.labelNoAbbonamento=labelNoAbbonamento;
	}

	@Override
	public void registraLabelNoCategorieClienti(LabelNoCategorieClienti labelNoCategorieClienti) {
		this.labelNoCategorieClienti=labelNoCategorieClienti;
		
	}

	@Override
	public void registraLabelNoPoliticheSconto(LabelNoPoliticheSconto labelNoPoliticheSconto) {
		this.labelNoPoliticheSconto=labelNoPoliticheSconto;
		
	}

	@Override
	public void registraRadioButtonProCliente(RadioButtonProCliente radioButtonProCliente) {
		this.radioButtonProCliente=radioButtonProCliente;
		
	}

	@Override
	public void registraRadioButtonProCentro(RadioButtonProCentro radioButtonProCentro) {
		this.radioButtonProCentro=radioButtonProCentro;
		
	}
    
}