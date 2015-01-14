/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListNextGenSport2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing TipologiaCorso...");
		ngs.peristentmodel.TipologiaCorso[] ngsperistentmodelTipologiaCorsos = ngs.peristentmodel.TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null);
		int length = Math.min(ngsperistentmodelTipologiaCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngsperistentmodelTipologiaCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DescrizioneCorso...");
		ngs.peristentmodel.DescrizioneCorso[] ngsperistentmodelDescrizioneCorsos = ngs.peristentmodel.DescrizioneCorsoDAO.listDescrizioneCorsoByQuery(null, null);
		length = Math.min(ngsperistentmodelDescrizioneCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ngsperistentmodelDescrizioneCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing TipologiaCorso by Criteria...");
		ngs.peristentmodel.TipologiaCorsoCriteria lngsperistentmodelTipologiaCorsoCriteria = new ngs.peristentmodel.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngsperistentmodelTipologiaCorsoCriteria.nomeTip.eq();
		lngsperistentmodelTipologiaCorsoCriteria.setMaxResults(ROW_COUNT);
		ngs.peristentmodel.TipologiaCorso[] ngsperistentmodelTipologiaCorsos = lngsperistentmodelTipologiaCorsoCriteria.listTipologiaCorso();
		int length =ngsperistentmodelTipologiaCorsos== null ? 0 : Math.min(ngsperistentmodelTipologiaCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngsperistentmodelTipologiaCorsos[i]);
		}
		System.out.println(length + " TipologiaCorso record(s) retrieved."); 
		
		System.out.println("Listing DescrizioneCorso by Criteria...");
		ngs.peristentmodel.DescrizioneCorsoCriteria lngsperistentmodelDescrizioneCorsoCriteria = new ngs.peristentmodel.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lngsperistentmodelDescrizioneCorsoCriteria.nomeCorso.eq();
		lngsperistentmodelDescrizioneCorsoCriteria.setMaxResults(ROW_COUNT);
		ngs.peristentmodel.DescrizioneCorso[] ngsperistentmodelDescrizioneCorsos = lngsperistentmodelDescrizioneCorsoCriteria.listDescrizioneCorso();
		length =ngsperistentmodelDescrizioneCorsos== null ? 0 : Math.min(ngsperistentmodelDescrizioneCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ngsperistentmodelDescrizioneCorsos[i]);
		}
		System.out.println(length + " DescrizioneCorso record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListNextGenSport2Data listNextGenSport2Data = new ListNextGenSport2Data();
			try {
				listNextGenSport2Data.listTestData();
				//listNextGenSport2Data.listByCriteria();
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
