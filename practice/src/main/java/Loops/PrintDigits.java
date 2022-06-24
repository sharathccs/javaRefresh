package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();		
				int reminder=A;
				 
				while(reminder!=0) {
					reminder = A%10;
					if(reminder!=0)
					System.out.println(reminder);
					A=A/10;
				}
				
				
				
	  		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}

	}

}
