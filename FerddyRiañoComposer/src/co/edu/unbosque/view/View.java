package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public View(){
	
	}
	
	public double leerDatoReal(String mensaje) {
		String aux1 = JOptionPane.showInputDialog(mensaje);
		double dato1 = Double.parseDouble(aux1);
		return dato1;
		
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}