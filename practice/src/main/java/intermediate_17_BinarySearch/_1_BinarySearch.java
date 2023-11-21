package intermediate_17_BinarySearch;

public class _1_BinarySearch {

	public static void main(String[] args) {
		int [] arr = {3,6,9,12,14,19,20,25,27};
		System.out.println(searchUsingBubbleSort(arr, 28));
	}
	
	
	public static boolean searchUsingBubbleSort(int [] A, int k) {
		boolean chkNumIsPresent = false;
		int n=A.length;
		int l = 0;
		int h = n-1;
		
		
		while (l<=h) {
			int mid=(l+h)/2;
			if(A[mid]==k) {
				return true;
			}
			if(A[mid]<k) {
				l=mid+1;
			}
			if(A[mid]>k) {
				h=mid-1;
			}
		}// end of while
		
		return chkNumIsPresent;
	}
	
	

}
