/*
 Write a program to input T numbers(N) from user and print sum of digits of the given numbers.

*/
/*
 * 1. Scan the number of elements
 * 2. Write a scanner to accept the numbers
 * 3. Read the numbers to an array
 * 4. For each element of the array, get the digits and print it
 * 5. Sum up the positive divisors and check if its perfect
 * 
 * getNInputs - this will accept N imputs from the user to an array
 * getTheCountOfDigits - this will get the array of positive divisors of a number
 * checkIfItsPerfect - this will accept an array of numbers, sum it up and compare with N and return a boolean
 * 
 * 
 * 
 * 
 * 
 */


package Loops2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		BigInteger[] ListOfNums = getNInputs();
		for(BigInteger j : ListOfNums) { 
			System.out.println(getSumOfDigits(j));
		}
	}
	
	private static BigInteger[] getNInputs() {
		 //this will accept N inputs from the user to an array
		
		/*
		try{
			
			
		*/	
		
		System.out.println("Enter the number of inputs:\n");
		Scanner sc = new Scanner(System.in);
					BigInteger T ;
					T=sc.nextBigInteger();
					int s = T.intValue();
					BigInteger[] inputArray = new BigInteger[s];
					for(int i=0;i<s;i++) {
						inputArray[i]=sc.nextBigInteger();
					}
					
				
					System.out.println(T + " numbers are entered. They are:" );
					for(BigInteger m : inputArray) 
						System.out.println(m);
			
					sc.close();
						return inputArray;
						
					
						
			/*			
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		*/
	}
	private static BigInteger getSumOfDigits(BigInteger M) {
		
					BigInteger reminder=BigInteger.ONE;
					BigInteger sumOfDigits = BigInteger.ZERO;
					
				
						if(M.intValue()!=0) {
						while(reminder.intValue()!=0 && M.intValue()!=0 ) {
							
							
							reminder = M.mod(BigInteger.TEN);
							if(reminder.intValue()!=0) { 
									sumOfDigits = sumOfDigits.add(reminder);
									M=M.divide(BigInteger.TEN);
							}else if(M.intValue()!=0 && reminder.intValue()==0) {
								sumOfDigits = sumOfDigits.add(reminder);
								reminder = M.ONE;
								M=M.divide(BigInteger.TEN);
							}else
							M=M.divide(BigInteger.TEN);
							//System.out.println("M:"+M);
									
						}
					}else {
						sumOfDigits = sumOfDigits.add(reminder);
					}
					
				
				return sumOfDigits;
		}
}
