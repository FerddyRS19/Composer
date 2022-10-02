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
	
	public String leerCaracteres(String mensaje) {
		String aux2 = JOptionPane.showInputDialog(mensaje);
		String dato2 = aux2;
		return dato2;
		
	}
	
	public int leerDatoEntero(String mensaje) {
		String aux3 = JOptionPane.showInputDialog(mensaje);
		int dato3 = Integer.parseInt(aux3);
		return dato3;
		
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}