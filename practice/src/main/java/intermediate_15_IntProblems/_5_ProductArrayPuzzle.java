/*
 * 
	 * Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
	
	Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.


 *Approach is : prodArray[i]  = prefix[i-1] * suffix[i+1]
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * /
 */






package intermediate_15_IntProblems;

public class _5_ProductArrayPuzzle {

	public static void main(String[] args) {
		
		
		// tc1: int [] A = {9, 7, 6, 18, 2};
		
		//int [] A = {16, 8, 24, 9, 25, 17};
		
		int [] A = {1,2,3,4,5};
		
		
		int [] prefixArr = getPrefixArray(A);
		
		
		//======================================================================================
		System.out.println("Prefix Array:");
		
		
		for(int i=0;i<prefixArr.length;i++) {
			System.out.print(prefixArr[i] + " ");
		}
	
		//======================================================================================		
		int [] suffixArr = getSuffixArray(A);
		
		System.out.println("Suffix Array:");
				
		for(int i=0;i<suffixArr.length;i++) {
			System.out.print(suffixArr[i] + " ");
		}
	
		//======================================================================================
		
		
		int [] prodArr =  getProductArrayWithoutDivisor(prefixArr, suffixArr);
		
		
		System.out.println("Product Array:");
		
		for(int i=0;i<prodArr.length;i++) {
			System.out.print(prodArr[i] + " ");
		}
		
		
		

	}
	
	  static int[] getSuffixArray(int []A){
	        int n=A.length;
	        int [] suFfixSumArr = new int [n];

	        suFfixSumArr[n-1] = A[n-1];
	        for(int i=n-2;i>=0;i--){
	            suFfixSumArr[i]=Math.max(A[i], suFfixSumArr[i+1]);
	        }

	        return suFfixSumArr ;

	    }
	  
	  
	  static int [] getPrefixArray (int[] A) {
			int n=A.length;
			int[] prefixMax= new int[n]; 
			
			prefixMax[0]=A[0];
			for(int i=1;i<n;i++) {
				prefixMax[i]=Math.max(A[i], prefixMax[i-1] );
			}
			
			return prefixMax;
		}
	  
	  
	  static int [] getProductArrayWithoutDivisor (int[] prefixArray, int [] suffixArray) {
			int n=prefixArray.length;
			int[] productArray= new int[n];
			
			for(int i=0;i<n;i++) {
				
				if(i==0) {
					productArray[i] =  suffixArray[i];
				}else if (i==(n-1)) {
					productArray[i] =  prefixArray[i-1];
				}else {
					productArray[i] =  prefixArray[i-1] * suffixArray[i+1];
				}
								
			}
			
			
			return productArray;
		}
	  
		
	
	

}
