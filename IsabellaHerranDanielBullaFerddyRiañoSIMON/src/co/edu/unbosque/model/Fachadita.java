package co.edu.unbosque.model;

public class Fachadita {

	private ClaseY y;
	
	public Fachadita() {
		y = new ClaseY();
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}
	
	public String procesarDatoClaseY(String dato) {
		dato = dato + " procesado por la claseY";
		return dato;
	}
	
	public String procesarDatoOtraClase(String dato2) {
		dato2 = dato2 + " procesado por la Otra Clase";
		return dato2;
	}
}
