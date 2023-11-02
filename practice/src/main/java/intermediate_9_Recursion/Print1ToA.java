package intermediate_9_Recursion;

public class Print1ToA {
	
	
	public void printNum(int A) {
		
		//first breaking condition
		
		if(A==0) {
			return;
		}
		
		//Recursive call
		printNum(A-1);
		
		//print statement
		System.out.print(A + " ");
	}
	
	public static void main (String args[]) {
		
		Print1ToA pA = new Print1ToA();
		pA.printNum(5);
		System.out.println();
			
	}
	
	
	

	
	

}
