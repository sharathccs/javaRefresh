
/*
Write a program to print all odd numbers from 1 to N where you have to take N as input from user.

*/

package Loops2;

import java.time.YearMonth;
import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberIndicatingMonth = sc.nextInt();
		YearMonth yearMonthObject = YearMonth.of(1999, numberIndicatingMonth);
		System.out.println(yearMonthObject.lengthOfMonth());
		sc.close();
		

	}

}
