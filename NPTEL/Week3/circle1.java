// example of static variable 

public class circle1
{
	static int circlecount = 0;
	//class variable

	public double x,y,r;
	//instance variable;

	public circle1(double x , double y , double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public circle1(double r)
	{
		this(0.0 , 0.0 , r);
		circlecount++;
	}

	/*public circle1(circle c)
	{
		this(c.x , c.y , c.r);
		circlecount++;
	}
	*/
	public circle1()
	{
		this(0.0 , 0.0 , 0.1);
		circlecount++;
	}



	public double circumference()
	{
		return (2*Math.PI*r);
	}
	public double area()
	{
		return (Math.PI*r*r);
	}

	public static void main(String[] args) 
	{
		circle1 c1 = new circle1();
		System.out.println("c1# " + c1.circlecount); 

		circle1 c2 = new circle1(5.0);
		System.out.println("c2# " + c2.circlecount);

		circle1 c3 = new circle1(c1);
		System.out.println("c3# " + c3.circlecount);

		System.out.println("c1# " + c1.circlecount + "c2# " + c2.circlecount + "c3# " + c3.circlecount);
		
	}
}
/*ERROR circle1.java:55: error: incompatible types: circle1 cannot be converted to double
circle1 c3 = new circle1(c1);
^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/