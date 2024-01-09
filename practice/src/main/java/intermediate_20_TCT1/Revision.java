package intermediate_20_TCT1;

public class Revision {

	public static void main(String[] args) {
		String s = "I love India";
		StringBuilder revString = new StringBuilder(); 
		
		for(int i=0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
		}
		
		reverseString(s, 2, 5);
	}
	
	public static String reverseString(String s1, int s, int e) {
		StringBuilder sd = new StringBuilder("");
		for(int i=e;i>=s;i--) {
			sd.append(s1.charAt(i));
		}
		System.out.println("reversed String:"+sd.toString());
		
		return sd.toString();
		
	}
	
	
	

}
