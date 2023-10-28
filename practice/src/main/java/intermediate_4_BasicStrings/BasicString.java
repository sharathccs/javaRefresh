package intermediate_4_BasicStrings;

public class BasicString {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("the sky is blue");
		//System.out.println("String: "+sb1.toString());
		
		//System.out.println("reversed String: "+sb1.reverse());
		
		
		//System.out.println("Capacity of String: "+sb1.capacity());
		
		String s2 = " I love India ";
		String s4 = s2.trim();
		
		System.out.println("s2:"+s2);
		
		
		
		String[] s3 = s4.split(" ", 0);
		
		String [] revString  = new String [s3.length] ;
	
		for (int i=0, j = s3.length-1; i<s3.length; i++, j--) {
			revString[j] = s3[i];
		}
		
		
		
		for (int j=0; j<s3.length; j++) {
			System.out.println(revString[j]);
			
		}
		
		String s5 = String.join(" ", revString);
		
		System.out.println(s5);

	}

}
