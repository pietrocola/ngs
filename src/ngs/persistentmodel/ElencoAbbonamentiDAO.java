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

public class ElencoAbbonamentiDAO {
	public static ElencoAbbonamenti loadElencoAbbonamentiByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoAbbonamentiByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti getElencoAbbonamentiByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getElencoAbbonamentiByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoAbbonamentiByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti getElencoAbbonamentiByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getElencoAbbonamentiByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByORMID(PersistentSession session, int ID) {
		try {
			return (ElencoAbbonamenti) session.load(ngs.persistentmodel.ElencoAbbonamenti.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti getElencoAbbonamentiByORMID(PersistentSession session, int ID) {
		try {
			return (ElencoAbbonamenti) session.get(ngs.persistentmodel.ElencoAbbonamenti.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (ElencoAbbonamenti) session.load(ngs.persistentmodel.ElencoAbbonamenti.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti getElencoAbbonamentiByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (ElencoAbbonamenti) session.get(ngs.persistentmodel.ElencoAbbonamenti.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryElencoAbbonamenti(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryElencoAbbonamenti(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryElencoAbbonamenti(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryElencoAbbonamenti(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti[] listElencoAbbonamentiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listElencoAbbonamentiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti[] listElencoAbbonamentiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listElencoAbbonamentiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryElencoAbbonamenti(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ElencoAbbonamenti as ElencoAbbonamenti");
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
	
	public static List queryElencoAbbonamenti(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ElencoAbbonamenti as ElencoAbbonamenti");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ElencoAbbonamenti", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti[] listElencoAbbonamentiByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryElencoAbbonamenti(session, condition, orderBy);
			return (ElencoAbbonamenti[]) list.toArray(new ElencoAbbonamenti[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti[] listElencoAbbonamentiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryElencoAbbonamenti(session, condition, orderBy, lockMode);
			return (ElencoAbbonamenti[]) list.toArray(new ElencoAbbonamenti[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoAbbonamentiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoAbbonamentiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByQuery(PersistentSession session, String condition, String orderBy) {
		ElencoAbbonamenti[] elencoAbbonamentis = listElencoAbbonamentiByQuery(session, condition, orderBy);
		if (elencoAbbonamentis != null && elencoAbbonamentis.length > 0)
			return elencoAbbonamentis[0];
		else
			return null;
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		ElencoAbbonamenti[] elencoAbbonamentis = listElencoAbbonamentiByQuery(session, condition, orderBy, lockMode);
		if (elencoAbbonamentis != null && elencoAbbonamentis.length > 0)
			return elencoAbbonamentis[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateElencoAbbonamentiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateElencoAbbonamentiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateElencoAbbonamentiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateElencoAbbonamentiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateElencoAbbonamentiByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ElencoAbbonamenti as ElencoAbbonamenti");
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
	
	public static java.util.Iterator iterateElencoAbbonamentiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ElencoAbbonamenti as ElencoAbbonamenti");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ElencoAbbonamenti", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ElencoAbbonamenti createElencoAbbonamenti() {
		return new ngs.persistentmodel.ElencoAbbonamenti();
	}
	
	public static boolean save(ngs.persistentmodel.ElencoAbbonamenti elencoAbbonamenti) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(elencoAbbonamenti);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.ElencoAbbonamenti elencoAbbonamenti) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(elencoAbbonamenti);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.ElencoAbbonamenti elencoAbbonamenti) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(elencoAbbonamenti);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.ElencoAbbonamenti elencoAbbonamenti) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(elencoAbbonamenti);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static ElencoAbbonamenti loadElencoAbbonamentiByCriteria(ElencoAbbonamentiCriteria elencoAbbonamentiCriteria) {
		ElencoAbbonamenti[] elencoAbbonamentis = listElencoAbbonamentiByCriteria(elencoAbbonamentiCriteria);
		if(elencoAbbonamentis == null || elencoAbbonamentis.length == 0) {
			return null;
		}
		return elencoAbbonamentis[0];
	}
	
	public static ElencoAbbonamenti[] listElencoAbbonamentiByCriteria(ElencoAbbonamentiCriteria elencoAbbonamentiCriteria) {
		return elencoAbbonamentiCriteria.listElencoAbbonamenti();
	}
}
