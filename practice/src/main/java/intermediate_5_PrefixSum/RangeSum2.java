/*

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right

*/


package intermediate_5_PrefixSum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeSum2 {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> arra =scanElementsToArrayList();
		ArrayList<ArrayList<Integer>> B = get2DArrayList();
		
		
		ArrayList <Long> rangeSumArr=getRangeSum(arra,B);
		System.out.println(rangeSumArr);
		
		

	}
	
	static ArrayList<Integer> scanElementsToArrayList(){
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		try {
				
			System.out.println("Enter the size of array you want to construct:");
			long sizeOfArray	 = sc.nextLong();
			
			
			System.out.println("Enter the array of size:"+sizeOfArray);
			
				for(int i=0;i<sizeOfArray;i++) {
					 arr1.add(i, sc.nextInt());
				 }		
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		return arr1;
		
	}
	
	static ArrayList<ArrayList<Integer>> get2DArrayList(){
		ArrayList<ArrayList<Integer>> arr2D = new ArrayList<ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);
		try {
				
			System.out.println("Enter the size of 2D array you want to construct:");
			long sizeOfArray	 = sc.nextLong();
			
			System.out.println("Enter the L-R pairs for the 2D array:"+sizeOfArray);
			
				for(int i=0;i<sizeOfArray;i++) {
					arr2D.get(i).set(0, sc.nextInt());
					arr2D.get(i).set(1, sc.nextInt());
					
				 }		
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		return arr2D;
		
	}
	
	
	 static ArrayList<Integer> getPrefixSumArrayList(ArrayList<Integer> Arr){
			
			System.out.println("The entered array for calculating the prefix sum is:"+Arr);
			int lengthOfArrayList = Arr.size();
			
			
			ArrayList<Integer> PS = new ArrayList<Integer>(lengthOfArrayList);
			PS.add(0, Arr.get(0));
			for (int i=1;i<(lengthOfArrayList);i++) {
				PS.add(i, PS.get(i-1)+Arr.get(i));
			}
			
			System.out.println("The Prefix sum array is:");
			System.out.println(PS);
			
			
			return PS;
			
		}
	 
	 
	 public static ArrayList<Long> getRangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

         
         ArrayList<Integer> PrefixSum = getPrefixSumArrayList(A);


         //Define an arraylist to hold the output
         ArrayList<Long> Output = new ArrayList<Long>();
         long sizeOfB=(long)B.size();
         
          //Write a for loop to get L, R 
         for(int i=0; i<sizeOfB; i++){

             int L=B.get(i).get(0);
             int R=B.get(i).get(1);
             long pSum=0;

             if(L==0){
                  pSum = PrefixSum.get(R);
             }else{
                  pSum = PrefixSum.get(R)-PrefixSum.get(L-1);
             }

             Output.add(i, pSum);
         }
      

         return Output;
         
     }
	 
	 
	 
	 

}
