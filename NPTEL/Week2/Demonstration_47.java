import java.io.*;

class Demonstration_47
{
	public static void main(String[] args) throws exception
	{
		// use throw exception when try catch is not used
		Float principalAmount = new Float(0);
		Float rateOfInterest = new Float(0);

		int numberOfYears = 0;

		//try
		//{
			DataInputStream in = new DataInputStream(System.in);
			// here we can use find them to read from it

			String tempString;
			//temporary String
			System.out.print(" enter principal amount: ");
			System.out.flush();
			// clean the buffer so that no garbage will be inputted

			tempString = in.readLine();
			// who read bufferEnterNext line

			principalAmount = Float.valueOf(tempString);
			//convert tempString to float type

			System.out.println("Enter rate of interest: ");
			System.out.flush();
			tempString = in.readLine();

			rateOfInterest = Float.valueOf(tempString);
			System.out.println("Enter Number of years: ");
			System.out.flush();
			tempString = in.readLine();

			numberOfYears = Integer.parseInt(tempString);

			//"input is over now calculate interest

			float interestTotal = principalAmount*rateOfInterest*numberOfYears;
			System.out.print(" Total interest = " + interestTotal);
		//}
		//catch(Exception ex)
		//{}
	}
}