/*
 * Write a program to input T numbers(N) from user and print first and last digits of the given numbers.

*/
package Pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstVSLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int T=1;
		
		try {
			T = sc.nextInt();
			int[] intArray = new int[T];
			for(int i=0;i<T;i++) {
				intArray[i]=sc.nextInt();
			}
			//System.out.println("Printing the array of integers:");
			for(int j: intArray) {
				//System.out.println(j);
				System.out.print(getFirstDigit(j));
				System.out.print(" ");
				System.out.print(getLastDigit(j));
				System.out.println();
			}
			//pass the array and print the first digit
			//pass the array and print the last digit
			
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}
	
	private static int getFirstDigit(int N) {
		int FirstDigit=0;
		//int reminder = 0;
		//System.out.print("Getting the first digit of:"+N);
		
		while(N>=10) {
			N=N/10;
		}
		return N;
	}
	private static int getLastDigit(int M) {
		//System.out.print("Getting the last digit of:"+M);
		
		
		return (M%10);
	}
}
