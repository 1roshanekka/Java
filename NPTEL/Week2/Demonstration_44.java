//Program to check for command line arguments 

class Demonstration_44
{
	public static void main(String[] args) 
	{
		//check if length of args array is greater than 0
		if(args.length>0)
		{
			System.out.println("The command line " + "argument are : ");

			for(String val: args)
			{
				System.out.println(val);
			}
		}	

		else
		{
			System.out.println("No command line " + "arguments found");
		}
	}
}