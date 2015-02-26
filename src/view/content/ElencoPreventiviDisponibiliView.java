package view.content;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.controller.ErogaAbbonamentoHandler;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.Cliente;
import ngs.persistentmodel.PreventivoAbbonamento;
import view.InterfacciaSegretaria;
import view.utility.Message;
import view.utility.decorator.FrameDecorator;
import view.utility.decorator.ScrollDecorator;
import view.utility.decorator.Pannello;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class ElencoPreventiviDisponibiliView extends Pannello{
	private JComboBox comboBox;
	private JLabel lblCategoriaCliente;
	private JButton btnMostraPreventivi;
	private JLabel lblAbbonamento;
	private JLabel lblNumeroMesi;
	private JLabel lblPrezzo;
	private JSeparator separator;
	private JLabel lblNoPrev;
	
	static PreventivoAbbonamento prevAbb=null;
	
	
	public ElencoPreventiviDisponibiliView(Boolean aux){
		
	}
	
	
	/**
	 * Create the panel.
	 */
	
	public ElencoPreventiviDisponibiliView() {
		
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x=(screen.width);
	    int y=(screen.height);
	    setPreferredSize(new Dimension(x,y));
		
		setLayout(null);
		{
			comboBox = new JComboBox();
			//comboBox.setSelectedIndex(-1);
			ascoltatoreElencoCategorieClienti();
			comboBox.setBounds(163, 49, 140, 20);
			add(comboBox);
		}
		{
			lblCategoriaCliente = new JLabel("categoria cliente");
			lblCategoriaCliente.setBounds(55, 52, 117, 14);
			add(lblCategoriaCliente);
		}
		{
			btnMostraPreventivi = new JButton("mostra preventivi");
			btnMostraPreventivi.setEnabled(false);
			btnMostraPreventivi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(comboBox.getSelectedItem()==null)
						Message.errorMessage("ERRORE", "Selezionare una categoria cliente");
					else
						stampaPreventivi((String) comboBox.getSelectedItem());
					
					btnMostraPreventivi.setEnabled(false);
				}
				
			});
			btnMostraPreventivi.setBounds(313, 48, 136, 23);
			add(btnMostraPreventivi);
		}
		{
			lblNoPrev = new JLabel("");
			lblNoPrev.setBounds(55, 122, 309, 14);
			add(lblNoPrev);
		}



	}

	
	
	
	
	private void stampaPreventivi(String catCliente) {
		
		removeAll();
		repaint();
		revalidate();
		
		{
			comboBox = new JComboBox();
			
			ascoltatoreElencoCategorieClienti();
			comboBox.setBounds(163, 49, 140, 20);
			add(comboBox);
		}
		{
			lblCategoriaCliente = new JLabel("categoria cliente");
			lblCategoriaCliente.setBounds(55, 52, 117, 14);
			add(lblCategoriaCliente);
		}
		{
			lblNoPrev = new JLabel("");
			lblNoPrev.setBounds(55, 122, 309, 14);
			add(lblNoPrev);
		}
		{
			btnMostraPreventivi = new JButton("mostra preventivi");
			btnMostraPreventivi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					stampaPreventivi((String) comboBox.getSelectedItem());
					btnMostraPreventivi.setEnabled(false);
				}
			});
			btnMostraPreventivi.setBounds(313, 48, 136, 23);
			add(btnMostraPreventivi);
		}
		
		CategoriaCliente categoriaCliente=ErogaAbbonamentoHandler.getInstance().getCategoriaCliente(catCliente);
		
		ArrayList<PreventivoAbbonamento> elencoPreventivi=ErogaAbbonamentoHandler.getInstance().getPreventiviAbbonamenti(categoriaCliente);
		
		
		
		{
			lblAbbonamento = new JLabel("ABBONAMENTO");
			lblAbbonamento.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblAbbonamento.setBounds(55, 150, 123, 20);
			add(lblAbbonamento);
		}
		{
			lblNumeroMesi = new JLabel("NUMERO MESI");
			lblNumeroMesi.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNumeroMesi.setBounds(255, 150, 123, 20);
			add(lblNumeroMesi);
		}
		{
			lblPrezzo = new JLabel("PREZZO");
			lblPrezzo.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblPrezzo.setBounds(455, 150, 86, 20);
			add(lblPrezzo);
		}
		{
			separator = new JSeparator();
			separator.setBounds(55, 180, 810, 3);
			add(separator);
		}
		
		
		
		HashMap<Integer,JLabel> map = new HashMap<Integer,JLabel>();
		
		HashMap<Integer,PreventivoAbbonamento> map1= new HashMap<Integer,PreventivoAbbonamento>();
		
		int x=55;
		int y=180;
		int b=0;
		
		
		if(elencoPreventivi.size()==0){
			//System.out.println("ciao");
			
			
			//textField.setEnabled(false);
			//button.setEnabled(false);
			lblAbbonamento.setText("");
			lblNumeroMesi.setText("");
			lblPrezzo.setText("");
			separator.setVisible(false);
			//Message.errorMessage("titolo", "messaggio");
			Message.confirmLabel("Nessun preventivo presente", false, lblNoPrev);
		}
		else{
		
			for(PreventivoAbbonamento pa:elencoPreventivi){
			
				JLabel label1=new JLabel();
				label1.setText(pa.getDescAbb().getNomeAbbonamento());
				label1.setBounds(x, y, 200, 50);
				add(label1);
				x=x+200;
				JLabel label2=new JLabel();
				String s=String.valueOf(pa.getNumeroMesi());
				label2.setText(s);
				label2.setBounds(x, y, 200, 50);
				add(label2);
				x=x+200;
				JLabel label3=new JLabel();
				String pre=String.valueOf(pa.getPrezzo());
				label3.setText(pre+" €");
				label3.setBounds(x, y, 100, 50);
				add(label3);
				x=x+200;
				b=y+15;
				JButton bottone=new JButton("info");
				bottone.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						int cordY=bottone.getY();
						//System.out.println(label1.getY());
						String nomeAbb="";
						Set<Integer> s=map.keySet();
						
						for(Integer aux:s){
							if(aux==cordY)
								nomeAbb=map.get(aux).getText();
						}
						
					
							DialogInfoAbbonamentoView diav=new DialogInfoAbbonamentoView(nomeAbb);
							//dicv.setContentPane(InterfacciaSegretaria.segFrame);
							diav.setLocationRelativeTo(InterfacciaSegretaria.segFrame);
							diav.setModal(true);
							diav.setVisible(true);
						
						
					}
				});
				bottone.setBounds(x-80, b, 70, 20);
				add(bottone);
				
				x=x+200;
				
				JButton bottoneCrea=new JButton("associa cliente");
				bottoneCrea.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						int cordY=bottoneCrea.getY();
						//System.out.println(label1.getY());
						//PreventivoAbbonamento prevAbb=null;
						Set<Integer> s=map1.keySet();
						
						for(Integer aux:s){
							if(aux==cordY)
								prevAbb=map1.get(aux);
						}
						
					
						//clearMainPanel(segFrame);
						InterfacciaSegretaria.segFrame.getContentPane().removeAll();
						InterfacciaSegretaria.segFrame.getContentPane().repaint();
						InterfacciaSegretaria.segFrame.getContentPane().add(InterfacciaSegretaria.toolBar, BorderLayout.NORTH);
						
						Pannello panelAux = new CreaAbbonamentoView(true);
						
						Pannello aux=new FrameDecorator(panelAux,"ASSOCIA CLIENTE","/view/img/abbonamento1 frame.png");
						Pannello aux1=aux.draw();
	
						InterfacciaSegretaria.segFrame.getContentPane().add(aux1,	BorderLayout.CENTER);
						InterfacciaSegretaria.segFrame.getContentPane().revalidate();
						InterfacciaSegretaria.segFrame.repaint();
						
						
					}
				});
				bottoneCrea.setBounds(x-140, b, 150, 20);
				add(bottoneCrea);
				
				map.put(b,label1);
				map1.put(b, pa);
				
				y=y+40;
				x=55;
		
		
		
			
		
		
		
		revalidate();
		repaint();
			}
		}
	}






	private void ascoltatoreElencoCategorieClienti() {
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				btnMostraPreventivi.setEnabled(true);
				lblNoPrev.setText("");
				//label.setText("");
				ArrayList<CategoriaCliente> cc=ErogaAbbonamentoHandler.getInstance().getCategorieClienti();
				//System.out.println(cc.get(0).getNomeCat());
				if(cc.size()==0){
					comboBox.setEnabled(false);
					Message.errorMessage("ERRORE", "Nessuna categoria cliente presente");
					//btnSalva.setEnabled(false);
				}
				else{
					DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
					for(CategoriaCliente cat:cc){
						dcbm.addElement(cat.getNomeCat());
						comboBox.setModel(dcbm);
					}
						
				}
			}
			
			
		});
			
	}

	
	
	public Pannello draw() {
		return new ElencoPreventiviDisponibiliView();
			
	}


	@Override
	public Pannello drawEmpty() {
		return new ElencoPreventiviDisponibiliView(true);
	}	
}
