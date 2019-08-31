package a1;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

import java.util.List;

public class A1Adept {
	
	public static class Customer{
		String firstname;
		String lastname;
		String total;
		public Customer(String a, String b, String c) {
			// constructor for class
			this.firstname = a;
			this.lastname = b;
			this.total = c;
		}
		void printline() {
			System.out.println(this.firstname + " "+ this.lastname + (this.total));
		}
		
	}
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

		for (int x = 0; x < stock; x++) {
			items[x] = scan.next();
			prices[x] = scan.nextDouble();

		}
		System.out.println(Arrays.toString(items));
		System.out.println(Arrays.toString(prices));

		int loops = scan.nextInt();
		System.out.println(loops);
		int buying;
		List <Customer> buyers = new ArrayList<Customer>();
		for (int y = 0; y < loops; y++) {
			// make a name into a class with a first name and a second name 
			String fName = scan.next(); 
	
			String lName = scan.next();
		// making an list of customers with each index being initalized in the loop 
			buyers.add( new Customer( fName, lName, ""));
			System.out.println(buyers);
			buying = scan.nextInt();
			System.out.println("The amount you are buying is: " + buying);
			
			// Initalizing the arrays for quanity of each cost and items brought. 
			String[] basket = new String[buying];
			int[] price = new int[buying];
			
				for (int z = 0; z < buying; z++) {
					price[z] = scan.nextInt();
					basket[z] = scan.next();
				}
				
			System.out.println(Arrays.toString(price));
			System.out.println(Arrays.toString(basket));
			
			
			// Woot all the arrays are here!! Now to compare arrays to find the index's!!
			int [] indexs = new int[buying];
			for (int t = 0; t < basket.length; t++) {
				for (int e=0; e < items.length; e++) {
				if(basket[t].equals(items[e])) {
					indexs[t] = e;
				}
				}
			}
			System.out.println(Arrays.toString(indexs));
			
			
			// Woot now to get the total cost
			Double cost; 
			cost = 0.0;
			for (int u = 0; u < basket.length; u++) {
				cost = (price[u]*prices[indexs[u]]);		
			}
			String roundTotal = "";
			System.out.println(cost);
			roundTotal = String.format("%.2f", cost);
			buyers.get(y).total = roundTotal;
		}

		// make a class that stores a first name, last name and the cost that's printed! Then figure out the loop and comparison!!	
		
	}

/*PLAN FOR GOING ON!!
		 * make a method that compares the string arrays, and when it finds a match it's stored into an array of indexes
		 * Then take those indexes and use them to find the prices of each item
		 * Then multiply the prices buy the quantity brought
		 * Then make the array of the total and the names. Each name is an index in another array
		 * Then go through all three names make a method to see which value is greater, the indexes match with the name, 
		 * Then print out the statemens
		 */

// make a method to compare the prices from part 1!!		

// method goes here that sorts through the people and orders	

	public static String[] namesArray(int a) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[a];
		for (int x = 0; x < a; x++) {
			names[x] = scan.next();
		}
		return names;
	}

}

