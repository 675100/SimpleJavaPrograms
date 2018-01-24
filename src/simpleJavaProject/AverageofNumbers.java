package simpleJavaProject;

import java.util.Scanner;

public class AverageofNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the Numbers: ");
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
	System.out.println("Avearage of the three numbers are : "+(number1 + number2 + number3)/3);
	sc.close();
}
}
