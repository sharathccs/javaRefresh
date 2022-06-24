/*

You are given a constant array A and an integer B.

You are required to return another array where outArr[i] = A[i] + B.


*/

package arrays1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CopyTheArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int[] arr=getInput1DArray();
			outputNegativeIntegers(arr);
		}catch(InputMismatchException e) {
			
		}
	}
	

			
			
			static void outputNegativeIntegers(int [] InputArr) {
				for(int i=0; i<InputArr.length; i++) {
					if(InputArr[i]<0) {
						System.out.print(InputArr[i]);
					}
				}
			}
			
			static ArrayList<Integer> addNumberToEachElement(final List<Integer> A, int B){
				
				ArrayList<Integer> arrList = new ArrayList<Integer>();
				for(int i=0; i<A.size(); i++) {
					int addedElement = B+A.get(i);
					arrList.add(addedElement);
				}
				return arrList;
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
}