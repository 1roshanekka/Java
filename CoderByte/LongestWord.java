import java.util.*; 
import java.io.*;

class LongestWord 
{

  public static String LongestWord(String sen) 
  {
    // code goes here
    int j = s.length;
    String word [] =  s;

    for(int i=0 ; i<j ; i++)
    {
      int a = word[i].length;
      int b = word[i+1].length;
    }
    return sen;
  }

  public static void main (String[] args) 
  {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }
  
}
/*

    String [] word = LongestWord();
    for(int i=word.length ; i>=0 ; i--)
    {
      int a = word[i].length;
      int b = word[i-1].length;
      if(a>b)
      {
        String res = args[i];
      }
    }
    System.out.println(res);
  }
  */