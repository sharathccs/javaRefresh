package intermediate_7_SlidingWindow;

public class MinSwapsGoogleQuestion {
	
	/*
	 * Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	//Code using sliding window technique
	
    //First get the sub array sum of length B starting at 0th index
	
	public static void main(String [] args){
		
		//int [] A = {52,7,93,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74,92,5,84,27,48,49,37,59,3,56,79,26,55,60,16,83,63,40,55,9,96,29,7,22,27,74,78,38,11,65,29,52,36,21,94,46,52,47,87,33,87,70};
		int [] A = {31,98,58,86,36,31,3,22,4,17,51,33,56,7,91,17,59,66,54,67,55,41,58,24,100,1,98,68,21,33,27,67,20,66,20,100,36,89,20,15,13,26,11,29,99,36,39,49,74,77,54,66,30,21,14,18,83,72,10,22,53,83,60,9,68,56,9,21,77,44,45,61,97,82,35,16,38,95,55,11,46,77,25,3,44};
		
		
		//int [] A = {1, 12, 10, 3, 14, 10, 5};
		
	//	int [] A = {5, 17, 100, 11};
		
		int B=18;
		int swaps = getMinSwaps(A, B);
		System.out.println(swaps);
		
		
		
		
		
		
		
	}//ending of main method
	
	
	
	
	
				
	public static int getMinSwaps(int [] A, int B) {
		
		
		//first find the fixed length of the sliding window which is k
        //then using sliding window technique, get the count of bad elements
            //the count of bad elements would be the min number of swaps needed


            int n=A.length;
            int k=0;
            int bad=0;
            for(int i=0;i<n;i++){
                if(A[i]<=B){
                    k++;
                }//end of if
            }// end of for

            //Count of k is done
            System.out.println("k:"+k);


            //Beginning of the sliding window technique
            if(k==0 || k==1 || k==n){// in all of these cases, no swapping is needed.
                return 0;
            }


            //Find the bad element in the first sub array of the length k - which is from i=0 to k-1
            for(int j=0;j<k;j++){
                if (A[j]>B){
                    bad++;
                }// end of if
            }// end of for loop for calculating the initial value of bad

            System.out.println("initial cont of bad:"+bad);
            



            //Beginning of the sliding window technique
            int s=1;
            int e=k;
            int minSwap=bad;
            while(e<n){
                if(A[s-1]>B){
                     bad--;   
                }if(A[e]>B){
                    bad++;
                }
                minSwap=Math.min(bad,minSwap);
                
                s++;
                e++;
                
                
            }// end of while

            System.out.println("final count min of bad:"+minSwap);
            return minSwap;
		
		
		
		
	
	
	}//method getMinSwaps ending
		
				
	
	
	

}// class ending
