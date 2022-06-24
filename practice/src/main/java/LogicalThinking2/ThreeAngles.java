package LogicalThinking2;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeAngles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int B = sc.nextInt();
				int C = sc.nextInt();
				
				

				
				if(A >=1 && A <=180) {
					if(B >=1 && B <=180) {
						if(C >=1 && C <=180) {
							
							if((A+B+C)==180) {
								System.out.println("1");
							}else {
								System.out.println("0");
							}
							
							
						}else {
							System.out.println("NA");
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
