package java_Q7;

import javax.swing.JOptionPane;

class java_Q7 {

	public static void main(String[] args) {
		int r = Integer.parseInt(JOptionPane.showInputDialog("Enter radius: "));
		int l = Integer.parseInt(JOptionPane.showInputDialog("Enter length: "));
		
		double volume = Math.PI * r * r * l; 
	
		JOptionPane.showInternalMessageDialog(null," The volume of the cylinder is: "+volume);
		

	}

}
