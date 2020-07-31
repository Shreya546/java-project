package java_Qu21;

import java.util.Scanner;

public class java_Qu21 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter day of the week:");
		int day = input.nextInt();
		
		switch(day) {
		
		case 1: 
		System.out.println("Today is Monday. ");
		break;
		
		case 2: 
		System.out.println("Today is Tuesday. ");
		break;
		
		case 3: 
		System.out.println("Today is Wednesday. ");
		break;
		
		case 4: 
		System.out.println("Today is Thursday. ");
		break;
			
		case 5: 
		System.out.println("Today is Friday. ");
		break;
				
		case 6: 
		System.out.println("Today is Saturday. ");
		break;
				
		case 7: 
		System.out.println("Today is Saturday. ");
		break;	
		
		default:
		System.out.println(" not ivalid ");
		
		input.close();
		
		
		
	}
		
  }

}
