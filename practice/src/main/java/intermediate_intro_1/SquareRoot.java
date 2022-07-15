
/*
Given a number A. Return square root of the number if it is perfect square otherwise return -1.

*/

package intermediate_intro_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;


public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sqN;
		try {
				int N = sc.nextInt();
				if(N<=10000 && N>=1) {

					System.out.println(squareRoot(N));
					
				}
			else 
				System.out.println("Enter number within the range");
			
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}
	
	public static int squareRoot(int N) {
		double sqN;
		int x;
		
		sqN=Math.sqrt(N);
		if(sqN == (int)sqN) {
			return (int)sqN;
		}else
			return -1;
	}
}
