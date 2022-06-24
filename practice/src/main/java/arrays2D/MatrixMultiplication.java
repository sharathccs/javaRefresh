package arrays2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
				
			int [][] arr1=input2DArray();
			
			
			int [][] arr2=arr1;
			System.out.println("-----------------------------------");
			print2DArray(arr2);
			System.out.println("-----------------------------------");
			print2DArray(arr2);
			
			System.out.println("---Multiplied Matrix--------------------------------");
			int [][] mm = multiplyTwoMatrices(arr1, arr2);
			
			
			print2DArray(mm);
			
			
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
	 
	
	 static int[][] multiplyTwoMatrices(int [][]a1, int[][]a2){
		 int rowOfA1 = a1.length;
		 int colOfA2 = a2.length;
		 int colOfA1 = a1[0].length;
		 int sum = 0;
		 
		 int[][] m = new int[rowOfA1][colOfA2];
		 
		 if(rowOfA1!=colOfA2) {
			 System.out.println("Row of A1 is not equal to A2. ");
			 return m;
		 }else {
			 
					 for(int i=0; i<rowOfA1; i++) {
								 for(int j=0; j<colOfA2; j++) {
									 
									 sum=0;
									 for(int k = 0; k<colOfA1; k++) {
										 
										 sum = sum+ (a1[i][k]*a2[k][j]);
									 }
									 m[i][j]=sum;
									 
									 
							 }
			 
					 }
		 }
		 return m;
	
		 
	 }
	 
	 static void print2DArray(int[][] Arr) {
		 
		 int row=Arr.length;
		 int col=Arr[0].length;
		 
		 System.out.println("Entered Array:");
			for (int i=0; i<row; i++) {
					for (int j=0; j<col; j++) {
						System.out.print(Arr[i][j]);
						}System.out.println();
			}
	 }
	

}
