/*

Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers 
(correct up to 2 decimal places).

*/

package pack1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
				
		float A=scn.nextFloat();
		float B=scn.nextFloat();
		float C=scn.nextFloat();
		float D=scn.nextFloat();
		float E=scn.nextFloat();
		
		float avg=(A+B+C+D+E)/5;
		
		DecimalFormat f = new DecimalFormat("##.00");
	    System.out.println(f.format(avg));
		
		}
	}
