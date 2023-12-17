/*
 * Given N non-negative integers A[0], A[1], ..., A[N-1] , where each represents a point at coordinate (i, A[i]).

N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).

Find two lines, which together with x-axis forms a container, such that the container contains the most water. You need to return this maximum area.

Note: You may not slant the container. It is guaranteed that the answer will fit in integer limits.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */




package intermediate_18_TwoPointers;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int a[] = {3,5,4,7,3,6,4,1,2};
		System.out.println(maxArea(a));
		
	}
	
	public static int maxArea(int []A) {
		int n=A.length;
		int i=0;
		int j=n-1;
		long ans=0l;
		while(i<j) {
			long water=(long)Math.min(A[i], A[j])*(j-i);
			ans=Math.max(ans, water);
			if(A[i]<A[j]) {
				i++;
			}else {j--;}
		}
		return (int)(ans%1000000007);
		
		
	}//maxArea
	
}//class end
