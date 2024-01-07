// a program that uses simple point class and naive initialisation of data

class Point
{
	int x;
	int y;
}

// this class declares an object of type Point

class Demonstration_34
{
	public static void main(String[] args)
	{
		Point mypoint = new Point();

		// assign values to my point's instance variable
		mypoint.x = 10;
		mypoint.y = 20;

		// access the values from my point's instance variable
		System.out.println("x " + mypoint.x);
		System.out.println("y " + mypoint.y);
	}
}