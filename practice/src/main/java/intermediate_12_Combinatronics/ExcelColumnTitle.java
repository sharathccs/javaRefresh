/*
 * 
 * This program is working for all values like: 943599
 * 
 * But it is failing for values like 943566
 * 
 * 
 * 
 * /
 */







package intermediate_12_Combinatronics;

import java.util.HashMap;

public class ExcelColumnTitle {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder(); 
		
		
		//s1=getExcelColumnTitle(943566,s1).reverse();
		s1=getExcelColumnTitle(943599,s1).reverse();
		System.out.println("Final:" + s1);
	
	
	}//end of main method
	
	static StringBuilder getExcelColumnTitle(int num, StringBuilder s) {
		
		
		if( num < 26) {
			char c = getCharFromInt(num);
			return s.append(c);
		}
		
		Long q = (long) num / 26;
		int r = num % 26;
		System.out.println("q:" + q + " r: " + r);
		 s = s.append(getCharFromInt(r));
		 System.out.println("s:" + s);
		return getExcelColumnTitle(q.intValue(), s);
		
	}// end of Excel Column Title
	
	
	static char getCharFromInt(int N) {
		
		HashMap <Integer, Character> charMap = new HashMap <Integer, Character>();
		charMap.put(1, 'A');
		charMap.put(2, 'B');
		charMap.put(3, 'C');
		charMap.put(4, 'D');
		charMap.put(5, 'E');
		charMap.put(6, 'F');
		charMap.put(7, 'G');
		charMap.put(8, 'H');
		charMap.put(9, 'I');
		charMap.put(10, 'J');
		charMap.put(11, 'K');
		charMap.put(12, 'L');
		charMap.put(13, 'M');
		charMap.put(14, 'N');
		charMap.put(15, 'O');
		charMap.put(16, 'P');
		charMap.put(17, 'Q');
		charMap.put(18, 'R');
		charMap.put(19, 'S');
		charMap.put(20, 'T');
		charMap.put(21, 'U');
		charMap.put(22, 'V');
		charMap.put(23, 'W');
		charMap.put(24, 'X');
		charMap.put(25, 'Y');
		charMap.put(0, 'Z');
		
				
		
		return charMap.get(N);
		
		
	}
	
	
	

}// end of class
