package co.edu.unbosque.view;

import java.awt.Image;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelNumeros extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel numero;
	private JLabel numero1;
	private JLabel numero2;
	private JLabel numero3;
	private JLabel numero4;
	private int naleatorio1;
	private int naleatorio2;
	private int naleatorio3;
	private int naleatorio4;
	private int ngenerado;
	
	public PanelNumeros() {
		setLayout(null);
		numero = new JLabel("Numero:");
		numero.setBounds(20, 65, 100, 30);
		numero1 = new JLabel("1");
		ImageIcon imd1 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
		ImageIcon iconon1 = new ImageIcon(imd1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero1.setIcon(iconon1);
		numero2 = new JLabel("2");
		ImageIcon imd2 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
		ImageIcon iconon2 = new ImageIcon(imd2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero2.setIcon(iconon2);
		numero3 = new JLabel("3");
		ImageIcon imd3 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
		ImageIcon iconon3 = new ImageIcon(imd3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero3.setIcon(iconon3);
		numero4 = new JLabel("4");
		ImageIcon imd4 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
		ImageIcon iconon4 = new ImageIcon(imd4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero4.setIcon(iconon4);
	}
	
	public void generarNumeroAleatorio() {
		Random numale = new Random();
		naleatorio1 = numale.nextInt(4)+1;
		naleatorio2 = numale.nextInt(4)+1;
		naleatorio3 = numale.nextInt(4)+1;
		naleatorio4 = numale.nextInt(4)+1;
		if(naleatorio1 == 1) {
			numero1.setBounds(160, 20, 120, 120);
			add(numero1);
		}
		if(naleatorio1 == 2) {
			numero2.setBounds(160, 20, 120, 120);
			add(numero2);
		}
		if(naleatorio1 == 3) {
			numero3.setBounds(160, 20, 120, 120);
			add(numero3);
		}
		if(naleatorio1 == 4) {
			numero4.setBounds(160, 20, 120, 120);
			add(numero4);
		}
		if(naleatorio2 == 1) {
			numero1.setBounds(300, 20, 120, 120);
			add(numero1);
		}
		if(naleatorio2 == 2) {
			numero2.setBounds(300, 20, 120, 120);
			add(numero2);
		}
		if(naleatorio2 == 3) {
			numero3.setBounds(300, 20, 120, 120);
			add(numero3);
		}
		if(naleatorio2 == 4) {
			numero4.setBounds(300, 20, 120, 120);
			add(numero4);
		}
		if(naleatorio3 == 1) {
			numero1.setBounds(420, 20, 120, 120);
			add(numero1);
		}
		if(naleatorio3 == 2) {
			numero2.setBounds(420, 20, 120, 120);
			add(numero2);
		}
		if(naleatorio3 == 3) {
			numero3.setBounds(420, 20, 120, 120);
			add(numero3);
		}
		if(naleatorio3 == 4) {
			numero4.setBounds(420, 20, 120, 120);
			add(numero4);
		}
		if(naleatorio4 == 1) {
			numero1.setBounds(540, 20, 120, 120);
			add(numero1);
		}
		if(naleatorio4 == 2) {
			numero2.setBounds(540, 20, 120, 120);
			add(numero2);
		}
		if(naleatorio4 == 3) {
			numero3.setBounds(540, 20, 120, 120);
			add(numero3);
		}
		if(naleatorio4 == 4) {
			numero4.setBounds(540, 20, 120, 120);
			add(numero4);
		}
		ngenerado = naleatorio1 + naleatorio2 + naleatorio3 + naleatorio4;
	}

	public JLabel getNumero() {
		return numero;
	}

	public void setNumero(JLabel numero) {
		this.numero = numero;
	}

	public JLabel getNumero1() {
		return numero1;
	}

	public void setNumero1(JLabel numero1) {
		this.numero1 = numero1;
	}

	public JLabel getNumero2() {
		return numero2;
	}

	public void setNumero2(JLabel numero2) {
		this.numero2 = numero2;
	}

	public JLabel getNumero3() {
		return numero3;
	}

	public void setNumero3(JLabel numero3) {
		this.numero3 = numero3;
	}

	public JLabel getNumero4() {
		return numero4;
	}

	public void setNumero4(JLabel numero4) {
		this.numero4 = numero4;
	}

	public int getNaleatorio1() {
		return naleatorio1;
	}

	public void setNaleatorio1(int naleatorio1) {
		this.naleatorio1 = naleatorio1;
	}

	public int getNaleatorio2() {
		return naleatorio2;
	}

	public void setNaleatorio2(int naleatorio2) {
		this.naleatorio2 = naleatorio2;
	}

	public int getNaleatorio3() {
		return naleatorio3;
	}

	public void setNaleatorio3(int naleatorio3) {
		this.naleatorio3 = naleatorio3;
	}

	public int getNaleatorio4() {
		return naleatorio4;
	}

	public void setNaleatorio4(int naleatorio4) {
		this.naleatorio4 = naleatorio4;
	}

	public int getNgenerado() {
		return ngenerado;
	}

	public void setNgenerado(int ngenerado) {
		this.ngenerado = ngenerado;
	}
}

