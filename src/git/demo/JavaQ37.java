package git.demo;

import java.util.Scanner;

//this is soltion for Question37

public class JavaQ37 {

	public static void main(String[] args) {
		final int ROW = 3;
		final int COLUMN = 3;
		int [][] arr = new int[ROW][COLUMN];
		
		System.out.println("Enter numbers");
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i< arr.length; i++) {
			for (int j=0; j< arr.length; j++) {
				arr[i][j] = input.nextInt();
			}
		System.out.println();
		}
		
		for (int i=0; i< arr.length; i++) {
			for (int j=0; j< arr.length; j++) {
				arr[i][j] = input.nextInt();
			}
		System.out.println();
		}
		
		int [][] sum = new int[ROW][COLUMN];
		for (int i=0; i< arr.length; i++) {
			for (int j=0; j< arr.length; j++) {
				sum[i][j] = arr[i][j] + arr[i][j];
			}
		System.out.println();
		}
		System.out.print("The sum of the array is: ");
		for (int i=0; i< arr.length; i++) {
			for (int j=0; j< arr.length; j++) {
				System.out.println(sum[i][j]+" ");
			}	
		}
		input.close();
	}
}