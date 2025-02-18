package Anudip;
/*Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.*/

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Arithmetic Exception Example:");
		
		//try block that may have exception
		try {
			int a=10;
			int b=0;
			int result=a/b;    //this is cause arithmetic exception that attempt to divide by zero
			}
		//catch block that handle the exception
		catch(ArithmeticException e)
			{
				System.out.println(e);  //printing the exception message
			}

	}

}
/*Output:
This is Arithmetic Exception Example:
java.lang.ArithmeticException: / by zero
 */