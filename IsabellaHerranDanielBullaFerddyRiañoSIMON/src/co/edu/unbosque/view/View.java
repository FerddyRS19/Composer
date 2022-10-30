package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	
	private static final long serialVersionUID = 1L;

	private PanelNumeros panelNumeros; 
	private PanelBotones panelBotones; 
	private PanelTerminar panelTerminar;

	public View(Controller control) {
		setSize(700,700);
		setResizable(false); 
		setTitle("SIMON"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout(null);
		
		panelNumeros = new PanelNumeros();
		panelNumeros.setBounds(0, 0, 700, 160);
		add(panelNumeros);
		
		panelBotones = new PanelBotones();
		panelBotones.setBounds(0, 160, 700, 380);
		add(panelBotones);
		
		panelTerminar = new PanelTerminar();
		panelTerminar.setBounds(0, 540, 700, 160);
		add(panelTerminar, BorderLayout.CENTER);
		
		panelBotones.getB1().addActionListener(control);
		panelBotones.getB2().addActionListener(control);
		panelBotones.getB3().addActionListener(control);
		panelBotones.getB4().addActionListener(control);
		panelTerminar.getButTerminar().addActionListener(control);
	}
	
	public void borrarNumero() {
		Timer timer = new Timer();
		TimerTask tarea = new TimerTask() {
			public void run() {
				panelBotones.getB1().setEnabled(true);
				panelBotones.getB2().setEnabled(true);
				panelBotones.getB3().setEnabled(true);
				panelBotones.getB4().setEnabled(true);
				panelTerminar.getButTerminar().setEnabled(true);
				
				ImageIcon imn1p1 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon1p1 = new ImageIcon(imn1p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero1p1().setIcon(iconon1p1);
				
				ImageIcon imn1p2 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon1p2 = new ImageIcon(imn1p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero1p2().setIcon(iconon1p2);
				
				ImageIcon imn1p3 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon1p3 = new ImageIcon(imn1p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero1p3().setIcon(iconon1p3);
				
				ImageIcon imn1p4 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon1p4 = new ImageIcon(imn1p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero1p4().setIcon(iconon1p4);
				
				ImageIcon imn2p1 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon2p1 = new ImageIcon(imn2p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero2p1().setIcon(iconon2p1);
				
				ImageIcon imn2p2 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon2p2 = new ImageIcon(imn2p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero2p2().setIcon(iconon2p2);
				
				ImageIcon imn2p3 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon2p3 = new ImageIcon(imn2p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero2p3().setIcon(iconon2p3);
				
				ImageIcon imn2p4 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon2p4 = new ImageIcon(imn2p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero2p4().setIcon(iconon2p4);
				
				ImageIcon imn3p1 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon3p1 = new ImageIcon(imn3p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero3p1().setIcon(iconon3p1);
				
				ImageIcon imn3p2 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon3p2 = new ImageIcon(imn3p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero3p2().setIcon(iconon3p2);
				
				ImageIcon imn3p3 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon3p3 = new ImageIcon(imn3p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero3p3().setIcon(iconon3p3);
				
				ImageIcon imn3p4 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon3p4 = new ImageIcon(imn3p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero3p4().setIcon(iconon3p4);
				
				ImageIcon imn4p1 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon4p1 = new ImageIcon(imn4p1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero4p1().setIcon(iconon4p1);
				
				ImageIcon imn4p2 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon4p2 = new ImageIcon(imn4p2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero4p2().setIcon(iconon4p2);
				
				ImageIcon imn4p3 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon4p3 = new ImageIcon(imn4p3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero4p3().setIcon(iconon4p3);
				
				ImageIcon imn4p4 = new ImageIcon(getClass().getResource("/Imagenes/Gris.png"));
				ImageIcon iconon4p4 = new ImageIcon(imn4p4.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
				panelNumeros.getNumero4p4().setIcon(iconon4p4);
			}
			
		};
		timer.schedule(tarea, 5000);
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public PanelNumeros getPanelNumeros() {
		return panelNumeros;
	}

	public void setPanelNumeros(PanelNumeros panelNumeros) {
		this.panelNumeros = panelNumeros;
	}

	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelTerminar getPanelTerminar() {
		return panelTerminar;
	}

	public void setPanelTerminar(PanelTerminar panelTerminar) {
		this.panelTerminar = panelTerminar;
	}
}
