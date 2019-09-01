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
		int[] quantity;
		int buying = 0;
		public Customer(String a, String b, int d) {
			// constructor for class
			this.wholename = a;
			this.total = b;
			this.buying = d;
			this.basket = new String[d];
			this.quantity = new int[d];
		}

		String printline() {
			String printout = "";
			printout = (this.wholename+ " (" + this.total + ")");
			return printout;
		
	}
	}
	public static class Store{
		String[] stock ;
		int[] numberBrought;
		int[] counter;
		public Store ( String[] a) {
			this.stock = a;
			numberBrought = new int[a.length];
			counter = new int[a.length];
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
		Store grocer = new Store(items);
		List <Customer> buyers = new ArrayList<Customer>();
		List <int[]> matched = new ArrayList<int[]>();
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
				// making arrays for each customer to save how many of each item they brought 
				buyers.get(y).basket = basket;
				buyers.get(y).quantity = price;
			
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
		
		
			System.out.println(Arrays.toString(buyers.get(y).basket) );
			
		}
		for ( int i =0; i < loops; i ++) {
		System.out.println(buyers.get(i).wholename);
		System.out.println(Arrays.toString(items));
		System.out.println(Arrays.toString(buyers.get(i).basket));
		// indexes of each of the brought objects, and they occur in the quanity brought!!
		System.out.println( " You buy this amount of items:" + Arrays.toString(findmatch(buyers.get(i).basket, items)));
		matched.add(findmatch(buyers.get(i).basket, items));
		System.out.println(Arrays.toString(counterBuy(matched.get(i), grocer));
		}
		)
	}

// c is the longer array!!
public static int[] findmatch( String[] s, String[] c) {
	int [] count = new int[s.length];
	for ( int i =0; i < s.length; i ++) {
		for ( int x = 0; x < c.length; x++) {
			if(s[i].equals(c[x])) {
				count[i] = x;
			}
		}
	}
	return count;
}
	
// count how many of each item you buy 
public static int[] counterBuy( int[] a, Store s) {
	int[] counter = new int[s.stock.length];
	for ( int y = 0; y < counter.length; y ++) {
		int x = 0;
	if ( a[y] == x) {
		counter[x] = counter[x]++;
		x++;
	}
	}
	return counter;
}
}
// make method to 
	
