package java_Qu28;

import java.util.Scanner;

public class java_Qu28 {

	public static boolean isPrimenumber(int num) {
		boolean isPrime = true;
		if( num == 1 || num == 0) {
			isPrime = false;
		}
	for (int i=2; i<=num/2; i++) {
		if( num % i == 0) {
			isPrime = false;
			break;
		}
	}
	return isPrime;
	}
	
	public static void firstNthPrime(int num) {
		for (int i=2; i<=num; i++) {
			if(isPrimenumber(i)) {
				System.out.print(i +" ");
			}
		}
		System.out.println(" ");
	}
	
	public static void allPrimebetween(int s, int e) {
		for (int i = s; i <=e; i++) {
			if (isPrimenumber(i)) {
				System.out.print(i + " ");
				
			}
		}
		System.out.println("");
		
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String decision = "";
		do {
			System.out.println("Enter your choice:");
			String choice = input.next();
			
		switch (choice) {
		case "isprime":
			System.out.println("Enter your number:");
			int num = input.nextInt();
			boolean isPrime = isPrimenumber(num);
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
			firstNthPrime(n);
			break;
			
		case "allprime":
			System.out.println("Enter a start:");
			int s = input.nextInt();
			System.out.println("Enter a end:");
			int e = input.nextInt();
			allPrimebetween(s, e);
			break;
		default:
			System.out.println("NOT VALID");
			break;
		}
		System.out.println("Do you want to continue? (Y/N)");
		decision = input.next();
		}while (decision.equalsIgnoreCase("y"));
		input.close();
		
		}
}
