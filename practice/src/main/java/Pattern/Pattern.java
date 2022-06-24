package Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				
				if(A<=1000 && A>=1) {		
					/*
					 * for(int i=1;i<=N;i=i+1) { if(A%i==0 && B%i==0) { GCD=i; } }
					 */
					
					//Alternate logic
					
					for(int i=1;i<=A;i=i+1) {
							for(int j=1;j<=A;j=j+1) {
								System.out.print("*");
						}System.out.println();
							
					}
						
						
						
						
						
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
