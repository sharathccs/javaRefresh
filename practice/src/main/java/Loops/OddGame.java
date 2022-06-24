
/*
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

*/

package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int limit = 0;
		int i=0;
		try {
				int N = sc.nextInt();
				if(N<=1000002 && N>=1) {		
						for( i=1;i<=N;i=i+2) {
								System.out.print(i + " ");
							}

							
						}
					
				
						/*
						if(N%2==0) {
							limit=N-2;
							for(i=1;i<=limit;i=i+2) {
								System.out.print(i+ " ");
							}System.out.print(i);
						}else {
							limit=N-2;
							for(i=1;i<=limit;i=i+2) {
								System.out.print(i+ " ");
							}System.out.print(i);
						}
						
						*/
						
						
					
					
					
				//}//System.out.print("\b");
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}

}
