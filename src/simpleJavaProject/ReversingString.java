package simpleJavaProject;

import java.util.Scanner;

/**
 * 
 * @author Venkat
 *
 *Reversing a String :: 
 *Example -  Venkat ==> takneV
 */
public class ReversingString {
	public static void main(String[] args) {
		String revString="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String below:: ");
		String name = sc.nextLine();
		int nameLength = name.length();
		System.out.println("Length of String is : "+nameLength);
		for(int i=nameLength-1;i>=0;i--)
		{
			revString = revString + name.charAt(i);
		}
		System.out.println("Reverse String is : "+revString);
		sc.close();
	}
}
