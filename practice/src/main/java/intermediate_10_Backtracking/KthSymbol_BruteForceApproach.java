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

public class KthSymbol_BruteForceApproach {

	public static void main(String[] args) {
		
		//The approach that I thought is to generate the entire matrix - there is now a level 0
		//the other approach is to use recursion. wherein, you use recursion to generate all rows and then get the required element from  the row
		//under the main method, we will be using the one mentioned earlier
		//Now that the generateNthRow method id completed, I will use that in the main method
		
		//generating for nthRow
		ArrayList <Integer> nthRow = generateNthRow(2); // if you pass 2 over here and 2 in line #30, it will give runtime error
		System.out.println("Nth row of the pyramid is" + nthRow);
		
		
		//To avoid runtime error for passing 2, give .get(2-1)
		System.out.println("Getting the 3rd element from the Nth row of the pyramid is:" + nthRow.get(2));
		
		

	}// end of main method
	
	
		static ArrayList<Integer> generateNthRow (int N){
			
			//Defining the breaking condition once the code is written. The breaking condition here is when N reaches 1
			if(N==1) {
				ArrayList <Integer> b = new ArrayList<Integer>();
				b.add(0);
				return b;
			}
			
			
			
			ArrayList<Integer> prevRow = generateNthRow(N-1);
			ArrayList<Integer> currentRow = new ArrayList<Integer>();
			for (int i=0; i<prevRow.size(); i++) {
				if(prevRow.get(i)==0) {
					currentRow.add(0);
					currentRow.add(1);
				}else {
					currentRow.add(1);
					currentRow.add(0);
				}
				
			}// end of for
			return currentRow;
			
			
		}// end of generate NthRow method

}//end of class
