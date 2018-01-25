package simpleJavaProject;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	int a,b,input;
	float result=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the first Number : ");
	a = sc.nextInt();
	System.out.println("Please Enter the Second Number : ");
	b = sc.nextInt();
	System.out.println("Please choose your Operation Number : \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");
	input = sc.nextInt();
	switch(input){
	case 1 :
		result = a+b;
		break;
	case 2 :
		result = a-b;
		break;
	case 3 :
		result = a*b;
		break;
	case 4 :
		result = a/b;
		break;
	default :
		System.out.println("You choose wrong number :");
	}
	
	if(input>=1 && input <=5)
	{
		System.out.println("Result is : "+result);
	}
	sc.close();
}
}
