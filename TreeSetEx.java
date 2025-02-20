package Anudip;

import java.util.TreeSet;

/*Write a program using TreeSet insert Integer values and print them.*/
public class TreeSetEx {

	public static void main(String[] args) {
		
		// creating TreeSet to store integer values
		TreeSet<Integer> num=new TreeSet<Integer>();
		
		//Adding integer value to the set
		num.add(10);
		num.add(5);
		num.add(7);
		num.add(15);
		num.add(5); //duplicate value will not be added
		
		System.out.println("TreeSet: "+num);
		
		System.out.println("The set contain 10 : "+num.contains(10)); //checking if value exist in the set(contains)
		
		num.remove(10); //removing value from the set
		
		System.out.println("TreeSet after removing 10: "+num);
		
		System.out.println("First element: "+num.first()); //getting the first element of the set
		
		System.out.println("Last element: "+num.last()); ////getting the last element of the set

	}

}
/*Output:
TreeSet: [5, 7, 10, 15]
The set contain 10 : true
TreeSet after removing 10: [5, 7, 15]
First element: 5
Last element: 15
*/