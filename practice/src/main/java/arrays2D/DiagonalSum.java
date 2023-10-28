package arrays2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiagonalSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
				
			int [][] arr1=input2DArray();
			
			

			System.out.println("-----------------------------------");
			print2DArray(arr1);
			
			System.out.println("---Diagonal Sum====="+getDiagonalSum(arr1));
			
			
			}catch(InputMismatchException e) {
			
		}	
	
		
		

	}
	
	
	
	 static int[][] input2DArray(){
		int [][] matrix;
		Scanner sc = new Scanner(System.in);
		
				System.out.println("Enter the row size of the array:");
				int row=sc.nextInt();
				
				System.out.println("Enter the col size of the array:");
				int col=sc.nextInt();
			
				
				System.out.println("Enter the array:"+ row + "x" + col);
				matrix = new int [row][col];
				
				
				
				System.out.println("row:"+matrix.length);
				System.out.println("col:"+matrix[0].length);
				
				
				
			
				for (int i=0; i<matrix.length; i++) {
						for (int j=0; j<matrix[0].length; j++) {
							matrix[i][j] = sc.nextInt();
							}
				}
			
					sc.close();
					return matrix;	
	}
	 
	
	static void print2DArray(int[][] Arr) {
		 
		 int row=Arr.length;
		 int col=Arr[0].length;
		 
		 System.out.println("Entered Array:");
			for (int i=0; i<row; i++) {
					for (int j=0; j<col; j++) {
						System.out.print(Arr[i][j] + " ");
						}System.out.println();
			}
	 }
	
	static int getDiagonalSum(int A[][]) {
		int rowCount= A.length;
		int colCount=A[0].length;
		int diagonalSum=0;
				
				for (int i=0; i<rowCount; i++) {
					for (int j=0; j<colCount; j++) {
							if(i==j) {
								diagonalSum=diagonalSum+A[i][j];
							}
						}
			}
		
				return diagonalSum;
		
		
		
	}
	

}
