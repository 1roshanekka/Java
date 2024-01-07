import java.util.*;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for ( int i = 0 ; i <= s.length() ; i++) {
            if ( i%2==0 ) {
                System.out.println(s.charAt(i));
            }
        }
        sc.close();

    }
}
