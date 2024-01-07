import java.util.*;

public class A1703 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for ( int i = 0 ; i < n ; i++ ) {
			String x = sc.next();
			var a = x.charAt(0);
			var b = x.charAt(1);
			var c = x.charAt(2);
			// dont use "" it means string 
			// use '' it means character
			if ( ( a == 'y' || a == 'Y' ) && (b == 'e' || b == 'E') && ( c == 's' || c == 'S' ) ) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}