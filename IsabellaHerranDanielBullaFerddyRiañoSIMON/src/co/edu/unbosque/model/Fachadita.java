package co.edu.unbosque.model;

public class Fachadita {

	private ClaseY y;
	
	public Fachadita() {
		// TODO Auto-generated constructor stub
		y = new ClaseY();
	}



	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}


	/* metodo que realiza un proceso basado en un par�metro "dato" 
	 * y retorne el dato procesado. Reemplazar por lo que se necesiten
	 */
	public String procesarDatoClaseY(String dato) {
		dato = dato + " procesado por la claseY";
		return dato;
	}
	
	public String procesarDatoOtraClase(String dato2) {
		dato2 = dato2 + " procesado por la Otra Clase";
		return dato2;
	}
}
