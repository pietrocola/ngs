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

public class ClienteDAO {
	public static Cliente loadClienteByORMID(String codiceFiscale) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadClienteByORMID(session, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente getClienteByORMID(String codiceFiscale) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getClienteByORMID(session, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente loadClienteByORMID(String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadClienteByORMID(session, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente getClienteByORMID(String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getClienteByORMID(session, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente loadClienteByORMID(PersistentSession session, String codiceFiscale) {
		try {
			return (Cliente) session.load(ngs.persistentmodel.Cliente.class, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente getClienteByORMID(PersistentSession session, String codiceFiscale) {
		try {
			return (Cliente) session.get(ngs.persistentmodel.Cliente.class, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente loadClienteByORMID(PersistentSession session, String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			return (Cliente) session.load(ngs.persistentmodel.Cliente.class, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente getClienteByORMID(PersistentSession session, String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			return (Cliente) session.get(ngs.persistentmodel.Cliente.class, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCliente(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCliente(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente[] listClienteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente[] listClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCliente(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Cliente as Cliente");
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
	
	public static List queryCliente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cliente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryCliente(session, condition, orderBy);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryCliente(session, condition, orderBy, lockMode);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente loadClienteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente loadClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy) {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}
	
	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy, lockMode);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Cliente as Cliente");
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
	
	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cliente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Cliente createCliente() {
		return new ngs.persistentmodel.Cliente();
	}
	
	public static boolean save(ngs.persistentmodel.Cliente cliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(cliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.Cliente cliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(cliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.Cliente cliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(cliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.Cliente cliente) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(cliente);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static Cliente loadClienteByCriteria(ClienteCriteria clienteCriteria) {
		Cliente[] clientes = listClienteByCriteria(clienteCriteria);
		if(clientes == null || clientes.length == 0) {
			return null;
		}
		return clientes[0];
	}
	
	public static Cliente[] listClienteByCriteria(ClienteCriteria clienteCriteria) {
		return clienteCriteria.listCliente();
	}
}
