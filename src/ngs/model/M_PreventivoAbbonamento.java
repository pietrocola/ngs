package ngs.model;

import java.util.ArrayList;
import java.util.Set;

import view.utility.observer.IListener;
import ngs.controller.ConfAbbCorsiHandler;
import ngs.factory.PoliticaScontoAbbonamentoStrategyFactory;
import ngs.persistentmodel.*;

public class M_PreventivoAbbonamento extends AModel implements IListener{

	//PATTER SINGLETON
	public static M_PreventivoAbbonamento instance;
	
	public static M_PreventivoAbbonamento getInstance()
	{
		if(instance==null)
		{
			instance = new M_PreventivoAbbonamento();
		}
		return instance;
	}
	
	
	
	@Override
	public APersistentModel getPersistentModel() {

		return this.model;
	}
	
	
	
	
	// PATTERN OBSERVER
	
	private float prezzo;
	
	
	public float getPrezzo(){
		return this.prezzo;
	}
	
	
	public void addInPublisher(PoliticaScontoAbbonamentoStrategyFactory psasf){
		psasf.addListener(this);
	}
	
	@Override
	public void actionAfterEvent(PoliticaScontoAbbonamentoStrategyFactory politicaScontoAbbonamentoStrategyFactory,String nome, float prezzo) {
		if(nome.equals("prezzoAbb"))
			this.prezzo=prezzo;
	}

	//fine OBSERVER
	

	public boolean verificaPreventivo(DescrizioneAbbonamento descAbb,CategoriaCliente cat, int numMesi) {
		
		PreventivoAbbonamento[] pa=PreventivoAbbonamentoDAO.listPreventivoAbbonamentoByQuery(null, null);
		for(int i=0;i<pa.length;i++){
			if(pa[i].getDescAbb().equals(descAbb) && pa[i].getCategoriaCliente().equals(cat) && pa[i].getNumeroMesi()==numMesi)
				return false;
		}
		
		return true;	
	}
	

	/**
	 * 
	 * @param categoriaCliente
	 */
	public ArrayList<PreventivoAbbonamento> getPreventiviAbbonamenti(CategoriaCliente categoriaCliente) {
		ArrayList<PreventivoAbbonamento> elencoPreventivi = new ArrayList<PreventivoAbbonamento>();
		for(int i=0;i<PreventivoAbbonamentoDAO.listPreventivoAbbonamentoByQuery(null, null).length;i++)
			if(PreventivoAbbonamentoDAO.listPreventivoAbbonamentoByQuery(null,null)[i].getCategoriaCliente().equals(categoriaCliente))
				elencoPreventivi.add(PreventivoAbbonamentoDAO.listPreventivoAbbonamentoByQuery(null, null)[i]);
		return elencoPreventivi;
	}



	public boolean impostaCategoriaCliente(String nomeCat) {
		CategoriaCliente cc=CategoriaClienteDAO.createCategoriaCliente();
	    cc.setNomeCat(nomeCat);

	    return CategoriaClienteDAO.save(cc);
	}



	public boolean configuraAbbonamento(String nomeAbb,float prezzoBaseMensile,Set<DescrizioneCorso> elencoCorsiSelezionati,Set<SalaPesi> elencoSalePesiSelezionate) {
		
		
		DescrizioneAbbonamento da=DescrizioneAbbonamentoDAO.createDescrizioneAbbonamento();
	    da.setNomeAbbonamento(nomeAbb);
	    da.setPrezzoBaseMensile(prezzoBaseMensile);
	    da.setElencoCorsi(elencoCorsiSelezionati);
	    da.setElencoSalePesi(elencoSalePesiSelezionate);
	    return DescrizioneAbbonamentoDAO.save(da);
	}






	
	
}