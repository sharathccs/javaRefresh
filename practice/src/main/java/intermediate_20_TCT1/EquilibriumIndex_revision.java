package intermediate_20_TCT1;

import java.util.ArrayList;


public class EquilibriumIndex_revision {

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
		
		
		
		
		System.out.println("ans:"+getEquilibriumIndex(v));
	}
	
	public static int getEquilibriumIndex(ArrayList<Integer> a){

		int n=a.size();
		if(n==0) {
			return -1;
		}
		ArrayList <Integer> prefixSum = new ArrayList <Integer>();
		prefixSum.add(0,a.get(0));
		
		int sum=a.get(0);
		for(int i=1;i<n;i++) {
			sum=sum+a.get(i);
			prefixSum.add(i, sum);
		}
		
		System.out.println(prefixSum);
		int sumLeft=0;
		int sumRight=0;
		
		
		for(int i=0;i<n;i++) {
			
			if(i==0) {
				sumLeft=0;
				sumRight=prefixSum.get(n-1)-prefixSum.get(i);
			}else {
				sumLeft=prefixSum.get(i-1);
				sumRight=prefixSum.get(n-1)-prefixSum.get(i);
				
				
			}
			
			
			if (sumLeft==sumRight) {
				return i;
			}
		}//end of for
		
		return -1;

	}
	
	

}
