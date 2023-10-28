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

public class ArrayOfSumOfSubArrays {

	public static void main(String[] args) {
		
		
		ArrayList<Long> B = readLongArrayList();
		ArrayList <Long> arrOfAllSubArrSum  = new ArrayList<Long>();
		
		for(int i=0;i<B.size();i++) {
			for(int j=i;j<B.size();j++) {
				arrOfAllSubArrSum.add(getSubArraySum(i, j, B));
			}
		}
		
		
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
	
	static ArrayList<Long> readLongArrayList(){
		
		Scanner sc = new Scanner (System.in);
		ArrayList<Long> alist = new ArrayList<Long>();
		int size;
		
		try {
	//			 sc = new Scanner (System.in);
				
				System.out.println("Enter the size of the array list you want to create:");
				size=sc.nextInt();
				System.out.println("Enter the elements of the arrayList:");
				for(int i=0;i<size;i++) {
					alist.add(sc.nextLong());
				}
				System.out.println("Entered array list is:"+alist);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter Integers only");
		}
		sc.close();
		return alist;
		
	}
	
	
	
	
	
	
	

}
