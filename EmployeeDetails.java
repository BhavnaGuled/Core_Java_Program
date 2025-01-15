package Anudip;
/* Write a java program to take employee id, name, address & salary from user and display on to screen.*/

import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		//Taking Employee Details from user
		System.out.println("Enter Employee ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Employee Address: ");
		String address=sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		double salary=sc.nextDouble();
		
		//Displaying the Employee Details
		System.out.println("***Employee Details***");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);

	}

}
/* Output:
Enter Employee ID: 
5
Enter Employee Name: 
Bhavna
Enter Employee Address: 
Solapur
Enter Employee Salary: 
50000
***Employee Details***
ID: 5
Name: Bhavna
Address: Solapur
Salary: 50000.0
 */
