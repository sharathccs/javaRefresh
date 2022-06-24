package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMinOfArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			ArrayList<Integer> A=getInput1DArrayList();
			System.out.print(getMax(A) + " " + getMin(A) );
		}catch(InputMismatchException e) {
			
		}
	}			
			static ArrayList<Integer> getInput1DArrayList() {

				int sizeOfArray;
				
				Scanner sc = new Scanner(System.in);
				
						
						System.out.println("Enter the size of array you want to construct:");
						sizeOfArray	 = sc.nextInt();
						System.out.println("Enter the array of size:"+sizeOfArray);
						ArrayList<Integer> A = new ArrayList<Integer>(); 
						
						
						for(int i=0; i<sizeOfArray; i++) {
							 A.add(sc.nextInt());
						 }
						
						 System.out.println("Entered Array:");
						 
						 System.out.println(A);
						 
						 System.out.println("--------------------");
						 
						 sc.close();
				
					return A;	
			}
			
			static int getMax(ArrayList<Integer> arr) {
				 return (Collections.max(arr));
			}
			static int getMin(ArrayList<Integer> arr) {
				 return (Collections.min(arr));
			}
			
}