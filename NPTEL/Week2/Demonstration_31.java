// A program that uses the Circle class
//Call this file Demonstration_31.java
class Circle
{
    double x,y; 
    //Coordinates of center of the circle
    double r;
    //radius of the circle

    //Method that returns circumference
    double circumference()
    {
        return 2*Math.PI*r;
    }

    //method that returns area
    double area()
    {
        int b = 2;
        return (Math.PI)*Math.pow(r, b);
    }
    
}

//following class declares an object of type circle
// Main class name same as file name
class Demonstration_31
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        //object c is declared

        //values inputted 
        c.x = 0.0;
        c.y = 0.0;
        c.r = 5.0;

        System.out.println("circumference = " + c.circumference());
        //we call the method cicumference using the object c of class circle
        System.out.println("area = " + c.area());
        //we call the method area using the object c of class circle
    }
}