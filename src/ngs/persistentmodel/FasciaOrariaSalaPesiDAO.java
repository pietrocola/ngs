/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ngs.persistentmodel;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class FasciaOrariaSalaPesiDAO {
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadFasciaOrariaSalaPesiByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi getFasciaOrariaSalaPesiByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getFasciaOrariaSalaPesiByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadFasciaOrariaSalaPesiByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi getFasciaOrariaSalaPesiByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getFasciaOrariaSalaPesiByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByORMID(PersistentSession session, int ID) {
		try {
			return (FasciaOrariaSalaPesi) session.load(ngs.persistentmodel.FasciaOrariaSalaPesi.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi getFasciaOrariaSalaPesiByORMID(PersistentSession session, int ID) {
		try {
			return (FasciaOrariaSalaPesi) session.get(ngs.persistentmodel.FasciaOrariaSalaPesi.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (FasciaOrariaSalaPesi) session.load(ngs.persistentmodel.FasciaOrariaSalaPesi.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi getFasciaOrariaSalaPesiByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (FasciaOrariaSalaPesi) session.get(ngs.persistentmodel.FasciaOrariaSalaPesi.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryFasciaOrariaSalaPesi(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryFasciaOrariaSalaPesi(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryFasciaOrariaSalaPesi(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryFasciaOrariaSalaPesi(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi[] listFasciaOrariaSalaPesiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listFasciaOrariaSalaPesiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi[] listFasciaOrariaSalaPesiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listFasciaOrariaSalaPesiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryFasciaOrariaSalaPesi(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.FasciaOrariaSalaPesi as FasciaOrariaSalaPesi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryFasciaOrariaSalaPesi(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.FasciaOrariaSalaPesi as FasciaOrariaSalaPesi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FasciaOrariaSalaPesi", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi[] listFasciaOrariaSalaPesiByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryFasciaOrariaSalaPesi(session, condition, orderBy);
			return (FasciaOrariaSalaPesi[]) list.toArray(new FasciaOrariaSalaPesi[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi[] listFasciaOrariaSalaPesiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryFasciaOrariaSalaPesi(session, condition, orderBy, lockMode);
			return (FasciaOrariaSalaPesi[]) list.toArray(new FasciaOrariaSalaPesi[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadFasciaOrariaSalaPesiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadFasciaOrariaSalaPesiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByQuery(PersistentSession session, String condition, String orderBy) {
		FasciaOrariaSalaPesi[] fasciaOrariaSalaPesis = listFasciaOrariaSalaPesiByQuery(session, condition, orderBy);
		if (fasciaOrariaSalaPesis != null && fasciaOrariaSalaPesis.length > 0)
			return fasciaOrariaSalaPesis[0];
		else
			return null;
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		FasciaOrariaSalaPesi[] fasciaOrariaSalaPesis = listFasciaOrariaSalaPesiByQuery(session, condition, orderBy, lockMode);
		if (fasciaOrariaSalaPesis != null && fasciaOrariaSalaPesis.length > 0)
			return fasciaOrariaSalaPesis[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFasciaOrariaSalaPesiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateFasciaOrariaSalaPesiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateFasciaOrariaSalaPesiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateFasciaOrariaSalaPesiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateFasciaOrariaSalaPesiByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.FasciaOrariaSalaPesi as FasciaOrariaSalaPesi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateFasciaOrariaSalaPesiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.FasciaOrariaSalaPesi as FasciaOrariaSalaPesi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("FasciaOrariaSalaPesi", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static FasciaOrariaSalaPesi createFasciaOrariaSalaPesi() {
		return new ngs.persistentmodel.FasciaOrariaSalaPesi();
	}
	
	public static boolean save(ngs.persistentmodel.FasciaOrariaSalaPesi fasciaOrariaSalaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(fasciaOrariaSalaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.FasciaOrariaSalaPesi fasciaOrariaSalaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(fasciaOrariaSalaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.FasciaOrariaSalaPesi fasciaOrariaSalaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(fasciaOrariaSalaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.FasciaOrariaSalaPesi fasciaOrariaSalaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(fasciaOrariaSalaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static FasciaOrariaSalaPesi loadFasciaOrariaSalaPesiByCriteria(FasciaOrariaSalaPesiCriteria fasciaOrariaSalaPesiCriteria) {
		FasciaOrariaSalaPesi[] fasciaOrariaSalaPesis = listFasciaOrariaSalaPesiByCriteria(fasciaOrariaSalaPesiCriteria);
		if(fasciaOrariaSalaPesis == null || fasciaOrariaSalaPesis.length == 0) {
			return null;
		}
		return fasciaOrariaSalaPesis[0];
	}
	
	public static FasciaOrariaSalaPesi[] listFasciaOrariaSalaPesiByCriteria(FasciaOrariaSalaPesiCriteria fasciaOrariaSalaPesiCriteria) {
		return fasciaOrariaSalaPesiCriteria.listFasciaOrariaSalaPesi();
	}
}
