package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
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
