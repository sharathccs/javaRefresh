package pattern2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int A = sc.nextInt();
				int i;
				if(A<=1000 && A>=1) {		
					
					// prints ************
					printALineOfStars(A);
					
					//print a square of *
					/*
					 5
					*****
					*****
					*****
					*****
					*****
					*/
					System.out.println();
					System.out.println("==============================================");
					printASquareOfStars(A);
					
					
					//print the below triangle *
					/*
					 5
					*****
					****
					***
					**
					*
					*/
					System.out.println();
					System.out.println("==============================================");
					printATrianglefStars(A);
					
					
					//print the below triangle *
					/*
					 5
					*
					**
					***
					****
					*****
					*/
					System.out.println();
					System.out.println("==============================================");
					printBTrianglefStars(A);
					
					
					
					//print the below pattern with - - 
					/*
					 
					 3
					*--*
					*--*
					*--*		
					
					*/
					System.out.println();
					System.out.println("==============================================");
					printSocialDistanceStars(A);
					
					

					//print the below pattern with - - 
					/*
					 
					 5
					*----*
					*---*
					*--*		
					*-*
					**
					
					
					*/
					System.out.println();
					System.out.println("==============================================");
					printTriangleSocialDistanceStars(A);
					
					
					
					
					
					
				}
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();

	}
	
	private static void printALineOfStars(int M) {
		
		for(int i=1;i<=M;i++) {
			System.out.print("*");
		}
		
	}
	
	private static void printASquareOfStars(int M) {
		for(int i=1;i<=M;i++) {
			for(int j=1;j<=M;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	private static void printATrianglefStars(int M) {
		int A = M;
		int B=A;
		for(int i=1;i<=M;i++) {
			for(int j=1;j<=B;j++) {
				System.out.print("*");
			}B=B-1;
			System.out.println();
		}
		
	}
	private static void printBTrianglefStars(int M) {
		int A = M;
		int B=1;
		for(int i=1;i<=M;i++) {
			for(int j=1;j<=B;j++) {
				System.out.print("*");
			}B=B+1;
			System.out.println();
		}
		
	}
	private static void printSocialDistanceStars(int M) {
		int A = M;
		int B=A-1;
		for(int i=1;i<=M;i++) {
			System.out.print("*");
			for(int j=1;j<=B;j++) {
				System.out.print("-");
			}
			System.out.print("*");
			System.out.println();
		}
		
	}
	
	private static void printTriangleSocialDistanceStars(int M) {
		int A = M;
		int B=A-1;
		for(int i=1;i<=M;i++) {
			System.out.print("*");
			for(int j=1;j<=B;j++) {
				System.out.print("-");
			}B=B-1;
			System.out.print("*");
			System.out.println();
		}
		
	}
	
	
	

}
