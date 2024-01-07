import java.util.Scanner;

class StringLength
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        //initialize array
        /*String [] w = word;

        for(int i=0 ; i<w.length ; i++)
        {
            int c = 0;
            int b = w[i].length;
            c = b+c;
        }
        */

        int a = word.length();
        System.out.println("The String " + word + "has length = " + a);
        //System.out.println("The String " + word + "has length = " + c);
    }
}
