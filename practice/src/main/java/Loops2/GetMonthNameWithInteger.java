
/*
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

*/

package Loops2;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class GetMonthNameWithInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberIndicatingMonth = sc.nextInt();
		Month m=Month.of(numberIndicatingMonth);
		String s=m.getDisplayName(TextStyle.FULL,Locale.ENGLISH);
		System.out.println(s);
		sc.close();
		

	}

}
