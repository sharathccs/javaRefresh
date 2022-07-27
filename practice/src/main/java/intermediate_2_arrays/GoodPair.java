/*

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right

*/


package intermediate_2_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodPair {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
		
		
		//size of the array
		int sizeOfArray;
		
		//array
		int [] arr ;
	
		
		//	Target Number
		int B;
		
		

		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				arr = new int[sizeOfArray];
				
				for(int i=0; i<arr.length; i++) {
					 arr[i]=sc.nextInt();
				 }
				
				System.out.println("Enter B:");
				 B= sc.nextInt();
				 

				 System.out.println(checkGoodPair(arr, B));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int checkGoodPair(int [] InputArr, int B) {
					int l = InputArr.length;
					int val=0;
					for(int i=0;i<l-1;i++) {
						for(int j=i+1;j<l;j++) {
							if ((i!=j) && (InputArr[i]+InputArr[j]==B)) { 
								val=1;
								break;
							}
						}
					}
					return val;
				
			}
			
		
			
			

}
