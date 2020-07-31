package java_Qu27;

import java.util.Scanner;

public class java_Qu27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any numbers:");
		int i = input.nextInt();
		
		int sum = 0;
		int product =1;
		int r =0;
		while(i!= 0) {
			r = i%10;
			i = i/10;
			sum = sum + r;
			product = product * r;
		}
		
		System.out.println("The sum of given number is: "+sum );
		System.out.println("The product of given number is: "+product );
		
		input.close();

			
		}
		

	}
