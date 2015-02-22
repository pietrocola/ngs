package view.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JScrollPane;
import javax.swing.JLabel;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.controller.ErogaAbbonamentoHandler;
import view.utility.Message;
import ngs.persistentmodel.*;

public class DialogInfoAbbonamentoView extends JDialog {

	/**
	 * Launch the application.
	 */
private JPanel panel;
	private JButton btnNewButton;
	private JLabel lblCorsi;
	private JLabel lblSale;
	private JLabel lblNewLabel;
	private JLabel labelNoCorsi;

	/**
	 * Create the dialog.
	 */
	public DialogInfoAbbonamentoView(String nomeAbb) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogInfoAbbonamentoView.class.getResource("/view/img/abbonamento1.png")));
		setTitle("Informazioni Abbonamento");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JScrollPane scrollPane = new JScrollPane();
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			{
				panel = new JPanel();
				
				panel.setLayout(null);
				{
					stampaCorsiESalePesi(panel,nomeAbb);
					//System.out.println("dentro panel");
				}
				{
					lblCorsi = new JLabel("CORSI:");
					lblCorsi.setBounds(55, 42, 46, 14);
					panel.add(lblCorsi);
				}
				{
					labelNoCorsi = new JLabel("");
					labelNoCorsi.setBounds(139, 42, 246, 14);
					panel.add(labelNoCorsi);
				}

			
			}
		    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		    int x=(screen.width);
		    int y=(screen.height);
		    panel.setPreferredSize(new Dimension(x,y));
			scrollPane.setViewportView(panel);
		}
	}
	
	
	
	
	
	
	public void stampaCorsiESalePesi(JPanel panel, String nomeAbb)
	{
			ArrayList<DescrizioneCorso> elencoCorsiAbb=new ArrayList<DescrizioneCorso>();
			elencoCorsiAbb=ErogaAbbonamentoHandler.getInstance().getCorsiAbbonamento(nomeAbb);
			
	        ArrayList<SalaPesi> elencoSalePesi=new ArrayList<SalaPesi>();
	        elencoSalePesi=ErogaAbbonamentoHandler.getInstance().getSalePesiAbbonamento(nomeAbb);
	        
	        int y=70;
	        if(elencoCorsiAbb.size()!=0)
			{
				
				for(int j=0; j<elencoCorsiAbb.size();j++){
					String nomeCorso=elencoCorsiAbb.get(j).getNomeCorso();
					JLabel label=new JLabel("- "+nomeCorso);
					label.setBounds(70, y, 400, 14);
					panel.add(label);
					y=y+30;
				}	
			}
			else
			{
				Message.confirmLabel("Nessun corso", false, labelNoCorsi);
			}
	        
	        y=y+20;
	        lblSale=new JLabel("SALE PESI:");
	        lblSale.setBounds(55, y, 400, 14);
	        panel.add(lblSale);
	        
	        if(elencoSalePesi.size()!=0)
			{
	        	y=y+28;
				for(int j=0; j<elencoSalePesi.size();j++){
					String nomeSala=elencoSalePesi.get(j).getNomeSala();
					JLabel label=new JLabel("- "+nomeSala);
					label.setBounds(70, y, 400, 14);
					panel.add(label);
					y=y+30;
				}	
			}
			else
			{
				JLabel labelNoSale=new JLabel("Nessuna sala pesi");
				labelNoSale.setBounds(139, y, 400, 14);
				labelNoSale.setFont(new Font("Tahoma", Font.BOLD, 13));
				labelNoSale.setForeground(Color.RED);
				panel.add(labelNoSale);
				
			}
			
		}
	
	
	
	
	
	
}
