package ngs.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import ngs.model.Adapter.*;
import ngs.model.*;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.CertificatoMedico;
import ngs.persistentmodel.Cliente;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.PreventivoAbbonamento;
import ngs.persistentmodel.SalaPesi;
import ngs.factory.*;

public class ErogaAbbonamentoHandler {

	//IVerificaCategoriaClienteAdapter catClienteAdapter;
	M_PreventivoAbbonamento preventivoAbb;
	M_Cliente cliente;
	M_Abbonamento abbonamento;
	M_DescrizioneAbbonamento descAbb;
	ServicesCreatorFactory scFactory;
	M_ElencoAbbonamenti elencoAbb;
	M_CategoriaCliente catCliente;
	M_CertificatoMedico certificatoMedico;
	
	
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
		
		
		return ServicesCreatorFactory.getInstance().verificaCategoriaCliente(cat, codice);
		

	}

	/**
	 * 
	 * @param categoriaCliente
	 */
	public ArrayList<PreventivoAbbonamento> getPreventiviAbbonamenti(CategoriaCliente categoriaCliente) {
		preventivoAbb= new M_PreventivoAbbonamento();
		return preventivoAbb.getPreventiviAbbonamenti(categoriaCliente);
		
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 */
	public Boolean verificaSeDatiClientePresenti(String codiceFiscale) {
		cliente=new M_Cliente();
		return cliente.verificaSeDatiClientePresenti(codiceFiscale);
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param codiceFiscale
	 * @param telefono
	 * @param email
	 */
	public Boolean registraCliente(String nome, String cognome, String codiceFiscale, String telefono, String email) {
		abbonamento= new M_Abbonamento();
		return abbonamento.registraCliente(nome, cognome, codiceFiscale, telefono, email);
	}

	/**
	 * 
	 * @param dataScadenza
	 * @param cliente
	 * @return 
	 */
	public Boolean associaCertificatoMedicoCliente(Date dataScadenza, String codiceFiscaleCliente) {
		cliente=new M_Cliente();
		return ServicesCreatorFactory.getInstance().associaCertificatoMedicoCliente(dataScadenza, cliente.getCliente(codiceFiscaleCliente));
	}
	
	
	
	public Cliente[] getElencoClienti(){
		cliente=new M_Cliente();
		return cliente.getElencoClienti();
	}
	
	

	/**
	 * 
	 * @param cliente
	 * @param preventivoAbb
	 * @param dataPagamento
	 * @param importo
	 * @param stato
	 */
	public Boolean creaAbbonamento(Cliente cliente, PreventivoAbbonamento preventivoAbb, Date dataInizio, Date dataFine) {
		M_ElencoAbbonamenti ea=M_ElencoAbbonamenti.getInstance();
		System.out.println(ea.getElencoAbbonamenti().size()+" nel contr");
		return ea.creaAbbonamento(cliente, preventivoAbb, dataInizio,dataFine);
	}



	public ArrayList<CategoriaCliente> getCategorieClienti() {
		catCliente=new M_CategoriaCliente();
		return catCliente.getCategorieClienti();
	}
	
	
	public ArrayList<Cliente> filtraClienti(String cognome){
		cliente= new M_Cliente();
		
		return cliente.filtraCliente(cognome);
	}



	public boolean verificaSeCertificatoPresente(String codFisc) {
		Cliente c=cliente.getCliente(codFisc);
		certificatoMedico=new M_CertificatoMedico();
		return certificatoMedico.verificaSeCertificatoPresente(c);
	}
	
	
	public CategoriaCliente getCategoriaCliente(String nomeCat){
		catCliente=new M_CategoriaCliente();
		return catCliente.getCategoriaCliente(nomeCat);
	}



	public ArrayList<DescrizioneCorso> getCorsiAbbonamento(String nomeAbb) {
		// TODO Auto-generated method stub
		descAbb=new M_DescrizioneAbbonamento();
		return descAbb.getCorsiAbbonamento(nomeAbb);
		
	}



	public ArrayList<SalaPesi> getSalePesiAbbonamento(String nomeAbb) {
		descAbb=new M_DescrizioneAbbonamento();
		return descAbb.getSalePesiAbbonamento(nomeAbb);
	}



	public CertificatoMedico[] getElencoCertificati() {
		certificatoMedico=new M_CertificatoMedico();
		return certificatoMedico.getElencoCertificati();
	}



	public ArrayList<CertificatoMedico> filtraCertificatiCognome(String cognome) {
		certificatoMedico=new M_CertificatoMedico();
		return certificatoMedico.filtraCertificatiCognome(cognome);
	}



	public Boolean verificaPresenzaCertificato(Cliente cliente) {
		certificatoMedico=new M_CertificatoMedico();
		return certificatoMedico.verificaPresenzaCertificato(cliente);
	}


	public Boolean verificaValiditaCertificato(Cliente cliente) {
		certificatoMedico=new M_CertificatoMedico();
		return certificatoMedico.verificaValiditaCertificato(cliente);
	}



	public Boolean verificaAbbonamentoEsistente(Cliente cliente) {
		M_ElencoAbbonamenti ea=M_ElencoAbbonamenti.getInstance();
		return ea.verificaAbbonamentoEsistente(cliente);
	}


}