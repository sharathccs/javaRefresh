/*


You are given an integer T (number of test cases). You are given array A and an integer B for each test case. 
You have to tell whether B is present in array A or not.

*/


package intermediate_2_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchElementInArray {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
		
		
		//size of the array
		double T;
		double sizeOfArray;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arrArr = new ArrayList<ArrayList<Integer>>();
		//HashMap<Integer, ArrayList<Integer>> mapa = new HashMap<Integer, ArrayList<Integer>>();
	
		ArrayList<Integer> ResultList = new ArrayList<Integer>();
		int val=0;
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter T");
				T=sc.nextInt();
			
				for(int k=0;k<T;k++) {
					System.out.println("Enter size of array followed by array elements:");
					sizeOfArray=sc.nextDouble();
					 
					for(int i=0; i<sizeOfArray; i++) {
						arr.add(i, sc.nextInt() );
					 }
					
					System.out.println("Enter B:");
					int B=sc.nextInt();
					
					if(arr.contains(B)) {
						val=1;
					}else {
						val=0;
					}
					
					ResultList.add(k, val);
					
				}
				
				for(int m:ResultList) {
					System.out.println(m);
				}
				
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	
			
}
