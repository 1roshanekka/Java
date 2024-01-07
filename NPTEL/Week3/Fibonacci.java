import java.util.Scanner; //This package for reading input
public class Fibonacci 
{ 

	public static void main(String args[]) 
	{ 
		 Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); //Read an integer
		System.out.println(fib(n)); //Generate and print the n-th Fibonacci number         
    } 
	static int fib(int n) 
	{
		int i = 0;
		int j = 1;
		int k = 0;
		for(int count = 1 ; count<=n ; count++)
		{
			
			System.out.print(k +" ");
			i=j;
			j=k;
			if(count<n)
			{
				k = i+j;
			}
			//refresh
		}
		System.out.println("\n");
		return k;
	}
}

