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

public class ScontoPercentualeDAO {
	public static ScontoPercentuale loadScontoPercentualeByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoPercentualeByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale getScontoPercentualeByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getScontoPercentualeByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale loadScontoPercentualeByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoPercentualeByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale getScontoPercentualeByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getScontoPercentualeByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale loadScontoPercentualeByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (ScontoPercentuale) session.load(ngs.persistentmodel.ScontoPercentuale.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale getScontoPercentualeByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (ScontoPercentuale) session.get(ngs.persistentmodel.ScontoPercentuale.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale loadScontoPercentualeByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (ScontoPercentuale) session.load(ngs.persistentmodel.ScontoPercentuale.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale getScontoPercentualeByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (ScontoPercentuale) session.get(ngs.persistentmodel.ScontoPercentuale.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryScontoPercentuale(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryScontoPercentuale(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryScontoPercentuale(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryScontoPercentuale(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale[] listScontoPercentualeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listScontoPercentualeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale[] listScontoPercentualeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryScontoPercentuale(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoPercentuale as ScontoPercentuale");
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
	
	public static List queryScontoPercentuale(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoPercentuale as ScontoPercentuale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ScontoPercentuale", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale[] listScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryScontoPercentuale(session, condition, orderBy);
			return (ScontoPercentuale[]) list.toArray(new ScontoPercentuale[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale[] listScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryScontoPercentuale(session, condition, orderBy, lockMode);
			return (ScontoPercentuale[]) list.toArray(new ScontoPercentuale[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale loadScontoPercentualeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoPercentualeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale loadScontoPercentualeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale loadScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy) {
		ScontoPercentuale[] scontoPercentuales = listScontoPercentualeByQuery(session, condition, orderBy);
		if (scontoPercentuales != null && scontoPercentuales.length > 0)
			return scontoPercentuales[0];
		else
			return null;
	}
	
	public static ScontoPercentuale loadScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		ScontoPercentuale[] scontoPercentuales = listScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		if (scontoPercentuales != null && scontoPercentuales.length > 0)
			return scontoPercentuales[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateScontoPercentualeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateScontoPercentualeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateScontoPercentualeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoPercentuale as ScontoPercentuale");
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
	
	public static java.util.Iterator iterateScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoPercentuale as ScontoPercentuale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ScontoPercentuale", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoPercentuale createScontoPercentuale() {
		return new ngs.persistentmodel.ScontoPercentuale();
	}
	
	public static boolean save(ngs.persistentmodel.ScontoPercentuale scontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(scontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.ScontoPercentuale scontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(scontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.ScontoPercentuale scontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(scontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.ScontoPercentuale scontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(scontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static ScontoPercentuale loadScontoPercentualeByCriteria(ScontoPercentualeCriteria scontoPercentualeCriteria) {
		ScontoPercentuale[] scontoPercentuales = listScontoPercentualeByCriteria(scontoPercentualeCriteria);
		if(scontoPercentuales == null || scontoPercentuales.length == 0) {
			return null;
		}
		return scontoPercentuales[0];
	}
	
	public static ScontoPercentuale[] listScontoPercentualeByCriteria(ScontoPercentualeCriteria scontoPercentualeCriteria) {
		return scontoPercentualeCriteria.listScontoPercentuale();
	}
}
