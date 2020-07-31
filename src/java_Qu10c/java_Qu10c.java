package java_Qu10c;
 
import java.util.Scanner;

public class java_Qu10c {
	
   public static void main(String[]args) {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Enter a: ");
	   double a = input.nextDouble();
	
	   System.out.println("Enter b: ");
	   double b = input.nextDouble();
	   
	   System.out.println("Enter c: ");
	   double c = input.nextDouble();
	   
	   
	   double x = ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2 * a;
	   
	   System.out.println("x is: "+ x);
	   
	   input.close();
	   
   }

}
