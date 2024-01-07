import java.util.*;

public class christmasPattern {
    
    public static void main(String[] args){
        String x = "";
        int count = 1;
        // row
        for ( int i = 6 ; i >= 0 ; i--) { // 6 times
            int a = 0;
            for ( int j = i ; j > 0 ; j--) { // 5 times gap
                System.out.print(" ");
            }
            if(i%2==0) {
                    x = "*";
                }
            else {
                x = "#";
            }

            while(a!=count){
                System.out.print(x);
                a++;
            }
            count ++;
            System.out.println();
        }
    }
}


    /* Alternatively 
        for ( int i = 0 ; i <= 6 ; i++ ){

            for ( int j = 6 ; j >= 0 ; j--) {
                if(j%2==0){
                    x = "*";
                }
                else {
                    x = "#";
                }
            }
        }
     * 
     * 
    */
