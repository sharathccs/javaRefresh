package arrays2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdentityMatrix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		
		Scanner sc = new Scanner(System.in);
		try {
				
			
			
				System.out.println("Enter the row size of the array:");
				int row=sc.nextInt();
				
				System.out.println("Enter the col size of the array:");
				int col=sc.nextInt();
			
				
				System.out.println("Enter the array:"+ row + "x" + col);
				int [][] matrix = new int [row][col];
				
				
				
				System.out.println("row:"+matrix.length);
				System.out.println("col:"+matrix[0].length);
				
				
				
			
				for (int i=0; i<matrix.length; i++) {
						for (int j=0; j<matrix[0].length; j++) {
							matrix[i][j] = sc.nextInt();
							}
				}

				
				
				
				 System.out.println("Entered Array:");
					for (int i=0; i<row; i++) {
							for (int j=0; j<col; j++) {
								//System.out.print("val of i:" + i + " val of j: "+ j + " value:" + matrix[i][j]);
								System.out.print(matrix[i][j]);
								}System.out.println();
					}
					
					
				
			
				
				
			}catch(InputMismatchException e) {
			
		}	
		sc.close();
		
		

	}
	
	static boolean checkIdentityMatrix(int [][]A, int[][] B) {
		
			int rowA = A.length;
			int colA= A[0].length;
			
			int rowB = B.length;
			int colB= B[0].length;
			
			
			boolean check=true;
			
			if(colA == rowB) {
				//then proceed

				for(int i=0; i<rowB; i++) {
					for(int j=0; j<rowB; j++) {
						if(i==j && B[i][j]==1) {
							check = false;
						} 
						else if (i!=j && B[i][j]==0){
							check = false;
						}
					}
				}
				
				
				
			}else {
				return false;
			}
			
			
			return check;
		
		
		
		
		
	}
	
	

}
