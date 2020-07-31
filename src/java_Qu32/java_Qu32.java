package java_Qu32;

import java.util.Scanner;

public class java_Qu32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number of element:");
		int n = input.nextInt();
		int []arr = new int[n];
		System.out.println("Enter all the elements:");
		int sum = 0;
		for (int i =0; i < n; i++) {
			arr[i] = input.nextInt();
			sum = sum + arr[i];
			
		}
		System.out.println("The sum of an array element is: "+sum);
		input.close();
	}
}