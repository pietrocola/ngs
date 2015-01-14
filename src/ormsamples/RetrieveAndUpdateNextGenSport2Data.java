/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateNextGenSport2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			ngs.peristentmodel.TipologiaCorso lngsperistentmodelTipologiaCorso = ngs.peristentmodel.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Update the properties of the persistent object
			ngs.peristentmodel.TipologiaCorsoDAO.save(lngsperistentmodelTipologiaCorso);
			ngs.peristentmodel.DescrizioneCorso lngsperistentmodelDescrizioneCorso = ngs.peristentmodel.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Update the properties of the persistent object
			ngs.peristentmodel.DescrizioneCorsoDAO.save(lngsperistentmodelDescrizioneCorso);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving TipologiaCorso by TipologiaCorsoCriteria");
		ngs.peristentmodel.TipologiaCorsoCriteria lngsperistentmodelTipologiaCorsoCriteria = new ngs.peristentmodel.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngsperistentmodelTipologiaCorsoCriteria.nomeTip.eq();
		System.out.println(lngsperistentmodelTipologiaCorsoCriteria.uniqueTipologiaCorso());
		
		System.out.println("Retrieving DescrizioneCorso by DescrizioneCorsoCriteria");
		ngs.peristentmodel.DescrizioneCorsoCriteria lngsperistentmodelDescrizioneCorsoCriteria = new ngs.peristentmodel.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lngsperistentmodelDescrizioneCorsoCriteria.nomeCorso.eq();
		System.out.println(lngsperistentmodelDescrizioneCorsoCriteria.uniqueDescrizioneCorso());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateNextGenSport2Data retrieveAndUpdateNextGenSport2Data = new RetrieveAndUpdateNextGenSport2Data();
			try {
				retrieveAndUpdateNextGenSport2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateNextGenSport2Data.retrieveByCriteria();
			}
			finally {
				ngs.peristentmodel.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
