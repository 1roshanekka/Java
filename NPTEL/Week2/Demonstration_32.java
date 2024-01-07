//A program that declares two objects of the circle class

class Circle
{
	double x,y;
	double r;

	//Method that returns circumference
	double cicumference()
	{
		return 2*Math.PI*r;
	}

	//Method that returns area
	double area()
	{
		return Math.PI*r*r;
	}
}

//file name should be same as main class

class Demonstration_32
{
	public static void main(String[] args)
	{
		//class name should match #CaseSensitive
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		//multiple objects are declared for class Circle

		//Initialize the data values for object c1
		c1.x = 3.0;
		c1.y = 4.0;
		c1.r = 5.0;

		//Initialize the data values for object c2
		c2.x = -4.0;
		c2.y = -8.0;
		c2.r = 10.0;

		//method cicumference is accessed or called for object c1 of class Circle
		System.out.println("circumference circle 1 = " + c1.cicumference());
		//method area is accessed or called for object c1 of class Circle
		System.out.println("area circle 1 = " + c1.area());
		//method circumference of class Circle is called using object c2
		System.out.println("circumference circle 2 = " + c2.cicumference());
		//method area of class Circle is called using object c2
		System.out.println("area circle 2 = " + c1.area());
		
	}
}