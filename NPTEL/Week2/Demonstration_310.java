//The following program for the use of this() to avoid name space collision
class Student
{
	int rollno;
	String name, course;
	float fee;

	Student(int rollno, String name, String course)
	{
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		/* when imported using variable roll number it can't be used to print
		So other variable is used to store or use this.rollno to reuse the same variable */

	}

	Student(int rollno,String name, String course, float fee)
	{
		this(rollno, name, course);
		//reusing constructor

		this.fee = fee;
	}

	void display()
	{
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class Demonstration_310
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(111 , "ankit" , "java");
		//this type of format goes to line 8

		Student s2 = new Student(112 , "sumit" , "java" , 600);
		//this type of format goes to line 18

		//input defines which method is used , if method name are same i.e Student

		s1.display();
		s2.display();
	}
}