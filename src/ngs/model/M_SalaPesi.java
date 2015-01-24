package ngs.model;

import java.util.ArrayList;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.FasciaOrariaSalaPesi;
import ngs.persistentmodel.SalaPesi;

public class M_SalaPesi extends AModel {

	public ArrayList<SalaPesi> getSalePesi() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<FasciaOrariaSalaPesi> getFasceOrarieSalaPesi() {
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

}