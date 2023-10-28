package intermediate_6_SubArrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StoringSubArrays {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList <ArrayList<Integer>> arrOfAllSubArr  = new ArrayList<ArrayList<Integer>> ();
		
		for(int i=0;i<B.size();i++) {
			for(int j=i;j<B.size();j++) {
				arrOfAllSubArr.add(getSubArray(i, j, B));
			}
		}
		
			

	}
	
	
	//Given the start index and end index, print the sub arrays
	public static ArrayList<Integer>  getSubArray(int s, int e, ArrayList<Integer> B) {
		
		int l=e+1-s;
		ArrayList<Integer> subArr= new ArrayList<Integer>(l);
	
		//System.out.println("Printing the subArray:");
		for (int i=s ; i<=e; i++) {
			subArr.add(B.get(i));
			//System.out.println(B[i] + " " );
		}
		
		return subArr;
		
	}
	

}
