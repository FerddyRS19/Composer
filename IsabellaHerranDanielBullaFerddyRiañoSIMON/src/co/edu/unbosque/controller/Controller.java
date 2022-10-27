package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.Fachadita;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private Fachadita m;
	private View gui;
	
	public Controller() {
		m = new Fachadita();
		gui = new View(this);

		gui.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
	}
}
