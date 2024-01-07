//Encapsulation: Defining a class with method
class Point
{
	int x,y;
	//defined method setPoint

	//no need to define like double setPoint() just use void
	void setPoint()
	{
		//here it initialisation value 
		//earlier we did that in when class
		x = 10;
		y = 10;
	}
}
//Definition of another class. This is main class

class Demonstration_35
{
	public static void main(String[] args) 
	{
		//object p is created for class Point
		Point p = new Point();

		p.setPoint();
		//if this method is NOT called then x,y values were 0 as int x,y is initialized

		//this executes the method setPoint which in turn initialises by going to line 8
		System.out.println("x = " + p.x);
		//p.x is initialized as 10 
		// if simply x is written instead of p.x it couldn't find the symbol
		System.out.println("y = " + p.y);
	}
}