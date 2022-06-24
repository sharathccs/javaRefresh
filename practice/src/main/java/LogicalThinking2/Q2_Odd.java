package LogicalThinking2;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2_Odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int B = sc.nextInt();
				double C = 0 ; 
					
				
				if(B!=0) {
					C = Math.floor(A/B);
					
					Double newData = new Double(C);
					int value = newData.intValue();
					
					
					System.out.println(value);
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
