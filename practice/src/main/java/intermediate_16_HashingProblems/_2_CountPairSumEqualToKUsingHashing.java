/*Check Pair Sum

 * Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 * 
 * 
 * /
 */



package intermediate_16_HashingProblems;

import java.util.HashMap;
import java.util.HashSet;

public class _2_CountPairSumEqualToKUsingHashing {

	public static void main(String[] args) {
			
		int A [] = {8,9,2,-2,4,5,11,-6,4};
		int B = 9; //true
	//	int B = 4; //false
		
		
		System.out.println(getCountOfPairSumUsingHashing(A, B));
		

	}
	
	
	public static int getCountOfPairSumUsingHashing(int ar[], int K) {
		int n=ar.length;
		long count = 0l;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int target = K - ar[i];
			
			if(hm.containsKey(target)) {
				count=count+ (long) hm.get(target);
			}
			if(hm.containsKey(ar[i])) {
				hm.put(ar[i], hm.get(ar[i])+1);
			}else {
				hm.put(ar[i], 1);
			}
		}//end of for
		
		return (int)((count)%1000000007);
	
	}// end of method
	
}
