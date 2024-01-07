//class circle is created
class circle
{
	double x,y;
	double r;

	//method circumference in class circle returns circumference
	double circumference()
	{
		return 2*Math.PI*r;
	}

	//method area in class circle returns area
	double area()
	{
		return Math.PI*r*r;
	}
}

//class box is created
class box
{
	//data fields are initiated
	double width;
	double height;
	double depth;

	//method area defined in class box
	double area() //** NOTE THIS method area() created is unique from the method area() in class circle
	{
		double a;
		a = (width*height + height*depth + width*depth)*2 ;
		return a;
	}

	//method volume is declared
	double volume()
	{
		double v;
		v = width*height*depth;
		return v;
	}
}


//** Save the two classes in same file as Main Class
//Declaring objects of type circle and box

class Demonstration_33
{
	public static void main(String[] args)
	{
		//object c is created for class circle
		circle c = new circle();
		//object b is created for class box
		box b = new box();

		//value initialized for object c which will be used in class circle
		c.x = 3.0;
		c.y = 4.0;
		c.r = 5.0;

		//values intialized for object b which will be used in class box
		b.width = 3.0;
		b.height = 4.0;
		b.depth = 5.0;

		System.out.println("circumference of circle = " + c.circumference());
		//method circumference is called from class circle using the object c which was created
		System.out.println("area of circle = " + c.area());
		//method area is called from class circle using the object c which was created
		System.out.println("area of box = " + b.area());
		//method area is called from class box using the object b which was created
		System.out.println("volume of box = " + b.volume());
		//method volume is called from class box using the object b which was created
	}
}
