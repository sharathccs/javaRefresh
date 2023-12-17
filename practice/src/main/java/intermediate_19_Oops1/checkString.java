package intermediate_19_Oops1;

public class checkString {

	public static void main(String[] args) {


		String s;
		s="I love my india";
		String [] sr = s.split(" ");
		
		for(int i1=0;i1<sr.length;i1++) {
			System.out.println(sr[i1] + sr[i1].length());
		}
		
		s.matches("[A-Za-z0-9]+");
		s.matches("ZXCVBNMSDFGHJKLPUYWQT");
		
		for(int i=0; i<s.length(); i++) {
	         if(s.charAt(i) == 'a'||s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
	            System.out.println("Given string contains "+s.charAt(i)+" at the index "+i);
	         }
		}
		
	}
}		
	
		
		
	

	
	
	
	


