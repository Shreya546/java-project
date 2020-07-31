package java_Qu17;

import java.util.Scanner;

public class java_Qu17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = input.nextInt();
		
		if( n % 4 == 0) {
			System.out.println("It is a leap year:");
			
		}else {
			System.out.println("It is not leap year:");
		}
         input.close();
	}

}
