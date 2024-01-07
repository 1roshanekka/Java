//program to demonstrate use of this() to invoke current class method

class A
{
	void m()
	{
		System.out.println("Hello m");
	}

	void n()
	{
		System.out.println("Hello n");
		this.m();
		//also call method m() while in n()
		//to access the method in same class we can resolve by specifying this.m()
	}
}

class Demonstration_312
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m();
		a.n();
	}
}
//*** Use this() method . NO need to create object
