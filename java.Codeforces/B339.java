import java.util.*;

public class B339 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); // number of houses
		int m = sc.nextInt(); // m things to do
		
		long arr[] = new long[m]; // creating array
			
		long dist = 1; // initially at house 1
		for ( int i = 0 ; i < m ; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		
		// intial 
		dist = arr[0] - dist;

		for ( int j = 0 ; j < m-1 ; j++) {
			if( (arr[j] - arr[j+1]) > 0 ) {
				dist = dist + ( n - arr[j] ) + arr[j+1];
			}
			else {
				dist = dist + (arr[j+1] - arr[j]) ;
			}
		}
		System.out.println(dist);
		sc.close();
	}
}

