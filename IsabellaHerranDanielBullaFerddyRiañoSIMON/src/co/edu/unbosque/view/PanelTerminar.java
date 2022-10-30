package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelTerminar extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton butTerminar;
	public static final String TERMINAR = "Terminar";
	
	public PanelTerminar() {
		setLayout(null);
		butTerminar = new JButton("Terminar");
		butTerminar.setActionCommand(TERMINAR);
		butTerminar.setBounds(290, 50, 120, 30);
		butTerminar.setEnabled(false);
		add(butTerminar);
	}

	public JButton getButTerminar() {
		return butTerminar;
	}

	public void setButTerminar(JButton butTerminar) {
		this.butTerminar = butTerminar;
	}

	public static String getTerminar() {
		return TERMINAR;
	}
}
