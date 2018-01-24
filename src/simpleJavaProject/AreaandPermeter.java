package simpleJavaProject;

import java.util.Scanner;

class AreaandPermeter {
	public void area(double radius)
	{
		double result = Math.PI * radius * radius;
		System.out.println("Area result is : "+result);
	}
	public void Perimeter(double radius)
	{
		double perimeter_result = 2 * Math.PI * radius;
		System.out.println("Perimeter Result is : "+perimeter_result);
	}
	public static void main(String[] args) {
		AreaandPermeter area_per = new AreaandPermeter();
		Scanner sc  = new Scanner(System.in);
		area_per.area(sc.nextDouble());
		area_per.Perimeter(sc.nextDouble());
		sc.close();
		
	}

}
