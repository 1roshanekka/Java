// This is the main class Question
public class Question24
{    public static void main(String[] args)
    {
		Answer a = new Answer(10,"MCQ");
	}
}
class Answer
{
	Answer()
    //will execute automatic without an argument
    {
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type)
    //if argument given with the format int then String
    {		
        this();
		System.out.println("You got "+marks+" for an "+ type);
	}
}


