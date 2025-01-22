package Anudip;
/* Write a program to check given number is prime number or not. */

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, i, count=0; //Declaring variables
		
		//Taking input number from user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		
		for(i=1; i<=num; i++) //Loop to check factors 1 to num
		{
			if(num%i==0) //checking if number is divisible by i
			{
				count++;  // increment count if divisible
			}
		}
		
		if(count==2) // check if the number is prime(it has exactly two factors:1 and itself)
		{
			System.out.println(num+" is a Prime Number."); //Display result if condition true 
		}
		else
		{
			System.out.println(num+" is not a Prime Number.");//Display result if condition false
		}
	}
}
/* Output:
Enter the Number: 
5
5 is a Prime Number.
Enter the Number: 
8
8 is not a Prime Number.
*/