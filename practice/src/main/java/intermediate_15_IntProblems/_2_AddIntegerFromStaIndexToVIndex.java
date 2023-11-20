/*Given an array of of size n, and Q queiries For each query, Given (s,v), add element v to all indexes starting from s to index e
 * Once all queries are done, return n
 * 
 * Also known as beggars outside the temple problem
 * 
 * 
 * 
 * The approach would be to add the values at the respective startting indices to the end and then remove the same v from e+1 until the end index
 * 
 *  * 
 * 
 * 
 * /
 */




package intermediate_15_IntProblems;

import java.util.Arrays;

public class _2_AddIntegerFromStaIndexToVIndex {

	public static void main(String[] args) {
		
		
		int [][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};		
		
		int n=5;
		int [] res = getFinalArrayAfterAddition(n, B);
		for(int i=0;i<n;i++) {
			System.out.print(res[i] + " ");
		}//end of for
		
		
		
		
		
	}// end of main
	
	
	
	static int [] getFinalArrayAfterAddition(int n, int [][] Q) {
		int [] ans = new int [n];
        //Arrays.fill(ans, 0);
        
        //Iterate thru the array and add the v to the ans array at the index s
        for(int i=0;i<Q.length;i++) {
            int s=Q[i][0]-1;
            int e=Q[i][1]-1;
            int v=Q[i][2];
            
            ans[s]=ans[s]+v;
            
            if(e+1<n) {
                    ans[e+1]=ans[e+1]-v;
                }
            
            
        }//end of for
        
        //Create a pSumArray out of it
        
        for(int i=1;i<n;i++) {
                ans[i]=ans[i]+ans[i-1];
            
        }//end of for
        
        
        
        
        return ans;
	}
	
	
	
	
	
	

}//end of class