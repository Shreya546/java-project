package java_Qu12;

import java.util.Scanner;

public class java_Qu12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id = input.nextInt();
		
		input.hasNextLine();
		System.out.println("Enter name:");
		String name = input.next();
		
		System.out.println("Enter nationality:");
		String nationality = input.next();
		
		System.out.println("****************");
		System.out.println("The person id is: " + id);
		System.out.println("The person name is: " + name);
		System.out.println("The person nationality is: " + nationality);
		System.out.println("****************");
		
		input.close();
		
		
		
		
	}
}