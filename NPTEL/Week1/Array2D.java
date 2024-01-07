import java.lang.*;
 	class Array2D
 		{
 			public static void main(String[] args) 
 			{
 				int a[] = {10,20,30,40,50};
 				//initializing
 				//traversing array

 				for(int i=0 ; i<a.length ; i++)
 				{
 					System.out.print(a[i] + " ");
 				}
				 System.out.println();
 				//average calculations
 				float sum=0;
				float avg=0;

 				for(int i=0 ; i<a.length ; i++)
 				{
 					sum = sum+ a[i];
 					avg = sum/a.length;
 					
 				}
				System.out.println("Average = " + avg);
 			}
 		}