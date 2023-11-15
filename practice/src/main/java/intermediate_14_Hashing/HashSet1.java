package intermediate_14_Hashing;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
			
		System.out.println("size:"+hs.size());
		
		
		hs.remove(50);
		System.out.println("size:"+hs.size());
		
		hs.remove(80);
		System.out.println(hs);
		
		System.out.println("check if 40 is present:"+hs.contains(40));

	}

}
