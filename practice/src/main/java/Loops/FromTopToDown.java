
/*
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

*/

package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FromTopToDown {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		try {
				int N = sc.nextInt();
				if(N<=10000000 && N>=1) {		
						for( i=N;i>=1;i=i-1) {
								System.out.print(i + " ");
							}
						}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}

}
