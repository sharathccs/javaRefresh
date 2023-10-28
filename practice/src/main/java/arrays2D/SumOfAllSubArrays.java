package arrays2D;

public class SumOfAllSubArrays {
	
	public int solve(int[][] A) {
        int m=A.length;
        int n=A[0].length;
        
        
        long TL=0;
        long BR=0;
        Long sum=(long)0;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            	
            	
            	//Use this formula for getting to the Top left and Bottom right index
                TL=(i+1)*(j+1);
                BR=(m-i)*(n-j);
                
                //Sum = sum + contribution of each element
                			//contribution of each element  = frequency * value of the element
                					//frequency = TL * BR of the element
                sum=sum+TL*BR*(long)A[i][j];
            }
        }

        return sum.intValue();



    }

}
