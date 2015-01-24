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

public class PoliticaScontoAbbonamentoDAO {
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoAbbonamentoByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento getPoliticaScontoAbbonamentoByORMID(String nomePolitica) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPoliticaScontoAbbonamentoByORMID(session, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoAbbonamentoByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento getPoliticaScontoAbbonamentoByORMID(String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPoliticaScontoAbbonamentoByORMID(session, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (PoliticaScontoAbbonamento) session.load(ngs.persistentmodel.PoliticaScontoAbbonamento.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento getPoliticaScontoAbbonamentoByORMID(PersistentSession session, String nomePolitica) {
		try {
			return (PoliticaScontoAbbonamento) session.get(ngs.persistentmodel.PoliticaScontoAbbonamento.class, nomePolitica);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (PoliticaScontoAbbonamento) session.load(ngs.persistentmodel.PoliticaScontoAbbonamento.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento getPoliticaScontoAbbonamentoByORMID(PersistentSession session, String nomePolitica, org.hibernate.LockMode lockMode) {
		try {
			return (PoliticaScontoAbbonamento) session.get(ngs.persistentmodel.PoliticaScontoAbbonamento.class, nomePolitica, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPoliticaScontoAbbonamento(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPoliticaScontoAbbonamento(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPoliticaScontoAbbonamento(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPoliticaScontoAbbonamento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento[] listPoliticaScontoAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPoliticaScontoAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento[] listPoliticaScontoAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPoliticaScontoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPoliticaScontoAbbonamento(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoAbbonamento as PoliticaScontoAbbonamento");
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
	
	public static List queryPoliticaScontoAbbonamento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoAbbonamento as PoliticaScontoAbbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PoliticaScontoAbbonamento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento[] listPoliticaScontoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryPoliticaScontoAbbonamento(session, condition, orderBy);
			return (PoliticaScontoAbbonamento[]) list.toArray(new PoliticaScontoAbbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento[] listPoliticaScontoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryPoliticaScontoAbbonamento(session, condition, orderBy, lockMode);
			return (PoliticaScontoAbbonamento[]) list.toArray(new PoliticaScontoAbbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPoliticaScontoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		PoliticaScontoAbbonamento[] politicaScontoAbbonamentos = listPoliticaScontoAbbonamentoByQuery(session, condition, orderBy);
		if (politicaScontoAbbonamentos != null && politicaScontoAbbonamentos.length > 0)
			return politicaScontoAbbonamentos[0];
		else
			return null;
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PoliticaScontoAbbonamento[] politicaScontoAbbonamentos = listPoliticaScontoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		if (politicaScontoAbbonamentos != null && politicaScontoAbbonamentos.length > 0)
			return politicaScontoAbbonamentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePoliticaScontoAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePoliticaScontoAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePoliticaScontoAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePoliticaScontoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePoliticaScontoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoAbbonamento as PoliticaScontoAbbonamento");
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
	
	public static java.util.Iterator iteratePoliticaScontoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PoliticaScontoAbbonamento as PoliticaScontoAbbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PoliticaScontoAbbonamento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PoliticaScontoAbbonamento createPoliticaScontoAbbonamento() {
		return new ngs.persistentmodel.PoliticaScontoAbbonamento();
	}
	
	public static boolean save(ngs.persistentmodel.PoliticaScontoAbbonamento politicaScontoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(politicaScontoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.PoliticaScontoAbbonamento politicaScontoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(politicaScontoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.PoliticaScontoAbbonamento politicaScontoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(politicaScontoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.PoliticaScontoAbbonamento politicaScontoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(politicaScontoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static PoliticaScontoAbbonamento loadPoliticaScontoAbbonamentoByCriteria(PoliticaScontoAbbonamentoCriteria politicaScontoAbbonamentoCriteria) {
		PoliticaScontoAbbonamento[] politicaScontoAbbonamentos = listPoliticaScontoAbbonamentoByCriteria(politicaScontoAbbonamentoCriteria);
		if(politicaScontoAbbonamentos == null || politicaScontoAbbonamentos.length == 0) {
			return null;
		}
		return politicaScontoAbbonamentos[0];
	}
	
	public static PoliticaScontoAbbonamento[] listPoliticaScontoAbbonamentoByCriteria(PoliticaScontoAbbonamentoCriteria politicaScontoAbbonamentoCriteria) {
		return politicaScontoAbbonamentoCriteria.listPoliticaScontoAbbonamento();
	}
}
