/* 0
 * 01
 * 0110
 * 01101001
 * 
 * 
 * 
 * 
 */


package intermediate_10_Backtracking;
import java.util.ArrayList;

public class KthSymbol_IntermediateApproach {

	public static void main(String[] args) {
		
		//After multiple observations it concluded that the element at the kth index will be same as the parent if the index is even, if the index is odd, then it will be opposite of parent
		// So the problem reduces to figuring out the parent data given a kth index and nth row
		
		
		
		
		
		//getting the  4th element from 4th row
		System.out.println("Getting the 4th element from the 4th row of the pyramid is: " + getKthSymbol(4, 5));
		
		

	}// end of main method
	
	
		static int getKthSymbol (int N, int K){
			if(K==0) {
				return 0;
			}
			int parent = getKthSymbol(N-1, (K/2));
			if(K%2==0) {
				return parent ;
			}else {
				return (1-parent);
			}
		}// end of getKthSymbol method
		

}//end of class
