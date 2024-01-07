// a Java program to demonstrate the working of print() and println() together printf()

class Demonstration_41
{
	public static void main(String[] args) 
	{
		int x =555;
		System.out.println("1. println");
		System.out.println("2. println");

		System.out.print("1. print");
		//System.out.print("\n");
		//try \n for a going to next line or println()
		System.out.print("2. print" + x);

	}
}