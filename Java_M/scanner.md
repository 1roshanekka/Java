```
Scanner sc = new Scanner(System.in);
System.out.print("Enter a word to print even letters : ");
String s1 = sc.next();
evenDisplay(s1);
```

Resource leak: 'sc' is never closed

so close the scanner

---
sc.close();
