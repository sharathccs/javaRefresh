package intermediate_14_Hashing;

import java.util.HashSet;



public class GetDistinctElementsFromArray {

	public static void main(String[] args) {
		//int[] arr = {3,5,6,5,4};
		int[] arr = {1,1,1,2,2};
		System.out.println(setOfDistinctElements(arr).size());

	}//end of main method
	
	static HashSet<Integer> setOfDistinctElements (int [] A){
		HashSet<Integer> settoma =  new HashSet<Integer>();
		
		for(int k=0;k<A.length;k++) {
			settoma.add(A[k]);
		}
		
		
		return settoma;
	}//end of getDistinctElements
	
	
	
	

}
