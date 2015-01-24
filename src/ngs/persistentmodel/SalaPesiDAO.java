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

public class SalaPesiDAO {
	public static SalaPesi loadSalaPesiByORMID(String nomeSala) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadSalaPesiByORMID(session, nomeSala);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi getSalaPesiByORMID(String nomeSala) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getSalaPesiByORMID(session, nomeSala);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi loadSalaPesiByORMID(String nomeSala, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadSalaPesiByORMID(session, nomeSala, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi getSalaPesiByORMID(String nomeSala, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getSalaPesiByORMID(session, nomeSala, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi loadSalaPesiByORMID(PersistentSession session, String nomeSala) {
		try {
			return (SalaPesi) session.load(ngs.persistentmodel.SalaPesi.class, nomeSala);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi getSalaPesiByORMID(PersistentSession session, String nomeSala) {
		try {
			return (SalaPesi) session.get(ngs.persistentmodel.SalaPesi.class, nomeSala);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi loadSalaPesiByORMID(PersistentSession session, String nomeSala, org.hibernate.LockMode lockMode) {
		try {
			return (SalaPesi) session.load(ngs.persistentmodel.SalaPesi.class, nomeSala, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi getSalaPesiByORMID(PersistentSession session, String nomeSala, org.hibernate.LockMode lockMode) {
		try {
			return (SalaPesi) session.get(ngs.persistentmodel.SalaPesi.class, nomeSala, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List querySalaPesi(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return querySalaPesi(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List querySalaPesi(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return querySalaPesi(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi[] listSalaPesiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listSalaPesiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi[] listSalaPesiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listSalaPesiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List querySalaPesi(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.SalaPesi as SalaPesi");
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
	
	public static List querySalaPesi(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.SalaPesi as SalaPesi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SalaPesi", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi[] listSalaPesiByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = querySalaPesi(session, condition, orderBy);
			return (SalaPesi[]) list.toArray(new SalaPesi[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi[] listSalaPesiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = querySalaPesi(session, condition, orderBy, lockMode);
			return (SalaPesi[]) list.toArray(new SalaPesi[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi loadSalaPesiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadSalaPesiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi loadSalaPesiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadSalaPesiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi loadSalaPesiByQuery(PersistentSession session, String condition, String orderBy) {
		SalaPesi[] salaPesis = listSalaPesiByQuery(session, condition, orderBy);
		if (salaPesis != null && salaPesis.length > 0)
			return salaPesis[0];
		else
			return null;
	}
	
	public static SalaPesi loadSalaPesiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		SalaPesi[] salaPesis = listSalaPesiByQuery(session, condition, orderBy, lockMode);
		if (salaPesis != null && salaPesis.length > 0)
			return salaPesis[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSalaPesiByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateSalaPesiByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateSalaPesiByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateSalaPesiByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateSalaPesiByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.SalaPesi as SalaPesi");
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
	
	public static java.util.Iterator iterateSalaPesiByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.SalaPesi as SalaPesi");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SalaPesi", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static SalaPesi createSalaPesi() {
		return new ngs.persistentmodel.SalaPesi();
	}
	
	public static boolean save(ngs.persistentmodel.SalaPesi salaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(salaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.SalaPesi salaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(salaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.SalaPesi salaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(salaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.SalaPesi salaPesi) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(salaPesi);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static SalaPesi loadSalaPesiByCriteria(SalaPesiCriteria salaPesiCriteria) {
		SalaPesi[] salaPesis = listSalaPesiByCriteria(salaPesiCriteria);
		if(salaPesis == null || salaPesis.length == 0) {
			return null;
		}
		return salaPesis[0];
	}
	
	public static SalaPesi[] listSalaPesiByCriteria(SalaPesiCriteria salaPesiCriteria) {
		return salaPesiCriteria.listSalaPesi();
	}
}
