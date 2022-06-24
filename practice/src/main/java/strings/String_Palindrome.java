package strings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String rev;
		String A;
		boolean check=true;
		try {
				 A = sc.next();
				 
				/*
				for(int i=0;i<=((A.length())/2);i++) {
					if(A.charAt(i)==A.charAt(A.length()-1-i)) {
						System.out.print(A.charAt(i) + " " + A.charAt(A.length()-1-i));
						System.out.println();
						check=true;
					}
				}
				
				*/
				
				 for(int i=0, j=A.length()-1 ;i<j;i++, j--) {
						if(A.charAt(i)!=A.charAt(j)) {
							System.out.print(A.charAt(i) + " " + A.charAt(A.length()-1-i));
							System.out.println();
							check=false;
						}
					}
				 
				 
				
		System.out.println("Is a palindrome:" + check);
				
				
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

		
		
	}

}
