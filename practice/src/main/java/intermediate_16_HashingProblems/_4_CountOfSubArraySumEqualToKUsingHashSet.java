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

public class _4_CountOfSubArraySumEqualToKUsingHashSet {

	public static void main(String[] args) {
		/*
		 * int A [] = {8,9,2,-2,4,5,11,-6,4}; int B = 19; //true // int B = 4; //false
		 */
		
		
		
		
		int A [] = {-2,16,-12,5,7,-1,2,12,11};
		int B= 17;

		
		System.out.println(countSubArraySumEqualToKusingHashing(A, B));
		

	}
	
	
	public static int countSubArraySumEqualToKusingHashing(int ar[], int K) {
		//Approach is to create a prefix sum array and then use the target to check if its there in HashSet.
		
		//the edge case is that to add zero
		
		int n=ar.length;
		int sum=0;
		int target=0;
		int count=0;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		hm.put(0,1);
		for(int i=0;i<n;i++) {
			sum=sum+ar[i];
			target = sum-K;
			
			count = count+hm.getOrDefault(target, 0);
			hm.put(sum, (hm.getOrDefault(sum, 0)+1));
				
		}//end of for
		
		return (int) (count%1000000007);
	
	}// end of method
	
}
