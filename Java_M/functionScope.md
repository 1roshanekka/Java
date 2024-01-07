```
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

    int area(){
        return (h*w);
    }
    // dont do void int as it wont return anything
}

---

area(){
    return (w*h);
}

here return type is missing
so 
int area(){
    return(w*h);
}

---

public void seth(int height){
        height = h;
    }

here height is being initialised to h BUT as we are calling this from main function of DIFFERENT class 
so it has to be the variable comming from there which needs to be initialised for calculation in this function of Rectangle 

correct code
public void seth(int height){
        h = height;
    }


---

if you dont mention public then other class calling this function wont be given access to the data 

---
