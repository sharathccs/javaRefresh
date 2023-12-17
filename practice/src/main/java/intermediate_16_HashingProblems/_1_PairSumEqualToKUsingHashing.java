/*Check Pair Sum

 * Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 * 
 * 
 * /
 */



package intermediate_16_HashingProblems;

import java.util.HashSet;

public class _1_PairSumEqualToKUsingHashing {

	public static void main(String[] args) {
			
		int A [] = {8,9,2,-2,4,5,11,-6,4};
		//int B = 9; //true
		int B = 4; //false
		
		
		System.out.println(checkPairSumUsingHashing(A, B));
		

	}
	
	
	public static boolean checkPairSumUsingHashing(int ar[], int K) {
		boolean isPairExists = false;
		int n=ar.length;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			int target = K - ar[i];
			if(hs.contains(target)) {
				isPairExists = true;
			}else {
				hs.add(ar[i]);
			}
		}//end of for
		
		return isPairExists;
	
	}// end of method
	
}
