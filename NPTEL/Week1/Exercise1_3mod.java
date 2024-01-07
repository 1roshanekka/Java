import java.util.Scanner;
public class Exercise1_3mod{
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
//Use for or while loop do the operation.
if (n>=0)
{
for (int i=0; i<=n*2; i++)
{
  if(i%2==0)
  {
    if(i%3==0)
    {
      sum = sum + i;
    }  
  }
}
System.out.print(sum);
}
       }
      }


