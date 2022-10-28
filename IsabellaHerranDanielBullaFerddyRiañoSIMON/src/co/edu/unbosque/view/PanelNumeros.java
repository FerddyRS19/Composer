package co.edu.unbosque.view;

import java.util.Timer;
import java.util.TimerTask;



import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelNumeros extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel numero;
	private JLabel numero1;
	private JLabel numero2;
	private JLabel numero3;
	private JLabel numero4;
	
	public PanelNumeros() {
		setLayout(null);
		numero = new JLabel("Numero:");
		numero.setBounds(20, 65, 100, 30);
		numero1 = new JLabel("1");
		numero1.setBounds(160, 10, 140, 140);
		numero2 = new JLabel("2");
		numero2.setBounds(320, 10, 140, 140);
		numero3 = new JLabel("3");
		numero3.setBounds(460, 10, 140, 140);
		numero4 = new JLabel("4");
		numero4.setBounds(600, 10, 140, 140);
		add(numero);
		add(numero1);
		add(numero2);
		add(numero3);
		add(numero4);
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int i = 5;
			public void run() {
				if(i < 1) {
					remove(numero1);
					remove(numero2);
					remove(numero3);
					remove(numero4);
					timer.cancel();
				}
				i--;
			}
		};
		timer.schedule(task, 0, 1000);
	}
	
}

