package java_Qu33;

import java.util.Scanner;

public class java_Qu33 {

    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the size of array:");
		int size = input.nextInt();
		int []arr = new int [size];
		System.out.println(" Enter the elements in an array:");

        for(int i = 0; i < arr.length; i++){
        	arr[i]= input.nextInt();
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
        System.out.println("The elements in ascending order: ");
        for(int k = 0; k < arr.length; k++) {
        	System.out.println(arr[k]+ " ");
        }
        input.close();
	}

}
