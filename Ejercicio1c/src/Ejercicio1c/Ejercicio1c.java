package Ejercicio1c;

import javax.swing.JOptionPane;

public class Ejercicio1c {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Di un numero.");
		
		int b = Integer.parseInt(s);
		
		if(b < 0){
			JOptionPane.showMessageDialog(null, "Tu numero es negativo.");
		}
		
		if(b > 0){
			JOptionPane.showMessageDialog(null, "Tu numero es positivo.");
		}
		
	}
}
