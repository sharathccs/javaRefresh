package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class InsertThat2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pos=0;
		int element=0;
		try {
			ArrayList<Integer> A=getInput1DArrayList();
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("Enter the position to be inserted:");
			pos = sc1.nextInt();
			
			System.out.println("Enter the element to be inserted:");
			element = sc1.nextInt();
			
			insertElementAtSpecfiedPositioninArrayList(A, pos, element);
			
			sc1.close();
		}catch(InputMismatchException e) {
			
		}
	}			
			static ArrayList<Integer> getInput1DArrayList() {

				int sizeOfArray;
				
				Scanner sc = new Scanner(System.in);
				
						
						System.out.println("Enter the size of array you want to construct:");
						sizeOfArray	 = sc.nextInt();
						System.out.println("Enter the array of size:"+sizeOfArray);
						ArrayList<Integer> A = new ArrayList<Integer>(); 
						
						
						for(int i=0; i<sizeOfArray; i++) {
							 A.add(sc.nextInt());
						 }
						
						 System.out.println("Entered Array:");
						 
						 System.out.println(A);
						 
						 System.out.println("--------------------");
						 
						 sc.close();
				
					return A;	
			}
			

			static void insertElementAtSpecfiedPositioninArrayList(ArrayList<Integer> arrList, int position, int number) {
				arrList.add(position, number);
				for(int i=0; i<arrList.size();i++) {
					System.out.print(arrList.get(i) + " ");
				}
				
			}
			
}