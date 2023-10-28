/*
 * 
 * This approach will give memory limit exceeded
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







package intermediate_6_SubArrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxSubArraySumOfFixedLength {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> A = readLongArrayList();
		ArrayList <Long> arrOfAllSubArrSum  = new ArrayList<Long>();
	//	ArrayList <Long> prefixSum = getPrefixSum(B);
		
		/*
		for(int i=0;i<B.size();i++) {
			for(int j=i;j<B.size();j++) {
				
				if(i==0) {
					arrOfAllSubArrSum.add(prefixSum.get(j));
				}else {
					arrOfAllSubArrSum.add(prefixSum.get(j)-prefixSum.get(i-1));
				}
			}
		}
		
		*/
		System.out.println("Array of Sum of Sub Arrays:" );
		for(int k=0;k<arrOfAllSubArrSum.size();k++) {
			System.out.print(arrOfAllSubArrSum.get(k) + " ");
		}
		

	}
	
	
	//Given the start index and end index, get the sum of Sun Array
	public static long getSubArraySum(int s, int e, ArrayList<Long> B) {
		long sum=0;
		for (int i=s ; i<=e; i++) {
			sum=sum+B.get(i);
		}
		return sum;
		
	}
	
	static ArrayList<Integer> readLongArrayList(){
		
		Scanner sc = new Scanner (System.in);
		ArrayList<Integer> alist = new ArrayList<Integer>();
		int size;
		
		try {
	//			 sc = new Scanner (System.in);
				
				System.out.println("Enter the size of the array list you want to create:");
				size=sc.nextInt();
				System.out.println("Enter the elements of the arrayList:");
				for(int i=0;i<size;i++) {
					alist.add(sc.nextInt());
				}
				System.out.println("Entered array list is:"+alist);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter Integers only");
		}
		sc.close();
		return alist;
		
	}
	
	static ArrayList<Long> getPrefixSum(ArrayList<Long> B){
		ArrayList <Long> pSum = new ArrayList <Long>();
		pSum.add(0, B.get(0));
		for(int j=1;j<B.size();j++) {
			pSum.add(j, pSum.get(j-1)+B.get(j));
		}
		return pSum;
	}
	

}
