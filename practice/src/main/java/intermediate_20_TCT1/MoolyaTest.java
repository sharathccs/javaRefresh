package intermediate_20_TCT1;

/*
 * String str = "I am XYZ";
Reverse the string but the spaces should be at same place in the reversed string from original string.
Output: "Z YX maI"
		Z YX ma I
		Z YX  ma I
 * 
 * 
 * 
 * 
 * Not completely solved
 * 
 * 
 * 
 */



public class MoolyaTest {

	public static void main(String[] args) {
		String str = "I am XYZ";
		
		
		
		System.out.println(revString(str));
		
		
		
		

	}
	
	
	public static String revString(String S) {
		StringBuilder sb = new StringBuilder("");
		StringBuilder sb2 = new StringBuilder("");
		
		char [] chArr = S.toCharArray();
		for(int i=S.length()-1;i>=0;i--) {
			sb.append(chArr[i]);
		}//end of for
		
		String s2=sb.toString();
		
		char [] chArr2 = s2.toCharArray();
	
		for(int i=0;i<S.length();i++) {
			if(chArr[i]==' ' && chArr2[i]!=' ') {
				sb.replace(i, i, " ");
			}else if(chArr2[i]==' ' && chArr[i]!=' ') {
				sb2.append(chArr[i]);
				sb.replace(i, i, S);
				
				//replace(i, i, sb2);
			}
			
			
			
		}
		
		
		
		
		return sb.toString();
	}//end of rev method	
	
		
		
	

}
