package view.content;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JCheckBox;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.persistentmodel.DescrizioneCorso;

public class ConfiguraAbbonamentoView extends JPanel {
	private JCheckBox chckbxNewCheckBox;

	/**
	 * Create the panel.
	 */
	public ConfiguraAbbonamentoView() {
		setLayout(null);
		{
			
			ArrayList<DescrizioneCorso> arrayCorsi=new ArrayList<DescrizioneCorso>();
			arrayCorsi=ConfAbbCorsiHandler.getInstance().getDescrizioniCorsi();
			int i=0;
			int aux;
			ArrayList<JCheckBox> acb=new ArrayList<JCheckBox>();
			
			for(int j=0; j<arrayCorsi.size();j++){
				String nome= arrayCorsi.get(j).getNomeCorso();
				System.out.println(nome);
				acb.add(new JCheckBox(nome));
				aux=55+i;
				acb.get(j).setBounds(40, aux, 97, 23);
				i=i+50;
				add(acb.get(j));
			}
			
			
			/*
			for(DescrizioneCorso dc: arrayCorsi){
				String nome= dc.getNomeCorso();
				chckbxNewCheckBox = new JCheckBox(nome);
				aux=40+i;
				chckbxNewCheckBox.setBounds(aux, 55, 97, 23);
				add(chckbxNewCheckBox);
				acb.add(chckbxNewCheckBox);
				i=i+10;
				chckbxNewCheckBox=null;
			}	
			*/
			/*
			chckbxNewCheckBox = new JCheckBox("New check box");
			chckbxNewCheckBox.setBounds(40, 55, 97, 23);
			add(chckbxNewCheckBox);
			*/
		}

	}
}
