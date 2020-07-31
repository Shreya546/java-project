package java_Qu36;

import java.util.Scanner;

public class java_Qu36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number of elements:");
		int n = input.nextInt();
		
		int arr [] = new int[n];
		System.out.println("Enter the duplicate elements in array");
	
		 for(int i = 0; i < arr.length; i++){
	        	for (int j = i + 1; j < arr.length; j++) {
	        		if(arr[i]== arr[j]);
	        		System.out.println(arr[j]);
	        		
	        	}
	        	input.close();
		 }
    }
}