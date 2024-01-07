/*Encapsulation: Defining a class having method with parameter*/

class Point
{
	//data member initialized
	int x,y;

	void setPoint(int a , int b)//this part takes argument
	//void is used instead of double setPoint because it doesnot hold any task to store 
	{
		//data members are alloted different values
		x = a;
		y = b;
		//a from argument is converted to x 
	}

}

//definition of another class. This is main class

class Demonstration_36
{
	public static void main(String[] args)
	{
		//object p is created for class Point
		Point p = new Point();

		p.setPoint(15,20);
		//method setPoint is called with ARGUMENTS

		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);
		//data value is accessed for using object p from class Point
	}
}