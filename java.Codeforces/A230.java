import java.util.*;


// dont set a file or class name starting with number like 230A , instead use A230
public class A230 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // strength 
        int n = sc.nextInt(); // number of iterations

        
        // we need possible way to clear levels
        // we can't take random loops to find all possible ways by permutations and combinations
        // rather sort them and gradually defeat the lower power and get bonus

        
        // System.out.println(s);
        // System.out.println(n);

        // store
        int arr[][] = new int[n][2]; // declaring array

        for ( int j = 0 ; j < n; j++) {
            int ds = sc.nextInt();
            int bonus = sc.nextInt();
            arr[j][0] = ds;
            arr[j][1] = bonus;
        }
        // System.out.println("Done Input");

        // selection sort

        for (int j = 0 ; j < n ; j++) {
            // did only one loop , it wont gonna fix 
            for ( int i = 0 ; i < n-1 ; i++){
                if (arr[i][0]>=arr[i+1][0]) {
                        
                    // ascending order so >=
                    int dummyStrength = arr[i][0];
                    int dummyBonus = arr[i][1];

                    arr[i][0] = arr[i+1][0]; // assuming it also swaps the bonus value in array
                    arr[i][1] = arr[i+1][1];

                    arr[i+1][0] = dummyStrength;
                    arr[i+1][1] = dummyBonus;
                }
                else {
                    continue ;
                }
            }
        }
        // System.out.println("Done Sort");


        // check sorted array

        /* 
        System.out.println();
        for ( int j = 0 ; j < n; j++) {
            for ( int i = 0 ; i < 2 ; i++ ) { // 2 because of opponent and bonus
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        */
        

        // System.out.println("Done Print");

        int flag = 0;
        for ( int i = 0 ; i < n ; i++){
            if(s > arr[i][0]) {
                s = s + arr[i][1]; // added bonus
            }
            else {
                flag = 1;
                break;
            }
        }

        // to call from sort class we need an object
        /*
        sort obj1 = new sort();
        obj1.sort(arr[], n , s);
        */

        /*
        for ( int j = 0 ; j < n; j++){
            for ( int i = 0 ; i < 2 ; i++ ) {

                arr[j][i] = ds;

            if( s>=ds ){
                s = s + bonus;
            }
            else {
                flag = 1;
            }
        }
         */

        // System.out.println("--");

        if ( flag == 1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

        sc.close();
    }
}
