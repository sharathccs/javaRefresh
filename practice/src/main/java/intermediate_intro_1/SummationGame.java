
/*
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

*/

package intermediate_intro_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;


public class SummationGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
				int N = sc.nextInt();
				if(N<=10000 && N>=1) {
					System.out.println(sumOfNaturalNumbers(N));
				}
			else 
				System.out.println("Enter number within the specified  range");
			
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}
	
	public static int sumOfNaturalNumbers(int N) {
		long Sum=0;
		Sum=(N*(N+1)/2);
		return (int)Sum;
	}
}
