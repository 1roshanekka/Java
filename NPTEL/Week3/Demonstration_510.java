class Demonstration_510
{
	public static void main(String[] args) 
	{
		int x;
		//x is defined outside scope

		for(x=0 ; x<4 ; x++)	
		{
			System.out.println(x);
		}
		System.out.println(x);
	}
}