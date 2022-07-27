
/*
Given a number A. Return square root of the number if it is perfect square otherwise return -1.

*/

package intermediate_1_intro;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;


public class ArmStrongNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		try {
				N = sc.nextInt();
				if(N<=10000 && N>=1) {
				
					for(int i=1;i<=N;i++) {
						if(checkArmstrong(i))
						System.out.println(i);
					}
					
				}
			else 
				System.out.println("Enter number within the range");
			
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}	

	}
	
	public static boolean checkArmstrong(int N) {
		boolean isArmstrong = false;
		int num=N;
		int sum=0;
		int rem=1;
		
		while(num!=0) {
			rem = num%10;
			sum = ((rem)*(rem)*(rem))+sum;
			num=num/10;
		}
		//System.out.println("N:"+ N + " sum:"+sum );
		if(N==sum) {
			isArmstrong=true;
		}else {
			isArmstrong=false;
		}
		return isArmstrong;
		
	}
}
