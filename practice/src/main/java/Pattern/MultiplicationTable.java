/*

For a given number A, print its multiplication table having the first 10 multiples.

1 <= A <= 1000

A=2
 2 * 1 = 2 
 2 * 2 = 4 
 2 * 3 = 6 
 2 * 4 = 8 
 2 * 5 = 10 
 2 * 6 = 12 
 2 * 7 = 14 
 2 * 8 = 16 
 2 * 9 = 18 
 2 * 10 = 20 





*/


package Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int B=A-1;
				if(A<=1000 && A>=1) {				
					for(int i=1;i<=10;i=i+1) {
						System.out.println(A+ " * "+ i + " = "+ (A*i));
					}
						
						
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
