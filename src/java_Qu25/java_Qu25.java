package java_Qu25;

import java.util.Scanner;

public class java_Qu25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maxScore = 0;
		String studentName ="";
	    System.out.println("Enter number of student:");
        int n = input.nextInt();
		
	    for(int i = 1; i <= n; ++i) {
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
		input.close();
	}

}
