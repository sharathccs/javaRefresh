/*


Given an Integer N. Print an Inverse half pyramid of N lines using '*'.

For example

Input:-

5

Output:-

*****

****

***

**

*


*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixOfStars {

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
