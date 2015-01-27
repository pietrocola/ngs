package view.content;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Prova extends JScrollPane {
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	

	
	
	/**
	 * Create the panel.
	 */
	public Prova() {
		System.out.println("ciao");
		setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		{
			panel = new JPanel();
			setViewportView(panel);
			panel.setLayout(null);
			{
				lblNewLabel = new JLabel("New label");
				lblNewLabel.setBounds(20, 45, 46, 14);
				panel.add(lblNewLabel);
			}
			{
				lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setBounds(20, 70, 46, 14);
				panel.add(lblNewLabel_1);
			}
			{
				lblNewLabel_2 = new JLabel("New label");
				lblNewLabel_2.setBounds(20, 114, 46, 14);
				panel.add(lblNewLabel_2);
			}
		}
        

		
	}
	
	/*
	public static void main(String[] args){
		Prova p=new Prova();
	}
	*/
}
