package java_Qu30;

import java.util.Scanner; 

public class java_Qu30 {

	public static void fibonacci(int count) {
		System.out.println(" The fibonacci series is:");
		int a = 1, b = 1, c =1;
		for(int i = 1; i<= count; i++)
		{
			a = b;
			b = c;
			c = a + b;
			System.out.print( a +" ");
			
	
		
		}
   	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter count");
		int count = input.nextInt();
		fibonacci(count);
	    input.close();
}
	
}