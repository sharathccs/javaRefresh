package intermediate_17_BinarySearch;

import java.util.HashSet;

public class test1 {

	public static void main(String[] args) {
		
		String S="abs";
		  char [] ch = S.toCharArray();
	        HashSet<Character> hs = new HashSet<Character>();
	        int n=ch.length;
	        String ans = "";
	        

	        for(int i=0;i<n;i++){
	            if(hs.contains(ch[i])){
	            	Character c=ch[i];
	            	String s=c.toString();
	            	
	                
	                
	            }
	            hs.add(ch[i]);
	        }

	       System.out.println(ans);

	}

}
