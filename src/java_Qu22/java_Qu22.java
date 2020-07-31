package java_Qu22;

import java.util.Scanner;

public class java_Qu22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a= input.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(a+" *  " +i+" =  "+a*i);
			
			input.close();
		}
	}

}
