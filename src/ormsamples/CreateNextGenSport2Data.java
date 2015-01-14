/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateNextGenSport2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			ngs.peristentmodel.TipologiaCorso lngsperistentmodelTipologiaCorso = ngs.peristentmodel.TipologiaCorsoDAO.createTipologiaCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nomeTip
			ngs.peristentmodel.TipologiaCorsoDAO.save(lngsperistentmodelTipologiaCorso);
			ngs.peristentmodel.DescrizioneCorso lngsperistentmodelDescrizioneCorso = ngs.peristentmodel.DescrizioneCorsoDAO.createDescrizioneCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nomeCorso
			ngs.peristentmodel.DescrizioneCorsoDAO.save(lngsperistentmodelDescrizioneCorso);
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
				ngs.peristentmodel.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
