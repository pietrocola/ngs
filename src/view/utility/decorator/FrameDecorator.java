package view.utility.decorator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ButtonUI;

import com.sun.java.swing.plaf.motif.*;

import view.InterfacciaAmministratore;



public class FrameDecorator extends Decorator{

	public String titolo;
	public String img;
	
	
	public FrameDecorator(Pannello c,String titolo,String img){
		super(c);
		this.titolo=titolo;
		this.img=img;

	}
	
	
	
	
	
public Pannello draw() {

		Pannello p=super.draw();
		
		JInternalFrame frame = new JInternalFrame();
		frame.add(p);
		frame.setTitle(this.titolo);
		try {
			frame.setIcon(true);
		} catch (PropertyVetoException e1) {
			e1.printStackTrace();
		}
		frame.setFrameIcon(new ImageIcon(InterfacciaAmministratore.class.getResource(this.img)));
		//frame.setBorder(new EmptyBorder(25, 0, 0, 0));
		
		//frame.setBorder((Border) new EtchedBorder(EtchedBorder.RAISED, null, null)); // ok
		frame.setBorder(new LineBorder(Color.GRAY, 2, false)); // ok
		//frame.setBorder(new MatteBorder(10, 10, 10, 10, Color.GRAY));
		//frame.setBorder(UIManager.getBorder("RadioButtonMenuItem.border"));
		//frame.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//frame.setBorder(new TitledBorder(null, "CALCOLA PREZZI - CREA PREVENTIVO ABBONAMENTO", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		//frame.setNormalBounds(new Rectangle(0, 0, 0, 0));
		
		frame.setVisible(true);
		
		
		Pannello pan=component.drawEmpty();
	
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x=(screen.width)/2;
	    int y=(screen.height)/2;
	    pan.setPreferredSize(new Dimension(x,y));
		pan.setLayout(new BorderLayout(0, 0));
		
		pan.add(frame);
		
		return pan;
				
	}





@Override
public Pannello drawEmpty() {
	// TODO Auto-generated method stub
	return null;
}

	
}
