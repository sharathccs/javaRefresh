/*
 * The below solution is not ideal even though it compiles and gives the correct output
 * 
 * 
 * Mathematically, the maximum number for which this condition satisfies is :
 * 
 * 
 * A % m= B % m is abs(A-B)
 * 
 * 
 * So the entire solution boils down to one single line. Thats it. Smashed
 * 
 * 
 * 
 * */






package intermediate_11_ModularArithmetic;

public class A_B_Modulo_Smasher {

	public static void main(String[] args) {

		
		System.out.println(findModulo(3582353, 2636654));// 945699
		System.out.println(findModulo(106978, 4487506));// 4380528
		
	}//end of main method
	
	static int findModulo( int A, int B) {
		
		
		return Math.abs(-B);
	}//end of find modulo
	
	

}// end of class





