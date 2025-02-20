package Anudip;

import java.util.ArrayDeque;

/*Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.*/
public class ArrayDequeEx {

	public static void main(String[] args) {
		
		// creating ArrayDeque to store book names
		ArrayDeque<String> b=new ArrayDeque<String>();
		
		//Adding book names to the deque
		b.add("Book 1");
		b.add("Book 2");
		b.add("Book 3");
		b.add("Book 4");
		
		System.out.println("Initial book shelf: "+b);
		b.addFirst("Book 0"); //Adding book to the first of the deque
		System.out.println("After adding book to the first: "+b);
		b.addLast("Book 5"); //Adding book to the last of the deque
		System.out.println("After adding book to the last: "+b);
		b.removeFirst(); //Removing book to the first of the deque
		System.out.println("After removing book from the first: "+b);
		b.removeLast(); //Removing book to the last of the deque
		System.out.println("After removing book from the last: "+b);
	}
}
/*Output:
Initial book shelf: [Book 1, Book 2, Book 3, Book 4]
After adding book to the first: [Book 0, Book 1, Book 2, Book 3, Book 4]
After adding book to the last: [Book 0, Book 1, Book 2, Book 3, Book 4, Book 5]
After removing book from the first: [Book 1, Book 2, Book 3, Book 4, Book 5]
After removing book from the last: [Book 1, Book 2, Book 3, Book 4]
*/