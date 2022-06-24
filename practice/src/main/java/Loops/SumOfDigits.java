package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();		
				int reminder=A;
				int Sum=0;
				
				while(reminder!=0) {
					reminder = A%10;
					Sum = reminder + Sum; 
					A=A/10;
				}
				System.out.println(Sum);
				
				
	  		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
