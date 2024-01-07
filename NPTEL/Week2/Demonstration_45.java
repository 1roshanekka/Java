/*The program demonstrates how to take input using scanner class*/

import java.util.Scanner;

class Demonstration_45
{
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		// calculating the maximum two numbers in Java	

		System.out.println(" please enter two numbers to find maximum of two");

		int a = scnr.nextInt();
		int b = scnr.nextInt();
		// excessively read and store
		// Scan as an integer

		if(a>b)
		{
			System.out.printf("Between %d and %d , maximum is %d\n" , a,b,a);
		}
		else
		{
			System.out.printf("Between %d and %d , maximum is %d\n" , a,b,b);
		}
	}
}