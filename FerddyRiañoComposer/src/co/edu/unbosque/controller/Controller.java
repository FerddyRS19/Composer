package co.edu.unbosque.controller;

import co.edu.unbosque.model.GestionMusical;
import co.edu.unbosque.view.View;

public class Controller {
	private GestionMusical gm;
	private View view;
	
	public Controller() {
		gm = new GestionMusical();
		view = new View();
		funcionar();
	}
	public void funcionar() {
		String aux = view.leerCaracteres("Ingresa el nombre que le deseas poner a la cancion.");
		gm.setNombreCancion(aux);
		gm.nombrarCancion();
		view.mostrarInformacion(gm.getL().generarCancion());
		gm.gestionarArchivo();
		view.mostrarInformacion(gm.gestionarPropiedades());
	}
}
