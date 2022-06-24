package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativeIntegers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int[] arr=getInput1DArray();
			System.out.println(sumTheArray(arr));
		}catch(InputMismatchException e) {
			
		}
	}			
			static int[] getInput1DArray() {

				int sizeOfArray;
				
				Scanner sc = new Scanner(System.in);
				
						
						System.out.println("Enter the size of array you want to construct:");
						sizeOfArray	 = sc.nextInt();
						System.out.println("Enter the array of size:"+sizeOfArray);
						int[] arr = new int[sizeOfArray];
						for(int i=0; i<arr.length; i++) {
							 arr[i]=sc.nextInt();
						 }
						
						 System.out.println("Entered Array:");
						 for(int k: arr) {
							 System.out.println(k);
						 }
						 System.out.println("--------------------");
						 
						 sc.close();
				
					return arr;	
			}
			
			static int sumTheArray(int [] arr) {
				int sum=0;
				for(int i=0; i<arr.length; i++) {
					sum=sum+arr[i];
				}
				return sum;
			}
			
}