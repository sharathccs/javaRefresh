/*
 * 
 * This approach will give memory limit exceeded
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * /
 */







package intermediate_6_SubArrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOfSubArraySumsMostOptimized {

	public static void main(String[] args) {
		
	}//main ending
	
	static long getSumOfAllSubArrays( ArrayList <Integer> A) {
		
		
		Long sum = 0l;
        
		   
        for(int i=0;i<A.size();i++) {
            
            //Frequency: In how many subarrays the ith element will be there
            long freq = (i+1) * (long) (A.size()-i);
            long contribution = freq * A.get(i);

            sum = sum + contribution;
            
        }//for loop ending

            return sum;

        }//method getSumOfAllSubArrays ending
	
}//class ending
