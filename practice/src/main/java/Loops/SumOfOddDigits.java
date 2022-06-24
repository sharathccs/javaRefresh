package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int A = sc.nextInt();
				if(A<=1000 && A>=1) {
					int reminder=A;
					int Sum=0;
					
					while(A>0) {
						reminder = A%10;
						if(reminder %2 != 0) {
							Sum = reminder + Sum;
						}
						A=A/10;
					}
					System.out.println(Sum);
				
			}else{
				System.out.println("Enter number between 1 and 1000");
			}
				
				
	  		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
