package Anudip;
/* Write a java program to invoke current class method using this keyword. */

public class ThisMethodExample {
	void reading() { //declare method reading
		System.out.println("I am reading a book...");
	}
	
	void writing() { //declare method writing
		this.reading(); //invoke method using 'this' keyword
		System.out.println("I am writing an essay...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethodExample ex= new ThisMethodExample();
		ex.writing(); //calling method

	}

}
