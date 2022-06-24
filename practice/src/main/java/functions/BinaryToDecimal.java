/*

You are given a number A in binary format (Base = 2). You have to print the number in decimal format (Base = 10).

(0011)2 = (21 + 20)10 = (3)10 

(1010)2 = (23+ 21 + 20)10 = (11)10 



*/

package functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float A = 1;
		int deci = 1;
		int B = 1;

		Scanner sc = new Scanner(System.in);
		try {
				 //A = sc.nextFloat();
				B = sc.nextInt();
				
				 //deci = convertBinaryToDecimal( A);
				// deci = BinaryToDeci(B );
			}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	
		System.out.println("Decimal:"+deci);
		sc.close();
		
		

	}

	private static int convertBinaryToDecimal(float a) {

			//int[] digits = getDigitsOfNum(a);
			int arrSize = getCountOfDigits(a);
			System.out.println(arrSize);
			int [] arrBinary = new int[arrSize]; 
			
			
		
		return 0;
	}

	private static int getCountOfDigits(float M) {
		
		int reminder=1;
		int count=0;
		
		if(M!=0) {
			while(reminder!=0) {
				System.out.println("reminder before:"+reminder);
				reminder = Math.round(M%2);
				System.out.println("reminder after:"+reminder);
				if(reminder!=0)
				count = count + 1 ;
				System.out.println("Count:"+count);
				M=Math.round(M/2);
				System.out.println("M:"+M);
						
			}
		}else {
			count = count +1;
		}
		
	
	return count;
}
	
	
	static int BinaryToDeci(String n) {
		
		String num = n;
        int dec_value = 0;
 
        // Initializing base value to 1,
        // i.e 2^0
        int base = 1;
 
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
 
        return dec_value;
		
	}

}
