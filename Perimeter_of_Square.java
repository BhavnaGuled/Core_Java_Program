package Anudip;
/* write a program to find the perimeter of the square. */

import java.util.Scanner;
public class Perimeter_of_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking side of the square from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square: ");
		double side=sc.nextDouble();
		double perimeter= 4 * side; //Calculating the perimeter
		System.out.println("Perimeter of the Square: "+perimeter); //Displaying the result

	}

}

/* Output:
Enter the side of the square: 
25
Perimeter of the Square: 100.0
*/