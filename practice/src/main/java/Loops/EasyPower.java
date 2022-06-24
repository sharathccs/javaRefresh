package Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyPower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Prod=1;
		try {
				int A = sc.nextInt();
				int B = sc.nextInt();
				if(A<=1000 && A>=1) {		
						for(int i=1;i<=B;i=i+1) {
							Prod=Prod*A;
						}	
				}System.out.println(Prod);
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}

}
