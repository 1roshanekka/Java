/* Encapsulation : Utilization of objects in a program */

class Point
{
	int x,y;

	void getPoint(int a, int b)
	{
		x = a;
		y = b;
	}
}

//definition of another class. This is main class

class Demonstration_37
{
	static double distance;
	public static void main(String[] args)
	{
		Point p1 = new Point();
		Point p2 = p1;
		Point p3 = new Point();
		Point p4 = new Point();

		p1.getPoint(5,10);
		p2.getPoint(15,20);
		p3.getPoint(20,30);
		p4.getPoint(30,40);

		System.out.println("x1 = " + p1.x + " y1 = " + p1.y);
		System.out.println("x1 = " + p2.x + " y1 = " + p2.y);
		System.out.println("x1 = " + p3.x + " y1 = " + p3.y);
		System.out.println("x1 = " + p4.x + " y1 = " + p4.y);
	}
}