/*

Write a program to find the sum of the following series up to n terms.
1^2 + ( 1^2 + 2^2 ) + ( 1^2 + 2^2 + 3^2 ) + ......... + ( 1^2 + 2^2 + .... + n^2 )

*/

import java.util.*;

public class W2GRPA1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int tot = 0;
        for( int i=1 ; i<=n ; i++) {
            int sum = 0;
            for( int j=1 ; j<=i ; j++){
                int sq = j*j;
                sum = sum + sq;
            }
            tot = tot + sum;
        }
        System.out.println(tot);
    }
}
