package intermediate_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RotationGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///Scan the below inputs
		
		
		//size of the array
		int sizeOfArray;
		
		//array
		int [] arr = new int[sizeOfArray];
	//	int [] Rotated_arr = new int[sizeOfArray];
		
		//	Number of times of rotation
		int NumberOfRotations ;
		

		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				for(int i=0; i<arr.length; i++) {
					 arr[i]=sc.nextInt();
				 }
				
				System.out.println("Enter the number of rotations:");
				 NumberOfRotations = sc.nextInt();
				
				 
				 
				
				 int [] Rotated_arr=RotateArray(arr, NumberOfRotations);
				
				 System.out.println("Rotated Array:");
				 for(int k: Rotated_arr) {
					 System.out.println(k);
				 }
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int[] RotateArray(int [] InputArr, int rotations) {
			
				int l = InputArr.length;
				//int effectiveRotations=rotations%l;
				int [] RotateArr = new int[l];
				
				
				RotateArr[0]=InputArr[l-1];
				for(int k=1, s=0; (k<l) || (s<l-1); k++, s++) {
					RotateArr[k]=InputArr[s];
				}
			
								
				return RotateArr;
			}	

}
