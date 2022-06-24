package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfOdds {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Sum=0;
		try {
				int A = sc.nextInt();
				if(A<=1000 && A>=1) {		
						for(int i=1;i<=A;i=i+2) {
							Sum=i+Sum;
						}	
				}System.out.println(Sum);
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}

}
