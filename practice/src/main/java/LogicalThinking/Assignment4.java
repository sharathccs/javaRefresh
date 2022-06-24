/*
 * 
 * You are given an integer A.

You have to tell how many days are there in the month denoted by A in a non-leap year.

Months are denoted as follows:

January : 1
February : 2
March : 3
April : 4
May : 5
June : 6
July : 7
August : 8
September : 9
October : 10
November : 11
December : 12
 * 
 * 
*/

package LogicalThinking;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int A = sc.nextInt();
			
			// Create a month instance
	        Month month = Month.of(A);
	  
	        // Print the length of this Month
	        System.out.println(month.length(false));

		}catch(DateTimeException e1) {
			System.out.println("Invalid month index");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		
		
	}

}






