/*

Given an integer N. Print N lines. The ith line having 
2 * N - (i-1) * 2 stars and 
(i-1) * 2 spaces.

Input:-

5

Output:-

********** // 0 spaces

****__**** // 2 spaces

***____*** // 4 spaces

**______** // 6 spaces

*________* // 8 spaces

Here '_' is used to represent spaces. You have to print spaces in your code.

*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern20868 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B=A;
			int C=1;
				
				for(int i=1;i<=A;i++) {
					
					//Loop for printing the stars
					for(int k=1;k<=(2 * A - (i-1) * 2 );k++) {
						//System.out.print(N);
						System.out.print("*");
					}
					
					
					/*
					
					//Print the first  of triangle stars
					for(int k=1;k<=B;k++) {
						//System.out.print(N);
						System.out.print("*");
					}B=B-1;
					
					*/
					
					//Loop for printing the spaces
					int j=1;
					for(j=1;j<=(i-1)*2;j++) {
						System.out.print("-");
					}
					
					
					/*
					//Print the second  of triangle stars
					for(int k=1;k<=B;k++) {
						//System.out.print(N);
						System.out.print("*");
					}B=B-1;
				
					*/
					
					System.out.println();	
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();
	}

}
