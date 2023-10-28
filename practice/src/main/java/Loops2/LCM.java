/*
 Write a program to input T numbers(N) from user and print the LCM of the numbers

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
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		
		BigInteger hcf=BigInteger.ONE;
		 for(int i = 1; i <= a.intValue() || i <= b.intValue(); i++) {
	         if( a.intValue()%i == 0 && b.intValue()%i == 0 )
	         hcf = BigInteger.valueOf(i);
	      }
		 
		 BigInteger lcm = (a.multiply(b)).divide(hcf);
	      System.out.println("HCF of given two numbers is ::"+hcf.intValue());
	      System.out.println("LCM:"+lcm);
	
		sc.close();
		
		
		
	}	
}
