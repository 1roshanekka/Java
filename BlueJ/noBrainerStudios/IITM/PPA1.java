import java.util.*;

public class PPA1 {
    class rectangle{ 
        int w; // width 
        int h; // height
        
        public void setw(int x){
            w = x;
        }
        
        // function to initiate the function seth(int) to initialize h
        public void seth(int y){  // this doesn't return anything so its void 
            h = y;
        }
        
        // function to calculate the area() to return the area of input
        public int area(){
            return w*h;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        
        rectangle r = new rectangle();  // object created 
        
        r.setw(a); // calls method
        r.seth(b); // calls method 
        
        int area = r.area();
        
        System.out.println(area);
        sc.close();
    }
}
