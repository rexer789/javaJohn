package ejerciccio1c1;

import javax.swing.JOptionPane;

public class Ejerciccio1c1 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Di un numero.");
		String w = JOptionPane.showInputDialog("Di otro numero.");
		
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(w);
		
		if(a < 0){
			JOptionPane.showMessageDialog(null, "Tu primer numero es menor que 0.");
		}
		if(a > 0){
			JOptionPane.showMessageDialog(null, "Tu primer numero es mayor que 0.");
		}
		
		if(b < 0){
			JOptionPane.showMessageDialog(null, "Tu segundo numero es menor que 0.");
		}
		if(b > 0){
			JOptionPane.showMessageDialog(null, "Tu segundo numero es mayor que 0.");
		}
		
	}

}
