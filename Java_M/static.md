if a method is called from static main

then the method should itself have static content

---

non-static method evenDisplay(String) cannot be referenced from a static context

```
import java.util.*;
public class print {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        evenDisplay(s1);

    }

//Define evenDisplay(String) method here

   void evenDisplay(String x){
        for(int i=0; i<x.length() ; i++){
            if(i%2==0){
                // System.out.print(x[i]);
                // the above will give error : array required, but String found

                System.out.print(x.charAt(i));
            }
        }
    }
}

```


---

the correct code should include static void