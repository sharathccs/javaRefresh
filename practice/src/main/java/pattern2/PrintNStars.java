/*

Given N=4, print an isoceles triangle

*
**
***
****


*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintNStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
				int A = sc.nextInt();
			
				if(A<=1000 && A>=1) {		
					for(int i=1;i<=A;i++) {
						System.out.print("*");
					}
				}	
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();
	}
}