package intermediate_4_BasicStrings;

public class ReverseString {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("the sky is blue");
		
		//System.out.println("Capacity of String: "+sb1.capacity());
		
		String s2 = " I love India ";
		
		StringBuilder sb2 = new StringBuilder(s2);
		
	
		
		String revString = sb2.reverse().toString();
		
		System.out.println(revString);
		
		
	}

}
