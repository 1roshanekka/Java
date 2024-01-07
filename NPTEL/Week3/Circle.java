import java.util.Scanner;

public class Circle extends Point
{	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		Point p1 = new Point();
		p1.x=sc.nextDouble();
		p1.y=sc.nextDouble();

		Point p2 = new Point();
		p2.x=sc.nextDouble();
		p2.y=sc.nextDouble(); 

        Circle c1=new Circle();
    	c1.distance(p1,p2);
	}
}
class Point
{
	double x,y;
	public static void distance(Point p1 , Point p2)
	{
			double n =2;
			double a = p1.x;
			double b = p1.y;
			double c = p2.x;
			double d = p2.y;
			double f = (a-c);
			double g = (b-d);
			double i = Math.pow(f,n) + Math.pow(g,n);
			double dist = Math.sqrt(i);
			System.out.print(dist);
	}
}



    /*class Point
	{
		double x,y;
		/*this.distance();
		
            }
		
	}
		*/

    


	/*double distance(double a , double b)
	{

	}
	*/

//Complete the code segment to define a class Point with parameter x,y and method distance()for calculating distance between two points.
//Note: Pass objectsof type class Point as argument in distance() method. 


