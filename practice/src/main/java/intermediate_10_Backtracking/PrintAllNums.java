/* The question is about, given the size of the number say a 3 digit number or a 4 digit number, print all the numbers that can be formed with 1 and 2
 * lets say if its a 2 digit number with 1 and 2, the answer would be :
 * 11
 * 12
 * 21
 * 22
 * 
 * for n=3, it would be 
 * 111
 * 112
 * 121
 * 122
 * 221
 * 222
 * 212
 * 211
 * 
 * The total number of digits would be 2^n 
 * 
 */


package intermediate_10_Backtracking;
import java.util.ArrayList;

public class PrintAllNums {

	public static void main(String[] args) {
		
		/*
		 * First lets define the method signature 
		 * The key thing to remember in backtracking is while you are exploring the options, if you hit a dead end, you will undo the steps and explore other paths
		 * In the main method, we are going to call the printAll method and pass the values. thats it 
		 * 
		 */
		
		
		ArrayList<Integer> num = new ArrayList<Integer> (3);
		printAllNums(num, 3, 0);
		

	}// end of main method
	
	static void printAllNums(ArrayList<Integer> a1, int digitSize, int i){
		
		
		if(i == digitSize) {
			System.out.println(a1);
			return;
		}
		
		
		//first choice : 1
		a1.add(i, 1);
		printAllNums(a1, digitSize, i+1);
		//a1.set(i,0);
		a1.remove(i);// this is the core of back tracking
		
		
		
		//first choice : 2
		a1.add(i, 2);
		printAllNums(a1, digitSize, i+1);
		//	a1.set(i,0);
		a1.remove(i);
		
		
	}// end of printAllNums
	
	
	
		
}//end of class
