package a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import a1.A1Adept.Customer;

public class A1Jedi {
	
	public static class Customer{
		String wholename = "";
	
		String total = "";
		String[] basket ;
		double[] quantity;
		int buying = 0;
		public Customer(String a, String b, int d) {
			// constructor for class
			this.wholename = a;
			this.total = b;
			this.buying = d;
			this.basket = new String[d];
			this.quantity = new double[d];
		}

		String printline() {
			String printout = "";
			printout = (this.wholename+ " (" + this.total + ")");
			return printout;
		
	}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Scan the list of the stock ingredients and to initalize an array of customers
		int stock = scan.nextInt();
		
		String[] items;
		double[] prices;
		items = new String[stock];
		prices = new double[stock];

		for (int x = 0; x < stock; x++) {
			items[x] = scan.next();
			prices[x] = scan.nextDouble();
		}
		int loops = scan.nextInt();
		int buying;
		List <Customer> buyers = new ArrayList<Customer>();
		double[] baseline = new double[loops];
		
// main class constructor for the orders		
		for (int y = 0; y < loops; y++) {
			
			// make a name into a class with a first name and a second name 
			String fName = scan.next(); 
			String lName = scan.next();
			String wholenam = (fName + " " + lName);
		// making an list of customers with each index being initialized in the loop 
			buyers.add( new Customer( wholenam, "", 0));
			
			buying = scan.nextInt();
	
			
			// Initalizing the arrays for quanity of each cost and items brought. 
			String[] basket = new String[buying];
			int[] price = new int[buying];
			
				for (int z = 0; z < buying; z++) {
					price[z] = scan.nextInt();
					basket[z] = scan.next();
				}
				buyers.get(y).basket = basket;
				
			
			// Woot all the arrays are here!! Now to compare arrays to find the index's!!
			int [] indexs = new int[buying];
			for (int t = 0; t < basket.length; t++) {
				for (int e=0; e < items.length; e++) {
				if(basket[t].equals(items[e])) {
					indexs[t] = e;
				}
				}
			}
		
			Double cost; 
			cost = 0.0;
			for (int u = 0; u < basket.length; u++) {
				cost = cost + (price[u]*prices[indexs[u]]);		
				}
			String roundTotal = "";
			roundTotal = String.format("%.2f", cost);
			buyers.get(y).total = roundTotal;

	
			String ok = buyers.get(y).total;
		
	
		}
		System.out.println(buyers.get(loops).wholename);
		System.out.println(Arrays.toString(buyers.get(loops).basket) );
	}
}
