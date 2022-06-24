/*
Given N=6
*     *
*    *
*   *
*  *
* *
**

*/


package Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int B=A-1;
				if(A<=1000 && A>=1) {		
					/*
					 * for(int i=1;i<=N;i=i+1) { if(A%i==0 && B%i==0) { GCD=i; } }
					 */
					
					//Alternate logic
					
					
					for(int i=1;i<=A;i=i+1) {
						System.out.print("*");
						for(int j=1;j<=B;j=j+1) {
							System.out.print(" ");
						
					}	B=B-1;
						System.out.print("*");
						System.out.println();
						
				}
						
						
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
