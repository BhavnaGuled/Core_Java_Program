package Anudip;
/* Create a parent class called "Vehicle" with attributes such as brand, model, year and a method called "drive". 
 * Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" 
 * and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods.
 */
class Vehicle{  //Parent class
	String brand;
	String model;
	int year;
	
	Vehicle(String brand, String model, int year){ //constructor to initialize brand, model, year
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	
	public void drive() { //Method of class Vehicle
		System.out.println("The "+year+" "+brand+" "+model+" is driving.");
	}
}

class Car extends Vehicle{  //Child class
	String color;
	
	Car(String brand, String model, int year, String color ){ //constructor to initialize brand,model,year,color
		super(brand,model,year);   //Calling parent class's constructor
		this.color=color;
	}
	
	public void honk() {  //Method of class Car
		System.out.println("The "+color+" "+brand+" "+model+" says: Honk!");
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		
		Car c=new Car("BMW","3series",2025,"Blue"); //Creating object of Class Car
		c.drive();  //Calling method drive from Vehicle class
		c.honk();   //Calling method honk from Car class
	}
}
/* Output:
The 2025 BMW 3series is driving.
The Blue BMW 3series says: Honk!
*/
