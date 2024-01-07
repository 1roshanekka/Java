import java.lang.*;
import java.util.Scanner;

	public class Exercise1_2mod
	{
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);

			//Scanner input for 3 numbers
			System.out.println("Enter First Number");
			int x = s.nextInt();
			System.out.println("Enter Second Number");
			int y = s.nextInt();
			System.out.println("Enter Third Number");
			int z = s.nextInt();

			int result = 0;
			//intitialization
			System.out.print("The biggest number is - ");
			if((x>=y && y>=z) ||(x>=z && z>=y))
			{
				result = x;
				System.out.println(result);
			}
			else if((y>=z && z>=x) || (y>=x && x>=z))
			{
				result = y;
				System.out.println(result);
			}
			else if((z>=x && x>=y) || (z>=y && y>=x))
			{
				result = z;
				System.out.println(result);
			}
			else
			{
				System.out.println("Wrong input");
				System.out.println("please enter integer");
			}
		}
	}