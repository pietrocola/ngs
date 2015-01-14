/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteNextGenSport2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			ngs.peristentmodel.TipologiaCorso lngsperistentmodelTipologiaCorso = ngs.peristentmodel.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Delete the persistent object
			ngs.peristentmodel.TipologiaCorsoDAO.delete(lngsperistentmodelTipologiaCorso);
			ngs.peristentmodel.DescrizioneCorso lngsperistentmodelDescrizioneCorso = ngs.peristentmodel.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Delete the persistent object
			ngs.peristentmodel.DescrizioneCorsoDAO.delete(lngsperistentmodelDescrizioneCorso);
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
				ngs.peristentmodel.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
