import java.util.*;

public class PPA2 {

    public static void evenDisplay(String x){
        for( int i = 0 ; i <x.length() ; i+=2 ){  // printing characters at even indices
            System.out.println(x.charAt(i));
        }
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        evenDisplay(s1);
        sc.close();
    }

}

/* 

import java.util.*;

public class PPA2 {

    public void evenDisplay(String x){
        for( int i = 0 ; i <x.length() ; i+=2 ){  // printing characters at even indices
            System.out.println(x.charAt(i));
        }
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        evenDisplay(s1); 
        //this cannot make a static reference to the non static method evenDisplay(Srtring) from type PPA2
        //this means the method should be static so -> public static void

        sc.close();
    }

}

*/

