import java.lang.*;
import java.util.Scanner;

public class Exercise1_4mod
	{
		public static void main(String[] args)
		{
			//***Use while loop check the number is Armstrong or not.***
			//store the output(1 or 0) in result variable.
			int a,b,c,d=0 ;
			double power = 3;
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int result = 0;

			//get 1st digit
			a = n/100;
			//get 2nd digit
			b = n%100;
			c = b/10;
			d = b%10;
			
			//System.out.println(a);
			//System.out.println(b);
			//System.out.println(c);
			//System.out.println(d);
			double x = Math.pow(a, power);
			double y = Math.pow(c, power);
			double z = Math.pow(d, power);
			double arm = (x+y+z);
			if(n==arm)
			{
				result = 1;
			}	
			System.out.println(result);
		}
	}