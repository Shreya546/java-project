package java_Qu11a;

import java.util.Scanner;

public class java_Qu11a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		System.out.println("Before swapping a is: "+a);
		System.out.println("Before swapping b is: "+b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After swapping a is: "+a);
		System.out.println("After swapping b is: "+b);
		
		input.close();

	}

}
