package Anudip;
/*Write a program using exception handling to handle array index out of bounds.*/

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5]; //array with 5 elements
		
		System.out.println("This is example of ArrayOutOfBounds Exception:");
		//try block that may have exception
		try
		{
			System.out.println("Access element at index 10:"+arr[10]); //exception that attempt to access an element at index 10(out of bounds)
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e); //Printing the exception message
		}

	}

}
/*Output:
This is example of ArrayOutOfBounds Exception:
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
*/