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

public class PreventivoAbbonamentoDAO {
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPreventivoAbbonamentoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento getPreventivoAbbonamentoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPreventivoAbbonamentoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPreventivoAbbonamentoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento getPreventivoAbbonamentoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPreventivoAbbonamentoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByORMID(PersistentSession session, int ID) {
		try {
			return (PreventivoAbbonamento) session.load(ngs.persistentmodel.PreventivoAbbonamento.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento getPreventivoAbbonamentoByORMID(PersistentSession session, int ID) {
		try {
			return (PreventivoAbbonamento) session.get(ngs.persistentmodel.PreventivoAbbonamento.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PreventivoAbbonamento) session.load(ngs.persistentmodel.PreventivoAbbonamento.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento getPreventivoAbbonamentoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PreventivoAbbonamento) session.get(ngs.persistentmodel.PreventivoAbbonamento.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPreventivoAbbonamento(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPreventivoAbbonamento(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPreventivoAbbonamento(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPreventivoAbbonamento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento[] listPreventivoAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPreventivoAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento[] listPreventivoAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPreventivoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPreventivoAbbonamento(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PreventivoAbbonamento as PreventivoAbbonamento");
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
	
	public static List queryPreventivoAbbonamento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PreventivoAbbonamento as PreventivoAbbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PreventivoAbbonamento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento[] listPreventivoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryPreventivoAbbonamento(session, condition, orderBy);
			return (PreventivoAbbonamento[]) list.toArray(new PreventivoAbbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento[] listPreventivoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryPreventivoAbbonamento(session, condition, orderBy, lockMode);
			return (PreventivoAbbonamento[]) list.toArray(new PreventivoAbbonamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPreventivoAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPreventivoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		PreventivoAbbonamento[] preventivoAbbonamentos = listPreventivoAbbonamentoByQuery(session, condition, orderBy);
		if (preventivoAbbonamentos != null && preventivoAbbonamentos.length > 0)
			return preventivoAbbonamentos[0];
		else
			return null;
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PreventivoAbbonamento[] preventivoAbbonamentos = listPreventivoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		if (preventivoAbbonamentos != null && preventivoAbbonamentos.length > 0)
			return preventivoAbbonamentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePreventivoAbbonamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePreventivoAbbonamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePreventivoAbbonamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePreventivoAbbonamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePreventivoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PreventivoAbbonamento as PreventivoAbbonamento");
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
	
	public static java.util.Iterator iteratePreventivoAbbonamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.PreventivoAbbonamento as PreventivoAbbonamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PreventivoAbbonamento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static PreventivoAbbonamento createPreventivoAbbonamento() {
		return new ngs.persistentmodel.PreventivoAbbonamento();
	}
	
	public static boolean save(ngs.persistentmodel.PreventivoAbbonamento preventivoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(preventivoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.PreventivoAbbonamento preventivoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(preventivoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.PreventivoAbbonamento preventivoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(preventivoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.PreventivoAbbonamento preventivoAbbonamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(preventivoAbbonamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static PreventivoAbbonamento loadPreventivoAbbonamentoByCriteria(PreventivoAbbonamentoCriteria preventivoAbbonamentoCriteria) {
		PreventivoAbbonamento[] preventivoAbbonamentos = listPreventivoAbbonamentoByCriteria(preventivoAbbonamentoCriteria);
		if(preventivoAbbonamentos == null || preventivoAbbonamentos.length == 0) {
			return null;
		}
		return preventivoAbbonamentos[0];
	}
	
	public static PreventivoAbbonamento[] listPreventivoAbbonamentoByCriteria(PreventivoAbbonamentoCriteria preventivoAbbonamentoCriteria) {
		return preventivoAbbonamentoCriteria.listPreventivoAbbonamento();
	}
}
