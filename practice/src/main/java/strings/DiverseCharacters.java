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
import java.util.Collections;
import java.util.HashMap;


public class DiverseCharacters {

	public static void main(String[] args) {
		
		try {
			String s = getString();
			getDiverseCharacters(s);
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
	

	
	static int getDiverseCharacters(String S){

		
		char[] charArray = S.toCharArray();
		
		int alphaSum=0;
		int digiSum=0;
		
		for(char c: charArray) {
			if((c>='A' && c<='Z') || (c>='a' && c<='z') ) {
					alphaSum=alphaSum+1;
				}
			else if(c>='0' && c<='9') {
				digiSum=digiSum+1;
			}
		}
		
		System.out.println("alpha:"+alphaSum + " digi: "+ digiSum);
		if(alphaSum < digiSum) {
			return digiSum;
		}else {
			return alphaSum;
			
		}
		
	}
	
	
	
}
