
**declare method**

``` 
    evenDisplay(String x){
        for(int i=0; i<x.length() ; i++){
            if(i%2==0){
                // System.out.print(x[i]);
                // the above will give error : array required, but String found
                System.out.print(x.charAt(i));
            }
        }
    }
``` 

---
invalid method declaration; return type required

---

# void

This is used for methods which dont have any return value

every function in java expects some return value unlike python

so void is necessary for no returns

---

correct code

---

```
    void evenDisplay(String x){
        for(int i=0; i<x.length() ; i++){
            if(i%2==0){
                // System.out.print(x[i]);
                // the above will give error : array required, but String found

                System.out.print(x.charAt(i));
            }
        }
    }
```