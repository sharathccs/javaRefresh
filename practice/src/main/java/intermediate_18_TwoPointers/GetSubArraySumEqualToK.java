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



public class GetSubArraySumEqualToK {

	public static void main(String[] args) {
		/*
		 * int [] ar = {3,7,8,11,14,19,20}; int ki=25;
		 */
		
		int [] ar = {1,3,6,8,11,14,18,25};
		int ki=25;
		
		
		
		
       int [] answer=getSubArrSumEqualToK(ar,ki);
		for(int i=0;i<answer.length;i++) {
			System.out.print (" " + answer[i]);
		}
		

	}// end of main
	
	
	public static int [] getSubArrSumEqualToK(int [] a, int k){
		int n=a.length;
		int i=0;
		int j=0;
		int sum=a[0];
	
		
		while (j<n) {
			
			 
			
			//case if sum is equal to k
			if(sum==k) {
				int [] ans  = new int[j-i+1];
				int ind=0;
				for(int x=i;x<=j;x++) {
					ans[ind]=a[x];
					ind++;
				}
				
				return ans;
				
				
			}//Sum ==k
			else if(sum<k) {//sum is less than
				j++;
				if(j<n) {
					sum=sum+a[j];
				}
				
			}//end of sum is less than
			
			
			else { //sum is more than k
				sum=sum-a[i];
				i++;
				
				if(i>j && j<n-1) {// what if i becomes >j to handle that scenario
					j++;
					sum=sum+a[j];
				}
				
				
			}//sum is more than k
			
			
		}// end of while
		
		int [] ans = {-1};
		return ans;
	}

}// end of classxxxx`
