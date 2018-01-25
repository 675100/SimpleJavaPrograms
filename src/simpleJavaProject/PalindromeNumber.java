package simpleJavaProject;

import java.util.Scanner;

/**
 * 
 * @author Venkat
 *
 *Check the given number is palindrome or not
 *example: 121 reverse also same 121
 */
public class PalindromeNumber {
public static void main(String[] args) {
	int number,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the number below to check palindrome or not :");
	number = sc.nextInt();
	int givenNumber =number;
	while(number>0)
	{
		sum = (sum*10) + (number%10);
		number = number/10;
		
	}
	if(givenNumber==sum)
	{
		System.out.println("Given Number : " +givenNumber+ " is palindrome");
	}
	else
		System.out.println("Given Number : " +givenNumber+ " is not a palindrome");
	sc.close();
}
}
