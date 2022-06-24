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

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountTheDigits {

	public static void main(String[] args) {
		float[] ListOfNums = getNInputs();
		for(float j : ListOfNums) { 
			System.out.println(getCountOfDigits(j));
		}
	}
	
	private static float[] getNInputs() {
		 //this will accept N inputs from the user to an array
		
		/*
		try{
			
			
		*/	Scanner sc = new Scanner(System.in);
				int T = 1;
			
			
				
					T=sc.nextInt();
					float[] floatArray = new float[T];
					for(int i=0;i<T;i++) {
						floatArray[i]=sc.nextInt();
					}
					
				/*	
					System.out.println(T + " numbers are entered. They are:" );
					for(int m : intArray) 
						System.out.println(m);
			*/
					
						return floatArray;
						
			/*			
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		*/
	}
	private static int getCountOfDigits(float M) {
		
					int reminder=1;
					int count=0;
					
					if(M!=0) {
						while(reminder!=0) {
							System.out.println("reminder before:"+reminder);
							reminder = Math.round(M%10);
							System.out.println("reminder after:"+reminder);
							if(reminder!=0)
							count = count + 1 ;
							System.out.println("Count:"+count);
							M=Math.round(M/10);
							System.out.println("M:"+M);
									
						}
					}else {
						count = count +1;
					}
					
				
				return count;
		}
}
