package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
	// number of items in store 
		int stock = scan.nextInt();
		// make a string array of items and then make a double array of prices. 
		// each item will correspond to the price in the same block 
		System.out.println("Amount in stock is: " + stock);
		String[] items; 
		double[] prices;
		items = new String[stock];
		prices = new double[stock];

		for ( int x = 0; x < stock; x++) {
			items[x]= scan.next();
			prices[x]= scan.nextDouble();
		
		}
		System.out.println(Arrays.toString(items));
		System.out.println(Arrays.toString(prices));

		/* make a method that reads these arrays it finds the string 
		that's equal to their item, and then uses the location 
		/hello!!
		 * 
		0. Seperate the loops by people
		1. make a method that sees when is the srting equal to an item in the array
		2. Store the value for it's location
		3. Go through the 
		to find the price and then multiplies it by the stored 
		value of the quantity	*/
		
		
// make a method to compare the prices from part 1!!		


	}
	
// method goes here that sorts through the people and orders	
	
	
}











/*
 * int customers = scan.nextInt();
 * 
 * // make for loop that will cycle through each customer!! for (int i = 0; i <
 * customers; i ++) { // System.out.println("Number of customers: " +
 * customers); String custFName = scan.next(); String custLName = scan.next();
 * 
 * double total = 0; int loops = scan.nextInt(); String roundTotal = ""; // loop
 * through for each item, updating the total as it goes. for (int n = 0; n <
 * loops; n++) { int amt = scan.nextInt(); // takes in name of item String
 * purchase = scan.next();
 * 
 * double price = scan.nextDouble();
 * 
 * total = total + ( amt * price); // rounds off to the correct amount
 * roundTotal = String.format("%.2f", total); }
 * 
 * System.out.println(custFName.charAt(0)+". " + custLName + ": "+ roundTotal );
 * }
 */