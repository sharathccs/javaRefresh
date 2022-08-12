/*

Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



*/


package intermediate_3_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NobleInteger {
	
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
		
				 System.out.println(countNoble(arr));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int countNoble(ArrayList<Integer> A) {
				
					System.out.println("=== unsorted=========================================");
					System.out.print(A);
					System.out.println("==== sorted========================================");
					Collections.sort(A);
					System.out.print(A);
					
					int l = A.size();
					System.out.println("============================================");
					System.out.println("size:"+l);
					int noble=0;
					int val=1;
					for(int j=0;j<l;j++) {
						
						if(A.get(j)>=0) {
							if(A.get(j)==((l-1)-j)) {
								noble++;
								System.out.println("=== got noble=========================================");
								System.out.println("noble count:"+noble + "noble element:" + A.get(j) + "at index:"+j);
								System.out.println("============================================");
								
								
							}
						}
					}
					if(noble==0) {
						val=-1;
					}
					
					return val;
			}
			
		
			
			

}
