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

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//end of main

	
	static boolean checkSubArraySumifZero(int [] A) {
		
		
		//Creating the pSum Array
		boolean chkSubArraySum0 = false;
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
				return true;
			}else {
				duplicacyChecker.add(pSum[i]);
			}
		}// end of for
		
		
		
		
		
		
		
		
		
		return chkSubArraySum0;
	}// end of method
	
	


}// end of class
