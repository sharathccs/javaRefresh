/*
 * Scooby has 3 three integers A, B, and C.
	Scooby calls a positive integer special if it is divisible by B and it is divisible by C. You need to tell the number of special integers less than or equal to A.
 * 
 * 
 */



package intermediate_11_ModularArithmetic;

public class DivisorGame {
	
	
	
		public static void main(String[] args) {
		
				
				System.out.println(solve(81991, 2549, 7)); //expected: 4 
				
				System.out.println(solve(12, 3, 2));// expected: 2
				
				System.out.println(solve(6, 1, 4));// expected: 1
				
		
			}//end of main method

			public static int solve(int A, int B, int C) {
			    int specialInt=0;
			    int maxOfBandC = Math.max(B,C);
			    for(int i=1;i<=A;i++){
			        int divisibleByB = i % B;
			        int divisibleByC = i % C;
			
			        if (divisibleByB == 0 && divisibleByC == 0 ){
			             if(i<=A){
			                specialInt++;
			             }
			        }//checking of divisibility
			
			    }// end of for loop
			
			    return specialInt++;
			
			}// end of solve
			
			




	

}// end of class
