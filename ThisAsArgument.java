package Anudip;
/* Write a java program to pass this keyword as argument in the constructor call. */
class Example{     //
	ThisAsArgument obj;
	Example(ThisAsArgument obj){ //constructor takes another object as parameter
		this.obj=obj;
	}
	void display() {
		System.out.println("Constructor as argument data: "+obj.data);//using data member of ThisAsArgument class
	}
}
public class ThisAsArgument {
	int data=15;
	ThisAsArgument()  //constructor that passes 'this' to Example class
	{
		Example ex= new Example(this);
		ex.display();  //calling method
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsArgument t= new ThisAsArgument();
		}

}
