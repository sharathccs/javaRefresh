
/*
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

*/

package Loops2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsItPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		boolean isPrime = true;
		try {
				int N = sc.nextInt();
				if(N<=10000001 && N>=1) {
					
						if(N==1) {
							isPrime=true;
						}
					
						for( i=2;i<N;i=i+1) {
								if(N%i==0) {
									isPrime= false;
								}
							}
						
				if(isPrime) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}

}
