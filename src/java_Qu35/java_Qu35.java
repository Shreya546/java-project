package java_Qu35;

import java.util.Scanner;

public class java_Qu35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number of elements:");
		int n = input.nextInt();
		
		
		int arr [] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
			
		}
		 int order = 0;
		 for(int i = 0; i < arr.length; i++){
	        	for (int j = i + 1; j < arr.length; j++) {
	        		
	        		if(arr[i] > arr[j]){
	        			order = arr[i];
	        			arr[i]= arr[j];
	        			arr[j]= order;
	        		}

	        	}
	        }
		
		System.out.print("The second  largest number in an array is: "+arr[arr.length-2]);
		input.close();

  
	}

}
