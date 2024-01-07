import java.util.Scanner;

//class
class findCube
{
	int c = 3;
	double result;
	
	//method
	double calculate(double x1)
	{
		result = Math.pow(x1, c);
		return result;
	}	
}

//main class
class Cube
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its cube");
		double x = sc.nextDouble();

		findCube c1 = new findCube();
		//object created for class findCube

		double result = c1.calculate(x);
		//method calculate is called using c1 object of class findCube 

		System.out.println("The cube of " + x +" = " + result);
	}
}