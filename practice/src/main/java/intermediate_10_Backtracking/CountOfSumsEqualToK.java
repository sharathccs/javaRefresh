/* The question is about generating sub set sums for a given array which is equal to k. Lets say you have an array like: 
 * [5 7 2] and k=7, the count of subsets would be 2. 
 * The subsets that can be formed are as below:
 * 
 * {}, (5), {7}, (2}, {5 7}, (7 2), {5, 2}, (5, 7, 2)
 * 
 * 
 * 
 * 
 * 
 */


package intermediate_10_Backtracking;
import java.util.ArrayList;

public class CountOfSumsEqualToK {

	public static void main(String[] args) {
		
		/*
		 * The brute force approach would be to generate all sub sets and then sum them up and check if theyre equal to k 
		 * 
		 * The other approach would be to use recursion to find the sum
		 * 
		 * The would consist of traversing thru the all the sets and checking the sums and incrementing the count if its = k
		 * 
		 * 
		 */
		
		
		ArrayList<Integer> num = new ArrayList<Integer> (3);
		
		

	}// end of main method
	
	static int countSubSet( int [] ar, int i, int N, int k, int sum) {
		
		//Include the breaking condition
		if(i==N) {
			if(sum==k) {
				return 1;
			}else {
				return 0;
			}
		}
		
		
		
		
		
		//Sub problem 1: To include in the sum
		sum=sum+ar[i];
		int c1=countSubSet(ar, 1+1, N, k, sum);
		sum=sum-ar[i];
		
		
		
		//Sub problem 2: Not To include in the sum
		int c2=countSubSet(ar, 1+1, N, k, sum);
		
		
		return c1+c2;
		
		
	}// end of countO
	
	
	
		
}//end of class
