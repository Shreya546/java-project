package java_Qu29;

import java.util.Scanner;

public class java_Qu29 {

	public static double math(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = input.nextInt();
	double sum = 0;
	double a = 0;
	double factorial = 1;
	for (int i=1; i<=n; ++i) {
		factorial = factorial * i;
		a = i/factorial;
		sum = sum + a;
			
	}
        input.close();	
		return sum;	
		
	}

    

    public static void main(String[] args) {
    	double output = math();
    System.out.println("The output is: "+output);
    	}
    
}
