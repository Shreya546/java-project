package java_Qu10b;

import java.util.Scanner;

public class java_Qu10b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter s");
		double s = input.nextDouble();
		
		System.out.println("Enter a");
		double a = input.nextDouble();
		
		System.out.println("Enter b");
		double b = input.nextDouble();
		
		System.out.println("Enter c");
		double c = input.nextDouble();
		
		
		double area = Math.sqrt((s)* (s-a)*(s-b)*(s-c));
	
		System.out.println("The area is: "+ area);
		
		input.close();
		
		
	}

}
