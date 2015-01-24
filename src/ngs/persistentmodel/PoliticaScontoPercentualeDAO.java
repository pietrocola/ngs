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

public class PoliticaScontoPercentualeDAO {
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoPercentualeByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale getPoliticaScontoPercentualeByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPoliticaScontoPercentualeByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoPercentualeByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale getPoliticaScontoPercentualeByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPoliticaScontoPercentualeByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (PoliticaScontoPercentuale) session.load(ngs.persistentmodel.PoliticaScontoPercentuale.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale getPoliticaScontoPercentualeByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (PoliticaScontoPercentuale) session.get(ngs.persistentmodel.PoliticaScontoPercentuale.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (PoliticaScontoPercentuale) session.load(ngs.persistentmodel.PoliticaScontoPercentuale.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale getPoliticaScontoPercentualeByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (PoliticaScontoPercentuale) session.get(ngs.persistentmodel.PoliticaScontoPercentuale.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPoliticaScontoPercentuale(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPoliticaScontoPercentuale(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPoliticaScontoPercentuale(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPoliticaScontoPercentuale(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale[] listPoliticaScontoPercentualeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPoliticaScontoPercentualeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale[] listPoliticaScontoPercentualeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPoliticaScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPoliticaScontoPercentuale(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoPercentuale as PoliticaScontoPercentuale");
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
	
	public static List queryPoliticaScontoPercentuale(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoPercentuale as PoliticaScontoPercentuale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PoliticaScontoPercentuale", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale[] listPoliticaScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryPoliticaScontoPercentuale(session, condition, orderBy);
			return (PoliticaScontoPercentuale[]) list.toArray(new PoliticaScontoPercentuale[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale[] listPoliticaScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryPoliticaScontoPercentuale(session, condition, orderBy, lockMode);
			return (PoliticaScontoPercentuale[]) list.toArray(new PoliticaScontoPercentuale[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoPercentualeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy) {
		PoliticaScontoPercentuale[] politicaScontoPercentuales = listPoliticaScontoPercentualeByQuery(session, condition, orderBy);
		if (politicaScontoPercentuales != null && politicaScontoPercentuales.length > 0)
			return politicaScontoPercentuales[0];
		else
			return null;
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PoliticaScontoPercentuale[] politicaScontoPercentuales = listPoliticaScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		if (politicaScontoPercentuales != null && politicaScontoPercentuales.length > 0)
			return politicaScontoPercentuales[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePoliticaScontoPercentualeByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePoliticaScontoPercentualeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePoliticaScontoPercentualeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePoliticaScontoPercentualeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePoliticaScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoPercentuale as PoliticaScontoPercentuale");
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
	
	public static java.util.Iterator iteratePoliticaScontoPercentualeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoPercentuale as PoliticaScontoPercentuale");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PoliticaScontoPercentuale", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoPercentuale createPoliticaScontoPercentuale() {
		return new ngs.persistentmodel.PoliticaScontoPercentuale();
	}
	
	public static boolean save(ngs.persistentmodel.PoliticaScontoPercentuale politicaScontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(politicaScontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.PoliticaScontoPercentuale politicaScontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(politicaScontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.PoliticaScontoPercentuale politicaScontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(politicaScontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.PoliticaScontoPercentuale politicaScontoPercentuale) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(politicaScontoPercentuale);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static PoliticaScontoPercentuale loadPoliticaScontoPercentualeByCriteria(PoliticaScontoPercentualeCriteria politicaScontoPercentualeCriteria) {
		PoliticaScontoPercentuale[] politicaScontoPercentuales = listPoliticaScontoPercentualeByCriteria(politicaScontoPercentualeCriteria);
		if(politicaScontoPercentuales == null || politicaScontoPercentuales.length == 0) {
			return null;
		}
		return politicaScontoPercentuales[0];
	}
	
	public static PoliticaScontoPercentuale[] listPoliticaScontoPercentualeByCriteria(PoliticaScontoPercentualeCriteria politicaScontoPercentualeCriteria) {
		return politicaScontoPercentualeCriteria.listPoliticaScontoPercentuale();
	}
}
