package intermediate_4_BasicStrings;

public class ToLowerCase {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("the sky is blue");
		
		//System.out.println("Capacity of String: "+sb1.capacity());
		
		String A = " I love India ";

		int l = A.length();
		
		for(int i=0;i<l;i++) {
			if(A.charAt(i)>=65 && A.charAt(i)<=90) {
				//A.charAt(i)=(A.charAt(i)+32);
			}
		}
		
		
		
	}

}
