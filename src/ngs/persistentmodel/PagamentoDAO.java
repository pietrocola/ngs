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

public class PagamentoDAO {
	public static Pagamento loadPagamentoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPagamentoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento getPagamentoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPagamentoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento loadPagamentoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPagamentoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento getPagamentoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getPagamentoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento loadPagamentoByORMID(PersistentSession session, int ID) {
		try {
			return (Pagamento) session.load(ngs.persistentmodel.Pagamento.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento getPagamentoByORMID(PersistentSession session, int ID) {
		try {
			return (Pagamento) session.get(ngs.persistentmodel.Pagamento.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento loadPagamentoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Pagamento) session.load(ngs.persistentmodel.Pagamento.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento getPagamentoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Pagamento) session.get(ngs.persistentmodel.Pagamento.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPagamento(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPagamento(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPagamento(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryPagamento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento[] listPagamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPagamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento[] listPagamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listPagamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPagamento(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Pagamento as Pagamento");
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
	
	public static List queryPagamento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Pagamento as Pagamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pagamento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento[] listPagamentoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryPagamento(session, condition, orderBy);
			return (Pagamento[]) list.toArray(new Pagamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento[] listPagamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryPagamento(session, condition, orderBy, lockMode);
			return (Pagamento[]) list.toArray(new Pagamento[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento loadPagamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPagamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento loadPagamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadPagamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento loadPagamentoByQuery(PersistentSession session, String condition, String orderBy) {
		Pagamento[] pagamentos = listPagamentoByQuery(session, condition, orderBy);
		if (pagamentos != null && pagamentos.length > 0)
			return pagamentos[0];
		else
			return null;
	}
	
	public static Pagamento loadPagamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Pagamento[] pagamentos = listPagamentoByQuery(session, condition, orderBy, lockMode);
		if (pagamentos != null && pagamentos.length > 0)
			return pagamentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePagamentoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePagamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePagamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iteratePagamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePagamentoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Pagamento as Pagamento");
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
	
	public static java.util.Iterator iteratePagamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Pagamento as Pagamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pagamento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Pagamento createPagamento() {
		return new ngs.persistentmodel.Pagamento();
	}
	
	public static boolean save(ngs.persistentmodel.Pagamento pagamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(pagamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.Pagamento pagamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(pagamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.Pagamento pagamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(pagamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.Pagamento pagamento) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(pagamento);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static Pagamento loadPagamentoByCriteria(PagamentoCriteria pagamentoCriteria) {
		Pagamento[] pagamentos = listPagamentoByCriteria(pagamentoCriteria);
		if(pagamentos == null || pagamentos.length == 0) {
			return null;
		}
		return pagamentos[0];
	}
	
	public static Pagamento[] listPagamentoByCriteria(PagamentoCriteria pagamentoCriteria) {
		return pagamentoCriteria.listPagamento();
	}
}
