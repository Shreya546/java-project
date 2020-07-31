package java_Qu34;

import java.util.Scanner;

public class java_Qu34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number of elements:");
		int n = input.nextInt();
		
		
		int arr [] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
			
		}
		System.out.println();
		
		System.out.println("The elements in reverse order:");
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		input.close();

	}

}
  