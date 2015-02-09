package ngs.controller;


import java.util.ArrayList;
import java.util.Date;

import ngs.model.Adapter.*;
import ngs.model.*;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.Cliente;
import ngs.persistentmodel.PreventivoAbbonamento;
import ngs.factory.*;

public class ErogaAbbonamentoHandler {

	IVerificaCategoriaClienteAdapter catClienteAdapter;
	M_PreventivoAbbonamento preventivoAbb;
	M_Cliente cliente;
	M_Abbonamento abbonamento;
	ServicesCreatorFactory scFactory;
	M_ElencoAbbonamenti elencoAbb;
	
	public static ErogaAbbonamentoHandler instance;
	
	
	public static ErogaAbbonamentoHandler getInstance(){
		if(instance==null)
		{
			instance = new ErogaAbbonamentoHandler();
		}
		return instance;
	}
	
	

	/**
	 * 
	 * @param codice
	 */
	public Boolean verificaCategoriaCliente(CategoriaCliente cat,String codice) {
		
		
		if(cat.getNomeCat().equals("univ")){
			catClienteAdapter= new ClienteUniversitarioAdapter();
		}else
			if(cat.getNomeCat().equals("dipendente alenia")){
				catClienteAdapter= new ClienteDipendenteAleniaSpazioAdapter();
		    }else{
		    	//catClienteAdapter=null;
		    }
		
		return catClienteAdapter.verificaCategoriaCliente(codice);
		
	}

	/**
	 * 
	 * @param categoriaCliente
	 */
	public ArrayList<PreventivoAbbonamento> getPreventiviAbbonamenti(CategoriaCliente categoriaCliente) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 */
	public Boolean verificaSeDatiClientePresenti(String nome, String cognome) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param codiceFiscale
	 * @param telefono
	 * @param email
	 */
	public Boolean registraCliente(String nome, String cognome, String codiceFiscale, int telefono, String email) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataScadenza
	 * @param cliente
	 */
	public void associaCertificatoMedicoCliente(Date dataScadenza, Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cliente
	 * @param preventivoAbb
	 * @param dataPagamento
	 * @param importo
	 * @param stato
	 */
	public Boolean creaAbbonamento(Cliente cliente, PreventivoAbbonamento preventivoAbb, Date dataPagamento, float importo, boolean stato) {
		throw new UnsupportedOperationException();
	}

}