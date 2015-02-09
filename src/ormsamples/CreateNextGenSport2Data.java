/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateNextGenSport2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			ngs.persistentmodel.SalaPesi lngspersistentmodelSalaPesi = ngs.persistentmodel.SalaPesiDAO.createSalaPesi();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nomeSala
			ngs.persistentmodel.SalaPesiDAO.save(lngspersistentmodelSalaPesi);
			ngs.persistentmodel.CategoriaCliente lngspersistentmodelCategoriaCliente = ngs.persistentmodel.CategoriaClienteDAO.createCategoriaCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nomeCat
			ngs.persistentmodel.CategoriaClienteDAO.save(lngspersistentmodelCategoriaCliente);
			ngs.persistentmodel.DescrizioneAbbonamento lngspersistentmodelDescrizioneAbbonamento = ngs.persistentmodel.DescrizioneAbbonamentoDAO.createDescrizioneAbbonamento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : elencoCorsi, elencoSalePesi, prezzoBaseMensile, nomeAbbonamento
			ngs.persistentmodel.DescrizioneAbbonamentoDAO.save(lngspersistentmodelDescrizioneAbbonamento);
			ngs.persistentmodel.PoliticaScontoAbbonamento lngspersistentmodelPoliticaScontoAbbonamento = ngs.persistentmodel.PoliticaScontoAbbonamentoDAO.createPoliticaScontoAbbonamento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nomePolitica
			ngs.persistentmodel.PoliticaScontoAbbonamentoDAO.save(lngspersistentmodelPoliticaScontoAbbonamento);
			ngs.persistentmodel.ScontoPercentuale lngspersistentmodelScontoPercentuale = ngs.persistentmodel.ScontoPercentualeDAO.createScontoPercentuale();
			// Initialize the properties of the persistent object here
			ngs.persistentmodel.ScontoPercentualeDAO.save(lngspersistentmodelScontoPercentuale);
			ngs.persistentmodel.TipologiaCorso lngspersistentmodelTipologiaCorso = ngs.persistentmodel.TipologiaCorsoDAO.createTipologiaCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nomeTip
			ngs.persistentmodel.TipologiaCorsoDAO.save(lngspersistentmodelTipologiaCorso);
			ngs.persistentmodel.DescrizioneCorso lngspersistentmodelDescrizioneCorso = ngs.persistentmodel.DescrizioneCorsoDAO.createDescrizioneCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : prenotazione, nomeCorso
			ngs.persistentmodel.DescrizioneCorsoDAO.save(lngspersistentmodelDescrizioneCorso);
			ngs.persistentmodel.PreventivoAbbonamento lngspersistentmodelPreventivoAbbonamento = ngs.persistentmodel.PreventivoAbbonamentoDAO.createPreventivoAbbonamento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numeroMesi, prezzo
			ngs.persistentmodel.PreventivoAbbonamentoDAO.save(lngspersistentmodelPreventivoAbbonamento);
			ngs.persistentmodel.Cliente lngspersistentmodelCliente = ngs.persistentmodel.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : telefono, codiceFiscale
			ngs.persistentmodel.ClienteDAO.save(lngspersistentmodelCliente);
			ngs.persistentmodel.CertificatoMedico lngspersistentmodelCertificatoMedico = ngs.persistentmodel.CertificatoMedicoDAO.createCertificatoMedico();
			// Initialize the properties of the persistent object here
			ngs.persistentmodel.CertificatoMedicoDAO.save(lngspersistentmodelCertificatoMedico);
			ngs.persistentmodel.Pagamento lngspersistentmodelPagamento = ngs.persistentmodel.PagamentoDAO.createPagamento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : stato, importo
			ngs.persistentmodel.PagamentoDAO.save(lngspersistentmodelPagamento);
			ngs.persistentmodel.Abbonamento lngspersistentmodelAbbonamento = ngs.persistentmodel.AbbonamentoDAO.createAbbonamento();
			// Initialize the properties of the persistent object here
			ngs.persistentmodel.AbbonamentoDAO.save(lngspersistentmodelAbbonamento);
			ngs.persistentmodel.ElencoAbbonamenti lngspersistentmodelElencoAbbonamenti = ngs.persistentmodel.ElencoAbbonamentiDAO.createElencoAbbonamenti();
			// Initialize the properties of the persistent object here
			ngs.persistentmodel.ElencoAbbonamentiDAO.save(lngspersistentmodelElencoAbbonamenti);
			ngs.persistentmodel.AnagraficaUniversitario lngspersistentmodelAnagraficaUniversitario = ngs.persistentmodel.AnagraficaUniversitarioDAO.createAnagraficaUniversitario();
			// Initialize the properties of the persistent object here
			ngs.persistentmodel.AnagraficaUniversitarioDAO.save(lngspersistentmodelAnagraficaUniversitario);
			ngs.persistentmodel.DipendenteAleniaSpazio lngspersistentmodelDipendenteAleniaSpazio = ngs.persistentmodel.DipendenteAleniaSpazioDAO.createDipendenteAleniaSpazio();
			// Initialize the properties of the persistent object here
			ngs.persistentmodel.DipendenteAleniaSpazioDAO.save(lngspersistentmodelDipendenteAleniaSpazio);
			ngs.persistentmodel.ScontoFisso lngspersistentmodelScontoFisso = ngs.persistentmodel.ScontoFissoDAO.createScontoFisso();
			// Initialize the properties of the persistent object here
			ngs.persistentmodel.ScontoFissoDAO.save(lngspersistentmodelScontoFisso);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateNextGenSport2Data createNextGenSport2Data = new CreateNextGenSport2Data();
			try {
				createNextGenSport2Data.createTestData();
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
