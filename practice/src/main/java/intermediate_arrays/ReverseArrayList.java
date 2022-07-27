/*


You are given a constant array A.

You are required to return another array which is the reversed form of the input array.



*/


package intermediate_arrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
		
		
		//size of the array
		int sizeOfArray;
		
		//array
	
		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of the array:");
				sizeOfArray=sc.nextInt();
			
				System.out.println("Enter the array:");
				ArrayList<Integer> arr = new ArrayList<Integer>(); 
						
				
				for(int i=0; i<sizeOfArray; i++) {
					arr.add(i, sc.nextInt() );
				 }
				
				System.out.println(reverseArrayList(arr)); 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static ArrayList<Integer> reverseArrayList(ArrayList<Integer> InputList) {
					int l = InputList.size();
					ArrayList<Integer> revList = new ArrayList<Integer>(l);
					for(int i=0;i<=(l-1);i++) {
						revList.add(i, InputList.get(l-1-i));
					}
					return revList;
			}
			
}
