/*

You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.



*/


package intermediate_2_arrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
			//size of array, ArrayList
		
		//size of the array
		int sizeOfArray;
		
		//array
		ArrayList<Integer> arr = new ArrayList<Integer>();
	
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				for(int i=0; i<sizeOfArray; i++) {
					 arr.add(i, sc.nextInt());
				 }
		
				 System.out.println(findSecondMax(arr));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int findSecondMax(ArrayList<Integer> A) {
					int l = A.size();
					int max1 = A.get(0);
					int max2 = A.get(1);
					
						for(int j=0;j<l;j++) {
							if(A.get(j)>max1) {
								//max2=max1;
								max1=A.get(j);
							}else if(A.get(j)> max2){
								max2=A.get(j);
							}
						}
					return max2;
			}
			
		
			
			

}
