/*

You are given a character string A, having length N and an integer ASCII code B.

You have to tell the leftmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.





*/


package strings;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class FirstOccurence {

	public static void main(String[] args) {
		
		try {
			String s = getString();
			
			
			
			getFirstOccurence(s, 9);
		}catch(InputMismatchException e) {
			System.out.println("NA");
		}
		
		
		
	}
	
	static String getString(){
		String InputString;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the lines of strings:");
		InputString =sc.next() ;
		
		return InputString;
		
	}
	

	
	static int getFirstOccurence(String A, int B){
		char c = (char)B;
		System.out.println(A.indexOf(c));
		System.out.println(A.lastIndexOf(c));
				
		return (A.indexOf(c));		
	}
	
	
	
}
