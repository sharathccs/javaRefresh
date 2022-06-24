/*
Write a program to input an integer T and then each of T lines will have a string (S).

You have to print T lines each containing length of input string.

Input Format
First line is T which means number of test cases.
Each next T lines contain a string S.

Example Input
2
scaler
interviewbit


Example Output
6
12


*/


package strings;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class CopyTheString {

	public static void main(String[] args) {
		
		String s = getString();
		System.out.println("Entered String:"+s);
		System.out.println(copyWithoutLastChar(s));
	}
	
	static String getString(){
		
		/*
		
		try {
			
			
			String InputString;
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter the lines of strings:");
			InputString =sc.next() ;
			return InputString;
			}
		catch(InputMismatchException e) {
			System.out.println("Enter String");
		}
		
		return InputString;	
		
		*/
		

		String InputString;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the lines of strings:");
		InputString =sc.next() ;
		return InputString;
		
	}
	
	static String copyWithoutLastChar(String S) {
		String copiedString;
		System.out.println(S.length());
		copiedString = S.substring(0, (S.length()-1));
		return copiedString;
	}
}
