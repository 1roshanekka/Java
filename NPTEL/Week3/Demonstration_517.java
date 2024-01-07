//Always use recursive version

//Example of recursion: practic 1

class Demonstration_517
{
	static void myMethod(int counter)
	{
		if(counter==0)
		{
			return;
		}
		else
		{
			System.out.println("Hello " + counter);

			myMethod(--counter);
			System.out.println(counter);
			return;
		}
	}

	public static void main(String[] args) 
	{
		myMethod(10);
		//pass +ve integer	
	}
}