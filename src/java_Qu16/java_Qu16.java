package java_Qu16;

import java.util.Scanner;

public class java_Qu16 {

	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = input.nextInt();
		
		if(n % 2 == 0) {
		System.out.println("The given number is even.");
		
		}else 
		System.out.println("The given number is odd.");	
		
		input.close();
		
	}
}
