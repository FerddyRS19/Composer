package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	public static final String Numero1 = "Numero1";
	public static final String Numero2 = "Numero2";
	public static final String Numero3 = "Numero3";
	public static final String Numero4 = "Numero4";

	public PanelBotones() {
		
		setLayout( new GridLayout(2,4) );
		b1 = new JButton("Numero1");
		b1.setActionCommand(Numero1);
		b1.setEnabled(false);
		b2 = new JButton("Numero2");
		b2.setActionCommand(Numero2);
		b2.setEnabled(false);
		b3 = new JButton("Numero3");
		b3.setActionCommand(Numero3);
		b3.setEnabled(false);
		b4 = new JButton("Numero4");
		b4.setActionCommand(Numero4);
		b4.setEnabled(false);
		add(new JLabel(""));
		add(b1);
		add(b2);
		add(new JLabel(""));
		add(new JLabel(""));
		add(b3);
		add(b4);
		add(new JLabel(""));
	}

	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	public JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	public JButton getB4() {
		return b4;
	}

	public void setB4(JButton b4) {
		this.b4 = b4;
	}

	public static String getNumero1() {
		return Numero1;
	}

	public static String getNumero2() {
		return Numero2;
	}

	public static String getNumero3() {
		return Numero3;
	}

	public static String getNumero4() {
		return Numero4;
	}
}
