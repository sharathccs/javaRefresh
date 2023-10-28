package intermediate_6_SubArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintingASubArray {

	public static void main(String[] args) {
		int []A= get1DArray();
		
		for(int i=0;i<A.length;i++) {
			for(int j=i;j<A.length;j++) {
				printSubArray(i, j, A);
			}
		}
		
			

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
					for (int i=0; i<N; i++) {
						System.out.print(arr[i] + " ");
					}		
			}catch(InputMismatchException e) {
			
		}	
		sc.close();
		
		return arr;
		
		
		
	}
	
	
	

}
