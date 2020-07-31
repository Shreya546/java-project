package java_Q9;

import javax.swing.JOptionPane;

public class java_Q9 {

	public static void main(String[] args) {

	double p = Double.parseDouble(JOptionPane.showInputDialog("Enter pounds:"));
	
	double kilogram = (double) p * 0.4554;
	
	
	JOptionPane.showInternalMessageDialog(null,"The kilogram is: "+kilogram);
	
	}
	
}	
	
	
	
