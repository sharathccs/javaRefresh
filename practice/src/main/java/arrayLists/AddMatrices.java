package arrayLists;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> A1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> A2 = new ArrayList<ArrayList<Integer>>();
		
		A1=readAndPrint2DArrayList();
		System.out.println("-------------------------------");
		System.out.println("Entered Array:");
		System.out.println(A1);
		A2=addMatrices(A1, A1);
		System.out.println("-------------------------------");
		System.out.println("Added Array:");
		System.out.println(A2);
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
	
	

static ArrayList<ArrayList<Integer>> addMatrices( ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B   ){
	
	ArrayList<ArrayList<Integer>> Addendum = new ArrayList<ArrayList<Integer>>();
	int rowA = A.size();
	int colA = A.get(0).size();
	

	int rowB = B.size();
	int colB = B.get(0).size();
	
	int sum=0;
	
	
	for (int i = 0; i < rowA; i++) {
	    ArrayList<Integer> add = new ArrayList<Integer>();
	    Addendum.add(add);
	}

	for(int i=0, m=0; i<rowA && m<rowB ; i++, m++) {
		for(int j=0, n=0; j<colA && n<colB ; j++, n++) {
			sum = A.get(i).get(j)+B.get(m).get(n);
			Addendum.get(i).add(j, sum);
		}
	}
	
	
	
	
	
	System.out.println(Addendum);
	
	return Addendum;
	
}






}
