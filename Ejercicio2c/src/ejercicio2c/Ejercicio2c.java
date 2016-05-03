package ejercicio2c;

import javax.swing.JOptionPane;

public class Ejercicio2c {

	public static void main(String[] args) {
		String b = JOptionPane.showInputDialog("Di un numero.");
		
		int a = Integer.parseInt(b);
		
		if(a % 2 == 0){
			JOptionPane.showMessageDialog(null, "Tu numero es un par.");
		}
		
		if(a % 2 == 1){
			JOptionPane.showMessageDialog(null, "Tu numero es un impar.");
		}
		
	}

}
