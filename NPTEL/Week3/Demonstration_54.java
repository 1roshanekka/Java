/* Loop exmaple with continue */

class Demonstration_54
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i<10 ; i++)
		{
			System.out.print(i + " ");

			if(i%2 == 0) 
			{
				continue;
			}
			System.out.println(" ");
            //goes to next line
		}	
	}
}