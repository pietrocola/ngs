package ngs.model;

import java.util.ArrayList;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CertificatoMedico;
import ngs.persistentmodel.CertificatoMedicoDAO;
import ngs.persistentmodel.Cliente;
import ngs.persistentmodel.ClienteDAO;

public class M_CertificatoMedico extends AModel {

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verificaSeCertificatoPresente(Cliente c) {
		
		for(int i=0;i<CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null).length;i++)
			if(CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null)[i].getCliente().equals(c))
				return true;
		// TODO Auto-generated method stub
		return false;
	}

	public CertificatoMedico[] getElencoCertificati() {
		return CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null);
	}

	
	
	public ArrayList<CertificatoMedico> filtraCertificatiCognome(String cognome) {
		ArrayList<CertificatoMedico> elencoCertificatiCognome=new ArrayList<CertificatoMedico>();
		
		for(int i=0;i<CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null).length;i++)
			if(CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null)[i].getCliente().getCognome().equals(cognome)){
				elencoCertificatiCognome.add(CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null)[i]);
			}
				
		return  elencoCertificatiCognome;
	}

	
	
	
	public Boolean verificaPresenzaCertificato(Cliente cliente) {
			
		for(int i=0; i<CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null).length;i++)
			if(CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null)[i].getCliente().equals(cliente))
				return true;
		return false;

	}
	
	
	
	
	public Boolean verificaValiditaCertificato(Cliente cliente) {
		
		java.util.Date datadioggi = java.util.GregorianCalendar.getInstance().getTime();
		
		for(int i=0; i<CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null).length;i++)
			if(CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null)[i].getCliente().equals(cliente))
				if(datadioggi.compareTo(CertificatoMedicoDAO.listCertificatoMedicoByQuery(null, null)[i].getScadenza()) <= 0)
						return true;
					
					
		return false;
		
	}
	
	
	
	
	
	
}