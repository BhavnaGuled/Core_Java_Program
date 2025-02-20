package Anudip;

import java.util.Vector;

/*Write a program using Vector to store the list of students details and print the details.*/

//Student class to store student details
class StudentDetails{
	String name;
	int age;
	String course;
	
//constructor to initialize student details
public StudentDetails(String name, int age, String course) {
	this.name=name;
	this.age=age;
	this.course=course;
}

//method to print student details
public void showDetails() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Course: "+course);
	}
}
public class VectorEx {

	public static void main(String[] args) {
		
		Vector<StudentDetails> st=new Vector<StudentDetails>(); //creating vector to store student objects
		
		//Adding student details to the vector
		st.add(new StudentDetails("Sai",20,"CSE"));
		st.add(new StudentDetails("Ram",22,"ME"));
		st.add(new StudentDetails("Sham",25,"AIDS"));
		st.add(new StudentDetails("Krishna",28,"ENTC"));
		
		for(StudentDetails s:st) {  //Printing each student details
			s.showDetails();
			System.out.println();
		}
	}
}
/*Output:
Name: Sai
Age: 20
Course: CSE

Name: Ram
Age: 22
Course: ME

Name: Sham
Age: 25
Course: AIDS

Name: Krishna
Age: 28
Course: ENTC
*/