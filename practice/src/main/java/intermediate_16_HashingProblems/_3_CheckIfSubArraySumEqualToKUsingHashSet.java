/*Check Pair Sum

 * Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.
 * 
 * 
 * /
 */



package intermediate_16_HashingProblems;

import java.util.HashMap;
import java.util.HashSet;

public class _3_CheckIfSubArraySumEqualToKUsingHashSet {

	public static void main(String[] args) {
			
		int A [] = {8,9,2,-2,4,5,11,-6,4};
		int B = 3; //true
	//	int B = 4; //false
		
		
		System.out.println(checkSubArraySumEqualToKusingHashing(A, B));
		

	}
	
	
	public static boolean checkSubArraySumEqualToKusingHashing(int ar[], int K) {
		//Approach is to create a prefix sum array and then use the target to check if its there in HashSet.
		
		//the edge case is that to add zero
		
		int n=ar.length;
		long sum=ar[0];
		long target=0;
		
		HashSet<Long> hs = new HashSet<Long>();
		hs.add(0l);
		for(int i=1;i<n;i++) {
			sum=sum+ar[i];
			target = sum-K;
			if(hs.contains(target)) {
				return true;
			}else {
				hs.add(sum);
			}
		}//end of for
		
		return false;
	
	}// end of method
	
}
