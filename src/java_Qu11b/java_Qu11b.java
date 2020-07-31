package java_Qu11b;

import java.util.Scanner;

public class java_Qu11b {
	 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		System.out.println("Before swapping a is: "+a);
		System.out.println("Before swapping b is: "+b);
		
		a = a + b; 
		b = a - b; 
		a = a - b;
		
		System.out.println("After swapping a is: "+a);
		System.out.println("After swapping b is: "+b);
			
		input.close();
	}
		
}
