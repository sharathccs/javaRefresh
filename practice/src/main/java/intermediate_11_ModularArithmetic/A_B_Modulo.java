/*
 * The below solution is not ideal even though it compiles and gives the correct output
 * 
 * 
 * 
 * */






package intermediate_11_ModularArithmetic;

public class A_B_Modulo {

	public static void main(String[] args) {

		
		System.out.println(findModulo(3582353, 2636654));// 945699
		System.out.println(findModulo(106978, 4487506));// 4380528
		
	
		
		

	}//end of main method
	
	static int findModulo( int A, int B) {
		
		
		int max=1;
		int lim=Math.max(A, B);
		for(int i=1; i<lim; i++) {
			int a1 = A%i;
			int b1 = B%i;
			
			
			
			
			if(a1==b1) {
				max=Math.max(i, max);
			}
			
			
		}//end of for
		
		
		
		return max;
	}//end of find modulo
	
	

}// end of class





