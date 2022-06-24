/*

Given an integer N. Print the following pattern.

Input:-

5

Output:-

*****

_****

__***

___**

____*

Here '_' represent the spaces for explanation purpose only. In your code you have to use spaces.


*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern20828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B=A;
			int C=1;
				
				for(int i=1;i<=A;i++) {
					
					//Loop for printing the spaces
					for(int k=1;k<i;k++) {
						System.out.print("-");
					}
					
					
					
					//Loop for printing the stars
					for(int j=1;j<=B;j++) {
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
