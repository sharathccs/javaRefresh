package functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i=0;
		try {
				int N = sc.nextInt();
				if(N<=1000002 && N>=1) {		
						for( i=1;i<=N;i=i+1) {
								fact=fact*i;
							}
						}
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		System.out.println("factorial:"+fact);
		sc.close();
	}

}
