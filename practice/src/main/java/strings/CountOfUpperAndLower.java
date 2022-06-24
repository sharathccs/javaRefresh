package strings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountOfUpperAndLower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int countOfUpper = 0;
		int countOfLower = 0;
		try {
				String A = sc.next();
				for(int i=0;i<A.length();i++) {
					if(A.charAt(i)>=65 && A.charAt(i)<=90 ) {
						countOfUpper++;
					}
				}
				
				
				
				for(int i=0;i<A.length();i++) {
					if(A.charAt(i)>='a' && A.charAt(i)<='z' ) {
						countOfLower++;
					}
				}
				
				
				System.out.println("Count of upper case chars in: "+A+" is "+countOfUpper);
				System.out.println("Count of upper case chars in: "+A+" is "+countOfLower);
				
				
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

		
		
	}

}
