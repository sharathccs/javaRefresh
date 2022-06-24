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


public class CountOfCharacters {

	public static void main(String[] args) {
		
		try {
			String s = getString();
			getCountOfCharecters(s);
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
	

	
	static HashMap<Character, Integer> getCountOfCharecters(String S){
		HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
		char[] charArray = S.toCharArray();
		int charSum;
		
		for(char c: charArray) {
			charSum=0;
			for(int i=0; i<S.length(); i++) {
				if(c==S.charAt(i)) {
					charSum=charSum+1;
				}
			}
			mapa.put(c, charSum);
		}
		
		System.out.println(mapa);
		
		//int maxValueInMap=(Collections.max(mapa.values()));
		
		
		System.out.println("Max value:"+Collections.max(mapa.values()));
		
		return mapa;
	}
	
	
	
}
