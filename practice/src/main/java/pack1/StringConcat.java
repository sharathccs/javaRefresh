/*

Given a name A as input. Print "Hello A", where A is the name in input.

*/

package pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
				 
		  Scanner scn = new Scanner (System.in);
		  
		  try { String A=scn.next(); String B=scn.next(); System.out.print(A +
		  " says Hi to "+ B); }catch(InputMismatchException e) {
		  System.out.print("Invalid Input"); }
		 

	}
	
	public static String concat(String U, String V) {
		return(U+V);
		
	}
	
	
	
}
