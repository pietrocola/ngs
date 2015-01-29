/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListNextGenSport2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing SalaPesi...");
		ngs.persistentmodel.SalaPesi[] ngspersistentmodelSalaPesis = ngs.persistentmodel.SalaPesiDAO.listSalaPesiByQuery(null, null);
		int length = Math.min(ngspersistentmodelSalaPesis.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelSalaPesis[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FasciaOrariaSalaPesi...");
		ngs.persistentmodel.FasciaOrariaSalaPesi[] ngspersistentmodelFasciaOrariaSalaPesis = ngs.persistentmodel.FasciaOrariaSalaPesiDAO.listFasciaOrariaSalaPesiByQuery(null, null);
		length = Math.min(ngspersistentmodelFasciaOrariaSalaPesis.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelFasciaOrariaSalaPesis[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CategoriaCliente...");
		ngs.persistentmodel.CategoriaCliente[] ngspersistentmodelCategoriaClientes = ngs.persistentmodel.CategoriaClienteDAO.listCategoriaClienteByQuery(null, null);
		length = Math.min(ngspersistentmodelCategoriaClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelCategoriaClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DescrizioneAbbonamento...");
		ngs.persistentmodel.DescrizioneAbbonamento[] ngspersistentmodelDescrizioneAbbonamentos = ngs.persistentmodel.DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null);
		length = Math.min(ngspersistentmodelDescrizioneAbbonamentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelDescrizioneAbbonamentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PoliticaScontoAbbonamento...");
		ngs.persistentmodel.PoliticaScontoAbbonamento[] ngspersistentmodelPoliticaScontoAbbonamentos = ngs.persistentmodel.PoliticaScontoAbbonamentoDAO.listPoliticaScontoAbbonamentoByQuery(null, null);
		length = Math.min(ngspersistentmodelPoliticaScontoAbbonamentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelPoliticaScontoAbbonamentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ScontoPercentuale...");
		ngs.persistentmodel.ScontoPercentuale[] ngspersistentmodelScontoPercentuales = ngs.persistentmodel.ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null);
		length = Math.min(ngspersistentmodelScontoPercentuales.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelScontoPercentuales[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipologiaCorso...");
		ngs.persistentmodel.TipologiaCorso[] ngspersistentmodelTipologiaCorsos = ngs.persistentmodel.TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null);
		length = Math.min(ngspersistentmodelTipologiaCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelTipologiaCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DescrizioneCorso...");
		ngs.persistentmodel.DescrizioneCorso[] ngspersistentmodelDescrizioneCorsos = ngs.persistentmodel.DescrizioneCorsoDAO.listDescrizioneCorsoByQuery(null, null);
		length = Math.min(ngspersistentmodelDescrizioneCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelDescrizioneCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PreventivoAbbonamento...");
		ngs.persistentmodel.PreventivoAbbonamento[] ngspersistentmodelPreventivoAbbonamentos = ngs.persistentmodel.PreventivoAbbonamentoDAO.listPreventivoAbbonamentoByQuery(null, null);
		length = Math.min(ngspersistentmodelPreventivoAbbonamentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelPreventivoAbbonamentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing SalaPesi by Criteria...");
		ngs.persistentmodel.SalaPesiCriteria lngspersistentmodelSalaPesiCriteria = new ngs.persistentmodel.SalaPesiCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelSalaPesiCriteria.nomeSala.eq();
		lngspersistentmodelSalaPesiCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.SalaPesi[] ngspersistentmodelSalaPesis = lngspersistentmodelSalaPesiCriteria.listSalaPesi();
		int length =ngspersistentmodelSalaPesis== null ? 0 : Math.min(ngspersistentmodelSalaPesis.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelSalaPesis[i]);
		}
		System.out.println(length + " SalaPesi record(s) retrieved."); 
		
		System.out.println("Listing FasciaOrariaSalaPesi by Criteria...");
		ngs.persistentmodel.FasciaOrariaSalaPesiCriteria lngspersistentmodelFasciaOrariaSalaPesiCriteria = new ngs.persistentmodel.FasciaOrariaSalaPesiCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelFasciaOrariaSalaPesiCriteria.ID.eq();
		lngspersistentmodelFasciaOrariaSalaPesiCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.FasciaOrariaSalaPesi[] ngspersistentmodelFasciaOrariaSalaPesis = lngspersistentmodelFasciaOrariaSalaPesiCriteria.listFasciaOrariaSalaPesi();
		length =ngspersistentmodelFasciaOrariaSalaPesis== null ? 0 : Math.min(ngspersistentmodelFasciaOrariaSalaPesis.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelFasciaOrariaSalaPesis[i]);
		}
		System.out.println(length + " FasciaOrariaSalaPesi record(s) retrieved."); 
		
		System.out.println("Listing CategoriaCliente by Criteria...");
		ngs.persistentmodel.CategoriaClienteCriteria lngspersistentmodelCategoriaClienteCriteria = new ngs.persistentmodel.CategoriaClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelCategoriaClienteCriteria.nomeCat.eq();
		lngspersistentmodelCategoriaClienteCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.CategoriaCliente[] ngspersistentmodelCategoriaClientes = lngspersistentmodelCategoriaClienteCriteria.listCategoriaCliente();
		length =ngspersistentmodelCategoriaClientes== null ? 0 : Math.min(ngspersistentmodelCategoriaClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelCategoriaClientes[i]);
		}
		System.out.println(length + " CategoriaCliente record(s) retrieved."); 
		
		System.out.println("Listing DescrizioneAbbonamento by Criteria...");
		ngs.persistentmodel.DescrizioneAbbonamentoCriteria lngspersistentmodelDescrizioneAbbonamentoCriteria = new ngs.persistentmodel.DescrizioneAbbonamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelDescrizioneAbbonamentoCriteria.nomeAbbonamento.eq();
		lngspersistentmodelDescrizioneAbbonamentoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.DescrizioneAbbonamento[] ngspersistentmodelDescrizioneAbbonamentos = lngspersistentmodelDescrizioneAbbonamentoCriteria.listDescrizioneAbbonamento();
		length =ngspersistentmodelDescrizioneAbbonamentos== null ? 0 : Math.min(ngspersistentmodelDescrizioneAbbonamentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelDescrizioneAbbonamentos[i]);
		}
		System.out.println(length + " DescrizioneAbbonamento record(s) retrieved."); 
		
		System.out.println("Listing PoliticaScontoAbbonamento by Criteria...");
		ngs.persistentmodel.PoliticaScontoAbbonamentoCriteria lngspersistentmodelPoliticaScontoAbbonamentoCriteria = new ngs.persistentmodel.PoliticaScontoAbbonamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelPoliticaScontoAbbonamentoCriteria.nomePolitica.eq();
		lngspersistentmodelPoliticaScontoAbbonamentoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.PoliticaScontoAbbonamento[] ngspersistentmodelPoliticaScontoAbbonamentos = lngspersistentmodelPoliticaScontoAbbonamentoCriteria.listPoliticaScontoAbbonamento();
		length =ngspersistentmodelPoliticaScontoAbbonamentos== null ? 0 : Math.min(ngspersistentmodelPoliticaScontoAbbonamentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelPoliticaScontoAbbonamentos[i]);
		}
		System.out.println(length + " PoliticaScontoAbbonamento record(s) retrieved."); 
		
		System.out.println("Listing ScontoPercentuale by Criteria...");
		ngs.persistentmodel.ScontoPercentualeCriteria lngspersistentmodelScontoPercentualeCriteria = new ngs.persistentmodel.ScontoPercentualeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelScontoPercentualeCriteria.nomePolitica.eq();
		lngspersistentmodelScontoPercentualeCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.ScontoPercentuale[] ngspersistentmodelScontoPercentuales = lngspersistentmodelScontoPercentualeCriteria.listScontoPercentuale();
		length =ngspersistentmodelScontoPercentuales== null ? 0 : Math.min(ngspersistentmodelScontoPercentuales.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelScontoPercentuales[i]);
		}
		System.out.println(length + " ScontoPercentuale record(s) retrieved."); 
		
		System.out.println("Listing TipologiaCorso by Criteria...");
		ngs.persistentmodel.TipologiaCorsoCriteria lngspersistentmodelTipologiaCorsoCriteria = new ngs.persistentmodel.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelTipologiaCorsoCriteria.nomeTip.eq();
		lngspersistentmodelTipologiaCorsoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.TipologiaCorso[] ngspersistentmodelTipologiaCorsos = lngspersistentmodelTipologiaCorsoCriteria.listTipologiaCorso();
		length =ngspersistentmodelTipologiaCorsos== null ? 0 : Math.min(ngspersistentmodelTipologiaCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelTipologiaCorsos[i]);
		}
		System.out.println(length + " TipologiaCorso record(s) retrieved."); 
		
		System.out.println("Listing DescrizioneCorso by Criteria...");
		ngs.persistentmodel.DescrizioneCorsoCriteria lngspersistentmodelDescrizioneCorsoCriteria = new ngs.persistentmodel.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelDescrizioneCorsoCriteria.nomeCorso.eq();
		lngspersistentmodelDescrizioneCorsoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.DescrizioneCorso[] ngspersistentmodelDescrizioneCorsos = lngspersistentmodelDescrizioneCorsoCriteria.listDescrizioneCorso();
		length =ngspersistentmodelDescrizioneCorsos== null ? 0 : Math.min(ngspersistentmodelDescrizioneCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelDescrizioneCorsos[i]);
		}
		System.out.println(length + " DescrizioneCorso record(s) retrieved."); 
		
		System.out.println("Listing PreventivoAbbonamento by Criteria...");
		ngs.persistentmodel.PreventivoAbbonamentoCriteria lngspersistentmodelPreventivoAbbonamentoCriteria = new ngs.persistentmodel.PreventivoAbbonamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelPreventivoAbbonamentoCriteria.ID.eq();
		lngspersistentmodelPreventivoAbbonamentoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.PreventivoAbbonamento[] ngspersistentmodelPreventivoAbbonamentos = lngspersistentmodelPreventivoAbbonamentoCriteria.listPreventivoAbbonamento();
		length =ngspersistentmodelPreventivoAbbonamentos== null ? 0 : Math.min(ngspersistentmodelPreventivoAbbonamentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelPreventivoAbbonamentos[i]);
		}
		System.out.println(length + " PreventivoAbbonamento record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListNextGenSport2Data listNextGenSport2Data = new ListNextGenSport2Data();
			try {
				listNextGenSport2Data.listTestData();
				//listNextGenSport2Data.listByCriteria();
			}
			finally {
				ngs.persistentmodel.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
