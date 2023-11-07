/*
 * Given an array, get the count of pairs a, b such that a+b is divisible by m
 * 
 * 
 * 
 * 
 */




package intermediate_11_ModularArithmetic;

public class PairSumDivisibleByk {
	
	///The steps to do this via recusion is :
	//Convert the given array to a remainder array
	//Create a frequency array
	//Frequency array will be of size m
	
	/*
	and will have 0 to m-1
	once u have the frequency array, count of pairs can be obtained as follows:
		
		for 0 u need to nC2 which is nothing but n(n-1)/2
		
		for remaining elements, to get the count, say at index i, with another index, say j use the while loop until i<j
	
	*/
	
	public static void main (String args[]) {
		
	}//end of main method
	
	static int getPairCountWhoseSumIsDivisbleByM(int [] ar, int m) {
		//get the remainder array
		int x = ar.length;
		Long ans=0l;
		int [] freq = new int[m];
		for(int i=0;i<x;i++) {
			ar[i]=ar[i]%m;
		}
		
		//Create the frequency array
		for(int j=0;j<x;j++) {
			int ele = ar[j];
			freq[ele] = freq[ele]+1;
		}// end of for loop
		
		//count of pairs with 0
		long c=freq[0];
		ans = ans + c*(c-1)/2;
		
		//For elements with even index:
		if(m%2==0) {
			int x1 = freq[m/2];
			ans = ans + x1*(x1-1)/2;
		}
		
		//For remaining elements:
		int a = 1; int b=m-1;
		while(a<b) {
			
			ans = ans+freq[a]*freq[b];
			a++;
			b--;
			
		}
		
		
		
		
		
		
		
		ans=ans%1000000007;
		
		return ans.intValue();
		}// end of getPairCount method
	
	
	
	
	
	
	

}//end of class
