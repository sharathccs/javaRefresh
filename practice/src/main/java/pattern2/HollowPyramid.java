package pattern2;

import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=n;j>=i;j--) {
						System.out.print("*");
					
				}
				
				
				for(int k=1;k<n;k++) {
					System.out.print(" ");
				}
				
				
				for(int k=2*(n-i);k>=1;k--) {
					System.out.print("*");
				}
				
				
				
				
				
				System.out.println();
			}
		
			
			
			
			
			
			
		
			sc.close();
	}

}
