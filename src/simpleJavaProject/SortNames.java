package simpleJavaProject;

import java.util.Scanner;

public class SortNames {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number of names that you want to sort : ");
	int N = sc.nextInt();
	sc.nextLine();
	String names[] = new String[N];
	System.out.println("Please Enter the Names :");
	for(int i=0;i<N;i++)
	{
		System.out.print("Enter the Name ["+(i+1)+" ]: ");
		names[i] =sc.nextLine();
	}
	System.out.println("Given Names are :");
	for(int i=0;i<=N-1;i++)
	{
	System.out.println(names[i]);
	}
	//Sorting Names
	String temp;
	for(int i=0; i<N; i++)
    {
        for(int j=1; j<N; j++)
        {
            if(names[j-1].compareTo(names[j])>0)
            {
                temp=names[j-1];
                names[j-1]=names[j];
                names[j]=temp;
            }
        }
    }
	System.out.println("Sorted Names are : ");
	for(int i=0;i<N;i++)	
	{
	System.out.println(names[i]);
	}
	sc.close();
}
}
