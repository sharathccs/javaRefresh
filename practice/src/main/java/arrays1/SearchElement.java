package arrays1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sizeOfArray;
		boolean isFound = true;
		
		int SearchElement = 1;
		
		Scanner sc = new Scanner(System.in);
		try {
				sizeOfArray	 = sc.nextInt();
				System.out.println("Enter the array of size:"+sizeOfArray);
				int [] arr = new int[sizeOfArray];
				
				
				/* Dont know why its failing	
				 for(int i: arr) {
					 arr[i]=sc.nextInt();
				 }
				 
				 
				 */
				
				for(int i=0; i<arr.length; i++) {
					 arr[i]=sc.nextInt();
				 }
				
				 System.out.println("Entered Array:");
				 for(int k: arr) {
					 System.out.println(k);
				 }
				 
				 System.out.println("Enter the element to be searched:");
				 
				 SearchElement = sc.nextInt();
				 
				 isFound=checkElement(arr, SearchElement);
				 
				 System.out.println("Enter the diff k:");
				 
				 int diffK = sc.nextInt();
				 
				 if(isFound) {
					 System.out.println("Is the Element found:"+isFound);
				 }else {
					 System.out.println("Is the Element found:"+isFound);
				 }
					 
				// System.out.println("Count of the instances of: " + SearchElement + " " + "is " + countElement(arr,SearchElement) );
				 
				// System.out.println("Check if the element if its strictly asc: "+ checkAscSorted(arr));
				 
				 System.out.println("Check if there are elements with a diff of k = "+ diffK + ": "+ checkDiffofK(arr, diffK));
				 
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		sc.close();
		
		

	}
	
	private static boolean checkElement(int [] arr1, int searchFor) {
		
		boolean found = true;
		for(int j=0; j<arr1.length; j++) {
			//System.out.println("checking for:"+ searchFor + "against " + arr1[j]);
			if(arr1[j]==searchFor) {
				found=true;
				break;
			}else {
				found=false;
			}
		}
		return found;
	}
	
	private static int countElement(int [] arr1, int searchFor) {
		
		int count = 0;
		for(int j=0; j<arr1.length; j++) {
			if(arr1[j]==searchFor) {
				count = count+1;
			}
		}
		return count;
	}
	
	
private static boolean checkAscSorted(int [] arr1) {
		
		boolean chkAsc = true;
		for(int j=0; j<arr1.length-1; j++) {
			if(arr1[j+1]>arr1[j]) {
				chkAsc = true;
			}else {
				chkAsc = false;
			}
		}
		return chkAsc;
	}


private static boolean checkDiffofK(int [] arr1, int k) {
	
	boolean chkDiff = false;
	for(int j=0; j<arr1.length-1; j++) {
		if(arr1[j]-arr1[j+1]==k) {
			chkDiff = true;
		}
	}
	return chkDiff;
}

	

}
