package view.utility.mediator;

public abstract class Mediator {

	public abstract void inviaRicevi(String messaggio);

	public abstract void registraBtnSalva(BtnSalva btnSalva);

	public abstract void registraBtnPrezzo(BtnPrezzo btnprezzo);

	public abstract void registraListAbbonamenti(ListAbbonamenti listAbbonamenti);

	public abstract void registraListCatCliente(ListCatCliente listCatCliente);

	public abstract void registraListNumMesi(ListNumMesi listNumMesi);

	//public abstract void registraLabelPrezzo(LabelPrezzo labelPrezzo);

	public abstract void registraLabelConferma(LabelConferma labelConferma);

	public abstract void registraLabelFrecciaAbb(LabelFrecciaAbb labelFrecciaAbb);

	public abstract void registraLabelNoAbbonamento(LabelNoAbbonamento labelNoAbbonamento);

	public abstract void registraLabelNoCategorieClienti(LabelNoCategorieClienti labelNoCategorieClienti);

	public abstract void registraLabelNoPoliticheSconto(LabelNoPoliticheSconto labelNoPoliticheSconto);

	public abstract  void registraRadioButtonProCliente(RadioButtonProCliente radioButtonProCliente);

	public abstract void registraRadioButtonProCentro(RadioButtonProCentro radioButtonProCentro);
		
	
		
	
		
	
}