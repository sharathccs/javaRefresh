package intermediate_20_TCT1;

import java.util.ArrayList;


public class MaxSumContigousSubArray_revision {

	public static void main(String[] args) {
		ArrayList <Integer> v = new ArrayList <Integer>();
		v.add(-7);
		v.add(1);
		v.add(5);
		v.add(2);
		v.add(-4);
		v.add(3);
		v.add(0);
		
		System.out.println("v:"+v);
		
		
		
		
		System.out.println("ans:"+getMaxSumOfContigousArray(v,2));
	}
	
	public static long getMaxSumOfContigousArray(ArrayList<Integer> a, int k){

		int n=a.size();
		long ans=0;
		long sum = 0;
		
		//get the first sub array sum of len k
		for(int i=0;i<k;i++) {
			sum=sum+a.get(i);
		}
		
		ans=Math.max(ans, sum);
		for(int i=0;i<n;i++) {
			sum=sum+a.get(i);
			ans=Math.max(ans, sum);
		}//for end
		
		return ans;
	}//method end
	
	

}
