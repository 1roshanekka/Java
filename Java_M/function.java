import java.util.*;
class Rectangle{
    int w;    //width
    int h;    //height

    /* we cant have same function name */
    /* but we can have same constructor name - called constructor overloading */

    /* same copy constructor is when passing an object of same constructor to duplicate it  */


//LINE-1: write the function setw(int) to initialize w
	public void setw(int width){
        w = width; //no job, only initiate that scope of w in Rectangle is width which will be called in main function via a parameter of int type
    }
    // no need to write static as we dont call inside the *function* class
    // use static when you want to call from the class

//LINE-2: write the function seth(int) to initialize h

    public void seth(int height){
        h = height;
    }
	
//LINE-3: write the function area() to return area of rectangle

    // area(){
    //     return (w*h);
    // }
    //return type is missing
    int area(){
        return (h*w);
    }
}
public class function{
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        Rectangle r = new Rectangle();
        r.setw(w);
        r.seth(h);
        int area = r.area();
        System.out.print(area);
        sc.close();
    }
}