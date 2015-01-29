/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateNextGenSport2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			ngs.persistentmodel.SalaPesi lngspersistentmodelSalaPesi = ngs.persistentmodel.SalaPesiDAO.loadSalaPesiByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.SalaPesiDAO.save(lngspersistentmodelSalaPesi);
			ngs.persistentmodel.FasciaOrariaSalaPesi lngspersistentmodelFasciaOrariaSalaPesi = ngs.persistentmodel.FasciaOrariaSalaPesiDAO.loadFasciaOrariaSalaPesiByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.FasciaOrariaSalaPesiDAO.save(lngspersistentmodelFasciaOrariaSalaPesi);
			ngs.persistentmodel.CategoriaCliente lngspersistentmodelCategoriaCliente = ngs.persistentmodel.CategoriaClienteDAO.loadCategoriaClienteByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.CategoriaClienteDAO.save(lngspersistentmodelCategoriaCliente);
			ngs.persistentmodel.DescrizioneAbbonamento lngspersistentmodelDescrizioneAbbonamento = ngs.persistentmodel.DescrizioneAbbonamentoDAO.loadDescrizioneAbbonamentoByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.DescrizioneAbbonamentoDAO.save(lngspersistentmodelDescrizioneAbbonamento);
			ngs.persistentmodel.PoliticaScontoAbbonamento lngspersistentmodelPoliticaScontoAbbonamento = ngs.persistentmodel.PoliticaScontoAbbonamentoDAO.loadPoliticaScontoAbbonamentoByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.PoliticaScontoAbbonamentoDAO.save(lngspersistentmodelPoliticaScontoAbbonamento);
			ngs.persistentmodel.ScontoPercentuale lngspersistentmodelScontoPercentuale = ngs.persistentmodel.ScontoPercentualeDAO.loadScontoPercentualeByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.ScontoPercentualeDAO.save(lngspersistentmodelScontoPercentuale);
			ngs.persistentmodel.TipologiaCorso lngspersistentmodelTipologiaCorso = ngs.persistentmodel.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.TipologiaCorsoDAO.save(lngspersistentmodelTipologiaCorso);
			ngs.persistentmodel.DescrizioneCorso lngspersistentmodelDescrizioneCorso = ngs.persistentmodel.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.DescrizioneCorsoDAO.save(lngspersistentmodelDescrizioneCorso);
			ngs.persistentmodel.PreventivoAbbonamento lngspersistentmodelPreventivoAbbonamento = ngs.persistentmodel.PreventivoAbbonamentoDAO.loadPreventivoAbbonamentoByQuery(null, null);
			// Update the properties of the persistent object
			ngs.persistentmodel.PreventivoAbbonamentoDAO.save(lngspersistentmodelPreventivoAbbonamento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving SalaPesi by SalaPesiCriteria");
		ngs.persistentmodel.SalaPesiCriteria lngspersistentmodelSalaPesiCriteria = new ngs.persistentmodel.SalaPesiCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelSalaPesiCriteria.nomeSala.eq();
		System.out.println(lngspersistentmodelSalaPesiCriteria.uniqueSalaPesi());
		
		System.out.println("Retrieving FasciaOrariaSalaPesi by FasciaOrariaSalaPesiCriteria");
		ngs.persistentmodel.FasciaOrariaSalaPesiCriteria lngspersistentmodelFasciaOrariaSalaPesiCriteria = new ngs.persistentmodel.FasciaOrariaSalaPesiCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelFasciaOrariaSalaPesiCriteria.ID.eq();
		System.out.println(lngspersistentmodelFasciaOrariaSalaPesiCriteria.uniqueFasciaOrariaSalaPesi());
		
		System.out.println("Retrieving CategoriaCliente by CategoriaClienteCriteria");
		ngs.persistentmodel.CategoriaClienteCriteria lngspersistentmodelCategoriaClienteCriteria = new ngs.persistentmodel.CategoriaClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelCategoriaClienteCriteria.nomeCat.eq();
		System.out.println(lngspersistentmodelCategoriaClienteCriteria.uniqueCategoriaCliente());
		
		System.out.println("Retrieving DescrizioneAbbonamento by DescrizioneAbbonamentoCriteria");
		ngs.persistentmodel.DescrizioneAbbonamentoCriteria lngspersistentmodelDescrizioneAbbonamentoCriteria = new ngs.persistentmodel.DescrizioneAbbonamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelDescrizioneAbbonamentoCriteria.nomeAbbonamento.eq();
		System.out.println(lngspersistentmodelDescrizioneAbbonamentoCriteria.uniqueDescrizioneAbbonamento());
		
		System.out.println("Retrieving PoliticaScontoAbbonamento by PoliticaScontoAbbonamentoCriteria");
		ngs.persistentmodel.PoliticaScontoAbbonamentoCriteria lngspersistentmodelPoliticaScontoAbbonamentoCriteria = new ngs.persistentmodel.PoliticaScontoAbbonamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelPoliticaScontoAbbonamentoCriteria.nomePolitica.eq();
		System.out.println(lngspersistentmodelPoliticaScontoAbbonamentoCriteria.uniquePoliticaScontoAbbonamento());
		
		System.out.println("Retrieving ScontoPercentuale by ScontoPercentualeCriteria");
		ngs.persistentmodel.ScontoPercentualeCriteria lngspersistentmodelScontoPercentualeCriteria = new ngs.persistentmodel.ScontoPercentualeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelScontoPercentualeCriteria.nomePolitica.eq();
		System.out.println(lngspersistentmodelScontoPercentualeCriteria.uniqueScontoPercentuale());
		
		System.out.println("Retrieving TipologiaCorso by TipologiaCorsoCriteria");
		ngs.persistentmodel.TipologiaCorsoCriteria lngspersistentmodelTipologiaCorsoCriteria = new ngs.persistentmodel.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelTipologiaCorsoCriteria.nomeTip.eq();
		System.out.println(lngspersistentmodelTipologiaCorsoCriteria.uniqueTipologiaCorso());
		
		System.out.println("Retrieving DescrizioneCorso by DescrizioneCorsoCriteria");
		ngs.persistentmodel.DescrizioneCorsoCriteria lngspersistentmodelDescrizioneCorsoCriteria = new ngs.persistentmodel.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelDescrizioneCorsoCriteria.nomeCorso.eq();
		System.out.println(lngspersistentmodelDescrizioneCorsoCriteria.uniqueDescrizioneCorso());
		
		System.out.println("Retrieving PreventivoAbbonamento by PreventivoAbbonamentoCriteria");
		ngs.persistentmodel.PreventivoAbbonamentoCriteria lngspersistentmodelPreventivoAbbonamentoCriteria = new ngs.persistentmodel.PreventivoAbbonamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngspersistentmodelPreventivoAbbonamentoCriteria.ID.eq();
		System.out.println(lngspersistentmodelPreventivoAbbonamentoCriteria.uniquePreventivoAbbonamento());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateNextGenSport2Data retrieveAndUpdateNextGenSport2Data = new RetrieveAndUpdateNextGenSport2Data();
			try {
				retrieveAndUpdateNextGenSport2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateNextGenSport2Data.retrieveByCriteria();
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
