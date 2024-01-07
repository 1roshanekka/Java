import java.util.*;
public class print {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to print even letters : ");
        String s1 = sc.next();
        evenDisplay(s1);
        sc.close();

    }

//Define evenDisplay(String) method here

   static void evenDisplay(String x){
        for(int i=0; i<x.length() ; i++){
            if(i%2==0){
                // System.out.print(x[i]);
                // the above will give error : array required, but String found

                System.out.print(x.charAt(i));
            }
        }
    }
}