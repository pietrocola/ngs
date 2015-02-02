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
