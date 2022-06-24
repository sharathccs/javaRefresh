package pattern2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatternPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int i;
				if(A<=1000 && A>=1) {		
					
		
			

					//print the below pattern even number with star
					/*
					 
					 5
					*
					*2
					*2*	
					*2*4
					*2*4*
					
					
					*/
					System.out.println();
					System.out.println("==============================================");
					//printTriangleStarWithEvenNum(A);
					
					
					


					//print the below pattern: Alt Number Alt Star
					/*
					 
					 5
					1
					1 *
					1 * 2	
					1 * 2 *
					1 * 2 * 3
					
					
					
					*/
					System.out.println();
					System.out.println("==============================================");
					printAltNumAltStar(A);
										
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();

	}
	




	private static void printTriangleStarWithEvenNum(int M) {
		
		/*
		 
		 5
		 
		*
		*2
		*2*	
		*2*4
		*2*4*
		
		
		*/
		
		int A = M;
		int B=1;
		for(int i=1;i<=M;i++) {
			for(int j=1;j<=B;j++) {
				
				if(j%2==0) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
				
			}B=B+1;
			System.out.println();
		}
		
	}
	
private static void printAltNumAltStar(int M) {
		
		/*
		 
	 		5
					1
					1 *
					1 * 2	
					1 * 2 *
					1 * 2 * 3
		
		*/
		
		
		int B=1;
		for(int i=1;i<=M;i++) {
			for(int j=1;j<=B;j++) {
				System.out.print(j);
			}B=B+1;
			System.out.println();
		}
		
	}
	
	

}
