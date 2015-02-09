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

public class DipendenteAleniaSpazioDAO {
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByORMID(int codiceDipendente) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDipendenteAleniaSpazioByORMID(session, codiceDipendente);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio getDipendenteAleniaSpazioByORMID(int codiceDipendente) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDipendenteAleniaSpazioByORMID(session, codiceDipendente);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByORMID(int codiceDipendente, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDipendenteAleniaSpazioByORMID(session, codiceDipendente, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio getDipendenteAleniaSpazioByORMID(int codiceDipendente, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDipendenteAleniaSpazioByORMID(session, codiceDipendente, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByORMID(PersistentSession session, int codiceDipendente) {
		try {
			return (DipendenteAleniaSpazio) session.load(ngs.persistentmodel.DipendenteAleniaSpazio.class, new Integer(codiceDipendente));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio getDipendenteAleniaSpazioByORMID(PersistentSession session, int codiceDipendente) {
		try {
			return (DipendenteAleniaSpazio) session.get(ngs.persistentmodel.DipendenteAleniaSpazio.class, new Integer(codiceDipendente));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByORMID(PersistentSession session, int codiceDipendente, org.hibernate.LockMode lockMode) {
		try {
			return (DipendenteAleniaSpazio) session.load(ngs.persistentmodel.DipendenteAleniaSpazio.class, new Integer(codiceDipendente), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio getDipendenteAleniaSpazioByORMID(PersistentSession session, int codiceDipendente, org.hibernate.LockMode lockMode) {
		try {
			return (DipendenteAleniaSpazio) session.get(ngs.persistentmodel.DipendenteAleniaSpazio.class, new Integer(codiceDipendente), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDipendenteAleniaSpazio(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDipendenteAleniaSpazio(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDipendenteAleniaSpazio(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDipendenteAleniaSpazio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio[] listDipendenteAleniaSpazioByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDipendenteAleniaSpazioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio[] listDipendenteAleniaSpazioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDipendenteAleniaSpazioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDipendenteAleniaSpazio(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DipendenteAleniaSpazio as DipendenteAleniaSpazio");
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
	
	public static List queryDipendenteAleniaSpazio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DipendenteAleniaSpazio as DipendenteAleniaSpazio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DipendenteAleniaSpazio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio[] listDipendenteAleniaSpazioByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryDipendenteAleniaSpazio(session, condition, orderBy);
			return (DipendenteAleniaSpazio[]) list.toArray(new DipendenteAleniaSpazio[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio[] listDipendenteAleniaSpazioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryDipendenteAleniaSpazio(session, condition, orderBy, lockMode);
			return (DipendenteAleniaSpazio[]) list.toArray(new DipendenteAleniaSpazio[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDipendenteAleniaSpazioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDipendenteAleniaSpazioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByQuery(PersistentSession session, String condition, String orderBy) {
		DipendenteAleniaSpazio[] dipendenteAleniaSpazios = listDipendenteAleniaSpazioByQuery(session, condition, orderBy);
		if (dipendenteAleniaSpazios != null && dipendenteAleniaSpazios.length > 0)
			return dipendenteAleniaSpazios[0];
		else
			return null;
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		DipendenteAleniaSpazio[] dipendenteAleniaSpazios = listDipendenteAleniaSpazioByQuery(session, condition, orderBy, lockMode);
		if (dipendenteAleniaSpazios != null && dipendenteAleniaSpazios.length > 0)
			return dipendenteAleniaSpazios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDipendenteAleniaSpazioByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDipendenteAleniaSpazioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDipendenteAleniaSpazioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDipendenteAleniaSpazioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDipendenteAleniaSpazioByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DipendenteAleniaSpazio as DipendenteAleniaSpazio");
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
	
	public static java.util.Iterator iterateDipendenteAleniaSpazioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DipendenteAleniaSpazio as DipendenteAleniaSpazio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DipendenteAleniaSpazio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DipendenteAleniaSpazio createDipendenteAleniaSpazio() {
		return new ngs.persistentmodel.DipendenteAleniaSpazio();
	}
	
	public static boolean save(ngs.persistentmodel.DipendenteAleniaSpazio dipendenteAleniaSpazio) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(dipendenteAleniaSpazio);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.DipendenteAleniaSpazio dipendenteAleniaSpazio) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(dipendenteAleniaSpazio);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.DipendenteAleniaSpazio dipendenteAleniaSpazio) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(dipendenteAleniaSpazio);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.DipendenteAleniaSpazio dipendenteAleniaSpazio) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(dipendenteAleniaSpazio);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static DipendenteAleniaSpazio loadDipendenteAleniaSpazioByCriteria(DipendenteAleniaSpazioCriteria dipendenteAleniaSpazioCriteria) {
		DipendenteAleniaSpazio[] dipendenteAleniaSpazios = listDipendenteAleniaSpazioByCriteria(dipendenteAleniaSpazioCriteria);
		if(dipendenteAleniaSpazios == null || dipendenteAleniaSpazios.length == 0) {
			return null;
		}
		return dipendenteAleniaSpazios[0];
	}
	
	public static DipendenteAleniaSpazio[] listDipendenteAleniaSpazioByCriteria(DipendenteAleniaSpazioCriteria dipendenteAleniaSpazioCriteria) {
		return dipendenteAleniaSpazioCriteria.listDipendenteAleniaSpazio();
	}
}
