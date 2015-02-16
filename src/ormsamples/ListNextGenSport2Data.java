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
		
		System.out.println("Listing Cliente...");
		ngs.persistentmodel.Cliente[] ngspersistentmodelClientes = ngs.persistentmodel.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(ngspersistentmodelClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CertificatoMedico...");
		ngs.persistentmodel.CertificatoMedico[] ngspersistentmodelCertificatoMedicos = ngs.persistentmodel.CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null);
		length = Math.min(ngspersistentmodelCertificatoMedicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelCertificatoMedicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pagamento...");
		ngs.persistentmodel.Pagamento[] ngspersistentmodelPagamentos = ngs.persistentmodel.PagamentoDAO.listPagamentoByQuery(null, null);
		length = Math.min(ngspersistentmodelPagamentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelPagamentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Abbonamento...");
		ngs.persistentmodel.Abbonamento[] ngspersistentmodelAbbonamentos = ngs.persistentmodel.AbbonamentoDAO.listAbbonamentoByQuery(null, null);
		length = Math.min(ngspersistentmodelAbbonamentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelAbbonamentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AnagraficaUniversitario...");
		ngs.persistentmodel.AnagraficaUniversitario[] ngspersistentmodelAnagraficaUniversitarios = ngs.persistentmodel.AnagraficaUniversitarioDAO.listAnagraficaUniversitarioByQuery(null, null);
		length = Math.min(ngspersistentmodelAnagraficaUniversitarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelAnagraficaUniversitarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DipendenteAleniaSpazio...");
		ngs.persistentmodel.DipendenteAleniaSpazio[] ngspersistentmodelDipendenteAleniaSpazios = ngs.persistentmodel.DipendenteAleniaSpazioDAO.listDipendenteAleniaSpazioByQuery(null, null);
		length = Math.min(ngspersistentmodelDipendenteAleniaSpazios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelDipendenteAleniaSpazios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ScontoFisso...");
		ngs.persistentmodel.ScontoFisso[] ngspersistentmodelScontoFissos = ngs.persistentmodel.ScontoFissoDAO.listScontoFissoByQuery(null, null);
		length = Math.min(ngspersistentmodelScontoFissos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngspersistentmodelScontoFissos[i]);
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
		
		System.out.println("Listing Cliente by Criteria...");
		ngs.persistentmodel.ClienteCriteria lngspersistentmodelClienteCriteria = new ngs.persistentmodel.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelClienteCriteria.codiceFiscale.eq();
		lngspersistentmodelClienteCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.Cliente[] ngspersistentmodelClientes = lngspersistentmodelClienteCriteria.listCliente();
		length =ngspersistentmodelClientes== null ? 0 : Math.min(ngspersistentmodelClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing CertificatoMedico by Criteria...");
		ngs.persistentmodel.CertificatoMedicoCriteria lngspersistentmodelCertificatoMedicoCriteria = new ngs.persistentmodel.CertificatoMedicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelCertificatoMedicoCriteria.ID.eq();
		lngspersistentmodelCertificatoMedicoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.CertificatoMedico[] ngspersistentmodelCertificatoMedicos = lngspersistentmodelCertificatoMedicoCriteria.listCertificatoMedico();
		length =ngspersistentmodelCertificatoMedicos== null ? 0 : Math.min(ngspersistentmodelCertificatoMedicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelCertificatoMedicos[i]);
		}
		System.out.println(length + " CertificatoMedico record(s) retrieved."); 
		
		System.out.println("Listing Pagamento by Criteria...");
		ngs.persistentmodel.PagamentoCriteria lngspersistentmodelPagamentoCriteria = new ngs.persistentmodel.PagamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelPagamentoCriteria.ID.eq();
		lngspersistentmodelPagamentoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.Pagamento[] ngspersistentmodelPagamentos = lngspersistentmodelPagamentoCriteria.listPagamento();
		length =ngspersistentmodelPagamentos== null ? 0 : Math.min(ngspersistentmodelPagamentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelPagamentos[i]);
		}
		System.out.println(length + " Pagamento record(s) retrieved."); 
		
		System.out.println("Listing Abbonamento by Criteria...");
		ngs.persistentmodel.AbbonamentoCriteria lngspersistentmodelAbbonamentoCriteria = new ngs.persistentmodel.AbbonamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelAbbonamentoCriteria.ID.eq();
		lngspersistentmodelAbbonamentoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.Abbonamento[] ngspersistentmodelAbbonamentos = lngspersistentmodelAbbonamentoCriteria.listAbbonamento();
		length =ngspersistentmodelAbbonamentos== null ? 0 : Math.min(ngspersistentmodelAbbonamentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelAbbonamentos[i]);
		}
		System.out.println(length + " Abbonamento record(s) retrieved."); 
		
		System.out.println("Listing AnagraficaUniversitario by Criteria...");
		ngs.persistentmodel.AnagraficaUniversitarioCriteria lngspersistentmodelAnagraficaUniversitarioCriteria = new ngs.persistentmodel.AnagraficaUniversitarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelAnagraficaUniversitarioCriteria.matricola.eq();
		lngspersistentmodelAnagraficaUniversitarioCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.AnagraficaUniversitario[] ngspersistentmodelAnagraficaUniversitarios = lngspersistentmodelAnagraficaUniversitarioCriteria.listAnagraficaUniversitario();
		length =ngspersistentmodelAnagraficaUniversitarios== null ? 0 : Math.min(ngspersistentmodelAnagraficaUniversitarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelAnagraficaUniversitarios[i]);
		}
		System.out.println(length + " AnagraficaUniversitario record(s) retrieved."); 
		
		System.out.println("Listing DipendenteAleniaSpazio by Criteria...");
		ngs.persistentmodel.DipendenteAleniaSpazioCriteria lngspersistentmodelDipendenteAleniaSpazioCriteria = new ngs.persistentmodel.DipendenteAleniaSpazioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelDipendenteAleniaSpazioCriteria.codiceDipendente.eq();
		lngspersistentmodelDipendenteAleniaSpazioCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.DipendenteAleniaSpazio[] ngspersistentmodelDipendenteAleniaSpazios = lngspersistentmodelDipendenteAleniaSpazioCriteria.listDipendenteAleniaSpazio();
		length =ngspersistentmodelDipendenteAleniaSpazios== null ? 0 : Math.min(ngspersistentmodelDipendenteAleniaSpazios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelDipendenteAleniaSpazios[i]);
		}
		System.out.println(length + " DipendenteAleniaSpazio record(s) retrieved."); 
		
		System.out.println("Listing ScontoFisso by Criteria...");
		ngs.persistentmodel.ScontoFissoCriteria lngspersistentmodelScontoFissoCriteria = new ngs.persistentmodel.ScontoFissoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngspersistentmodelScontoFissoCriteria.nomePolitica.eq();
		lngspersistentmodelScontoFissoCriteria.setMaxResults(ROW_COUNT);
		ngs.persistentmodel.ScontoFisso[] ngspersistentmodelScontoFissos = lngspersistentmodelScontoFissoCriteria.listScontoFisso();
		length =ngspersistentmodelScontoFissos== null ? 0 : Math.min(ngspersistentmodelScontoFissos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngspersistentmodelScontoFissos[i]);
		}
		System.out.println(length + " ScontoFisso record(s) retrieved."); 
		
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
