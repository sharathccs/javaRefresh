/*
 * Check if all the elements in the array are distinct or not
 * 
 * Approach 1: Using HashMap - get the freqMap of the array elements and check if any val is greater than 1
 * Approach 2: Using HashSet - add the elements of the array to a HashSet and check if the size of hashSet  = length of array
 * 
 * Both the above approaches involve traversing thru the entire array
 * 
 * But another approach is to exit as soon duplicate is added to the hashSet
 * 
 * /
 */



package intermediate_14_Hashing;

import java.util.HashSet;



public class CheckDistinctElements {

	public static void main(String[] args) {
		//int[] arr = {3,5,6,5,4};
		int[] arr = {1,1,1,2,2};
		System.out.println(checkIfElementsAreDistinct(arr));

	}//end of main method
	
	static boolean checkIfElementsAreDistinct (int [] A){
		HashSet<Integer> settoma =  new HashSet<Integer>();
		
		for(int k=0;k<A.length;k++) {
			if(settoma.contains(A[k])) {
				return false;
			}else {
				settoma.add(A[k]);
			}
			
			
			settoma.add(A[k]);
		}
		return true;
	}//end of getDistinctElements
	
	
	
	

}
