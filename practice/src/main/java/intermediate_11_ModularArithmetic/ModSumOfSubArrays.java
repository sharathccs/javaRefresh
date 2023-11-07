/*
 * 
 * The below approach of getModSum will give a TLE. So please refer to gerModSumSmasherl
 * 
 * 
 * 
 * 
 * 
 * /
 */




package intermediate_11_ModularArithmetic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModSumOfSubArrays {

	public static void main(String[] args) {
		int []A= get1DArray();
		
		
		
		System.out.println(" out of getModSum: " + getModSum(A));
		
			

	}
	
	
	//Given the start index and end index, print the sub arrays
	public static void printSubArray(int s, int e, int [] B) {
		
		//System.out.println("Printing the subArray:");
		for (int i=s; i<=e; i++) {
			System.out.println(B[i] + " " );
		}System.out.println(".....................");
		
	}
	
	
	public static int[] get1DArray() {
		
			int [] arr = null;
		
		Scanner sc = new Scanner(System.in);
		try {
				System.out.println("Enter the size of the array:");
				int N=sc.nextInt();
				
				System.out.println("Enter the array of size:"+ N);
				arr = new int [N];
				
				
				
				for (int i=0; i<N; i++) {
					arr[i] = sc.nextInt();
							
				}
				
				 System.out.println("Entered Array:");
				 System.out.println();
				 
				 
					for (int i=0; i<N; i++) {
						System.out.print(arr[i] + " ");
					}		
					
					System.out.println();
			}catch(InputMismatchException e) {
			
		}	
		sc.close();
		
		return arr;
		
		
		
	}
	
	
	
	public static int getModSum(int [] ar) {
		
		Long sum=0l;
        	for(int i=0;i<ar.length;i++) {
                for(int j=0;j<ar.length;j++) {
                	
                	System.out.println("Sub array is this: " + ar[i] + " " + ar[j] + ", Thier sum of mods is: " + (ar[i]%ar[j]));
                	
                	
                    sum=sum+(ar[i]%ar[j]);
                                 System.out.println("Overall sum: " + sum);
                    
                }
		}
		
        
        int x=(sum.intValue());
        System.out.println("x:" + x);
        
        return x%1000000007;
        
      }// end of getModSum
	
	
	

}
