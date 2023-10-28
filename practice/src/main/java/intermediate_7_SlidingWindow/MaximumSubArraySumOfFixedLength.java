package intermediate_7_SlidingWindow;

public class MaximumSubArraySumOfFixedLength {
	
	/*
	 * Given an array A of length N, Find the maximum subarray sum out of all possible subarray of length B.
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	//Code using sliding window technique
	
    //First get the sub array sum of length B starting at 0th index
				
	public static long meth() {
		
		
		int [] A= {34, -31, 3, 5};
	    int n=A.length;
	    long sum=0;
		int B=3; 
		
	    for(int i=0;i<B;i++){
	        sum=sum+ (long) A[i];
	    }//end of for loop 
	
	    long MaxSum=sum;
	
	//Then keep sliding the window until u reach the end of the array
	
	    int s=1;
	    int e=B;
	    while(e<n){
	        if(sum<0){
	            sum=0;
	        }else{
	            sum=sum-A[s-1]+(long)A[e];
	            MaxSum=Math.max(sum,MaxSum);
	        }//end of else
	
	        s++;
	        e++;
	
	    }//end of while
	
	    return MaxSum;   
	
	}//method ending
		
				
	
	
	

}// class ending
