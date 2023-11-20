/*
 * Given an array of integers check if it has any sub arrays with sub array sum=0
 * 
 * 
 *There are 2 approaches:
 *
 * Precursor : Calculate the prefix sum arrray
 * 
 * 1. if there are duplicates in the pSum Array then for sure shot there exists a sub array for which sub array sum=0
 * 1.a - If there is a 0 in the pSum array, then for sure, there will be a sub array for which sub array sum=0
 * 
 * 1. while calulating the pSum array, the moment u encounter a duplicate u can break
 *
 * 
 * 
 * /
 */



package intermediate_14_Hashing;

import java.util.HashSet;

public class CountOfSubArrayWithZeroSum {

	public static void main(String[] args) {
		
		
				
				int a[]= {30,-30,30,-30};
				System.out.println(countOfSubArraySumZero(a));
		
		
		

	}//end of main

	
		static int countOfSubArraySumZero(int [] A) {
			
			
			//Creating the pSum Array
			long count=0l;
			int n=A.length;
			long [] pSum = new long [n];
			
			pSum[0]=A[0];
			for(int i=1;i<n;i++) {
				pSum[i]=pSum[i-1]+A[i];
			}
			
			
			HashSet<Long> duplicacyChecker = new HashSet<Long>();
			
			//Need to know why to handle the below scenario
			duplicacyChecker.add(0l);
			
			
			
			for(int i=0;i<n;i++) {
				if(duplicacyChecker.contains(pSum[i])) {
					count++;
				}else {
					duplicacyChecker.add(pSum[i]);
				}
			}// end of for
			
			
			int c=(int)count%1000000007;
			
			
			
			return c;
	}// end of method
	
	


}// end of class
