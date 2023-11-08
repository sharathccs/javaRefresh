package intermediate_13_PrimeNumbers;
import java.util.ArrayList;



public class PrintVowelsAndConsonants {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> count = getCountOfVowelsAndConst("aeious");
		System.out.println(count);
		
		
		
		
		

	}// end of main
	
	static ArrayList<Integer> getCountOfVowelsAndConst(String s){
		
		char [] c1= s.toCharArray();
		int countVowels=0;
		int countConst=0;
		ArrayList<Integer> counts = new ArrayList<Integer>();
		
		
		for(int i=0;i<c1.length;i++) {
			if (c1[i]== 'a' | c1[i]== 'e' | c1[i]== 'i' | c1[i]== 'o' | c1[i]== 'u') {
				countVowels++;
			}//end of if
			else if(c1[i] >= 'A' | c1[i] <='Z') {
				countConst++;
			}
		}//end of for
		
		counts.add(countVowels);
		counts.add(countConst);
		
		
		return counts;
		
		
		
	}// end of method
	
	
	
	
	

}//end of class
