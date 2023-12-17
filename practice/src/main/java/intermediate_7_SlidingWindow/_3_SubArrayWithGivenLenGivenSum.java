package intermediate_7_SlidingWindow;

public class _3_SubArrayWithGivenLenGivenSum {

	public static int checkSubArrayWithGivenSumGivenLen(int [] a, int B, int C){
		
		int n=a.length;
		int checkSubArray = 0;
		long sum=0l;
		
		//calcualte the sum of elements of first sliding window and check ifits = C
		
		
		for(int i=0;i<B;i++) {
			sum=sum+a[i];
		}
		
		if(sum==C){
			checkSubArray=1;
			return checkSubArray;
		}
		
		int e=B;
		int s=1;
		while(e<n){
			sum=sum-a[s]+a[e];
			s++;
			e++;
			
			if(sum==C){
			checkSubArray=1;
			return checkSubArray;
		}
			
		}
		
		return checkSubArray;


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
