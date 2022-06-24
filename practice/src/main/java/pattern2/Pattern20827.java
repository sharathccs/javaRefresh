/*

Given an integer N. Print the following pattern.

Input:-

5

Output:-

____* // 4 spaces

___** // 3 spaces

__*** // 2 spaces

_**** // 1 space

***** // 0 space


*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern20827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B=A-1;
			int C=1;
				
				for(int i=1;i<=A;i++) {
					
					
					//Loop for printing the spaces
					for(int j=B;j>=1;j--) {
						System.out.print("-");
					}B=B-1;
					
					
					//Loop for printing the stars
					for(int k=1;k<=C;k++) {
						System.out.print("*");
					}C=C+1;
					
					System.out.println();	
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();
	}

}
