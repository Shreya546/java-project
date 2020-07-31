package exam;

import java.util.Scanner;

public class test{

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String decision = "";
		do {
			System.out.println("Enter your choice:");
			String choice = input.next();
	
	switch (choice) {
	case "findfactorial":
		System.out.println("Enter a number to print factorial:");
		int fact = input.nextInt();
		exam ob1 = new exam();
		int result = ob1.findFactorial(fact);
		System.out.println("The factorial is: "+ result);
	    break;
	
	case "findMaxScore":
	    System.out.println("Enter number of student:");
        int num1 = input.nextInt();
		exam.findMaxScore(num1);
		break;
	
	    
	case "findreverse":
		System.out.println("Enter a number to print reverse:");
		int reverse = input.nextInt();
		exam ob2 = new exam();
		int result1 = ob2.findReverse(reverse);
		System.out.println("The reverse is: "+ result1);
	    break;
	    
	case "findSumProduct":
		System.out.println("Enter a number:");
		int sp = input.nextInt();
		exam.findSumProduct(sp);
		break;
		
		
	case "isprime":
		System.out.println("Enter your number:");
		int num = input.nextInt();
		boolean isPrime = exam.isPrimenumber(num);
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		break;
	
	case "nthprime":
		System.out.println("Enter your number:");
		int n = input.nextInt();
		exam.firstNthPrime(n);
		
	case "allprime":
		System.out.println("Enter a start:");
		int s = input.nextInt();
		System.out.println("Enter a end:");
		int e = input.nextInt();
		exam.allPrimebetween(s, e);
		break;
	
	
	case "findseries":
		System.out.print("Enter your number:");
		int series = input.nextInt();
		exam ob3 = new exam();
		double result2 = ob3.findseries(series);
		System.out.println("The series is: "+ result2);
	    break;
	    
		
		
	case "findfibonacci":
		System.out.print("Enter your count:");
		int count = input.nextInt();
		exam ob4 = new exam();
		ob4.findfibonacci(count);
		break;
		
	case"findpattern":
		exam ob5 = new exam();
		ob5.findpattern();
		break;
		
	}	
	System.out.println("Do you want to continue? (Y/N)");
	decision = input.next();
	}while (decision.equalsIgnoreCase("y"));
	input.close();
	
	}
	
	
}


			
			
