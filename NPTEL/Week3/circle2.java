//example of static method

// a class method and instance method

public class circle2
{
	public double x,y,r;
	static int circlecount = 0;

	public circle2(double x , double y, double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;

		circlecount++;
	}

	public circle2(double c)
	{
		this(0.0 , 0.0 , r);
		circlecount++;
	}

	public circle2(circle2 c)
	{
		this(c.x , c.y , c.r);
		circlecount++;
	}

	public circle2()
	{
		this(0.0 , 0.0 , 0.1);
		circlecount++;
	}

	//an instance method. Return the bigger of two circles

	public circle2 bigger(circle2 c);
	{
		if(c.r>r)
		{
			return c;
		}
		else
		{
			return this;
			//else return current circle
		}
	}

	//a class method. Return the bigger of two classes

	public static circle2 bigger(circle2 a , circle2 b)
	{
		if(a.r>b.r)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static void main(String[] args)
	{
		circle2 a = new circle2(2.0);
		circle2 b = new circle2(3.0);

		circle2 c = a.bigger(b);
		//referring to object a(values)

		circle2 d = circle2.bigger(a,b);
		//class method
	}
}