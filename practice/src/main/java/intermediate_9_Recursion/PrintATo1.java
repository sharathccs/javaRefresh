package intermediate_9_Recursion;

public class PrintATo1 {
	
	
	public void printNum(int A) {
		
		//first breaking condition
		
		if(A==0) {
			return;
		}
		
		
		//print statement
		System.out.print(A + " ");
		
		//Recursive call
		printNum(A-1);
		
		
	}
	
	public static void main (String args[]) {
		
		PrintATo1 pA = new PrintATo1();
		pA.printNum(5);
		System.out.println();
			
	}
	
	
	

	
	

}
