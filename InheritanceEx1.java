package Anudip;
/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class
 *called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". 
 *Create an object of the Student class and call both the "speak" and "study" methods. 
 */

class Person{  //Parent class(Super class)
	String name;   //Declaring attributes of parent class as name, age
	int age;
	
	public Person(String name,int age) {  //Constructor to initialize name and age
		this.name=name;
		this.age=age;
	}
	
	public void speak() {  //Method of parent class(Person class)
		System.out.println(name+" is speaking.");
	}
}

class Student extends Person{    //Child class(Subclass)
	int grade;     //Declaring attribute of child class
	
	public Student(String name, int age, int grade) {  //Constructor to initialize name, age, grade
		super(name,age);  //Calling parent class's constructor
		this.grade=grade;
	}
	
	public void study() {  //Method of Child class(Student class)
		System.out.println(name+" is studying.");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		Student s=new Student("Sai", 20, 8); //Creating object of Student class
		s.speak();  //Calling method speak from Person class
		s.study();	//Calling method study from Student class
	}
}
/* Output:
Sai is speaking.
Sai is studying.
*/