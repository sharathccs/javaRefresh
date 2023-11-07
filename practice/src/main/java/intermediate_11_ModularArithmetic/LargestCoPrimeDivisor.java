/*
 * 
 * You are given two positive numbers A and B . You need to find the maximum valued integer X such that:

			X divides A i.e. A % X = 0
			X and B are co-prime i.e. gcd(X, B) = 1
 * 
 * 
 * 
 * 
 * 
 * /
 */


package intermediate_11_ModularArithmetic;

public class LargestCoPrimeDivisor {

	public static void main(String[] args) {
		
		System.out.println(cpFact(30, 12));
		
	}//end of main
	
	
	public static int cpFact(int A, int B) {

		        while(getGCD (A,B)!=1){
		            A=A/getGCD(A,B);
		        }//end of while
		        return A;
    }// end of func

    static int getGCD (int a, int b){
        if(b==0){
            return a;
        }
        return getGCD(b, a%b);
    }// end of getGCD
	
	
	

}// end of class
