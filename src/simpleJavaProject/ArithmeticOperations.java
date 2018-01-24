package simpleJavaProject;

import java.util.Scanner;

class ArithmeticOperations {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the FirstNumber ::");
	int first = sc.nextInt();
	System.out.println("Second Number :: ");
	int second = sc.nextInt();
	int addition = first+second;
	int mult = first*second;
	int division = first/second;
	int subtraction = first-second;
	System.out.println("Results for Addition : "+addition +" \n Multiplication: "+mult +" \n Division "+division +" \n Subtraction : "+subtraction);
	sc.close();
}
}
