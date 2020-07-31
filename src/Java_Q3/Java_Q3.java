package Java_Q3;

import java.util.Scanner;

public class Java_Q3 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter a number1:");
	 int x = input.nextInt();
	 System.out.println("Enter a number2:");
	 int y = input.nextInt();
	 
	 int sum = x + y;
	 int avg = (x+y)/2;
	 
	 System.out.println("Sum of " + x + " and " + y + " is:" + sum);
	 System.out.println("Average of " + x + " and " + y + " is:" + avg); 
	 
	 input.close();
  }

}
