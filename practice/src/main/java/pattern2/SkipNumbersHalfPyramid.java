/*


Given an Integer N. Print N lines of Integers, each line has integers 1 to i where i is the line number. Replace all even numbers with a space.

For example

Input:-

5

Output:-

1

1_

1_3

1_3_

1_3_5

Here '_' represents space for explanation purpose only. You have to print space in your code.





*/

package pattern2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SkipNumbersHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int A = sc.nextInt();
			int B= 1;
				
				for(int i=1;i<=A;i++) {
					for(int j=1;j<=B;j++) {
						
						if(j%2!=0) {
							System.out.print(j);
						}else {
							System.out.print("_");
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
