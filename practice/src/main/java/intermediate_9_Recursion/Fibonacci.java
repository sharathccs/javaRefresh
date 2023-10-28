package intermediate_9_Recursion;

public class Fibonacci {
	
	public int findAthFibonacci(int A) {

        if(A<=1){
            return A;
        }// end of if

        return findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }// end of method
	
	
	

}
