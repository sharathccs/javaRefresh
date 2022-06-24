package LogicalThinking2;

import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
				int CostPrice = sc.nextInt();
				int SellingPrice = sc.nextInt();
				
				
				if(CostPrice >=1) {
					if(SellingPrice <=1000000000) {
						
						if(SellingPrice > CostPrice) {
							System.out.println("1");
							System.out.println(SellingPrice - CostPrice);
						}else {
							System.out.println("-1");
							System.out.println(Math.abs(SellingPrice-CostPrice));
						}
						
					}else {
						System.out.println("Selling price should be <= 1000000000 ");
					}
					
					
					
					
				}else {
					System.out.println("Cost Price >=1 ");
				}
				
	  		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer");
		}
		

		

	}

}
