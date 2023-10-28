package pattern2;

import java.util.Scanner;

public class PhotoFrame {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			
			for(int i=n;i>=1;i--) {
				for(int j=n;j>=1;j--) {
					
					if(i==1 | i==n | j==1 || j==n) {
						System.out.print("*");
					}else
						System.out.print(" ");
				}
				System.out.println();
			}
			sc.close();
	}

}
