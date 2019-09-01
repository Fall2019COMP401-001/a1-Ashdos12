package a1;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

import java.util.List;

public class A1Adept {
	
	public static class Customer{
		String firstname = "";
		String lastname = "";
		String total = "";
		double totalRaw= 0;
		public Customer(String a, String b, String c, double d) {
			// constructor for class
			this.firstname = a;
			this.lastname = b;
			this.total = c;
			this.totalRaw = d;
		}

		String printline() {
			String printout = "";
			printout = (this.firstname + " "+ this.lastname + " (" + this.total + ") ");
			return printout;
		
	}
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


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

		// making an list of customers with each index being initialized in the loop 
			buyers.add( new Customer( fName, lName, "", 0));
			
			buying = scan.nextInt();
	
			
			// Initalizing the arrays for quanity of each cost and items brought. 
			String[] basket = new String[buying];
			int[] price = new int[buying];
			
				for (int z = 0; z < buying; z++) {
					price[z] = scan.nextInt();
					basket[z] = scan.next();
				}
				
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
			buyers.get(y).totalRaw = cost;
	
			buyers.get(y).total = roundTotal;

	
			String ok = buyers.get(y).total;
		
	
		}
		for (int c = 0; c < buyers.size(); c++) {
			String purchase = buyers.get(c).total;
			baseline[c] = Double.parseDouble(purchase);
		}
		String maximum = "";
		Customer maxBuy = new Customer( "", "", "", 0);
		String minimum = "";
		Customer minBuy = new Customer("", "", "", 0);
		String average = "";
		
	
	// assigning variables for methods to find minimum and maximum 
		double max = findMax(baseline);
		maximum =String.format("%.2f", max);
		
		double min = findMin(baseline);
		minimum = String.format("%.2f", min);
		double avg = findAvg(baseline);
		average = String.format("%.2f", avg);
		// compares with the lists to choose which Customers to print
			for ( int t = 0; t < buyers.size(); t++) {
				if (buyers.get(t).totalRaw >=max) {
					maxBuy = buyers.get(t);
					
				} 
				if (buyers.get(t).totalRaw <= min){
					minBuy = buyers.get(t);
					
				}
			} if (max == min && buyers.size() > 1){
				for ( int i = 1; i < buyers.size(); i ++) {
				maxBuy = buyers.get(i);
				minBuy = buyers.get(0);
				}
		}
	
		// output
	
		System.out.println("Biggest: " + maxBuy.printline());
		
		System.out.println("Smallest: " + minBuy.printline());
		
		System.out.println("Averege: " + average);
}
		
		
			

		
// useful methods
	public static double findMax( double[] input)	{
		double maxVal = input[0];
		for ( int s = 0; s < input.length; s++) {
			if (input[s]> maxVal) {
				maxVal = input[s];
			}
		}
		return maxVal;
	}
	public static double findMin(double[] input) {
		double minVal = input[0];
		for ( int s = 0; s < input.length; s++) {
			if (input[s]< minVal) {
				minVal = input[s];
			}
		}
		return minVal;
	}
	public static double findAvg(double[] input) {
		double avg = input[0];
		for (int y = 1; y < input.length; y++) {
			avg = avg + input[y];
		}
		return avg / input.length;
	}

	public static String[] namesArray(int a) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[a];
		for (int x = 0; x < a; x++) {
			names[x] = scan.next();
		}
		return names;
		}
	}


