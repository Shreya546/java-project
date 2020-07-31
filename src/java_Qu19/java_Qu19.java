package java_Qu19;

import java.util.Scanner;

public class java_Qu19 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter a number x:");
	int x = input.nextInt();
	
	System.out.println("Enter a number y:");
	int y = input.nextInt();
	
	System.out.println("Enter a number z:");
	int z = input.nextInt();
	
	if(x == y && y == z && z == x)
	System.out.println("It is equivalent triangle.");
	
	if(x == y && y != z && z != x)
	System.out.println("It is isosceles triangle.");
	
	if(x != y && y != z && z != x)
	System.out.println("It is  scalene  triangle.");
		
	  
	input.close();
		

	}

}
