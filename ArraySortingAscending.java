package Anudip;
/* Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20] */

public class ArraySortingAscending {

	public static void main(String[] args) {
		int []arr={45,35,56,67,78,89,78,12,20}; //Declaring and initializing an integer array
		int temp=0;
		
		System.out.println("Elements of Original Array: "); //Printing the original array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//bubble sort algorithm to sort the array in ascending order
		for(int i=0;i<arr.length;i++) {    //outer loop
			for(int j=i+1;j<arr.length;j++) {    //inner loop
				if(arr[i]>arr[j]) {    //checking element using condition
					
				//Swapping the element if they are in not in correct order
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Elements of array sorted in Ascending Order: "); //Printing the sorted array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
/* Output:
Elements of Original Array: 
45 35 56 67 78 89 78 12 20 
Elements of array sorted in Ascending Order: 
12 20 35 45 56 67 78 78 89 
*/
