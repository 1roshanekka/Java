import java.util.*;

public class A1742 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		for ( int i = 0 ; i < t ; i ++ ) {
			int a,b,c = 0;
			a = sc.nextInt(); 
			b = sc.nextInt();
			c = sc.nextInt();

			int case1 = a+b;
			int case2 = b+c;
			int case3 = c+a;
			
			int flag = 0;

			if ( case1 == c ) {
				flag = 1;		
			}
			else if ( case2 == a ) {
				flag = 1;
			}
			else if ( case3 == b ) {
				flag = 1;
			}
			
			if ( flag==1 ) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		 
		sc.close();

		
	}
}
