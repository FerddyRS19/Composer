package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EscribirLeerFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class GestionMusical {
	
	private String nombreCancion;
	private GeneracionCanciones g;
	
		public GestionMusical() {
			g = new GeneracionCanciones();
			this.nombreCancion = "";
		}

		public void nombrarCancion() {
			g.setCancion(this.nombreCancion + "\n" + g.getCancion());
		}
		
		public void gestionarArchivo() {
			EscribirLeerFile archivo = new EscribirLeerFile();
			archivo.escribirArchivo(getG().getCancion());
		}
		
		public String gestionarPropiedades() {
			Propiedades prop = new Propiedades();
			prop.escribirPropiedades();
			return "Las propiedades son: " + "\n" + prop.leerPropiedades();
		}

		public String getNombreCancion() {
			return nombreCancion;
		}

		public void setNombreCancion(String nombreCancion) {
			this.nombreCancion = nombreCancion;
		}

		public GeneracionCanciones getG() {
			return g;
		}

		public void setG(GeneracionCanciones g) {
			this.g = g;
		}
		
}
