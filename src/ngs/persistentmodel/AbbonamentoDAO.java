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

public class AbbonamentoDAO {
	public static Abbonamento loadAbbonamentoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAbbonamentoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento getAbbonamentoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getAbbonamentoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento loadAbbonamentoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAbbonamentoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento getAbbonamentoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getAbbonamentoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento loadAbbonamentoByORMID(PersistentSession session, int ID) {
		try {
			return (Abbonamento) session.load(ngs.persistentmodel.Abbonamento.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento getAbbonamentoByORMID(PersistentSession session, int ID) {
		try {
			return (Abbonamento) session.get(ngs.persistentmodel.Abbonamento.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento loadAbbonamentoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Abbonamento) session.load(ngs.persistentmodel.Abbonamento.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento getAbbonamentoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Abbonamento) session.get(ngs.persistentmodel.Abbonamento.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAbbonamento(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryAbbonamento(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAbbonamento(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryAbbonamento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento[] listAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento[] listAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAbbonamento(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Abbonamento as Abbonamento");
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
	
	public static List queryAbbonamento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Abbonamento as Abbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Abbonamento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento[] listAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryAbbonamento(session, condition, orderBy);
			return (Abbonamento[]) list.toArray(new Abbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento[] listAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryAbbonamento(session, condition, orderBy, lockMode);
			return (Abbonamento[]) list.toArray(new Abbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento loadAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento loadAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento loadAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		Abbonamento[] abbonamentos = listAbbonamentoByQuery(session, condition, orderBy);
		if (abbonamentos != null && abbonamentos.length > 0)
			return abbonamentos[0];
		else
			return null;
	}
	
	public static Abbonamento loadAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Abbonamento[] abbonamentos = listAbbonamentoByQuery(session, condition, orderBy, lockMode);
		if (abbonamentos != null && abbonamentos.length > 0)
			return abbonamentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Abbonamento as Abbonamento");
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
	
	public static java.util.Iterator iterateAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Abbonamento as Abbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Abbonamento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Abbonamento createAbbonamento() {
		return new ngs.persistentmodel.Abbonamento();
	}
	
	public static boolean save(ngs.persistentmodel.Abbonamento abbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(abbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.Abbonamento abbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(abbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.Abbonamento abbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(abbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.Abbonamento abbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(abbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static Abbonamento loadAbbonamentoByCriteria(AbbonamentoCriteria abbonamentoCriteria) {
		Abbonamento[] abbonamentos = listAbbonamentoByCriteria(abbonamentoCriteria);
		if(abbonamentos == null || abbonamentos.length == 0) {
			return null;
		}
		return abbonamentos[0];
	}
	
	public static Abbonamento[] listAbbonamentoByCriteria(AbbonamentoCriteria abbonamentoCriteria) {
		return abbonamentoCriteria.listAbbonamento();
	}
}
