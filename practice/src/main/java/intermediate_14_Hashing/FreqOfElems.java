package intermediate_14_Hashing;

import java.util.HashMap;

public class FreqOfElems {

	public static void main(String[] args) {
			//For each query find the frequency
		
		int[] A= {2,6,3,8,2,3,8,10,6};
		System.out.println(getFrequencyMap(A));
		
		int[] getFreqOffollowingElements = {2,8,3,5};
		HashMap<Integer, Integer> MapWithAlltheFrequencies = getFrequencyMap(A);
		
		
		
		for (int k=0;k<getFreqOffollowingElements.length;k++) {
			if(MapWithAlltheFrequencies.containsKey(getFreqOffollowingElements[k])) {
				System.out.println("freq of: " + getFreqOffollowingElements[k] + " is: " + MapWithAlltheFrequencies.get(getFreqOffollowingElements[k]) );
			}else {
				System.out.println("freq of: " + getFreqOffollowingElements[k] + " is: 0");
				}// end of else
		}//end of for
		

	}

	
	
		//	Create a frequency Map

		static HashMap<Integer, Integer> getFrequencyMap(int [] A){
			
			HashMap<Integer, Integer> mapoma = new HashMap<Integer, Integer>();
			int n=A.length;
			
			//Traverse thru the array to get the number and its freq
			for(int i=0;i<n;i++) {
				if(mapoma.containsKey(A[i])) {
					int freq = mapoma.get(A[i]);
					mapoma.put(A[i], freq+1);
					
					
				}else {
					mapoma.put(A[i],1);
				}
				
				
			}
			
			
			return mapoma;
		}//end of getFreqArray
	
	
	
	
}
