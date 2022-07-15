
/*
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

*/

package intermediate_intro_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;


public class IsPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		boolean isPrime = true;
		try {
				int N = sc.nextInt();
				if(N<=10000001 && N>=1) {
					
					isPrime=CheckPrime(N);
						
				if(isPrime) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("Enter number within range");
			}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}
	
	public static boolean CheckPrime(int N) {
		boolean prime=false;
		int count=0;
		for(int i=1; i<=Math.floor(Math.sqrt(N)); i++) {
			if(N%i==0) {
				if(i==Math.sqrt(N))
				count=count+1;
				else
				count=count+2;
			}
		}
		if(count==2) {
			prime=true;
		}
		return prime;
		
	}
	
	
	

}
