package co.edu.unbosque.model.persistence;

import java.io.*;

import javax.swing.JFileChooser;

public class EscribirLeerFile {
	
	private String archivodata = "c:\\data\\datanumeros.txt";
	
	public int escribirarchivo(String dato) {
		
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);	
			
			pw.print(dato);
			
			fw.close();
		} catch(IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerArchivo() {
		
		String linea = "";
		String cadena = "";
		
		File f = new File(this.archivodata);
		
		try {
			FileReader fr= new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while(linea != null) {
				cadena += linea;
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}

}
