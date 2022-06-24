/*


Given two integers N and M. Print a matrix of stars of N rows and M columns.

For example

Input:-

3 2

Output:-

**

**

**



*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InverseMatrixOfStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B= A;
				
				for(int i=1;i<=A;i++) {
					for(int j=B;j>=1;j--) {
						System.out.print("*");
					}B=B-1;
					System.out.println();	
				}
		
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();
	}

}
