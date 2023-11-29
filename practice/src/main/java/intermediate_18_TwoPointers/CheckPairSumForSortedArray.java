/*
 * Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
	Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7)
 * 
 * 
 * 
 * 
 * 
 * /
 */


package intermediate_18_TwoPointers;

public class CheckPairSumForSortedArray {

	public static void main(String[] args) {
		/*
		 * int [] ar = {3,7,8,11,14,19,20}; int ki=25;
		 */
		
		int [] ar = {-3,0,1,3,6,8,11,14,18,25};
		int ki=17;
		
		
		System.out.println(checkPairSumEqualToK(ar,ki));
		

	}
	
	
	public static boolean checkPairSumEqualToK(int [] a, int k){
		boolean pairExists = false;
		int n=a.length;
		int i=0;
		int j=n-1;
		
		while (i<j) {
			if(a[i]+a[j]==k) {
				 pairExists=true;
				 return pairExists;
			}
			if(a[i]+a[j]<k) {
				i++;
			}
			if(a[i]+a[j]>k) {
				j--;
			}
			
		}
		return pairExists;
	}

}
