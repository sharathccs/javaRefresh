package LogicalThinking2;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				if(A <=1000000) {
					if(B <=1000000) {
						
						if((A>=B)) {
							System.out.println(B);
						}else {
							System.out.println(A);
						}
						
						
					}else {
						System.out.println("NA");
					}	
						
				}else {
					System.out.println("NA");
				}
				
	  		}catch (ArithmeticException e1) {
	            // Exception handler
	  				System.out.println("Divided by zero operation cannot possible");
	        }
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		

		

	}

}
