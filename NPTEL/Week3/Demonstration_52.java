/* Do while loop example */

class Demonstration_52
{
	public static void main(String[] args) 
	{
		int count = 1;
		System.out.println("Printing first 10 even numbers");

		do
		{
			System.out.print(" " + 2*count);
			count++;
		}
		while(count<11);

	}
}