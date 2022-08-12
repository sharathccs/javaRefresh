/*

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right

*/


package intermediate_2_arrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LittlePonyAndMaxElement {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
			//size of array, ArrayList, B
		///iterate thru the array and check if B is present. If not, return
		
		//if B is present, then iterate thru the array to find elements greater than B and increase the requiredCount
		
		//size of the array
		int sizeOfArray;
		
		//array
		ArrayList<Integer> arr = new ArrayList<Integer>();
	
		
		//	Target Number
		int B;
		

		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				for(int i=0; i<sizeOfArray; i++) {
					 arr.add(i, sc.nextInt());
				 }
				
				System.out.println("Enter B:");
				 B= sc.nextInt();
				 

				 System.out.println(findCountforMax(arr, B));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int findCountforMax(ArrayList<Integer> A, int B) {
					int l = A.size();
					int val=0;
					boolean checkB = false;
					
					if(A.contains(B))
						checkB=true;
					else
						return -1;
 					
					if(checkB) {
						if(B==-1) {
							return -1;
						}else {
								for(int j=0;j<l;j++) {
									if(A.get(j)>B) {
										val=val+1;
									}
								}
							}
					
						}		
					return val;
			}
			
		
			
			

}
