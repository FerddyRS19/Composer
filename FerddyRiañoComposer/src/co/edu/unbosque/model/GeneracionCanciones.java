package co.edu.unbosque.model;


import java.util.concurrent.ThreadLocalRandom;

public class GeneracionCanciones {
	
	private String palabras1[] = {"Princess ", "Mami ", "Bebe ", "Bonboncito "} ;
	private String palabras2[] = {"yo quiero ", "voy a ", "yo puedo ", "yo vengo a "} ;
	private String palabras3[] = {"encendelte ", "amalte ", "ligar ", "jugal "} ;
	private String palabras4[] = {"suave ", "lento ", "rapido ", "fuerte "} ;
	private String palabras5[] = {"hasta que salga el sol ", "toda la noche ", "hasta el amanecer ", "todo el dia "} ;
	private String palabras6[] = {"sin anestesia.", "sin compromiso.", "feis to feis.", "sin miedo."} ;
	private String frase;
	private String estrofa;
	private String cancion;
	
	public GeneracionCanciones() {
		this.frase = "";
		this.estrofa = "";
		this.cancion = "";
	}
	
	public String generarFrase() {
		this.frase = "";
		int numero1 = numeroAleatorio(0, palabras1.length - 1);
		int numero2 = numeroAleatorio(0, palabras2.length - 1);
		int numero3 = numeroAleatorio(0, palabras3.length - 1);
		int numero4 = numeroAleatorio(0, palabras4.length - 1);
		int numero5 = numeroAleatorio(0, palabras5.length - 1);
		int numero6 = numeroAleatorio(0, palabras6.length - 1);

		String palabraAleatoria = palabras1[numero1];
		String palabraAleatoria2 = palabras2[numero2];
		String palabraAleatoria3 = palabras3[numero3];
		String palabraAleatoria4 = palabras4[numero4];
		String palabraAleatoria5 = palabras5[numero5];
		String palabraAleatoria6 = palabras6[numero6];
		
		this.frase = palabraAleatoria + palabraAleatoria2 + palabraAleatoria3 + palabraAleatoria4 + palabraAleatoria5 + palabraAleatoria6;

		return this.frase;
		}

		public static int numeroAleatorio(int minimo, int maximo) {
		
		return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
		}
	
	public String generarEstrofa() {
		this.estrofa = "";
		for(int i = 1; i <= 4; i ++) {
			this.estrofa = this.estrofa + "\n" + 
					  generarFrase();
		}
		return this.estrofa;
	}
	
	public String generarCancion() {
		for(int j = 1; j <= 3; j++) {
		this.cancion = this.cancion + "\n" +
				  generarEstrofa();
		}
		return this.cancion;
	}

	public String[] getPalabras1() {
		return palabras1;
	}

	public void setPalabras1(String[] palabras1) {
		this.palabras1 = palabras1;
	}

	public String[] getPalabras2() {
		return palabras2;
	}

	public void setPalabras2(String[] palabras2) {
		this.palabras2 = palabras2;
	}

	public String[] getPalabras3() {
		return palabras3;
	}

	public void setPalabras3(String[] palabras3) {
		this.palabras3 = palabras3;
	}

	public String[] getPalabras4() {
		return palabras4;
	}

	public void setPalabras4(String[] palabras4) {
		this.palabras4 = palabras4;
	}

	public String[] getPalabras5() {
		return palabras5;
	}

	public void setPalabras5(String[] palabras5) {
		this.palabras5 = palabras5;
	}

	public String[] getPalabras6() {
		return palabras6;
	}

	public void setPalabras6(String[] palabras6) {
		this.palabras6 = palabras6;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getEstrofa() {
		return estrofa;
	}

	public void setEstrofa(String estrofa) {
		this.estrofa = estrofa;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
}
