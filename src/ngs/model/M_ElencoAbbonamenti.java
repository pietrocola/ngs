package ngs.model;

import java.util.ArrayList;
import java.util.Date;

import ngs.factory.ServicesCreatorFactory;
import ngs.persistentmodel.*;

public class M_ElencoAbbonamenti extends AModel {

	
	public ArrayList<Abbonamento> elencoAbbonamenti=new ArrayList<Abbonamento>();
	
	public static  M_ElencoAbbonamenti instance;
	
	public static  M_ElencoAbbonamenti getInstance(){
		if(instance==null)
			instance=new  M_ElencoAbbonamenti();
		return instance;
	}
	
	public ArrayList<Abbonamento> getElencoAbbonamenti(){
		return this.elencoAbbonamenti;
	}
	
	/**
	 * 
	 * @param cliente
	 * @param preventivoAbb
	 * @param p
	 */
	public Boolean creaAbbonamento(Cliente cliente, PreventivoAbbonamento preventivoAbb,Date dataInizio, Date dataFine) {
		Abbonamento a=AbbonamentoDAO.createAbbonamento();
		a.setCliente(cliente);
		a.setPreventivoAbb(preventivoAbb);
		a.setDataInizio(dataInizio);
		a.setDataFine(dataFine);
		
		this.addAbbonamento(a);
		
		return AbbonamentoDAO.save(a);
	}

	
	
	
	/**
	 * 
	 * @param a
	 */
	public void addAbbonamento(Abbonamento a) {
		elencoAbbonamenti.add(a);
	}

	
	
	
	
	
	
	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}




	public Boolean verificaAbbonamentoEsistente(Cliente cliente) {
		//System.out.println(elencoAbbonamenti.size());
		
		
		for( Abbonamento a : elencoAbbonamenti){
			  if(a.getCliente().equals(cliente))
				  return false;
		}
		
		return true;
			
	}

	

}