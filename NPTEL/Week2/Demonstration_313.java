/* Special use of this keyword: No object creation to invoke method */

class A
{
	A()
	{
		this(5);
		//this method A() but include 5 in it so = A(5) hence it goes to line 12
		System.out.println("hello a");
	}

	A(int x)
	{
		System.out.println(x);
	}
}

class Demonstration_313
{
	public static void main(String[] args)
	{
		A a = new A();
	}
}