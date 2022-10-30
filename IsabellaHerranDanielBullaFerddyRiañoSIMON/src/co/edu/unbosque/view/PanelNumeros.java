package co.edu.unbosque.view;

import java.awt.Image;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PanelNumeros extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel numero;
	private JLabel numero1p1;
	private JLabel numero1p2;
	private JLabel numero1p3;
	private JLabel numero1p4;
	private JLabel numero2p1;
	private JLabel numero2p2;
	private JLabel numero2p3;
	private JLabel numero2p4;
	private JLabel numero3p1;
	private JLabel numero3p2;
	private JLabel numero3p3;
	private JLabel numero3p4;
	private JLabel numero4p1;
	private JLabel numero4p2;
	private JLabel numero4p3;
	private JLabel numero4p4;
	private int naleatorio1;
	private int naleatorio2;
	private int naleatorio3;
	private int naleatorio4;
	private String ngenerado;
	
	public PanelNumeros() {
		setLayout(null);
		numero = new JLabel("Numero:");
		numero.setBounds(20, 65, 100, 30);
		add(numero);
		numero1p1 = new JLabel("1");
		ImageIcon imn1p1 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
		ImageIcon iconon1p1 = new ImageIcon(imn1p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero1p1.setIcon(iconon1p1);
		numero1p2 = new JLabel("1");
		ImageIcon imn1p2 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
		ImageIcon iconon1p2 = new ImageIcon(imn1p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero1p2.setIcon(iconon1p2);
		numero1p3 = new JLabel("1");
		ImageIcon imn1p3 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
		ImageIcon iconon1p3 = new ImageIcon(imn1p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero1p3.setIcon(iconon1p3);
		numero1p4 = new JLabel("1");
		ImageIcon imn1p4 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
		ImageIcon iconon1p4 = new ImageIcon(imn1p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero1p4.setIcon(iconon1p4);
		numero2p1 = new JLabel("2");
		ImageIcon imn2p1 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
		ImageIcon iconon2p1 = new ImageIcon(imn2p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero2p1.setIcon(iconon2p1);
		numero2p2 = new JLabel("2");
		ImageIcon imn2p2 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
		ImageIcon iconon2p2 = new ImageIcon(imn2p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero2p2.setIcon(iconon2p2);
		numero2p3 = new JLabel("2");
		ImageIcon imn2p3 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
		ImageIcon iconon2p3 = new ImageIcon(imn2p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero2p3.setIcon(iconon2p3);
		numero2p4 = new JLabel("2");
		ImageIcon imn2p4 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
		ImageIcon iconon2p4 = new ImageIcon(imn2p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero2p4.setIcon(iconon2p4);
		numero3p1 = new JLabel("3");
		ImageIcon imn3p1 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
		ImageIcon iconon3p1 = new ImageIcon(imn3p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero3p1.setIcon(iconon3p1);
		numero3p2 = new JLabel("3");
		ImageIcon imn3p2 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
		ImageIcon iconon3p2 = new ImageIcon(imn3p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero3p2.setIcon(iconon3p2);
		numero3p3 = new JLabel("3");
		ImageIcon imn3p3 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
		ImageIcon iconon3p3 = new ImageIcon(imn3p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero3p3.setIcon(iconon3p3);
		numero3p4 = new JLabel("3");
		ImageIcon imn3p4 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
		ImageIcon iconon3p4 = new ImageIcon(imn3p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero3p4.setIcon(iconon3p4);
		numero4p1 = new JLabel("4");
		ImageIcon imn4p1 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
		ImageIcon iconon4p1 = new ImageIcon(imn4p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero4p1.setIcon(iconon4p1);
		numero4p2 = new JLabel("4");
		ImageIcon imn4p2 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
		ImageIcon iconon4p2 = new ImageIcon(imn4p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero4p2.setIcon(iconon4p2);
		numero4p3 = new JLabel("4");
		ImageIcon imn4p3 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
		ImageIcon iconon4p3 = new ImageIcon(imn4p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero4p3.setIcon(iconon4p3);
		numero4p4 = new JLabel("4");
		ImageIcon imn4p4 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
		ImageIcon iconon4p4 = new ImageIcon(imn4p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		numero4p4.setIcon(iconon4p4);
	}
	
	public void generarNumeroAleatorio() {
		Random numale = new Random();
		naleatorio1 = numale.nextInt(4)+1;
		naleatorio2 = numale.nextInt(4)+1;
		naleatorio3 = numale.nextInt(4)+1;
		naleatorio4 = numale.nextInt(4)+1;
		if(naleatorio1 == 1) {
			numero1p1.setBounds(140, 20, 120, 120);
			add(numero1p1);
		}
		if(naleatorio1 == 2) {
			numero2p1.setBounds(140, 20, 120, 120);
			add(numero2p1);
		}
		if(naleatorio1 == 3) {
			numero3p1.setBounds(140, 20, 120, 120);
			add(numero3p1);
		}
		if(naleatorio1 == 4) {
			numero4p1.setBounds(140, 20, 120, 120);
			add(numero4p1);
		}
		if(naleatorio2 == 1) {
			numero1p2.setBounds(280, 20, 120, 120);
			add(numero1p2);
		}
		if(naleatorio2 == 2) {
			numero2p2.setBounds(280, 20, 120, 120);
			add(numero2p2);
		}
		if(naleatorio2 == 3) {
			numero3p2.setBounds(280, 20, 120, 120);
			add(numero3p2);
		}
		if(naleatorio2 == 4) {
			numero4p2.setBounds(280, 20, 120, 120);
			add(numero4p2);
		}
		if(naleatorio3 == 1) {
			numero1p3.setBounds(420, 20, 120, 120);
			add(numero1p3);
		}
		if(naleatorio3 == 2) {
			numero2p3.setBounds(420, 20, 120, 120);
			add(numero2p3);
		}
		if(naleatorio3 == 3) {
			numero3p3.setBounds(420, 20, 120, 120);
			add(numero3p3);
		}
		if(naleatorio3 == 4) {
			numero4p3.setBounds(420, 20, 120, 120);
			add(numero4p3);
		}
		if(naleatorio4 == 1) {
			numero1p4.setBounds(560, 20, 120, 120);
			add(numero1p4);
		}
		if(naleatorio4 == 2) {
			numero2p4.setBounds(560, 20, 120, 120);
			add(numero2p4);
		}
		if(naleatorio4 == 3) {
			numero3p4.setBounds(560, 20, 120, 120);
			add(numero3p4);
		}
		if(naleatorio4 == 4) {
			numero4p4.setBounds(560, 20, 120, 120);
			add(numero4p4);
		}
		ngenerado = String.valueOf(naleatorio1) + String.valueOf(naleatorio2) + String.valueOf(naleatorio3) + String.valueOf(naleatorio4);
	}
	public void borrarEtiquetas() {
		
	}

	public JLabel getNumero() {
		return numero;
	}

	public void setNumero(JLabel numero) {
		this.numero = numero;
	}

	public JLabel getNumero1p1() {
		return numero1p1;
	}

	public void setNumero1p1(JLabel numero1p1) {
		this.numero1p1 = numero1p1;
	}

	public JLabel getNumero1p2() {
		return numero1p2;
	}

	public void setNumero1p2(JLabel numero1p2) {
		this.numero1p2 = numero1p2;
	}

	public JLabel getNumero1p3() {
		return numero1p3;
	}

	public void setNumero1p3(JLabel numero1p3) {
		this.numero1p3 = numero1p3;
	}

	public JLabel getNumero1p4() {
		return numero1p4;
	}

	public void setNumero1p4(JLabel numero1p4) {
		this.numero1p4 = numero1p4;
	}

	public JLabel getNumero2p1() {
		return numero2p1;
	}

	public void setNumero2p1(JLabel numero2p1) {
		this.numero2p1 = numero2p1;
	}

	public JLabel getNumero2p2() {
		return numero2p2;
	}

	public void setNumero2p2(JLabel numero2p2) {
		this.numero2p2 = numero2p2;
	}

	public JLabel getNumero2p3() {
		return numero2p3;
	}

	public void setNumero2p3(JLabel numero2p3) {
		this.numero2p3 = numero2p3;
	}

	public JLabel getNumero2p4() {
		return numero2p4;
	}

	public void setNumero2p4(JLabel numero2p4) {
		this.numero2p4 = numero2p4;
	}

	public JLabel getNumero3p1() {
		return numero3p1;
	}

	public void setNumero3p1(JLabel numero3p1) {
		this.numero3p1 = numero3p1;
	}

	public JLabel getNumero3p2() {
		return numero3p2;
	}

	public void setNumero3p2(JLabel numero3p2) {
		this.numero3p2 = numero3p2;
	}

	public JLabel getNumero3p3() {
		return numero3p3;
	}

	public void setNumero3p3(JLabel numero3p3) {
		this.numero3p3 = numero3p3;
	}

	public JLabel getNumero3p4() {
		return numero3p4;
	}

	public void setNumero3p4(JLabel numero3p4) {
		this.numero3p4 = numero3p4;
	}

	public JLabel getNumero4p1() {
		return numero4p1;
	}

	public void setNumero4p1(JLabel numero4p1) {
		this.numero4p1 = numero4p1;
	}

	public JLabel getNumero4p2() {
		return numero4p2;
	}

	public void setNumero4p2(JLabel numero4p2) {
		this.numero4p2 = numero4p2;
	}

	public JLabel getNumero4p3() {
		return numero4p3;
	}

	public void setNumero4p3(JLabel numero4p3) {
		this.numero4p3 = numero4p3;
	}

	public JLabel getNumero4p4() {
		return numero4p4;
	}

	public void setNumero4p4(JLabel numero4p4) {
		this.numero4p4 = numero4p4;
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

	public String getNgenerado() {
		return ngenerado;
	}

	public void setNgenerado(String ngenerado) {
		this.ngenerado = ngenerado;
	}
}

