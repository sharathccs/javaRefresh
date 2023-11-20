package intermediate_15_IntProblems;

public class _3_PrefixArray {

	public static void main(String[] args) {
		
		
		// tc1: int [] A = {9, 7, 6, 18, 2};
		
		int [] A = {16, 8, 24, 9, 25, 17};
		int [] res = getPrefixMax(A);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
		

	}
	
	static int [] getPrefixMax (int[] A) {
		int n=A.length;
		int[] prefixMax= new int[n]; 
		
		prefixMax[0]=A[0];
		for(int i=1;i<n;i++) {
			prefixMax[i]=Math.max(A[i], prefixMax[i-1] );
		}
		
		return prefixMax;
	}
	
	

}
