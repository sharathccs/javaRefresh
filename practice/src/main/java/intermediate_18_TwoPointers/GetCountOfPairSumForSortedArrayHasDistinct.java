/*
 * Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
	Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7)
 * 
 * 
 * The below 
 * 
 * 
 * /
 */


package intermediate_18_TwoPointers;

public class GetCountOfPairSumForSortedArrayHasDistinct {

	public static void main(String[] args) {
		/*
		 * int [] ar = {3,7,8,11,14,19,20}; int ki=25;
		 */
		
		  int [] ar = {-3,0,1,3,6,8,11,14,18,25}; int ki=17;
		 
		
		/*
		 * int [] ar = {1,2,2,2,4,6,6,6,23,23,30,30}; int ki=32;
		 */
		
		System.out.println(countPairSumEqualToK(ar,ki));
	//	System.out.println(countPairSumEqualToK_HandlesDistinct(ar,ki));
		
	}
	
	
	public static int countPairSumEqualToK(int [] a, int k){
		int n=a.length;
		int i=0;
		int j=n-1;
		int count=0;
		
		while (i<j) {
			if(a[i]+a[j]==k) {
				 count++;
			}
			if(a[i]+a[j]<k) {
				i++;
			}else {
				j--;
			}
			
		}
		return count;
	}
	
	
}
