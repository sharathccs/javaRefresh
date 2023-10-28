/*

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right

*/


package intermediate_5_PrefixSum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilibriumIndex2 {
	
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
				 

				//checkEquilibriumIndex(arr1);
				
				
				 System.out.println(checkEquilibriumIndex(arr1));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			 static int checkEquilibriumIndex(ArrayList<Integer> A) {
					int val=-1;
					int SumLeft;
					int SumRight;
					
					
					
					ArrayList<Integer> PrefixSumArrayList = getPrefixSumArrayList(A);
					int l=PrefixSumArrayList.size();
					
					
					
					//check for Sum of left and sum of right for every elemenet
					for(int k=0;k<l;k++) {
						
						if(k==0) {
							SumLeft = PrefixSumArrayList.get(0);
						}else {
							SumLeft = PrefixSumArrayList.get(k-1);
							SumRight = PrefixSumArrayList.get(l-1)-PrefixSumArrayList.get(k);
							
							if(SumLeft==SumRight) {
									val=k;
									return val;
							}
						}
					}
					
					return val;
				
			}
			
			
			  static ArrayList<Integer> getPrefixSumArrayList(ArrayList<Integer> Arr){
				
				System.out.println("The entered array for calculating the prefix sum is:"+Arr);
				int lengthOfArrayList = Arr.size();
				
				
				ArrayList<Integer> PS = new ArrayList<Integer>(lengthOfArrayList);
				PS.add(0, Arr.get(0));
				for (int i=1;i<(lengthOfArrayList);i++) {
					PS.add(i, PS.get(i-1)+Arr.get(i));
				}
				
				System.out.println("The Prefix sum array is:");
				System.out.println(PS);
				
				
				return PS;
				
				
			}
			
		
			
			

}
