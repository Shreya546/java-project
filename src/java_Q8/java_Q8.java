package java_Q8;

import java.util.Scanner;

public class java_Q8 {

	public static void main(String[] args) {
	 double c, f;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter temperature in fahrenheit:");
	 f = input.nextDouble();
	 System.out.println("Enter temperature in celsius:");
	 c = input.nextDouble();
	 
	 c = (f-32)*(0.5556);
	 f = ((c*9)/5)+32;
	 
	 
System.out.println("The temperature in celsius is: "+f);
System.out.println("The temperature in fahrenheit is: "+c);

	input.close();
	 

	}
}