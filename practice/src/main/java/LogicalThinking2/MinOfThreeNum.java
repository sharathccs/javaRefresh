/*Write a program to input three numbers(A, B & C) from user and 
print the minimum element among A, B & C in each line.
*/

package LogicalThinking2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinOfThreeNum {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			
			if(A>=1 && 1000000 >=A) {
				if(B>=1 && 1000000 >=B) {
					if(C>=1 && 1000000 >=C) {
						
						if(A<B) {
							if(A<C) {
								System.out.println(A);
									} else if(C < B) {
										System.out.println(C);
									} else {
										System.out.println(B);
									}
							
						}else if(B<C) { 
							System.out.println(B);
						} else {
							System.out.println(C);
						}	
						
					}//System.out.println("C is out of bounds");
				}//System.out.println("B is out of bounds");
				
			}//System.out.println("A is out of bounds");

		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		
	}
	
	/*
	 * public String returnMonth(int B) {
	 * 
	 * String[] month1 = {"January", "February", "March", "April", "May", "June",
	 * "July", "August", "September", "October", "November", "December"}; String
	 * val= "NA";
	 * 
	 * try { if(B>=1 && 12 >=B) { int index=B-1; System.out.println(month1[index]);
	 * val = month1[index]; }else {
	 * System.out.println("Enter a valid month index between 1 and 12"); }
	 * 
	 * }catch(InputMismatchException e) { System.out.println("Enter an integer"); }
	 * 
	 * return val;
	 * 
	 * }
	 */
	
	

}






