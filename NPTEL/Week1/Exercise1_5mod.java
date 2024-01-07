import java.util.Scanner;
public class Exercise1_5mod{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
        
        double mark_avg1 = 0;
         int result1=0;
        double max = 0;
        for(int j = (arr.length-1); j>=0 ; j--)
        {
            max = max+arr[j];

            if(arr[j]>result1)
            {
                result1 = arr[j];
            }
            
        }
        mark_avg1 = max/arr.length;
        System.out.println(result1);
        System.out.println(mark_avg1);
    }
}
for(i<10)
