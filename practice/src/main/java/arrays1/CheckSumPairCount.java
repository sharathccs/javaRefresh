package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckSumPairCount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sizeOfArray;
		boolean isFound = true;
		
		int SearchElement = 1;
		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
			
				sizeOfArray	 = sc.nextInt();
				System.out.println("Enter the array of size:"+sizeOfArray);
				int [] arr = new int[sizeOfArray];
				

				
				for(int i=0; i<arr.length; i++) {
					 arr[i]=sc.nextInt();
				 }
				
				 System.out.println("Entered Array:");
				 for(int k: arr) {
					 System.out.println(k);
				 }
				 
				 System.out.println("Enter a sum to be checked:");
				 int sumToBeChecked=sc.nextInt();
				 
			
				
				System.out.println("Pait of numbers with checksum is:"+PairCountOfSum(arr, sumToBeChecked));
				
				
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
			private static int PairCountOfSum(int [] InputArr, int k) {
				
				int l = InputArr.length;
				int [] SumArray = new int[l];
				int sum=0;
				boolean IsCheckSum = false;
				int count=0;
				for (int i=0; i < InputArr.length ; i++){
					for (int j=i+1;j< InputArr.length ; j++) {
						sum= InputArr[i]+InputArr[j];
							if (sum==k) {
								IsCheckSum=true;
								System.out.println(InputArr[i] + " " + InputArr[j] );
								count=count+1;
							}
					}
					
					
				}
								
				return count;
			}
			
			


	

}
