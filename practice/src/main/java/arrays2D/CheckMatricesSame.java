package arrays2D;

public class CheckMatricesSame {
	
	  public int solve(int[][] A, int[][] B) {

          int result=0;
             for(int i=0;i<A.length;i++){
              for(int j=0;j<A[0].length;j++){
                  if(A[i][j]!=B[i][j]){
                      result=0;
                      break;
                  }else{
                      result=1;
                      continue;
                  }
                      
              }
          }

          return result;

  }

}
