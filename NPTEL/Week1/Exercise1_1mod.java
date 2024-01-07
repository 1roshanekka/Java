import java.lang.*;
import java.util.Scanner;

	public class Exercise1_1mod
	{
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);

			System.out.println("Please enter radius");
			double radius = s.nextDouble();
			//radius is inputted 
			double perimeter = 0;
			double area = 0;
			//variable perimeter and area are declared

			//formula
			if(radius>0)
			{
				perimeter = 2*Math.PI*radius;
				System.out.println("Perimeter = " + perimeter);

				area = Math.PI*radius*radius;
				System.out.println("Area = " + area);
			}
			else
			{
				System.out.println("please enter non zero positive number");
			}
		}
	}
