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


public class LengthOfString {

	public static void main(String[] args) {
		
		ArrayList<String> al = getInputStrings();
		for(String s: al) {
			System.out.println(s.length());
		}
		
	}
	
	static ArrayList<String> getInputStrings(){
		
		ArrayList<String> StringArrayList = new ArrayList<String>();
		int T;
		String InputString;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the lines of strings:");
			T =sc.nextInt() ;
			
			
			System.out.println("Enter the strings:");
			for(int i=0; i<T ; i++) {
				InputString=sc.next();
				StringArrayList.add(InputString);
			}
		}catch(InputMismatchException e) {
			System.out.println("Enter Integer");
		}
		
		System.out.println(StringArrayList);		
		return StringArrayList;
	}
	
}
