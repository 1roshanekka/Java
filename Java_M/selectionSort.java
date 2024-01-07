import java.util.Scanner;

class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x for number of arrays : ");
        int x = sc.nextInt(); // number of array inputs

        System.out.print("Input n for number of elements in an arrays : ");
        int n = sc.nextInt(); // number of elements in an array
        
        

        int arr[][] = new int[x][n];
        // declaring 2D array
        
        for ( int i = 0 ; i < x ; i++) {
            for ( int j = 0 ; j < n ; j++){
                int y = sc.nextInt();
                arr[i][j] = y;
            }
        }
        System.out.println();
        // for ( int i = 0 ; i < n ; i++)
        for ( int i = 0 ; i < x ; i++) {
            for ( int j = 0 ; j < n ; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

        // sort for 1d 
        convet to 2d
        
        for (int i = 0 ; i < n ; i++){
            for ( int j = 0 ; j < n-1 ; j++){
                if(arr[j]>=arr[j+1]) {
                    // ascending order so >=
                    int dummy = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = dummy;
                }
                else {
                    continue ;
                }
            }
        }
    }

    sc.close();
}
}