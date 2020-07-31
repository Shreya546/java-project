package java_Qu14;

import java.util.Scanner;

public class java_Qu14 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the first integer:");
	int a = input.nextInt();
	
	System.out.println("Enter the second integer:");
	int b = input.nextInt();
	
	if (a == b) {
	System.out.println("a is equal to b.");
	
	}if (a > b) {
	System.out.println("a is greater than b.");
	
	}if (a < b) {
	System.out.println("a is smaller than b.");
	
	}
     input.close();	
   		 
	}

}
