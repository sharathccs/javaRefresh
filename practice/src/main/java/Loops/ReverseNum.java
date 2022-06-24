package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();		
				int reminder=A;
				int Reverse=0;
				
				while(A>0) {
					reminder = A%10;
					
						Reverse = (Reverse*10)+reminder;
					
					 
					A=A/10;
				}
				System.out.println(Reverse);
				
				
	  		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
