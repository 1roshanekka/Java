import java.util.Scanner;


//Write a class with name volume using function overloading that computes the
//volume of cube, a sphere, a cuboid


//Method overloading is a feature of Java in which a class 
//has more than one method of the same name and their parameters are different.”
// ... When more than one method of the same name is created in a Class, this type of method is called Overloaded Methods
class volume
{
	double v(double s)
	{
		return s*s*s;
	}

	double v(double r, double a)
	{
		return (4/3)*Math.PI*r*r*r;
	}

	double v(double l , double b, double h)
	{
		return l*b*h;
	}

}

class volumeOverload
{
	public static void main(String[] args) 
	{
		volume v1 = new volume();
		volume v2 = new volume();
		volume v3 = new volume();

		v1.v(3);
		v2.v(3,2);
		v3.v(2,2,2);
		// Only this will execute the method and return but will not print

		System.out.println(v1.v(3));
		System.out.println(v2.v(3,2));
		System.out.println(v3.v(2,2,2));
		//this is actual input which will get output
	}
}


//constructor overloading is uselfull to initilize values and then execute area method by calling it in main method