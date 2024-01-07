/* A variable declared inside a pair of brackets or in a method 
	has scope within the brackets only
*/

public class Demonstration_58
{
	public static void main(String[] args) 
	{
		{
			//the variable x has scope within brackets
			int x = 10;
			System.out.println(x);
		}	

		//uncommenting the below line would produce error since variable x is out of scope

		//System.out.println(x); 
	}
}