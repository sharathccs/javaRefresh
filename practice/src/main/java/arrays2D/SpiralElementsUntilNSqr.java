package arrays2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpiralElementsUntilNSqr {
	
	public static void main(String[] args) {

		
					int [][] square2DArr=getSquare2DArray();
					int i=0;
					int j=0;
					int N=square2DArr.length;
					
					while(N>1) {
						printSpiralMatrix(square2DArr, i, j, N);
						i++;
						j++;
						N=N-2;
					}if(N==1) {
						System.out.print(square2DArr[i][j]);
					}
		}
	
	
	static int [][] getSquare2DArray(){
		
		int N=0;
		int [][]matrix = null ;
		
		Scanner sc = new Scanner(System.in);
		try {
				
				System.out.println("Enter the size of array, N:");
				N=sc.nextInt();
			
				//System.out.println("Enter the square array of size:"+ N + "x" + N);
				matrix = new int [N][N];
				
				for (int i=0; i<N; i++) {
						for (int j=0; j<N; j++) {
							matrix[i][j] = sc.nextInt();
							}
				}
				 System.out.println("Entered Array:");
					for (int i=0; i<N; i++) {
							for (int j=0; j<N; j++) {
								//System.out.print("val of i:" + i + " val of j: "+ j + " value:" + matrix[i][j]);
								System.out.print(matrix[i][j] + " ");
								}System.out.println();
					}
			}catch(InputMismatchException e) {
			
		}	
		sc.close();
		
		return matrix;
		
		
	}
	
	
	static void printSpiralMatrix(int[][] arr, int i, int j, int N) {
		int k=1;
		
		//print the top most row;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			j++;
		}
		
		//print the right most col;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			i++;
		}

		//print the bottom most row;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			j--;
		}

		
		//print the left most col;
		for(k=1;k<N;k++) {
			System.out.print(arr[i][j] + " ");
			i--;
		}
	}
	
	
	public static int getSizeOfSquare2DArray() {
		Scanner sc = new Scanner(System.in);
		int N=0;
		try {
				System.out.println("Enter the size of the square array:");
				N=sc.nextInt();
		
			}catch(InputMismatchException e) {
				
			}	
			sc.close();
			
			return N;
	}	
	
	
	
	
	

}
