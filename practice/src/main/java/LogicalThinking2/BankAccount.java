/*You are given a Bank account having N amount and you are asked to perfrom ADD(credit) or SUBTRACT(debit) operation.

After the operation print the amount left in the Bank account. If the debit amount is greater than current balance
print "Insufficient Funds"(without quotes) and the operation is skipped.

*/
package LogicalThinking2;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int Balance = sc.nextInt();
				int TypeOfOperation = sc.nextInt();
				int Amount = sc.nextInt();
				int LeftAmount;
				

				
				if(Balance>=1) {
					if(TypeOfOperation==1 || TypeOfOperation==2) {
						if(Amount <=100000) {
							
							if(TypeOfOperation==1) {
								LeftAmount = Balance + Amount;
								System.out.println(LeftAmount);
							}else if(Balance > Amount) {
								LeftAmount = Balance - Amount;
								System.out.println(LeftAmount);
							}else {
								System.out.println("Insufficient Funds");
							}
								
							
							
						}else {
							System.out.println("Amount should be <=100000 ");
						}	
					}else {
						System.out.println("Enter the correct type of operation: 1 or 2");
					}	
				}else {
					System.out.println("Balance should be greater than 0");
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
