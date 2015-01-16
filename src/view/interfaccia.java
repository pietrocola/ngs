package view;

import java.awt.EventQueue;
import java.awt.Event;

import javax.swing.JFrame;

import model.M_ElencoTipologieCorso;
import model.M_TipologiaCorso;

import org.orm.PersistentException;

import controller.ConfAbbCorsiHandler;
import peristentmodel.TipologiaCorso;
import peristentmodel.TipologiaCorsoDAO;
import view.content.Clienti_NuovaCategoria;
import view.content.Corso_Modifica;
import view.content.Corso_Nuovo;
import view.content.Tipologia;
import view.content.TipologiaCorso_Aggiungi;
import view.template.btnToolBar;

import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.FlowLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.BoxLayout;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JProgressBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButtonMenuItem;

import java.awt.Dimension;
import com.jgoodies.forms.builder.ButtonBarBuilder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JInternalFrame;

public class interfaccia {

	private static final String ICON_NEW = "/view/img/nuovo_icon.png";
	final static String HOMEPANEL = "Card home";
	final static String CONTENTPANEL = "Card content";
	public ConfAbbCorsiHandler contr;	//controller
	private JFrame frmNextgenSport;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPanel panel;
	/**
	 * Launch the application.
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaccia window = new interfaccia();
					window.frmNextgenSport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		/*
		 * ConfAbbCorsiHandler s = new ConfAbbCorsiHandler();//dovrebbe essere creato nel caso d'uso di avviamento
		 	s.impostaTipologiaCorso("ss");
		 	*/
		
		
		/*
		TipologiaCorso tip = new TipologiaCorso();
		//TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		//tip=tp.getTipologiaCorsoByORMID("sala");
		//tip=tp.loadTipologiaCorsoByORMID("campo");
		boolean aux;
		TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		aux=tp.save(tip);
		*/
	    //System.out.print(tip.getNometip());
	     
	}

	
	
	
	
	/**
	 * Create the application.
	 */
	public interfaccia() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNextgenSport = new JFrame();
		frmNextgenSport.getContentPane().setBackground(new Color(240, 240, 240));
		frmNextgenSport.getContentPane().setLayout(new BorderLayout(0, 0));
		
		/*
		 * Barra degli strumenti		
		 */
		JToolBar toolBar = new JToolBar();
		toolBar.setRollover(true);
		toolBar.setToolTipText("");
		toolBar.setFloatable(false);
		frmNextgenSport.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		/*
		 * Bottone corso con relativo POP UP menu
		 */
		JPopupMenu popupMenu = new JPopupMenu();
		
		JButton btnCorso = new JButton("Corso");
		btnCorso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					popupMenu.show(btnCorso, 0, btnCorso.getY()+btnCorso.getHeight());
				
			}
		});
		btnCorso.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/nuovo_icon.png")));
		toolBar.add(btnCorso);		
		
		addPopup(btnCorso, popupMenu);
		
		JMenuItem mntmIjli = new JMenuItem("ijli");
		popupMenu.add(mntmIjli);
		
		JMenu mnNewMenu = new JMenu("New menu");
		popupMenu.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmJulj = new JMenuItem("julj");
		popupMenu.add(mntmJulj);
		
		
		/*
		 * Bottone Abbonamento con relativo POP UP menu
		 */
		JPopupMenu popupMenu_1 = new JPopupMenu();
		
		JToggleButton tglbtnAbbonamento = new JToggleButton("Abbonamento");
		tglbtnAbbonamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnAbbonamento.isSelected()){
					popupMenu_1.show(tglbtnAbbonamento, 0, tglbtnAbbonamento.getY()+tglbtnAbbonamento.getHeight());
				} else {
					popupMenu_1.remove(popupMenu_1);				
					
				}
				
			}
		});
		tglbtnAbbonamento.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/print-icon.png")));
		toolBar.add(tglbtnAbbonamento);		
		
		addPopup(tglbtnAbbonamento, popupMenu_1);
		
		JMenuItem mntmKimoio = new JMenuItem("kimoio");
		popupMenu_1.add(mntmKimoio);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		popupMenu_1.add(mntmNewMenuItem);
		
		
		
		
		
	
		
         
       /* pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
		*/
		
		
		JLabel lblNewLabel = new JLabel("New label");
		frmNextgenSport.setTitle("NextGen Sport");
		//JFrameBackgroundSwing back = new JFrameBackgroundSwing("./src/view/img/ragazza.jpg"); //immagine sfondo
		//frmNextgenSport.getContentPane().add(back);
		frmNextgenSport.setBounds(100, 100, 700, 500);
		frmNextgenSport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(204, 255, 255));
		frmNextgenSport.setJMenuBar(menuBar);
		
		JMenu mnCorso_1 = new JMenu("Corso");
		menuBar.add(mnCorso_1);
		
		JMenuItem mntmCreaNuovo = new JMenuItem("Nuovo");
		ascoltatoreNuovoCorso(mntmCreaNuovo);
		mnCorso_1.add(mntmCreaNuovo);
		
		JMenuItem mntmModifica = new JMenuItem("Modifica");
		ascoltatoreCorsoModifica(mntmModifica);
		mnCorso_1.add(mntmModifica);
		
		JMenuItem mntmElimina = new JMenuItem("Elimina");
		mntmElimina.setEnabled(false);
		mnCorso_1.add(mntmElimina);
		
		JMenu mnTipologiaCorso = new JMenu("Tipologia Corso");
		menuBar.add(mnTipologiaCorso);
		
		JMenuItem mntmAggiungi = new JMenuItem("Aggiungi");
		ascoltatoreAggiungiTipologia(mntmAggiungi);
		mnTipologiaCorso.add(mntmAggiungi);
		
		JMenuItem mntmModifica_1 = new JMenuItem("Modifica ");
		mntmModifica_1.setEnabled(false);
		mnTipologiaCorso.add(mntmModifica_1);
		
		JMenuItem mntmElimina_1 = new JMenuItem("Elimina");
		mntmElimina_1.setEnabled(false);
		mnTipologiaCorso.add(mntmElimina_1);
		
		JMenu mnClienti = new JMenu("Clienti");
		menuBar.add(mnClienti);
		
		JMenuItem mntmNuovaCategoria = new JMenuItem("Nuova categoria");
		ascoltatoreNuovaCategoria(mntmNuovaCategoria);
		mnClienti.add(mntmNuovaCategoria);
		
		JMenuItem mntmModifica_2 = new JMenuItem("Modifica");
		mntmModifica_2.setEnabled(false);
		mnClienti.add(mntmModifica_2);
		
		JMenuItem mntmElimina_2 = new JMenuItem("Elimina");
		mntmElimina_2.setEnabled(false);
		mnClienti.add(mntmElimina_2);
						
	}

	/**
	 * Pulisce il pannello principale
	 */
	public void pulisciFinestra(JFrame frmNextgenSport)
	   {		   
		frmNextgenSport.getContentPane().removeAll();	//rimuovi tutti gli oggetti
		frmNextgenSport.getContentPane().repaint();	//ripristina il pannello vuoto
		
						
	   }
	
	/**
	 * 
	 * @return Controller
	 * 	 * 
	 */
	public ConfAbbCorsiHandler inizializzaControllore()
	{		
		return contr = new ConfAbbCorsiHandler();//dovrebbe essere creato nel caso d'uso di avviamento
	}
	
	 /**
	    * se TRUE messaggio verde
	    * se FALSE messaggio rosso
	    */
	public void messaggio(JLabel label, boolean b, String text)
	   {
		   label.setText(text);
		      
			if(b){label.setForeground(new Color(0, 153, 0));}
			else {label.setForeground(Color.RED);}			
	   }
	
	public void ascoltatoreAggiungiTipologia(JMenuItem mntmAggiungi)
	{
		mntmAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pulisciFinestra(frmNextgenSport);
				
				/*TipologiaCorso_Aggiungi at = new TipologiaCorso_Aggiungi();
				at.formInserisciTipologia(frmNextgenSport);
				
				frmNextgenSport.getContentPane().validate(); //valida l'aggiornamento grafico*/
				
				System.out.println("nell'ascoltatore");
				TipologiaCorso_Aggiungi at = new TipologiaCorso_Aggiungi();
				panel=at.formInserisciTipologia();
				frmNextgenSport.getContentPane().add(panel, BorderLayout.CENTER);
				
				
				
				frmNextgenSport.getContentPane().revalidate(); //valida l'aggiornamento grafico
				frmNextgenSport.repaint();
				}
		});
	}
	
	public void ascoltatoreNuovoCorso(JMenuItem mntmCreaNuovo)
	{
		mntmCreaNuovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pulisciFinestra(frmNextgenSport);
								
				Corso_Nuovo ac = new Corso_Nuovo();
				ac.formInserisciCorso(panel);
				panel.revalidate();
			}
		});
	}
	
	public void ascoltatoreNuovaCategoria(JMenuItem mntmNuovaCategoria)
	{
		mntmNuovaCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
				
				Clienti_NuovaCategoria ac = new Clienti_NuovaCategoria();
				panel = ac.formNuovaCategoria(internalFrame);
				
				internalFrame.getContentPane().add(panel, BorderLayout.CENTER);
				frmNextgenSport.getContentPane().add(internalFrame, BorderLayout.CENTER);
				internalFrame.setVisible(true);
				/*pulisciFinestra(panel);
				
				Clienti_NuovaCategoria ac = new Clienti_NuovaCategoria();
				ac.formNuovaCategoria(frmNextgenSport);
				frmNextgenSport.revalidate();
				*/
			}
		});
	}
	
	public void ascoltatoreCorsoModifica(JMenuItem mntmModifica)
	{
		mntmModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				pulisciFinestra(frmNextgenSport);
				Corso_Modifica ac = new Corso_Modifica();
				ac.formNuovaCategoria(frmNextgenSport);
				frmNextgenSport.revalidate();
			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
