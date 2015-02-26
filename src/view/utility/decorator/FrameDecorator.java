package view.utility.decorator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

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
		frame.setBorder(new EmptyBorder(15, 0, 0, 0));
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
