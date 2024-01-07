/* the following program snippet shows how to read and write to the console */

import java.util.Scanner;

public class Demonstration_46
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the radius");

		Scanner sc = new Scanner(System.in);

		double radius = sc.nextDouble();
		double area = Math.PI*radius*radius;

		System.out.println("Area is " + area);
	}
}