package arrayLists;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadAndPrintArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		A1=readIntArrayList();

	}
	
	
static ArrayList<Integer> readIntArrayList(){
	
	Scanner sc = new Scanner (System.in);
	ArrayList<Integer> alist = new ArrayList<Integer>();
	int size;
	
	try {
			 sc = new Scanner (System.in);
			
			System.out.println("Enter the size of the array list you want to create:");
			size=sc.nextInt();
			System.out.println("Enter the elements of the arrayList:");
			for(int i=0;i<size;i++) {
				alist.add(sc.nextInt());
			}
			System.out.println("Entered array list is:"+alist);
	}
	catch(InputMismatchException e) {
		System.out.println("Enter Integers only");
	}
	sc.close();
	return alist;
	
}


}
