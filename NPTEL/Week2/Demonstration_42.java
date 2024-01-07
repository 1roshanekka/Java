class Demonstration_42
{
	public static void main(String[] args) 
	{
		int x = 100;
		System.out.printf ("Printing sample integer : n = %d\n" , x);

		//this will print it upto 2 decimal places
		System.out.printf ("Printing with precision : PI = %.2f\n" , Math.PI);

		float n = 5.2f;
		//automatically appends zero to the right most part of decimal
		System.out.printf ("Formatted to specific width : n = %.4f\n" , n);

		float m = 67954.69f;
		// as data type is not able to accomodate large number it modifies it
		//here number is formatted from right margin and occupies a width of 20 characters
		System.out.printf ("Formatted to right margin : n = %.1f\n" , m);

	}
}