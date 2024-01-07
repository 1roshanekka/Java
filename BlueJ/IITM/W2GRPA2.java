import java.util.*;

class Employee {

    String ename;
    String eid;
    String edept;
    
    public Employee() {  // constructor has same name as that of the class name
        ename = "guest";
    }

    public Employee(String name, String id, String dept) {
        ename = name;
        eid = id;
        edept = dept;
    }

    public void copyDept(Employee obj) {
        edept = obj.edept;
    }

    public void displayDetails() {
        System.out.println("ename : " + ename);
        System.out.println("eid : " + eid);
        System.out.println("edept : " + edept);
    }

}

public class W2GRPA2 {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee(); // object is created

        String name = sc.nextLine(); // Enter name of the employee
        String id = sc.nextLine(); // Enter id of the employee
        String dept = sc.nextLine(); // Enter department of the employee

        Employee e2 = new Employee(name,id,dept); 

        e1.copyDept(e2); // Copies the department name of e2 into e1's department name.

        e1.displayDetails();

        sc.close();

    }
}

/*

    public Employee() {  // constructor has same name as that of the class name
        ename = "guest";
    }

    Employee(String name, String id, String dept) {
        ename = name;
        eid = id;
        edept = dept;
    }

    // the above two are Methods but with different signatures 

*/