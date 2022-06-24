/*

Given N=4, print an isoceles triangle

*
**
***
****


*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericStair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B=1;
				
				for(int i=1;i<=A;i++) {
					for(int j=1;j<=B;j++) {
						System.out.print(j);
						if(j!=B) {
							System.out.print(" ");
						}
					}B=B+1;
					System.out.println();	
				}
		
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		sc.close();
	}

}
