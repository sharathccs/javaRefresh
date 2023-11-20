package intermediate_15_IntProblems;

public class _4_SuffixArray {

	public static void main(String[] args) {
		
		
		// tc1: int [] A = {9, 7, 6, 18, 2};
		
		int [] A = {16, 8, 24, 9, 25, 17};
		int [] res = getSuffixArray(A);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
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
	
	

}
