package Anudip;
/*Write a java program for  Unboxing.(all types).*/

public class Unboxing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	      //primitive datatype: int,float,char,double,long,byte,boolean,short
		  //wrapper class:Integer,Float,Character,Double,Long,Boolean,Short
		  //unboxing:is process to covert wrapper class to primitive type
		System.out.println("Unboxing of all Primitive Types: ");
		
		//Unboxing of int
		System.out.println("Unboxing of int:");
		Integer i=new Integer(20);
		 int a=i.intValue();//explicit conversion
		 System.out.println(a);
		 
		//Unboxing of float
		 System.out.println("Unboxing of float:");
		 Float f=new Float(8.5f);
		 float j=f.floatValue();//explicit conversion
		 System.out.println(j);
		   
		//Unboxing of char	
		 System.out.println("Unboxing of char:");
		 Character c=new Character('B');
		 char n=c.charValue();//explicit conversion
		 System.out.println(n);
		 
		//Unboxing of double
		 System.out.println("Unboxing of double:");
		 Double d=new Double(75.5);
		 double k=d.doubleValue();//explicit conversion
		 System.out.println(k);
		 
		//Unboxing of long
		 System.out.println("Unboxing of long:");
		 Long l=new Long(50L);
		 long p=l.longValue();//explicit conversion
		 System.out.println(p);
		 
		//Unboxing of byte
		 System.out.println("Unboxing of byte:");
		 Byte b =new Byte((byte) 20);
		 byte by=b.byteValue();//explicit conversion
		 System.out.println(by);
		 
		//Unboxing of boolean
		 System.out.println("Unboxing of boolean:");
		 Boolean r=new Boolean(false);
		 boolean t=r.booleanValue();//explicit conversion
		 System.out.println(t);
		 
		//Unboxing of short
		 System.out.println("Unboxing of short:");
		 Short sh=new Short((short) 20);
		 short s=sh.shortValue();//explicit conversion
		 System.out.println(s);
	} 
}
/* Output:
Unboxing of all Primitive Types: 
Unboxing of int:
20
Unboxing of float:
8.5
Unboxing of char:
B
Unboxing of double:
75.5
Unboxing of long:
50
Unboxing of byte:
20
Unboxing of boolean:
false
Unboxing of short:
20
 */
