/*
 You are given N positive integers.

For each given integer A, you have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

*/
/*
 * 1. Scan the number of elements
 * 2. Write a scanner to accept the numbers
 * 3. Read the numbers to an array
 * 4. For each element of the array, get the positive divisors
 * 5. Sum up the positive divisors and check if its perfect
 * 
 * getNInputs - this will accept N imputs from the user to an array
 * getPositiveDivisors - this will get the array of positive divisors of a number
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

public class IsItPerfect {

	public static void main(String[] args) {
		int[] ListOfNums = getNInputs();
		
		
		for(int j : ListOfNums) {
			ArrayList<Integer> ListOfPositiveDivisors = getPositiveDivisors(j);
			boolean IsPerfect =  checkIfItsPerfect(j, ListOfPositiveDivisors);
			if(IsPerfect) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		

	}
	
	private static int[] getNInputs() {
		 //this will accept N inputs from the user to an array
		
		/*
		try{
			
			
		*/	Scanner sc = new Scanner(System.in);
				int T = 1;
			
			
				
					T=sc.nextInt();
					int[] intArray = new int[T];
					for(int i=0;i<T;i++) {
						intArray[i]=sc.nextInt();
					}
					
					/*
					System.out.println(T + " numbers are entered. They are:" );
					for(int m : intArray) 
						System.out.println(m);
						
					
						*/
								
					
						return intArray;
						
			/*			
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		*/
	}
	private static ArrayList<Integer> getPositiveDivisors(int M) {
		
				ArrayList<Integer> arl = new ArrayList<Integer>();
				for(int j=1;j<M;j++) {
					if(M%j==0) {
						arl.add(j);
					}
				}
				//System.out.println("List of positive divisors of:"+M);
				//System.out.println(arl);
				return arl;
		}
	
	private static boolean checkIfItsPerfect(int N, ArrayList<Integer> PosDivisors) {
		
			int Sum = 0;
			for(Integer k : PosDivisors) {
				Sum = Sum+k;
			}
			//System.out.println("Sum of positive divisors:"+Sum);
			if(Sum==N) {
				return true;
			}else {
				return false;
			}	
	}
}
