/* Loop example with break */

class Demonstration_55
{
	public static void main(String[] args) 
	{
		for(int i=1 ;  ; i++)
		//will run for infinite times due to missing condition
		{
			if(i%999999==0)
			{
				break;
				//terminates the loop
			}
			System.out.println("i : " + i);			
		}	
		
		System.out.println("Loop Complete");
	}
}