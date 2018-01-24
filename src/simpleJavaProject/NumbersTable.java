package simpleJavaProject;

import java.util.Scanner;

public class NumbersTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for which you want to display the table");
		int number = sc.nextInt();
		if (number > 0)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(number +" * "+i + " = " +(number*i));
			}
		}
		else
			System.out.println("Please enter the number greater than 0");
		sc.close();

	}

}
