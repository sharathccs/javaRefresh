/*

Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.


*/


package intermediate_3_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortByColor {
	
	public static void main(String[] args) {
		
		
		///Scan the below inputs
			//size of array, ArrayList
		
		//size of the array
		int sizeOfArray;
		
		//array
		ArrayList<Integer> arr = new ArrayList<Integer>();
	
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array you want to construct:");
				sizeOfArray	 = sc.nextInt();
				
				
				System.out.println("Enter the array of size:"+sizeOfArray);
				for(int i=0; i<sizeOfArray; i++) {
					 arr.add(i, sc.nextInt());
				 }
		
				 System.out.println(sortByColor(arr));
				 
				 
				 
				
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	

			private static ArrayList<Integer> sortByColor(ArrayList<Integer> A) {
					
					int l = A.size();
					int countRed = 0;
					int countWhite = 0;
					int countBlue = 0;
					
					int j=0;
					int k=0;
					int m=0;
					
					ArrayList<Integer> reqArr = new ArrayList<Integer> ();
					
					for(int i=0;i<l;i++) {
						if(A.get(i)==0) {
							countRed++;
						}else if( A.get(i)==1 ) {
							countWhite++;
						}else 
							countBlue++;
					}
					
					//System.out.println("countRed:"+countRed + "CountWhite:"+countWhite + "CountBlue:"+countBlue);
					
					for( j=0;j<countRed;j++) {
						reqArr.add(j,0);
					//	System.out.println(j);
						//System.out.println("after adding 0:"+reqArr);
					}
					
					for( k= j;k<(countRed+countWhite);k++) {
						reqArr.add(k,1);
						//System.out.println(k);
						//System.out.println("after adding 1:"+reqArr);
					}
					
					for( m= k;m<(countRed+countWhite+countBlue);m++) {
						reqArr.add(m,2);
						//System.out.println(m);
						//System.out.println("after adding 2:"+reqArr);
					}
					
					return reqArr;
					
			}
			
		
			
			

}
