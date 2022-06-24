package LogicalThinking2;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int B = sc.nextInt();
				int C = sc.nextInt();
				
				

				
				if(A >=1 && A <=100000) {
					if(B >=1 && B <=100000) {
						if(C >=1 && C <=100000) {
							
							if((A==B) && (A==C) && (C==B) ) {
								System.out.println("equilateral");
							}else if((A!=B) && (A!=C) && (C!=B)){
								System.out.println("scalene");
							} 
								 else if((A==B) || (B==C) || (A==C) ){
									 { System.out.println("isoceles"); }
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
