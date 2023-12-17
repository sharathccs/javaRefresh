/*
 * You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.
 * 
 * 
 * 
 * /
 */



package intermediate_16_HashingProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class _5_DistinctElementsInWindowOfSizeK {

	public static void main(String[] args) {
		
		/*
		 * This problem will be similar to the fixed window approach First insert the
		 * first sub array starting from 0 and get the count of distinct elements in a
		 * hashmap
		 */
		
		int [] A = {1, 2, 1, 3, 4, 3};
		int B = 3;
		//getDistinctElementsInSubArrOfLenK(A, B);
		System.out.println(getDistinctElementsInSubArrOfLenK(A, B));
		
		
		
	}// main method
	
	
	public static ArrayList<Integer> getDistinctElementsInSubArrOfLenK(int [] ar, int k) {
		
		int n=ar.length;
		HashMap<Integer, Integer> hm  = new HashMap<Integer, Integer>();
		ArrayList<Integer> ans  = new ArrayList<Integer>();
		
		//Inserting the first array
		for(int i=0;i<k;i++) {
			hm.put(ar[i], hm.getOrDefault(ar[i], 0)+1);
		}
		
		//System.out.println("before"+"hm:" + hm + "size:" + hm.size());
		
		ans.add(hm.size());
		
		int s=1;
		int e=k;
		
		while(e<n) {
			//remove s-1
			hm.put(ar[s-1], hm.getOrDefault(ar[s-1],0)-1);
			if(hm.get(ar[s-1])==0) {
				hm.remove(ar[s-1]);
			}
			
			
			//add e
			hm.put(ar[e], hm.getOrDefault(ar[e],0)+1);
			
			//System.out.println("in while hm:" + hm + "size:" + hm.size());
			
			ans.add(hm.size());
			
			s++;
			e++;
			
		}//end of while

		//System.out.println("hm:" + hm + "size:" + hm.size());
		
	//System.out.println(ans);
		
		return ans;
		
	}//end of method
	
	
	
	

}//ending of class
