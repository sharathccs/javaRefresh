package arrayLists;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreMatricesSame {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> A1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> A3 = new ArrayList<Integer>();
		System.out.println("------------------------------------------");
		A1=readAndPrint2DArrayList();
		System.out.println("------------------------------------------");
		print2DArrayList(A1);
		
		checkEquality(A1, A1);
		
	}
	

static ArrayList<ArrayList<Integer>> readAndPrint2DArrayList(){
	
	ArrayList<ArrayList<Integer>> ArrList2D = new ArrayList<ArrayList<Integer>>(); 
	Scanner sc = new Scanner(System.in);
	int rows;
	int col;
	
	try {
		System.out.println("Enter the size of the rows:");
		rows = sc.nextInt();
		
		System.out.println("Enter the size of the col:");
		col = sc.nextInt();
		
		for (int i = 0; i < rows; i++) {
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    ArrList2D.add(list);
		}
		
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter the " + i + " row of elements:");
			for(int j=0; j<col; j++) {
				ArrList2D.get(i).add(j, sc.nextInt());
			}
		}
		
		
	}catch(InputMismatchException e) {
		System.out.println("Enter Integer only");
	}
	
	sc.close();
	return ArrList2D;
	
	
}

static void print2DArrayList( ArrayList<ArrayList<Integer>> _2DList  ) {
	
	for(int i=0; i<_2DList.size(); i++) {
		for(int j=0; j<_2DList.get(i).size();j++) {
			System.out.print(_2DList.get(i).get(j));
			System.out.print(" ");
		}
		System.out.println();
	}
}


		static int checkEquality(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B ){
			int isEqual = 1;
			int rowA = A.size();
			int colA = A.get(0).size();
			
			int rowB = B.size();
			int colB = B.get(0).size();
			
			if(rowA == rowB) {
				for(int i=0, m=0; i<rowA && m<rowB; i++, m++) {
					for(int j=0, n=0; j<colA && n<colB; j++, n++) {
							if(A.get(i).get(j)!=B.get(m).get(n)) {
								isEqual=0;
							}	
						}
					}
			}else {
				isEqual= 0;
			}
			return isEqual;
		}	
	
}



