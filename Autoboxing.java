package Anudip;
/*Write  a java program for Autoboxing.(All Primitive Types)*/

public class Autoboxing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //primitive datatype: int,float,char,double,long,byte,boolean,short
		//wrapper class:Integer,Float,Character,Double,Long,Boolean,Short
		//1.Autoboxing: is process to covert primitive type to wrapper class
		
		System.out.println("Autoboxing of all Primitive Types:");
		//Autoboxing of int
		System.out.println("Autoboxing of int: ");
		int a=25;
		Integer i=Integer.valueOf(a);//explicit conversion
		System.out.println(i);
		
		//Autoboxing of byte
		System.out.println("Autoboxing of byte: ");
		byte b=10; 
		Byte by=Byte.valueOf(b);//explicit conversion
		System.out.println(by);
		
		//Autoboxing of float
		System.out.println("Autoboxing of float: ");
		float f=5.5f;
		Float fl=Float.valueOf(f);//explicit conversion
		System.out.println(fl);
		
		//Autoboxing of char
		System.out.println("Autoboxing of char: ");
		char c='A';
		Character ch= Character.valueOf(c);//explicit conversion
		System.out.println(ch);
		
		//Autoboxing of double
		System.out.println("Autoboxing of double: ");
		double d=60.5;
		Double dl=Double.valueOf(d);//explicit conversion
		System.out.println(dl);
		
		//Autoboxing of long
		System.out.println("Autoboxing of long: ");
		long l=40L;
		Long lo=Long.valueOf(l);//explicit conversion
		System.out.println(lo);
		
		//Autoboxing of boolean
		System.out.println("Autoboxing of boolean: ");
		boolean bo=true;
		Boolean boo=Boolean.valueOf(bo);//explicit conversion
		System.out.println(boo);
		
		//Autoboxing of short
		System.out.println("Autoboxing of short: ");
		short s=20;
		Short sh=Short.valueOf(s);//explicit conversion
		System.out.println(sh);
   
	}
}
/* Output:
Autoboxing of all Primitive Types:
Autoboxing of int: 
25
Autoboxing of byte: 
10
Autoboxing of float: 
5.5
Autoboxing of char: 
A
Autoboxing of double: 
60.5
Autoboxing of long: 
40
Autoboxing of boolean: 
true
Autoboxing of short: 
20
*/
