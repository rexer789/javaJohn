package ejercicio3c;

import javax.swing.JOptionPane;

public class Ejercicio3c {

	public static void main(String[] args) {
		String b = JOptionPane.showInputDialog("Di un numero.");
		
		int c = Integer.parseInt(b);
		
		if(c < 0){
			JOptionPane.showMessageDialog(null, "Tu numero menor que 0.");
		}
		if(c > 0){
			JOptionPane.showMessageDialog(null, "Tu numero mayor que 0.");
		}
		
		if(c % 2 == 0){
			JOptionPane.showMessageDialog(null, "Tu numero es un par.");
		}
		if(c % 2 == 1){
			JOptionPane.showMessageDialog(null, "Tu numero es un impar");
		}
		
		if(c % 5 == 0){
			JOptionPane.showMessageDialog(null, "Tu numero es un multiplo de 5.");
		}
		
		if(c % 10 == 0){
			JOptionPane.showMessageDialog(null, "Tu numero es un multiplo de 10.");
		}
		
		if(c < 100){
			JOptionPane.showMessageDialog(null, "Tu numero menor que 100.");
		}
		if(c > 100){
			JOptionPane.showMessageDialog(null, "Tu numero mayor que 100.");
		}
		
	}

}
