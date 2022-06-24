package LogicalThinking2;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisble5Or11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				
				
				if(A <=1000000 || A >=1) {
					
					if((A%5)==0 && (A%11)==0 ) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					
				}else {
					System.out.println("NA");
				}
				
	  		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		

		

	}

}
