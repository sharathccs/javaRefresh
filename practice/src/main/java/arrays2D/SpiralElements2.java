package arrays2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpiralElements2 {
	
	
	static int linearCounter=1;
	
	public static void main(String[] args) {

		
					
					int N=getSizeOfSquare2DArray();
					int lim=N*N;
					int [][] square2DArr=new int [N][N];
					
					int i=0;
					int j=0;
					int lc=linearCounter;
					while(N>1) {
						
						
						//linearCounter= setSpiralMatrix(square2DArr, i, j, linearCounter, N);
						lc=setSpiralMatrix(square2DArr, i, j, lc, N);
						i++;
						j++;
						N=N-2;
					}if(N==1) {
						square2DArr[i][j]=lc;
					}
					
					
					for(int a=0;a<square2DArr.length;a++) {
						for(int b=0;b<square2DArr.length;b++) {
							System.out.print(square2DArr[a][b] +" ");
						}System.out.println();
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
	
	static int setSpiralMatrix(int[][] arr, int i, int j, int l, int N) {
		
		//print the top most row;
		for(int k=1;k<N;k++) {
			arr[i][j] =l;
			j++;
			l++;
		}
		
		//print the right most col;
		for(int k=1;k<N;k++) {
			arr[i][j]=l;
			i++;
			l++;
		}

		//print the bottom most row;
		for(int k=1;k<N;k++) {
			arr[i][j]=l;
			j--;
			l++;
		}

		
		//print the left most col;
		for(int k=1;k<N;k++) {
			arr[i][j]=l;
			i--;
			l++;
		}
		
		return l;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
