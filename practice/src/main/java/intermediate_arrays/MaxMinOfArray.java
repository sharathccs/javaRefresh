/*

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right

*/


package intermediate_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxMinOfArray {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
		
		
		//size of the array
		int sizeOfArray;
		
		//array
		int [] arr ;
		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				arr = new int[sizeOfArray];
				
				for(int i=0; i<arr.length; i++) {
					 arr[i]=sc.nextInt();
				 }
				
				System.out.print(checkMax(arr));
				System.out.print(" " + checkMin(arr));
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int checkMax(int [] InputArr) {
					int l = InputArr.length;
					int max;
					max=InputArr[0];
					
					for(int i=0;i<l;i++) {
						if (InputArr[i]>max) { 
								max=InputArr[i];
							}
						}
					
					return max;
				
			}
			
			private static int checkMin(int [] InputArr) {
				int l = InputArr.length;
				int min;
				min=InputArr[0];
				
				for(int i=0;i<l;i++) {
					if (InputArr[i] < min ){ 
							min=InputArr[i];
						}
					}
				
				return min;
			
		}
		
			
			

}
