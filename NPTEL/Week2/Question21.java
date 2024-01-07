// This is the class named School
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}
public class Question21{ 
    public static void main(String args[])
    {
       // Create an object of class Student

       // Call 'print()' method of class Student 

       // Create an object of class School

       // Call 'print()' method of class School
       // Student is class and s is new object created
        Student s = new Student();
        School s1 = new School();
       // object created

       //method print() is called from class using object s from class School
       //method print() is called from class using object s1 from class Student
       s.print();
       s1.print();


     } 
}