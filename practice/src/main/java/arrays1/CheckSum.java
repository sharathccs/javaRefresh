package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckSum {
	
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
				 
				System.out.println("IsCheckSum:"+CheckSumK(arr, sumToBeChecked));
				
				System.out.println("IsCheckSum in an Optimized way:"+OptimizedCheckSumK(arr, sumToBeChecked));
				
				
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static boolean CheckSumK(int [] InputArr, int k) {
			
				int l = InputArr.length;
				int [] SumArray = new int[l];
				int sum=0;
				boolean IsCheckSum = false;
				for (int i=0; i < InputArr.length ; i++){
					for (int j=0;j< InputArr.length ; j++) {
						sum= InputArr[i]+InputArr[j];
						
						if (i!=j) {
							if (sum==k) {
								IsCheckSum=true;
								System.out.println(InputArr[i] + " " + InputArr[j] );
							}
						}
						
						
					}
					
					
				}
								
				return IsCheckSum;
			}	

			
			
			private static boolean OptimizedCheckSumK(int [] InputArr, int k) {
				
				int l = InputArr.length;
				int [] SumArray = new int[l];
				int sum=0;
				boolean IsCheckSum = false;
				for (int i=0; i < InputArr.length ; i++){
					for (int j=i+1;j< InputArr.length ; j++) {
						sum= InputArr[i]+InputArr[j];
							if (sum==k) {
								IsCheckSum=true;
								System.out.println(InputArr[i] + " " + InputArr[j] );
							}
					}
					
					
				}
								
				return IsCheckSum;
			}
			
			
			private static int SecondMax(int [] InputArr) {
				
				
					
					int firstMax = InputArr[0];
					int secondMax = 1;
					for (int i=0; i < InputArr.length ; i++){
						if(firstMax > InputArr[0]) {
							secondMax=firstMax;
							firstMax=InputArr[i];
						}else if( InputArr[i] >  secondMax	) {
							 //optimized line
							//else if( InputArr[i] >  secondMax && secondMax!=firstMax	) {
							
							secondMax = InputArr[i];
						}
					}
					
					
				
								
				return secondMax;
			}

	

}
