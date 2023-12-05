/*
 * Given an one-dimensional integer array A of size N and an integer B.

Count all distinct pairs with difference equal to B.

Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.
 * 
 * 
 * 
 * 
 * /
 */


package intermediate_18_TwoPointers;

public class CheckPairDiffForSortedArray {

	public static void main(String[] args) {
		/*
		 * int [] ar = {3,7,8,11,14,19,20}; int ki=25;
		 */
		
		int [] ar = {1,3,6,8,11,14,18,25};
		int ki=5;
		
		
		System.out.println(checkPairDiffEqualToK(ar,ki));
		

	}
	
	
	public static boolean checkPairDiffEqualToK(int [] a, int k){
		boolean pairExists = false;
		int n=a.length;
		int i=0;
		int j=1;
		
		while (j<n) {
			
			
			
			if(Math.abs(a[i]-a[j])==k) {
				 pairExists=true;
				 return pairExists;
			}
			else if(Math.abs(a[i]-a[j])>k) {
				i++;
				if(i==j) {
					j++;
				}
			}
			else {
				j++;
			}
			
			
		}
		return pairExists;
	}//end of method

}//end of class
