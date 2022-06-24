/*


Given an integer N (N >= 2). Print N lines with two stars ('*') in each line with N - 2 spaces in between.

For example

Input:-

5

Output:-

*___*

*___*

*___*

*___*

*___*

Here '_' represents space for explanation purposes only. You have to print actual spaces in your code.


*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoLineStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B= A;
				
				for(int i=1;i<=A;i++) {
					for(int j=1;j<=B;j++) {
						if(j==1 || j == B) {
							System.out.print("*");
						}else {
							System.out.print("_");
						}
							
					}
					System.out.println();	
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();
	}

}
