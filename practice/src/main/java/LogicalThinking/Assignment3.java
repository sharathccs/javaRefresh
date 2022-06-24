/*
 * 
 * Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.
 * 
 * 
*/

package LogicalThinking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A>=1 && 1000000 >=A) {
				if(B>=1 && 1000000 >=B) {
						if(A>B) {
							System.out.println(A);
						} else {
										System.out.println(B);
							}
	
				}//System.out.println("B is out of bounds");
				
			}//System.out.println("A is out of bounds");

		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		
	}

}






