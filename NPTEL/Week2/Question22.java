// This is the class named Printer
class Printer 
{ 
    // This are the methods in class Printer
    public void print() 
    { 
		System.out.println("Hi! I class SCHOOL."); 
    } 


    public void print(String s) 
    { 
		System.out.println(s); 
    } 


} 

public class Question22
{ 
    public static void main(String[] args) 
    {    

        // Create an object of class Printer

        // Call 'print()' methods for desired output
        Printer s = new Printer();
        s.print("Hi! I am class STUDENT");
        //** HERE IT TAKES ARGUMENT AD STRING SO IT WILL INVOKE PRINT METHOD OF THAT PARTICULAR THOUGH ITS NAME ARE SAME 
        Printer a = new Printer();
        a.print();
        
        //object a  is created from class Printer



        
    }
}

