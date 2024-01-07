//example of factorial calculation

public class RecursiveFactorial
{
	int n ;
	int factorial(int n)
	{
		//Terminaton condition
		if(n==0)
		{
			return (1);
		}
		else
		{
			return (n*factorial(n-1));
		}
	}

	public static void main(String[] args) 
	{
		RecursiveFactorial x = new RecursiveFactorial();

		x.n = Integer.parseInt(args[0]);
		System.out.println("Factorial of " + x.n + ": " + x.factorial(x.n));
	}
}