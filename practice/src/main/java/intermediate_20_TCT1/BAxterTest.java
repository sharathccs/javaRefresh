package intermediate_20_TCT1;

import java.util.ArrayList;

//1,2,3,8,9,4,3,3,6,8,3

/*
 * Not solved
 * 
 * 
 * /
 */



public class BAxterTest {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,8,9,4,3,3,6,8,3};
		System.out.println(getRepeatedNum(arr));
		

	}
	
	public static int getRepeatedNum(int[] a) {
		int ans=0;
		int n=a.length;
		int count=0;
		
		int [][] freq = new int[n][2];
		
		for(int i=0;i<n; i++ ) {
			freq[i][0]=a[i];
			for(int j=0;j<n;j++) {
				if(a[i]==a[j]) {
					freq[i][1]=count++;
				}
				
				
				
				//ans=Math.max(ans,a[j]);
			}
			count=0;
		}
		
		
		
		
		return ans;
		
	}
	
	

}
