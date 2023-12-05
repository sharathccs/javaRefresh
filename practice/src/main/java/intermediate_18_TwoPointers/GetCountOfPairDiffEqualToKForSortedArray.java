/*
 * Given an one-dimensional integer array A of size N and an integer B.

Count all distinct pairs with difference equal to B.

Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.
 * 
 * 
 * 
 * 
 * 
 * 


 * 
 * /
 */

package intermediate_18_TwoPointers;

import java.util.HashMap;
import java.util.HashSet;

public class GetCountOfPairDiffEqualToKForSortedArray {

	public static void main(String[] args) {
		/*
		 * int [] ar = {3,7,8,11,14,19,20, 21}; int ki=25;
		 */

		/*
		 * int [] ar = {1,4,6,8,11,14,18,23}; int ki=5;
		 */

		/*
		 * int [] ar = {10,19,24,31,38}; int ki=5;
		 */

		/*
		 * int ar[] = {1,1,1,1,1,1,1,1,1,1}; int ki=0;
		 */

		/*
		 * int [] ar=
		 * {8,10,1,10,5,9,9,3,5,6,6,2,8,2,2,6,3,8,7,2,5,3,4,3,3,2,7,9,6,8,7,2,9,10,3,8,
		 * 10,6,5,4,2,3}; int ki=2;
		 */

		/*
		 * int [] ar=
		 * {8,5,1,10,5,9,9,3,5,6,6,2,8,2,2,6,3,8,7,2,5,3,4,3,3,2,7,9,6,8,7,2,9,10,3,8,10
		 * ,6,5,4,2,3}; int ki=3;
		 * 
		 */

		
		  
		  //int ar [] =   {8,5,1,10,5,9,9,3,5,6,6,2,8,2,2,6,3,8,7,2,5,3,4,3,3,2,7,9,6,8,7,2,9,10,3,8,10,6,5,4,2,3};
		  //int ki=3;
		  
		  
		  int ar[] = {8, 12, 16, 4, 0, 20};
		  int ki=4;
		 
		
		
		
		// System.out.println(countOfPairDiffEqualToK(ar,ki));
		System.out.println(getcountOfPairDiffEqualToK(ar, ki));

	}

	public static int countOfPairDiffEqualToK(int[] a, int k) {

		long n = a.length;
		int i = 0;
		int j = 1;
		long count = 0l;
		while (j < n) {
			// long diff = Math.abs(a[j]-a[i]);
			long diff = (long) (a[j] - a[i]);
			if (diff == k) {
				count++;
				i++;
				if (i == j) {
					j++;
				}

			} else if (diff > k) {
				i++;
				if (i == j) {
					j++;
				}
			} else {
				j++;
			}
		} // while end
		return (int) count % 1000000007;
	}// end of method

	public static int getcountOfPairDiffEqualToK(int[] a, int k) {
		int n = a.length;
		int count = 0;

		/*
		 * HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 * 
		 * 
		 * 
		 * for(int i=0;i<n;i++) { int target = Math.abs(a[i]-k);
		 * if(hm.containsValue(target)) { count++; }else { hm.put(i, target); } }
		 * 
		 */

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			int t1 = a[i] - k;
			int t2 = a[i] + k;
			if (hs.contains(t1) | hs.contains(t2)) {
				count++;
			} else {
				hs.add(a[i]);
			}
		} // end of for

		return count;
	}

}// class end
