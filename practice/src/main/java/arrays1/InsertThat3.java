package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class InsertThat3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pos=0;
		int element=0;
		Scanner sc = new Scanner(System.in);
		int sizeOfArray;
		
		try {
			System.out.println("Enter the size of array you want to construct:");
			sizeOfArray	 = sc.nextInt();
			System.out.println("Enter the array of size:"+sizeOfArray);
			ArrayList<Integer> A = new ArrayList<Integer>(); 
			
			
			for(int i=0; i<sizeOfArray; i++) {
				 A.add(sc.nextInt());
			 }
			
			System.out.println("Enter the position to be inserted:");
			pos = sc.nextInt();
			
			System.out.println("Enter the element to be inserted:");
			element = sc.nextInt();
			
			 System.out.println("Entered Array:");
			 
			 System.out.println(A);
			 
			 System.out.println("--------------------");
			
			
			A.add(pos, element);
			for(int i=0; i<A.size();i++) {
				System.out.print(A.get(i) + " ");
			}
			sc.close();
		}catch(InputMismatchException e) {
			
		}
	}		
}