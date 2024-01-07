import java.util.Scanner;
public class menu2
 {
     public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         int a,b,n,ar,pm;
         double d;
         System.out.println("Enter Length and Breadth of a rectangle");
         a=in.nextInt();
         b=in.nextInt();
         System.out.println("Enter 1 for area ; 2 for perimeter; 3 for diagonal");
         System.out.println("Enter your choice");
         n=in.nextInt();
         switch(n)
         {
             case 1:
             ar = a*b;
             System.out.println("Area of rectangle ="+ar);
             break;
             
             case 2:
             pm = 2*(a+b);
             System.out.println("Perimeter of rectangle ="+ pm);
             break;
             
             case 3:
             d=Math.sqrt(a*a+b*b);
             System.out.println("Diagonal of rectangle ="+d);
             break;
             
             default:
             System.out.println("Wrong Choice!");
            }
        }
    }
    