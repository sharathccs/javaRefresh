/*Write a program to input an integer(A) from user and print the Ath month of the year.

Months list: {January, February, March, April, May, June, July, August, September, October, November, December}
*/

package LogicalThinking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		try {
			int A = sc.nextInt();
			//int A = Integer.parseInt(args[0]);
			if(A>=1 && 12 >=A) {
				int index=A-1;
				System.out.println(month[index]);
			}else {
				System.out.println("Enter a valid month index");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		
	}
	
	public String returnMonth(int B) {
		
		String[] month1 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String val= "NA";
		
		try {
			if(B>=1 && 12 >=B) {
				int index=B-1;
				System.out.println(month1[index]);
				val = month1[index];
			}else {
				System.out.println("Enter a valid month index between 1 and 12");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		
		return val;
		
	}
	
	

}






