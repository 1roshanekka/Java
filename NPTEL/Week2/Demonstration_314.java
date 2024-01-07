/* Demonstration of constructor overloading */

//Two constructors can be treated as different if they are different in terms of argument, no. of arguments and type of arguments
class circle 
{
	 double x,y;
	 double r;

	 circle(double x, double y, double r)
	 {
	 	this.x = x;
	 	this.y = y;
	 	this.r = r;
	 }

	 circle(double r)
	 {
	 	this(0.0 , 0.0 , r);
	 	//3 argument and this() method used so it will go to line 8
	 }

	 circle(circle c)
	 {
	 	this(c.x , c.y , c.r );
	 }

	 circle()
	 {
	 	this(0.0 , 0.0 , 1.0);
	 }

	 double circumference()
	 {
	 	return 2*Math.PI*r;
	 }
	 double area()
	 {
	 	return Math.PI*r*r;
	 }
}

class Demonstration_314
{
	public static void main(String[] args) 
	{
		circle c1 = new circle(1, 2, 3);
		circle c2 = new circle(5);
		circle c3 = new circle(c1);
		circle c4 = new circle();

		System.out.println(c1.area());
		System.out.println(c2.area());
		System.out.println(c3.area());
		System.out.println(c4.area());
	}
}