import java.util.*;
import java.lang.*;
import java.io.*;

public class A381 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// as the cards are distinct we can sort them and the players can pick alternatively
		
		// int arr[] = new int[n]; // creating array
		
		Deque<Integer> deque = new LinkedList<>();

		for ( int i = 0 ; i < n ; i ++ ) {
			int num = sc.nextInt();
			deque.addLast(num);

			//int num = sc.nextInt();
			//arr[i] = num;
		}

		// Sereja picks first then Dima and this order continues
		int serejaScore = 0 ;
		int dimaScore = 0;
		
		
		int count = 0 ;
		while ( deque.size() > 0 ) {
			int f = deque.peekFirst();
			int l = deque.peekLast();
			
			// System.out.println(f);
			// System.out.println(l);
			// System.out.println("--");

			int add = 0;
			if( count%2==0 ) {
				if ( f>l ) {
					add = deque.removeFirst();
				}
				else {
					add = deque.removeLast();
				}
				
				serejaScore = serejaScore + add;
			}
			else {
				if ( f>l ) {
					add = deque.removeFirst();
				}
				else {
					add = deque.removeLast();
				}
				dimaScore = dimaScore + add;	
			}
			count++;
		}
	
		// printing score

		System.out.println(serejaScore);
		System.out.println(dimaScore);		
		
		sc.close();
	}
}
