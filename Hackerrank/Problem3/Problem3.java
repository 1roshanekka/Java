import java.util.Scanner;
	
	public class Problem3
	{
        public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			double b = scan.nextDouble();
            //important part
            Scanner sc = new Scanner(System.in);
			String x = sc.nextLine();
            scan.close();

			System.out.println("String: " + x);
			System.out.println("Double: " + b);
			System.out.println("Int: " + a);
		}

	}