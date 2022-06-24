
/*
You are given an integer N you need to print all the Prime Numbers between 1 and N.

Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
*/

package functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int radius;
		
		
		try {
				radius = sc.nextInt();
				if(radius<=1000 && radius>=1) {
						System.out.println(
								
								
								getVolOfSphere(radius));
						
					}
				else {
					System.out.println("Enter a value between 1 and 1000");
				
				}
			}catch(InputMismatchException e) 
		{
			System.out.println("Enter an integer");
		}
		sc.close();

	}
	
	
	private static int getVolOfSphere(int rad) {
			int volume;
			double pi=3.142;
			double val = (4*Math.PI * rad *rad *rad)/3;
			
			
			
			volume = (int) Math.ceil(val);
			
			System.out.println("act val: "+val);
			
			System.out.println("ciel val: "+ Math.ceil(val)  );
			
			System.out.println("int val: "+ (int) Math.ceil(val)  );
		

			
			
			
			
		
		return volume;
	}
	
}




