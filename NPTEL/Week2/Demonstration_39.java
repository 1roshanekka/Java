/*Demonstration of Constructor overloading
 Editing Demonstration_39.java
*/

class Circle
{
	double x,y;
	double r;

	//if object is created and 3 arguments are passed then this will be called
	Circle(double a , double b , double c)
	{
		//automatic initialization of 3 arguments using constructor
		x = a;
		y = b;
		r = c;
	}

	//if we call with one argument then this will be caleed
	Circle(double c)
	{
		//Java Runtime Compiler will automatically understand that this should be invoked
		x = 0;
		y = 0;
		r = c;
	}

	//here we pass argument which is object itself
	// insured duplicate object with same data value
	Circle(Circle c)
	{
		x = c.x;
		y = c.y;
		r = c.r;
	}

	//default constructor - no arguments
	Circle()
	{
		x = 0.0;
		y = 0.0;
		r = 1.0;
	}

	//method to return circumference
	double circumference()
	{
		return 2*Math.PI*r;
	}

	//method to return area
	double area()
	{
		return Math.PI*r*r;
	}
}

class Demonstration_39
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(3.0 , 4.0 , 5.0);

		Circle c2 = new Circle(10.0);

		Circle c3 = new Circle(c1);

		Circle c4 = new Circle();

		System.out.println("circumference circle 1 = " + c1.circumference());
		System.out.println("area circle 1 = " + c1.area());
		System.out.println("circumference circle 2 = " + c2.circumference());
		System.out.println("area circle 2 = " + c2.area());
		System.out.println("circumference circle 3 = " + c3.circumference());
		System.out.println("area circle 3 = " + c3.area());
		System.out.println("circumference circle 4 = " + c4.circumference());
		System.out.println("area circle 4 = " + c4.area());

	}
}
