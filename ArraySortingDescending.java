package Anudip;
/* Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B] */

public class ArraySortingDescending {

	public static void main(String[] args) {
		String[]arr= {"A","X","D","Z","Y","C","W","B"};  //Declaring the array of strings
		System.out.println("Element of the Original Array: ");  //Printing the original array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Sorting the array in descending order using bubble sort
		for(int i=0;i<arr.length;i++) {  //outer loop
			for(int j=i+1;j<arr.length;j++) {  //inner loop
				
				//Comparing adjacent elements and swap if necessary
				if(arr[i].compareTo(arr[j])<0) {  //condition to check element
					//Swapping the element if necessary
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		//Printing the sorted array in descending array
		System.out.println();
		System.out.println("Sorted array in Descending order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
/* Output:
Element of the Original Array: 
A X D Z Y C W B 
Sorted array in Descending order: 
Z Y X W D C B A 
*/