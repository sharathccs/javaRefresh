package intermediate_17_BinarySearch;

public class _4_FrequencyOfK {

	public static void main(String[] args) {
		int [] arr = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,8,10,10,15};
		
		int s=firstIndexOfSearchElemeent(arr, 5);
		int e=lastIndexOfSearchElemeent(arr, 5);
		System.out.println("frequency:" + (e-s+1));
	}
	
	
	public static int lastIndexOfSearchElemeent(int [] A, int k) {
		int n=A.length;
		int l = 0;
		int h = n-1;
		int ans=-1;
		
		
		while (l<=h) {
			int mid=(l+h)/2;
			if(A[mid]==k) {
				ans=mid;
				l=mid+1;
				
			}
			if(A[mid]<k) {
				l=mid+1;
			}
			if(A[mid]>k) {
				h=mid-1;
			}
		}// end of while
		
		return ans;
	}
	
	
	public static int firstIndexOfSearchElemeent(int [] A, int k) {
		int n=A.length;
		int l = 0;
		int h = n-1;
		int ans=-1;
		
		
		while (l<=h) {
			int mid=(l+h)/2;
			if(A[mid]==k) {
				ans=mid;
				h=mid-1;
				
			}
			if(A[mid]<k) {
				l=mid+1;
			}
			if(A[mid]>k) {
				h=mid-1;
			}
		}// end of while
		
		return ans;
	}
	
	
	
	

}
