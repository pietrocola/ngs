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

public class DescrizioneCorsoDAO {
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(String nomeCorso) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByORMID(session, nomeCorso);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(String nomeCorso) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneCorsoByORMID(session, nomeCorso);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(String nomeCorso, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByORMID(session, nomeCorso, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(String nomeCorso, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneCorsoByORMID(session, nomeCorso, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso) {
		try {
			return (DescrizioneCorso) session.load(ngs.persistentmodel.DescrizioneCorso.class, nomeCorso);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso) {
		try {
			return (DescrizioneCorso) session.get(ngs.persistentmodel.DescrizioneCorso.class, nomeCorso);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso, org.hibernate.LockMode lockMode) {
		try {
			return (DescrizioneCorso) session.load(ngs.persistentmodel.DescrizioneCorso.class, nomeCorso, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso, org.hibernate.LockMode lockMode) {
		try {
			return (DescrizioneCorso) session.get(ngs.persistentmodel.DescrizioneCorso.class, nomeCorso, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDescrizioneCorso(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneCorso(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDescrizioneCorso(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneCorso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDescrizioneCorso(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneCorso as DescrizioneCorso");
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
	
	public static List queryDescrizioneCorso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneCorso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryDescrizioneCorso(session, condition, orderBy);
			return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryDescrizioneCorso(session, condition, orderBy, lockMode);
			return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByQuery(session, condition, orderBy);
		if (descrizioneCorsos != null && descrizioneCorsos.length > 0)
			return descrizioneCorsos[0];
		else
			return null;
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		if (descrizioneCorsos != null && descrizioneCorsos.length > 0)
			return descrizioneCorsos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneCorso as DescrizioneCorso");
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
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneCorso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneCorso createDescrizioneCorso() {
		return new ngs.persistentmodel.DescrizioneCorso();
	}
	
	public static boolean save(ngs.persistentmodel.DescrizioneCorso descrizioneCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.DescrizioneCorso descrizioneCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.DescrizioneCorso descrizioneCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.DescrizioneCorso descrizioneCorso) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByCriteria(DescrizioneCorsoCriteria descrizioneCorsoCriteria) {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByCriteria(descrizioneCorsoCriteria);
		if(descrizioneCorsos == null || descrizioneCorsos.length == 0) {
			return null;
		}
		return descrizioneCorsos[0];
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByCriteria(DescrizioneCorsoCriteria descrizioneCorsoCriteria) {
		return descrizioneCorsoCriteria.listDescrizioneCorso();
	}
}
