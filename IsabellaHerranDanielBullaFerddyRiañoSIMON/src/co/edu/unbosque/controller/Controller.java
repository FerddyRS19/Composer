package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Fachadita;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private Fachadita m;
	private View gui;
	private String ningresado = "";
	
	public Controller() {
		m = new Fachadita();
		gui = new View(this);
		gui.setVisible(true);
		funcionar();
	}
	
	public void funcionar() {
		gui.getPanelNumeros().generarNumeroAleatorio();
		gui.borrarNumero();
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals(gui.getPanelBotones().Numero1)){
			ningresado = ningresado + "1";
			if(Integer.parseInt(ningresado) > 4444) {
				gui.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(gui.getPanelBotones().Numero2)){
			ningresado = ningresado + "2";
			if(Integer.parseInt(ningresado) > 4444) {
				gui.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(gui.getPanelBotones().Numero3)){
			ningresado = ningresado + "3";
			if(Integer.parseInt(ningresado) > 4444) {
				gui.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(gui.getPanelBotones().Numero4)){
			ningresado = ningresado + "4";
			if(Integer.parseInt(ningresado) > 4444) {
				gui.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(gui.getPanelTerminar().TERMINAR)){
			if(ningresado == "") {
				gui.mostrarError("Ingeniero, hay que introducir algo!");
				System.exit(0);
			}
			if(Integer.parseInt(ningresado) < 1111) {
				gui.mostrarError("Ingeniero, son 4 numeros!");
				System.exit(0);
			}
			if(Integer.parseInt(ningresado) == Integer.parseInt(gui.getPanelNumeros().getNgenerado())) {
				gui.mostrarInformacion("Secuencia exitosa!");
				System.exit(0);
			}else {
				gui.mostrarError("Fallaste!");
				System.exit(0);
			}
		}	
	}
}
