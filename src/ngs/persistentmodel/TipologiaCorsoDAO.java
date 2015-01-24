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

public class TipologiaCorsoDAO {
	public static TipologiaCorso loadTipologiaCorsoByORMID(String nomeTip) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByORMID(session, nomeTip);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(String nomeTip) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getTipologiaCorsoByORMID(session, nomeTip);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByORMID(String nomeTip, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByORMID(session, nomeTip, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(String nomeTip, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getTipologiaCorsoByORMID(session, nomeTip, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByORMID(PersistentSession session, String nomeTip) {
		try {
			return (TipologiaCorso) session.load(ngs.persistentmodel.TipologiaCorso.class, nomeTip);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(PersistentSession session, String nomeTip) {
		try {
			return (TipologiaCorso) session.get(ngs.persistentmodel.TipologiaCorso.class, nomeTip);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByORMID(PersistentSession session, String nomeTip, org.hibernate.LockMode lockMode) {
		try {
			return (TipologiaCorso) session.load(ngs.persistentmodel.TipologiaCorso.class, nomeTip, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(PersistentSession session, String nomeTip, org.hibernate.LockMode lockMode) {
		try {
			return (TipologiaCorso) session.get(ngs.persistentmodel.TipologiaCorso.class, nomeTip, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipologiaCorso(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryTipologiaCorso(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipologiaCorso(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryTipologiaCorso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listTipologiaCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipologiaCorso(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.TipologiaCorso as TipologiaCorso");
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
	
	public static List queryTipologiaCorso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.TipologiaCorso as TipologiaCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipologiaCorso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryTipologiaCorso(session, condition, orderBy);
			return (TipologiaCorso[]) list.toArray(new TipologiaCorso[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryTipologiaCorso(session, condition, orderBy, lockMode);
			return (TipologiaCorso[]) list.toArray(new TipologiaCorso[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy) {
		TipologiaCorso[] tipologiaCorsos = listTipologiaCorsoByQuery(session, condition, orderBy);
		if (tipologiaCorsos != null && tipologiaCorsos.length > 0)
			return tipologiaCorsos[0];
		else
			return null;
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		TipologiaCorso[] tipologiaCorsos = listTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		if (tipologiaCorsos != null && tipologiaCorsos.length > 0)
			return tipologiaCorsos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateTipologiaCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.TipologiaCorso as TipologiaCorso");
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
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.TipologiaCorso as TipologiaCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipologiaCorso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static TipologiaCorso createTipologiaCorso() {
		return new ngs.persistentmodel.TipologiaCorso();
	}
	
	public static boolean save(ngs.persistentmodel.TipologiaCorso tipologiaCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.TipologiaCorso tipologiaCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.TipologiaCorso tipologiaCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.TipologiaCorso tipologiaCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByCriteria(TipologiaCorsoCriteria tipologiaCorsoCriteria) {
		TipologiaCorso[] tipologiaCorsos = listTipologiaCorsoByCriteria(tipologiaCorsoCriteria);
		if(tipologiaCorsos == null || tipologiaCorsos.length == 0) {
			return null;
		}
		return tipologiaCorsos[0];
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByCriteria(TipologiaCorsoCriteria tipologiaCorsoCriteria) {
		return tipologiaCorsoCriteria.listTipologiaCorso();
	}
}
