package Anudip;
/* Write a java program to check given number is perfect number or not.*/

import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, i, sum=0;// Declaring variables
		
		//Taking input number from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
	    num=sc.nextInt();
		
		for(i=1; i<num; i++)//Loop to check all possible divisors of the number
		{
			//If i is divisor of number, add it to sum 
			if(num%i==0)
			{
				sum=sum+i;
				
			}
		}
		if(sum==num) //Check if su is equal to num then the given number is perfect number
		{
			System.out.println(num+" is a Perfect Number"); //Display the result if condition true
		}
		else
		{
			System.out.println(num+" is not a Perfect Number"); //Display the result if condition false
		}
	}
}
/* Output:
Enter the Number: 
28
28 is a Perfect Number
Enter the Number: 
5
5 is not a Perfect Number
*/
