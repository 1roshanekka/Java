//another example of scope of variable in a block

class Demonstration_511
{
	public static void main(String[] args)
	{
		int x;
		x = 10;

		if(x==10)
		{
			int y = 20;
			System.out.println("x & y: " + x + " " + y);

			x = y*2;
		}
		y = 100;
		//int y = 100;
		//error : Out of Scope
		System.out.println("y is " + y );
	}
}