/**
DescrizioneAbbonamentoDAO()create
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

public class DescrizioneAbbonamentoDAO {
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByORMID(String nomeAbbonamento) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneAbbonamentoByORMID(session, nomeAbbonamento);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento getDescrizioneAbbonamentoByORMID(String nomeAbbonamento) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneAbbonamentoByORMID(session, nomeAbbonamento);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByORMID(String nomeAbbonamento, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneAbbonamentoByORMID(session, nomeAbbonamento, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento getDescrizioneAbbonamentoByORMID(String nomeAbbonamento, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneAbbonamentoByORMID(session, nomeAbbonamento, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByORMID(PersistentSession session, String nomeAbbonamento) {
		try {
			return (DescrizioneAbbonamento) session.load(ngs.persistentmodel.DescrizioneAbbonamento.class, nomeAbbonamento);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento getDescrizioneAbbonamentoByORMID(PersistentSession session, String nomeAbbonamento) {
		try {
			return (DescrizioneAbbonamento) session.get(ngs.persistentmodel.DescrizioneAbbonamento.class, nomeAbbonamento);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByORMID(PersistentSession session, String nomeAbbonamento, org.hibernate.LockMode lockMode) {
		try {
			return (DescrizioneAbbonamento) session.load(ngs.persistentmodel.DescrizioneAbbonamento.class, nomeAbbonamento, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento getDescrizioneAbbonamentoByORMID(PersistentSession session, String nomeAbbonamento, org.hibernate.LockMode lockMode) {
		try {
			return (DescrizioneAbbonamento) session.get(ngs.persistentmodel.DescrizioneAbbonamento.class, nomeAbbonamento, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDescrizioneAbbonamento(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneAbbonamento(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDescrizioneAbbonamento(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneAbbonamento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento[] listDescrizioneAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento[] listDescrizioneAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDescrizioneAbbonamento(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneAbbonamento as DescrizioneAbbonamento");
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
	
	public static List queryDescrizioneAbbonamento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneAbbonamento as DescrizioneAbbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneAbbonamento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento[] listDescrizioneAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryDescrizioneAbbonamento(session, condition, orderBy);
			return (DescrizioneAbbonamento[]) list.toArray(new DescrizioneAbbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento[] listDescrizioneAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryDescrizioneAbbonamento(session, condition, orderBy, lockMode);
			return (DescrizioneAbbonamento[]) list.toArray(new DescrizioneAbbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		DescrizioneAbbonamento[] descrizioneAbbonamentos = listDescrizioneAbbonamentoByQuery(session, condition, orderBy);
		if (descrizioneAbbonamentos != null && descrizioneAbbonamentos.length > 0)
			return descrizioneAbbonamentos[0];
		else
			return null;
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		DescrizioneAbbonamento[] descrizioneAbbonamentos = listDescrizioneAbbonamentoByQuery(session, condition, orderBy, lockMode);
		if (descrizioneAbbonamentos != null && descrizioneAbbonamentos.length > 0)
			return descrizioneAbbonamentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDescrizioneAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDescrizioneAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDescrizioneAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneAbbonamento as DescrizioneAbbonamento");
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
	
	public static java.util.Iterator iterateDescrizioneAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.DescrizioneAbbonamento as DescrizioneAbbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneAbbonamento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static DescrizioneAbbonamento createDescrizioneAbbonamento() {
		return new ngs.persistentmodel.DescrizioneAbbonamento();
	}
	
	public static boolean save(ngs.persistentmodel.DescrizioneAbbonamento descrizioneAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(descrizioneAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.DescrizioneAbbonamento descrizioneAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(descrizioneAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.DescrizioneAbbonamento descrizioneAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(descrizioneAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.DescrizioneAbbonamento descrizioneAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(descrizioneAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static DescrizioneAbbonamento loadDescrizioneAbbonamentoByCriteria(DescrizioneAbbonamentoCriteria descrizioneAbbonamentoCriteria) {
		DescrizioneAbbonamento[] descrizioneAbbonamentos = listDescrizioneAbbonamentoByCriteria(descrizioneAbbonamentoCriteria);
		if(descrizioneAbbonamentos == null || descrizioneAbbonamentos.length == 0) {
			return null;
		}
		return descrizioneAbbonamentos[0];
	}
	
	public static DescrizioneAbbonamento[] listDescrizioneAbbonamentoByCriteria(DescrizioneAbbonamentoCriteria descrizioneAbbonamentoCriteria) {
		return descrizioneAbbonamentoCriteria.listDescrizioneAbbonamento();
	}
}
