package simpleJavaProject;

import java.util.Scanner;

public class FibinocciSeries {
public static void main(String[] args) {
	int a=0,b=1,c,i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the Length of Fibinocci Series that you would like to see \n");
	i = sc.nextInt();
	System.out.println("Fibinocci Result is :: ");
	System.out.println(a+"\n" +b);
	for(j=0;j<=i;j++)
	{
		c = a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	sc.close();
}
}
