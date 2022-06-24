package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sizeOfArray;
		boolean isFound = true;
		
		int SearchElement = 1;
		
		Scanner sc = new Scanner(System.in);
		try {
				sizeOfArray	 = sc.nextInt();
				System.out.println("Enter the array of size:"+sizeOfArray);
				int [] arr = new int[sizeOfArray];
				
				
				/* Dont know why its failing	
				 for(int i: arr) {
					 arr[i]=sc.nextInt();
				 }
				 
				 
				 */
				
				for(int i=0; i<arr.length; i++) {
					 arr[i]=sc.nextInt();
				 }
				
				 System.out.println("Entered Array:");
				 for(int k: arr) {
					 System.out.println(k);
				 }
				 
				System.out.println("Sum Array:");
				
				int[] SumArray=getSumArray(arr);
				
				for(int i=0; i<arr.length; i++) {
					System.out.println(SumArray[i]);
				 }
				
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int [] getSumArray(int [] InputArr) {
			
				int l = InputArr.length;
				int [] SumArray = new int[l];
				int sum=0;
				for (int i=0; i < InputArr.length ; i++){
					sum = sum+InputArr[i];
					SumArray[i]=sum;
				}
				
				/*
				for(int i=0; i<InputArr.length; i++) {
					System.out.println(SumArray[i]);
				}
				
				*/
				
				
				return SumArray;
			}	


	

}
