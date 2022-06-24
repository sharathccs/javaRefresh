package Loops2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

			public static void main(String[] args) {
				
				int N = getInput();
				int Rev  = reverseNum(N);
				if(Rev==N) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
			}
		
			private static int getInput() {
						
						int T=0; 
						try{
								Scanner sc = new Scanner(System.in);
								T = sc.nextInt();
								sc.close();
							}
						catch(InputMismatchException e) {
							System.out.println("Enter an integer");
						}
						System.out.println("Number Entered:"+T);
						return T;	
			}
			
			private static int reverseNum(int N) {
				
				int reminder=1;
				int Reverse = 0;
				while(N>0) {
					reminder = N%10;
					Reverse = (Reverse*10)+reminder;
					N=N/10;
				}
				System.out.println("Reverse:"+Reverse);
				return Reverse;
				
	}
	

}
