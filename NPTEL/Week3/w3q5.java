import java.lang.*;

class men
{
	int walkingDistance(int weight)
	{
		System.out.println(10);
		return 10;
	}
}

class wildmen extends men 
{
	void walkingDistance(int weight)
	{
		System.out.println("20");
	}
}

public class w3q5
{
	public static void main(String[] args) 
	{
		wildmen wc = new wildmen();
		wc.walkingDistance(30);
	}
}