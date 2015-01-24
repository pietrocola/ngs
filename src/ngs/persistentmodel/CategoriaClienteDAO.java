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

public class CategoriaClienteDAO {
	public static CategoriaCliente loadCategoriaClienteByORMID(String nomeCat) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCategoriaClienteByORMID(session, nomeCat);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente getCategoriaClienteByORMID(String nomeCat) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getCategoriaClienteByORMID(session, nomeCat);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente loadCategoriaClienteByORMID(String nomeCat, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCategoriaClienteByORMID(session, nomeCat, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente getCategoriaClienteByORMID(String nomeCat, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getCategoriaClienteByORMID(session, nomeCat, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente loadCategoriaClienteByORMID(PersistentSession session, String nomeCat) {
		try {
			return (CategoriaCliente) session.load(ngs.persistentmodel.CategoriaCliente.class, nomeCat);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente getCategoriaClienteByORMID(PersistentSession session, String nomeCat) {
		try {
			return (CategoriaCliente) session.get(ngs.persistentmodel.CategoriaCliente.class, nomeCat);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente loadCategoriaClienteByORMID(PersistentSession session, String nomeCat, org.hibernate.LockMode lockMode) {
		try {
			return (CategoriaCliente) session.load(ngs.persistentmodel.CategoriaCliente.class, nomeCat, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente getCategoriaClienteByORMID(PersistentSession session, String nomeCat, org.hibernate.LockMode lockMode) {
		try {
			return (CategoriaCliente) session.get(ngs.persistentmodel.CategoriaCliente.class, nomeCat, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCategoriaCliente(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryCategoriaCliente(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCategoriaCliente(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryCategoriaCliente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente[] listCategoriaClienteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listCategoriaClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente[] listCategoriaClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listCategoriaClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCategoriaCliente(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CategoriaCliente as CategoriaCliente");
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
	
	public static List queryCategoriaCliente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CategoriaCliente as CategoriaCliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("CategoriaCliente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente[] listCategoriaClienteByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryCategoriaCliente(session, condition, orderBy);
			return (CategoriaCliente[]) list.toArray(new CategoriaCliente[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente[] listCategoriaClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryCategoriaCliente(session, condition, orderBy, lockMode);
			return (CategoriaCliente[]) list.toArray(new CategoriaCliente[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente loadCategoriaClienteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCategoriaClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente loadCategoriaClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCategoriaClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente loadCategoriaClienteByQuery(PersistentSession session, String condition, String orderBy) {
		CategoriaCliente[] categoriaClientes = listCategoriaClienteByQuery(session, condition, orderBy);
		if (categoriaClientes != null && categoriaClientes.length > 0)
			return categoriaClientes[0];
		else
			return null;
	}
	
	public static CategoriaCliente loadCategoriaClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		CategoriaCliente[] categoriaClientes = listCategoriaClienteByQuery(session, condition, orderBy, lockMode);
		if (categoriaClientes != null && categoriaClientes.length > 0)
			return categoriaClientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCategoriaClienteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateCategoriaClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateCategoriaClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateCategoriaClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateCategoriaClienteByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CategoriaCliente as CategoriaCliente");
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
	
	public static java.util.Iterator iterateCategoriaClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CategoriaCliente as CategoriaCliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("CategoriaCliente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CategoriaCliente createCategoriaCliente() {
		return new ngs.persistentmodel.CategoriaCliente();
	}
	
	public static boolean save(ngs.persistentmodel.CategoriaCliente categoriaCliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(categoriaCliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.CategoriaCliente categoriaCliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(categoriaCliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.CategoriaCliente categoriaCliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(categoriaCliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.CategoriaCliente categoriaCliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(categoriaCliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static CategoriaCliente loadCategoriaClienteByCriteria(CategoriaClienteCriteria categoriaClienteCriteria) {
		CategoriaCliente[] categoriaClientes = listCategoriaClienteByCriteria(categoriaClienteCriteria);
		if(categoriaClientes == null || categoriaClientes.length == 0) {
			return null;
		}
		return categoriaClientes[0];
	}
	
	public static CategoriaCliente[] listCategoriaClienteByCriteria(CategoriaClienteCriteria categoriaClienteCriteria) {
		return categoriaClienteCriteria.listCategoriaCliente();
	}
}
