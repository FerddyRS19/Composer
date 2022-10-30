package co.edu.unbosque.model;

public class ClaseX {

	private ClaseY y;
	
	public ClaseX() {
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
	
	public String procesarDatoOtraClase(String dato) {
		dato = dato + " procesado por la Otra Clase";
		return dato;
	}
}
