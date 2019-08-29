package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// array for the number of customer 
		int customers = scan.nextInt();
		
		// make for loop that will cycle through each customer!!
		for (int i = 0; i < customers; i ++) {
			// System.out.println("Number of customers: " + customers);
			String custFName = scan.next();
			String custLName = scan.next();
	
			double total = 0; 
			int loops = scan.nextInt();
			String roundTotal = "";
			// loop through for each item, updating the total as it goes. 
			for (int n = 0; n < loops; n++) {
				int amt = scan.nextInt();
				// takes in name of item 
				String purchase = scan.next();
				
				double price = scan.nextDouble();
				
				total = total + ( amt * price);
				// rounds off to the correct amount
				 roundTotal = String.format("%.2f", total);
			}
			
			System.out.println(custFName.charAt(0)+". " + custLName + ": "+ roundTotal );
		}

	}
}
