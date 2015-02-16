/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteNextGenSport2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			ngs.persistentmodel.SalaPesi lngspersistentmodelSalaPesi = ngs.persistentmodel.SalaPesiDAO.loadSalaPesiByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.SalaPesiDAO.delete(lngspersistentmodelSalaPesi);
			ngs.persistentmodel.CategoriaCliente lngspersistentmodelCategoriaCliente = ngs.persistentmodel.CategoriaClienteDAO.loadCategoriaClienteByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.CategoriaClienteDAO.delete(lngspersistentmodelCategoriaCliente);
			ngs.persistentmodel.DescrizioneAbbonamento lngspersistentmodelDescrizioneAbbonamento = ngs.persistentmodel.DescrizioneAbbonamentoDAO.loadDescrizioneAbbonamentoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.DescrizioneAbbonamentoDAO.delete(lngspersistentmodelDescrizioneAbbonamento);
			ngs.persistentmodel.PoliticaScontoAbbonamento lngspersistentmodelPoliticaScontoAbbonamento = ngs.persistentmodel.PoliticaScontoAbbonamentoDAO.loadPoliticaScontoAbbonamentoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.PoliticaScontoAbbonamentoDAO.delete(lngspersistentmodelPoliticaScontoAbbonamento);
			ngs.persistentmodel.ScontoPercentuale lngspersistentmodelScontoPercentuale = ngs.persistentmodel.ScontoPercentualeDAO.loadScontoPercentualeByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.ScontoPercentualeDAO.delete(lngspersistentmodelScontoPercentuale);
			ngs.persistentmodel.TipologiaCorso lngspersistentmodelTipologiaCorso = ngs.persistentmodel.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.TipologiaCorsoDAO.delete(lngspersistentmodelTipologiaCorso);
			ngs.persistentmodel.DescrizioneCorso lngspersistentmodelDescrizioneCorso = ngs.persistentmodel.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.DescrizioneCorsoDAO.delete(lngspersistentmodelDescrizioneCorso);
			ngs.persistentmodel.PreventivoAbbonamento lngspersistentmodelPreventivoAbbonamento = ngs.persistentmodel.PreventivoAbbonamentoDAO.loadPreventivoAbbonamentoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.PreventivoAbbonamentoDAO.delete(lngspersistentmodelPreventivoAbbonamento);
			ngs.persistentmodel.Cliente lngspersistentmodelCliente = ngs.persistentmodel.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.ClienteDAO.delete(lngspersistentmodelCliente);
			ngs.persistentmodel.CertificatoMedico lngspersistentmodelCertificatoMedico = ngs.persistentmodel.CertificatoMedicoDAO.loadCertificatoMedicoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.CertificatoMedicoDAO.delete(lngspersistentmodelCertificatoMedico);
			ngs.persistentmodel.Pagamento lngspersistentmodelPagamento = ngs.persistentmodel.PagamentoDAO.loadPagamentoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.PagamentoDAO.delete(lngspersistentmodelPagamento);
			ngs.persistentmodel.Abbonamento lngspersistentmodelAbbonamento = ngs.persistentmodel.AbbonamentoDAO.loadAbbonamentoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.AbbonamentoDAO.delete(lngspersistentmodelAbbonamento);
			ngs.persistentmodel.AnagraficaUniversitario lngspersistentmodelAnagraficaUniversitario = ngs.persistentmodel.AnagraficaUniversitarioDAO.loadAnagraficaUniversitarioByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.AnagraficaUniversitarioDAO.delete(lngspersistentmodelAnagraficaUniversitario);
			ngs.persistentmodel.DipendenteAleniaSpazio lngspersistentmodelDipendenteAleniaSpazio = ngs.persistentmodel.DipendenteAleniaSpazioDAO.loadDipendenteAleniaSpazioByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.DipendenteAleniaSpazioDAO.delete(lngspersistentmodelDipendenteAleniaSpazio);
			ngs.persistentmodel.ScontoFisso lngspersistentmodelScontoFisso = ngs.persistentmodel.ScontoFissoDAO.loadScontoFissoByQuery(null, null);
			// Delete the persistent object
			ngs.persistentmodel.ScontoFissoDAO.delete(lngspersistentmodelScontoFisso);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteNextGenSport2Data deleteNextGenSport2Data = new DeleteNextGenSport2Data();
			try {
				deleteNextGenSport2Data.deleteTestData();
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
