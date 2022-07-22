/*

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right

*/


package intermediate_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RotationGame {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
		
		
		//size of the array
		int sizeOfArray;
		
		//array
		int [] arr ;
	//	int [] Rotated_arr = new int[sizeOfArray];
		
		//	Number of times of rotation
		int NumberOfRotations ;
		int EffectiveRotations ;
		

		
		Scanner sc = new Scanner(System.in);
		try {
				
				//System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				//System.out.println("Enter the array of size:"+sizeOfArray);
				arr = new int[sizeOfArray];
				
				for(int i=0; i<arr.length; i++) {
					 arr[i]=sc.nextInt();
				 }
				
				//System.out.println("Enter the number of rotations:");
				 NumberOfRotations = sc.nextInt();
				 EffectiveRotations = NumberOfRotations%sizeOfArray;
				 int m=0;
				 int [] Rotated_arr=new int[sizeOfArray];
				 
				 
				 
				 if(EffectiveRotations==0) {
					 printArray(arr);
				 }else {
					 while(m<EffectiveRotations){
								Rotated_arr=RotateArray(arr);
								 m++;
								 arr=Rotated_arr;	 
					 }
					 printArray(Rotated_arr);
					
				 }
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static int[] RotateArray(int [] InputArr) {
					int l = InputArr.length;
					int [] RotateArr = new int[l];
		
					RotateArr[0]=InputArr[l-1];
					for(int k=1, s=0; (k<l) || (s<l-1); k++, s++) {
						RotateArr[k]=InputArr[s];
					}					
					return RotateArr;
				
			}
			
			static void printArray(int [] ArrayToBePrinted) {
				
				for(int k: ArrayToBePrinted) {
					 System.out.println(k);
				 }
				
			}
			
			

}
