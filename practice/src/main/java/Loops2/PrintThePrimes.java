
/*
You are given an integer N you need to print all the Prime Numbers between 1 and N.

Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
*/

package Loops2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintThePrimes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=2;
		
		boolean isPrime = true;
		try {
				int N = sc.nextInt();
				if(N<=300 && N>=1) {
						
						if(N==1) {
							N=N-1;
							System.out.println(1);
						}
						for(i=2;i<N;i++) {
							//System.out.println("checking for prime:"+i);
							isPrime = CheckPrime(i);
							//System.out.println("Result for "+i + ": " + isPrime);
							if(isPrime) {
								System.out.println(i);
							}
						}
					}
			}catch(InputMismatchException e) 
		{
			System.out.println("Enter an integer");
		}	

	}
	
	
	private static boolean CheckPrime(int n) {
		// TODO Auto-generated method stub
		//System.out.println("Inside check prime method:"+n);
		boolean checkPrime=true;
		for(int j=2;j<n;j++) {
			//System.out.println("checking the primeness of :"+n + " with "+ j);
			if(n%j==0) {
				checkPrime=false;
				break;
			}
		}
		
		
		return checkPrime;
	}
	
}




