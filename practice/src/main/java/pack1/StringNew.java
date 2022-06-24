/*

Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.

Print in a single line separated by space A+B, A*B, A-B, A/B in the same order.

*/

package pack1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class StringNew {

	public static void main(String[] args) {
		try {
			Scanner scn = new Scanner (System.in);
			
			int A=scn.nextInt();
			int B=scn.nextInt();
			
			System.out.print((A+B)+" ");
			System.out.print((A*B)+" ");
			System.out.print((A-B)+" ");
			
			try {
				System.out.print(A/B);
			}
			catch(ArithmeticException e) {
				System.out.print("infinity");
			}
		
		}catch(InputMismatchException e) {
			System.out.print("Invalid input");
		}
	}
}