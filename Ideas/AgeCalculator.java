;(import java.util.Scanner;
class AgeCalculator
    {//Opening of class
        public void disp()
        {
            Scanner sl = new Scanner(System.in);
            
            System.out.println("Enter Your BirthYear");
            long y = sl.nextLong();
            
            System.out.println("Enter Todays Year");
            long y1 = sl.nextLong();
            
            System.out.println("Your age is "+(y1-y));
        }
    }