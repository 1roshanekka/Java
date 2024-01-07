import java.util.Scanner;
public class menu
{
    public static void main(String args[])
    {
        //in <- is the input
        //if Scanner SL then  n=SL.nextInt();
        Scanner in = new Scanner(System.in);
        //declare variables
        int a,b,c,d,e,f,g,h,n;
        System.out.println("Welcome");
        System.out.println("Menu:");
        System.out.println("Enter 1 for AgeCalculator");
        System.out.println("Enter 2 for Pattern");
        n=in.nextInt();
        switch(n)
        {
            case 1:
            Scanner sl = new Scanner(System.in);
            
            System.out.println("Enter Your BirthYear");
            long y = sl.nextLong();
            
            System.out.println("Enter Todays Year");
            long y1 = sl.nextLong();
            
            System.out.println("Your age is "+(y1-y));
            System.out.println("Thank You");
            break;
            
            case 2:
            System.out.println("Thank You");
            break;
            
            default:
            System.out.println("Pattern is being developed, Please Wait!");
        }
    }
}
            
        
    