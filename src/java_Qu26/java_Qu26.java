package java_Qu26;

import java.util.Scanner;

public class java_Qu26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any numbers:");
		int n = input.nextInt();

		int r = 0;
		while(n!= 0) {
			r = r * 10 + n%10;
			n = n/10;
		}
		
		System.out.println("The reverse number is: "+r);
		
		input.close();
		
	
	}

}
