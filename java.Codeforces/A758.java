import java.util.*;

public class A758 {
	public static void main( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		int n = sc.nextInt();
		
		long arr[] = new long[n];
	
		for ( int i = 0 ; i < n ; i++ ) {
			long x = sc.nextLong();
			
			arr[i] = x;
			
		}
			
		long max = 0;
		// this cant find the max if one item present

		if(arr.length == 1){
			max = arr[0];
		}
		else {
			for ( int i = 0 ; i < n ; i++ ) {
				// if( arr[i] < arr[i+1] ) {
				// 	max = arr[i+1];
				// }
				if ( max < arr[i]) {
					max = arr[i];
				}
			}
		}
		System.out.println(max);

		long money = 0;
		for ( int i = 0 ; i < n ; i++ ) {
			money = money + ( max - arr[i] );
			// System.out.println(money);
		}
		
		System.out.println(money);
		
		sc.close();
	}
}
