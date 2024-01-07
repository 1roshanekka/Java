import java.util.*;
public class PalindromeNumber {

    public static int digits(int x) {
        if (x!=0) { // checker case
            while(x!=0) {
                x = x % 10 ;
            }       
        }
        
        return x;
    }
    public static boolean isPalindrome(int x) {
        return x;
        int flag = 0;
        int check = -11;
        while(check!=x) {

        }
        if (flag==1) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(a));
    }
}
