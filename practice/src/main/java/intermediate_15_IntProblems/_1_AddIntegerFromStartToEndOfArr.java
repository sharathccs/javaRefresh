/*Given an array of of size n, and Q queiries For each query, Given (s,v), add element v to all indexes starting from s to n-1
 * Once all queries are done, return n
 * 
 * The approach would be to add the values at the respective startting indices and do pSum of that
 * 
 * this is something that we are doing because we need to add until the end of array. i.e until the index n-1
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * /
 */




package intermediate_15_IntProblems;

import java.util.Arrays;

public class _1_AddIntegerFromStartToEndOfArr {

	public static void main(String[] args) {
		

	}// end of main
	
	
	
	static long [] getFinalArrayAfterAddition(int n, int [][] Q) {
		long [] ans = new long [n];
		Arrays.fill(ans, 0l);
		
		//Iterate thru the array and add the v to the ans array at the index s
		ans[0]=0;
		for(int i=0;i<Q.length;i++) {
			int s=Q[i][0];
			int v=Q[1][i];
			
			ans[s]=ans[s]+v;
			
		}//end of for
		
		//Create a pSumArray out of it
		for(int i=1;i<n;i++) {
			ans[i]=ans[i]+ans[i-1];
		}//end of for
		
		
		
		
		return ans;
	}
	
	
	
	
	
	

}//end of class