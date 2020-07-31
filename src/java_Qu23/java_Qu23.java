package java_Qu23;

import java.util.Scanner;

public class java_Qu23 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = input.nextInt();
		
		int sum = 0;
		for (int i = 1; i <=n; i++ ) {
			sum = sum + i;
			System.out.println(i);
			
		}
		System.out.println("The sum is: "+sum);
		input.close();
	}

}
