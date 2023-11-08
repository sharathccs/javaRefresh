package intermediate_13_PrimeNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllPrimes {

	public static void main(String[] args) {
		
		
		int A=19;
		boolean [] bArr= getBooleanArray(A);
        ArrayList <Integer> a1= new ArrayList<Integer>();
        for(int k=2;k<bArr.length;k++){
            if(bArr[k]==true){
                a1.add(k);
            }// end of if
        }//end of for loop
        
        
        
        
        System.out.println(a1);
		
		
		
		
		

	}// end of main
	
	public static boolean [] getBooleanArray(int N){
        //initialize an array of N+1 size with true
        boolean [] primeBool = new boolean[N+1];
        Arrays.fill(primeBool , true);
        
        
        
        //set primeBool[0] and primeBool[1]=false
        primeBool[0]=false;
        primeBool[1]=false;


        //iterate from outer loop
                for(int i=2; i*i<=N; i++){
                    if(primeBool[i]==true){
                        for(int j=i*i; j<=N;j=j+i){
                            primeBool[j]=false;
                        }// end of inner for loop
                    }//end of if
                }//end of outer forloop


        return primeBool;




    }//end of getBooleanArray

	
	
	
	

}
