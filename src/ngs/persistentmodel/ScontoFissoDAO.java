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

public class ScontoFissoDAO {
	public static ScontoFisso loadScontoFissoByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoFissoByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso getScontoFissoByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getScontoFissoByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso loadScontoFissoByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoFissoByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso getScontoFissoByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getScontoFissoByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso loadScontoFissoByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (ScontoFisso) session.load(ngs.persistentmodel.ScontoFisso.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso getScontoFissoByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (ScontoFisso) session.get(ngs.persistentmodel.ScontoFisso.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso loadScontoFissoByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (ScontoFisso) session.load(ngs.persistentmodel.ScontoFisso.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso getScontoFissoByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (ScontoFisso) session.get(ngs.persistentmodel.ScontoFisso.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryScontoFisso(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryScontoFisso(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryScontoFisso(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryScontoFisso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso[] listScontoFissoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listScontoFissoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso[] listScontoFissoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listScontoFissoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryScontoFisso(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoFisso as ScontoFisso");
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
	
	public static List queryScontoFisso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoFisso as ScontoFisso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ScontoFisso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso[] listScontoFissoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryScontoFisso(session, condition, orderBy);
			return (ScontoFisso[]) list.toArray(new ScontoFisso[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso[] listScontoFissoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryScontoFisso(session, condition, orderBy, lockMode);
			return (ScontoFisso[]) list.toArray(new ScontoFisso[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso loadScontoFissoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoFissoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso loadScontoFissoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadScontoFissoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso loadScontoFissoByQuery(PersistentSession session, String condition, String orderBy) {
		ScontoFisso[] scontoFissos = listScontoFissoByQuery(session, condition, orderBy);
		if (scontoFissos != null && scontoFissos.length > 0)
			return scontoFissos[0];
		else
			return null;
	}
	
	public static ScontoFisso loadScontoFissoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		ScontoFisso[] scontoFissos = listScontoFissoByQuery(session, condition, orderBy, lockMode);
		if (scontoFissos != null && scontoFissos.length > 0)
			return scontoFissos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateScontoFissoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateScontoFissoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateScontoFissoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateScontoFissoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateScontoFissoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoFisso as ScontoFisso");
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
	
	public static java.util.Iterator iterateScontoFissoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.ScontoFisso as ScontoFisso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ScontoFisso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static ScontoFisso createScontoFisso() {
		return new ngs.persistentmodel.ScontoFisso();
	}
	
	public static boolean save(ngs.persistentmodel.ScontoFisso scontoFisso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(scontoFisso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.ScontoFisso scontoFisso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(scontoFisso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.ScontoFisso scontoFisso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(scontoFisso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.ScontoFisso scontoFisso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(scontoFisso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static ScontoFisso loadScontoFissoByCriteria(ScontoFissoCriteria scontoFissoCriteria) {
		ScontoFisso[] scontoFissos = listScontoFissoByCriteria(scontoFissoCriteria);
		if(scontoFissos == null || scontoFissos.length == 0) {
			return null;
		}
		return scontoFissos[0];
	}
	
	public static ScontoFisso[] listScontoFissoByCriteria(ScontoFissoCriteria scontoFissoCriteria) {
		return scontoFissoCriteria.listScontoFisso();
	}
}
