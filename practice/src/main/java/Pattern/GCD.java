package Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int B = sc.nextInt();
				int GCD = 1;
				int N=1;
				if (A>=B) {
					N = A;
				}else {
					N = B;
				}
				if(A<=1000 && A>=1) {		
					/*
					 * for(int i=1;i<=N;i=i+1) { if(A%i==0 && B%i==0) { GCD=i; } }
					 */
					
					//Alternate logic
					
					for(int i=N;i>=1;i=i-1) {
						if(A%i==0 && B%i==0) {
							GCD=i;
							break;
						}
					}
						
						
						
						
						
						
				}System.out.println(GCD);
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
