/*
 * Given a sorted array of   integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
	Since the number of such  pairs can be very large, return number of such pairs modulo (109 + 7)
 * 
 * 
 * The below 
 * 
 * 
 * /
 */


package intermediate_18_TwoPointers;

public class GetCountOfPairSumForSortedArray {

	public static void main(String[] args) {
		/*
		 * int [] ar = {3,7,8,11,14,19,20}; int ki=25;
		 */
		/*
		 * int [] ar = {-3,0,1,3,6,8,11,14,18,25}; int ki=17;
		 */
		/*
		 * int [] ar = {1,2,2,2,4,16,16,16,23,23,30,30}; int ki=32;
		 */
		int [] ar = {2,3,3,5,7,7,8,9,9,10,10}; int ki=11;
		
		
		System.out.println(countPairSumEqualToK_handlesDuplicates(ar,ki));

		
	}
	
	//This function with out handling the duplicates will return 4 for this data: 	int [] ar = {1,2,2,2,4,16,16,16,23,23,30,30}; int ki=32;
	public static int countPairSumEqualToK_handlesDuplicates(int [] a, int k){
		int n=a.length;
		int i=0;
		int j=n-1;
		  int mod1 = 1000000007;
		
		  long ans=0;
		
		while (i<j) {
           // System.out.println("i="+i + " j="+ j);

			if(a[i]+a[j]==k) {
				 
				if(a[i]==a[j]) {
					int count=j-i+1;
					ans=ans+((long)count*(count-1))/2; //based on nc2 = n*(n-1)/2;
					return (int) (ans % mod1);
				}
				
                 int countI=0; int countJ=0;


				//get the count of duplicates from i side
				for(int x=i;x<j;x++) {
					if(a[x]==a[i]) {
						countI++;
					}else {
						break;
					}
				}
				
				//get the count of duplicates from j side
				for(int x=j;x>i;x--) {
					if(a[x]==a[j]) {
						countJ++;
					}else {
						break;
					}
				}
				
				ans=ans+((long)countI*countJ);
				i=i+countI;
				j=j-countJ;
				
			}
			 else if(a[i]+a[j]>k) {
				j--;
			}else {
				i++;
			}

           // System.out.println("ans="+ans);

		}



		return (int) (ans % mod1);
	}

	
	
	
	

}
