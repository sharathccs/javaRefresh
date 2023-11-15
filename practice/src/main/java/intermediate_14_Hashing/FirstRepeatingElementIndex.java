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
 * 
 * 
 * 
 * the below code works, but the scenario wherein no repeating elements are there needs to be handled
 * 
 * /
 */



package intermediate_14_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;



public class FirstRepeatingElementIndex {

	public static void main(String[] args) {
		 //int[] arr = {3,5,6,5,4};
		//int[] arr = {1,1,1,2,2};
		
		//int [] arr= {10,5,3,4,3,5,6};
		//int [] arr= {8,15,1,10,5,19,19,3,5,6,6,2,8,2,12,16,3};
		
		int [] arr= {8,15,1,10,5};
		
		
		
		System.out.println(getMinIndexMap(arr));
		

	}//end of main method
	
	static HashMap<Integer, Integer> getMinIndexMap(int [] A){
		
		HashMap<Integer, Integer> mapoma = new HashMap<Integer, Integer>();
		int n=A.length;
		int minIndex = n;
		
		ArrayList<Integer> repeatingNums = new ArrayList<Integer>(); 
		
		
		//Traverse thru the array to get the number and its freq
		for(int i=0;i<n;i++) {
			if(mapoma.containsKey(A[i])) {
				//minIndex=i;
				int existingIndex=mapoma.get(A[i]);
				minIndex = Math.min(i, existingIndex);
				mapoma.put(A[i], minIndex);
				
				repeatingNums.add(A[i]);
				
				
			}else {
				mapoma.put(A[i],i);
			}
			
		}//end of for
		
		int ans = n;
		for (int j=0;j<repeatingNums.size();j++) {
			int temp=repeatingNums.get(j);
			
			
			
			ans=Math.min(mapoma.get(temp), ans);
		}
		
		
		
		
		System.out.println("repeating nums: " + repeatingNums + "ans:" + ans);
		
		
		
		
		return mapoma;
	}//end of getFreqArray
	

	
	
	
	
	
	

}
