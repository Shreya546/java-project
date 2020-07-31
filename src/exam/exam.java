package exam;

import java.util.Scanner;

public class exam {
	
	public int findFactorial(int fact) {
		int factorial = 1;
		for( int i = 1; i<=fact; ++i) {
			factorial = factorial * i;
	
		}
		return factorial;
	}
	
	
	public static void findMaxScore(int num1) {
		Scanner input = new Scanner(System.in);
		String studentName="";
		int maxScore = 0;
		for(int i = 1; i <= num1; ++i) {
	    	System.out.println("Enter student name:");
	    	String name = input.next();
	    	System.out.println("Enter score:");
	    	int score = input.nextInt();
	    	if(score > maxScore) {
	    		maxScore = score;
	    		studentName = name;
	    	}
	    }
	    System.out.println("Student name "+studentName+" is with max score: "+maxScore);
	}

	    
	 public int findReverse(int n) {
    	int reverse = 0;
		while(n!= 0) {
			reverse = reverse * 10 + n%10;
			n = n/10;
    }
		return reverse;
		
    }
	
    public static void findSumProduct(int sp) {

		int sum = 0;
		int product =1;
		while(sp!= 0) {
		int	a = sp%10;
			sp = sp/10;
			sum = sum + a;
			product = product * a;
		}
		System.out.println("The sum is "+sum);
		System.out.println("The product is "+product);
    }
   
    
    
    
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
				System.out.println(i +" ");
			}
		}
		System.out.println(" ");
	}
	
	public static void allPrimebetween(int s, int e) {
		for (int i = s; i <=e; i++) {
			if (isPrimenumber(i)) {
				System.out.println(i + " ");
				
			}
		}
		System.out.println("");
		
	}
	
	public double findseries(int series) {
		double sum = 0;
		double a = 0;
		double factorial = 1;
		for (int i=1; i<=series; ++i) {
			factorial = factorial * i;
			a = i/factorial;
			sum = sum + a;
				
		}
	      	
			return sum;	
			
		}

	 public void findfibonacci(int count) {
		 System.out.println(" The fibonacci series is:");
			int a = 1, b = 1, c =1;
			for(int i = 1; i<= count; i++)
			{
				a = b;
				b = c;
				c = a + b;
				System.out.print( a +" ");
				
	}
			System.out.println("");
}
	
	 public void findpattern() {

			for(int i =1; i <=5; i++) {
			for (int n =1; n <=i; n++) {
				System.out.print(n);
			}
			System.out.println("\n");
			}
		}
    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	