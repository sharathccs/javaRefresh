package arrays2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoundaryElements {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		///get the input of a 2D Array
		//Define a i, j and loop k :) while iterating thru i, j
		
		int [][] square2DArr=getSquare2DArray();
		printSpiralMatrix(square2DArr);
		
		}
	
	
	static int [][] getSquare2DArray(){
		
		int row=0;
		int [][]matrix = null ;
		
		Scanner sc = new Scanner(System.in);
		try {
				System.out.println("Enter the size of the square array:");
				row=sc.nextInt();
				
				System.out.println("Enter the square array of size:"+ row + "x" + row);
				matrix = new int [row][row];
				
				for (int i=0; i<row; i++) {
						for (int j=0; j<row; j++) {
							matrix[i][j] = sc.nextInt();
							}
				}
				
				 System.out.println("Entered Array:");
					for (int i=0; i<row; i++) {
							for (int j=0; j<row; j++) {
								//System.out.print("val of i:" + i + " val of j: "+ j + " value:" + matrix[i][j]);
								System.out.print(matrix[i][j] + " ");
								}System.out.println();
					}
		
				
			}catch(InputMismatchException e) {
			
		}	
		sc.close();
		
		return matrix;
		
		
	}
	
	
	static void printSpiralMatrix(int[][] arr) {
		int k=0;
		int i=0;
		int j=0;
		int N=arr.length;
		
		//print the top most row;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			j++;
		}//System.out.println();
		
		//System.out.println("Current value of i:"+ i + " j:" + j);
		
		//print the right most col;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			i++;
		}//System.out.println();
		
		//System.out.println("Current value of i:"+ i + " j:" + j);
		
		//print the bottom most row;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			j--;
		}//System.out.println();
		
		//System.out.println("Current value of i:"+ i + " j:" + j);
		
		//print the left most col;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			i--;
		}//		System.out.println();
		
		//System.out.println("Current value of i:"+ i + " j:" + j);
		
		if(N==1) {
			System.out.print(arr[i][j] + " ");
		}
		
		
	}
	
	
	
	
	

}
