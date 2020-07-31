package java_Qu10;

import java.util.Scanner;

public class java_Qua {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter u");
	double u = input.nextDouble();
	System.out.println("Enter t");
	double t = input.nextDouble();
	System.out.println("Enter a");
	double a = input.nextDouble();
	
	double s = u * t + 1/2 * a *( Math.pow(t,2));
	
	System.out.println("The distance is: "+ s );
	
	input.close();
	
	

	}

}
