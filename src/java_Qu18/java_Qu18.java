package java_Qu18;

import java.util.Scanner;

public class java_Qu18 {
	
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number x:");
	int x = input.nextInt();
	
	System.out.println("Enter a number y:");
	int y = input.nextInt();
	
	System.out.println("Enter a number z:");
	int z = input.nextInt();

	if( x >= y && x >= z)
    System.out.println("The largest number is :"+x);
	
	else if ( y >= x && y >= z)
	System.out.println("The largest number is :"+y);
	
	else 
	System.out.println("The largest number is: "+z);
	 
	input.close();
	
	
	
    }
}
