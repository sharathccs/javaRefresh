/*

Write a program to input N numbers array from user and insert an element Y in it at specified position X.

Problem Constraints

1 <= N <= 100

1 <= A[i] <= 1000

1 <= X <= N

1 <= Y <= 1000

*/




package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InsertThat {
	
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
