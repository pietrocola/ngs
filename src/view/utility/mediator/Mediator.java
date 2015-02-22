package view.utility.mediator;

public abstract class Mediator {

	public abstract void inviaRicevi(String messaggio);

	public abstract void registraBtnSalva(BtnSalva btnSalva);

	public abstract void registraBtnPrezzo(BtnPrezzo btnprezzo);

	public abstract void registraListAbbonamenti(ListAbbonamenti listAbbonamenti);

	public abstract void registraListCatCliente(ListCatCliente listCatCliente);

	public abstract void registraListNumMesi(ListNumMesi listNumMesi);

	public abstract void registraLabelPrezzo(LabelPrezzo labelPrezzo);

	public abstract void registraLabelConferma(LabelConferma labelConferma);

	public abstract void registraLabelFrecciaAbb(LabelFrecciaAbb labelFrecciaAbb);
}