package Anudip;
/*Write a program demonstrating multiple catch statements and finally block.*/
public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is example of MultipleCatch and Finally block:");
		
		//try block that may have exception 
		try {
			int ans=10/0;  //attempt to divide by zero arithmetic exception 
			}
		//catch block that handle arithmetic exception
		catch(ArithmeticException e)
		{
			System.out.println(e); //printing exception message
		}
		//catch block that handle null pointer exception
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		//catch block that handle number format exception
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");	
		}
		//catch block that handle array index out of bounds exception
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		//catch block that handles other exceptions
		catch(Exception e)
		{
			System.out.println("Global Exception");

		}
		//finally block that will always executed
		finally
		{
			System.out.println("Finally block executed.");//printing message
		}
	}
}
/*Output:
This is example of MultipleCatch and Finally block:
java.lang.ArithmeticException: / by zero
Finally block executed.
*/
