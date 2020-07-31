package java_Qu20;

import java.util.Scanner; 

public class java_Qu20 {
    
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a:");
	int a = input.nextInt();	
	
	System.out.println("Enter b: ");
	int b = input.nextInt();
	
	System.out.println("Enter operator to calculate:");
	String operator = input.next();
		
	switch (operator) {
	
	case "+":
	  int add = a + b;	
	  System.out.println("This is addition: "+add);
	  break;
	  
	case "-":
		  int sub = a - b;	
		  System.out.println("This is subtraction: "+sub);
		  break;
		  
	case "*":
		  int mul = a - b;	
		  System.out.println("This is multiplication: "+mul);
		  break;	  
		  
	case "/":
		  int div = a - b;	
		  System.out.println("This is division: "+div);
		  break;	  
    default:
    	  System.out.println("not valid");
    	  
	  input.close();
	  
	  
	  
	  
	  
	  
	  
	  
	}


	}

}
