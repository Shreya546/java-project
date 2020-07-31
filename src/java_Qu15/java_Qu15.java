package java_Qu15;

import java.util.Scanner;

public class java_Qu15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = input.nextInt();

	    if ( n >= 0 && n <= 128) {
	    
	    	System.out.println("ASCII code of +n+ is: "+n);
	    	
	    	input.close();
	    }
	}

}
