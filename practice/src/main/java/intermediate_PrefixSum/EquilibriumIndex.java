/*

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right

*/


package intermediate_PrefixSum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilibriumIndex {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
		
		
		//size of the array
		int sizeOfArray;
		
		//array
		int [] arr ;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		//	Target Number
		int B;
		
		

		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				
				
				for(int i=0; i<sizeOfArray; i++) {
					 arr1.add(i, sc.nextInt());
				 }
				 

				 System.out.println(checkEquilibriumIndex(arr1));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int checkEquilibriumIndex(ArrayList<Integer> A) {
					int l = A.size();
					int val=-1;
					int SumLeft;
					int SumRight;
					
					ArrayList<Integer> PS = new ArrayList<Integer>(l);
					
					
					//create the PS array
					PS.add(0, A.get(0));
					for(int i=1; i<l;i++) {
						//PS[i] = PS[i-1]+A[i]
						PS.add(i, (PS.get(i-1)+A.get(i)));
					}
					
					System.out.println("Prefix Sum Array is:"+PS);
					
					//check for Sum of left and sum of right for every elemenet
					for(int k=0;k<l;k++) {
						
						if(k==0) {
							SumLeft = 0;
						}else {
							SumLeft = PS.get(k-1);
							SumRight = PS.get(l-1)-PS.get(k);
							
							if(SumLeft==SumRight) {
									val=k;
									return val;
							}
						}
					}
					
					return val;
				
			}
			
		
			
			

}
