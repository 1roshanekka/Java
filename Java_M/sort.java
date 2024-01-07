import java.util.Scanner;

class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x for the number of arrays: ");
        int x = sc.nextInt(); // number of array inputs

        System.out.print("Input n for the number of elements in an array: ");
        int n = sc.nextInt(); // number of elements in an array

        int arr[][] = new int[x][n]; // declaring 2D array

        for (int i = 0; i < x; i++) {
            System.out.println("Input elements for array " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                int y = sc.nextInt();
                arr[i][j] = y;
            }
        }

        // Printing the arrays
        System.out.println("Arrays:");
        for (int i = 0; i < x; i++) {
            System.out.print("Array " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Print a newline after each array
        }

        sc.close();
    }
}
