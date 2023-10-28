/*
 Write a program to input T numbers(N) from user and print count of digits of the given numbers.

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

public class HCFwithLoops {

	public static void main(String[] args) {
		BigInteger[][] pairOfNumbersForHCF = getNPairOfNumbersForHCF();
		System.out.println("Entered Pair of numbers:");
		for(int l=0;l<pairOfNumbersForHCF.length;l++) {
			System.out.println(pairOfNumbersForHCF[l][0] + "," + pairOfNumbersForHCF[l][1]);
			getHCFOf2Digits(pairOfNumbersForHCF[l][0], pairOfNumbersForHCF[l][1]);
		}
		
		
	}
	
	private static BigInteger[][] getNPairOfNumbersForHCF() {
		 //this will accept N inputs from the user to an array
		
	
		
		System.out.println("Enter the number of pairs of input inputs:\n");
		Scanner sc = new Scanner(System.in);
					BigInteger T ;
					T=sc.nextBigInteger();
					int r = T.intValue();
					BigInteger[][] inputPairArray = new BigInteger[r][2];
					for(int i=0;i<r;i++) {
						for(int j=0;j<2;j++) {
							inputPairArray[i][j]=sc.nextBigInteger();
						}
					}
					
					/*
					System.out.println("Below are the numbers entered. They are:" );
					
					for(int i=0;i<r;i++) {
						for(int j=0;j<2;j++) {
							System.out.println(inputPairArray[i][j]);
						}
					}
					
					*/
			
					sc.close();
						return inputPairArray;
						
					
						
			/*			
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		*/
	}
			private static BigInteger getHCFOf2Digits(BigInteger a, BigInteger b ) {
							BigInteger hcf=BigInteger.ONE;
							 for(int i = 1; i <= a.intValue() || i <= b.intValue(); i++) {
						         if( a.intValue()%i == 0 && b.intValue()%i == 0 )
						         hcf = BigInteger.valueOf(i);
						      }
						      System.out.println("HCF of given two numbers is ::"+hcf.intValue());		
						return hcf;
				}
	
	
}
