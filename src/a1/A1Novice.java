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
	
			// make 3d array to store numerical value then use the array to add up the totals and store it in a value 
			double total = 0; 
			int loops = scan.nextInt();
			String roundTotal = "";
			// loop through for each item, updating the total as it goes. 
			// dosent work as double is a different data type than int
			for (int n = 0; n < loops; n++) {
				int amt = scan.nextInt();
	
				String purchase = scan.next();
				
				double price = scan.nextDouble();
				
				total = total + ( amt * price);
				 roundTotal = String.format("%.2f", total);
			}
			
			System.out.println(custFName.charAt(0)+". " + custLName + ": "+ roundTotal );
		}

	}
}
