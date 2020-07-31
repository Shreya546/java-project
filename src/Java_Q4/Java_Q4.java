package Java_Q4;

import java.util.Scanner;
public class Java_Q4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principle:");
		float P = input.nextFloat();
		System.out.println("Enter the time:");
		float T = input.nextFloat();
		System.out.println("Enter the rate:");
        float R = input.nextFloat();
        
        float interest = P*T*R / 100;
        		
        System.out.println("Simple interest is : " + interest);		
        input.close();
       
	}

}
