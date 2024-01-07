//A java program to demonstrate working of constructor in java

class Circle
{
	double x,y;
	double r;

	double Circumference()
	{
		return 2*Math.PI*r;
	}

	double area()
	{
		return Math.PI*r*r;
	}

	Circle(double a , double b , double c)
	{
		x = a;
		y = b;
		r = c;
	}
}

class Demonstration_38
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(3.0,4.0,5.0);
		Circle c2 = new Circle(-4.0,8.0,10.0);

		System.out.println("Circumference Circle 1 " + c1.Circumference());
		System.out.println("area Circle 1 " + c1.area());
		System.out.println("Circumference Circle 2 " + c2.Circumference());
		System.out.println("area Circle 2 " + c2.area());
	}
}