/*

Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.


*/


package intermediate_3_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticProgression {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
			//size of array, ArrayList
		
		//size of the array
		int sizeOfArray;
		
		//array
		ArrayList<Integer> arr = new ArrayList<Integer>();
	
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				for(int i=0; i<sizeOfArray; i++) {
					 arr.add(i, sc.nextInt());
				 }
		
				 System.out.println(checkArithmeticProgression(arr));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static boolean checkArithmeticProgression(ArrayList<Integer> A) {
					Collections.sort(A);
					int l = A.size();
					int diff = A.get(1)- A.get(0); 
						for(int j=0;j<l-1;j++) {
							if(A.get(j+1)- A.get(j)!=diff) {
								return false;	
							}
						}
					return true;
			}
			
		
			
			

}
