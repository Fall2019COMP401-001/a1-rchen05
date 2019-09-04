package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// Your code goes here.
		
		int num_items_store = scan.nextInt();
		//An integer count of the number of items in the store.
		
		String names[] = new String [num_items_store]; 
		Double prices[] = new Double [num_items_store];
		
		for (int a = 0; a < num_items_store; a++) {
			names [a] = scan.next();
			prices [a] = scan.nextDouble();	
		}
		
		int num_customers = scan.nextInt();
		
		String first[] = new String [num_customers]; 
		String last[] = new String [num_customers]; 
		Double totalPrices [] = new Double [num_customers];
		
		for (int z = 0; z < num_customers; z++) {
			totalPrices [z] = 0.0;
		}
		
		for (int b = 0; b < num_customers; b++) {
			first[b] = scan.next();
			last[b] = scan.next();
			int num_items_customers = scan.nextInt();
			
			for (int c = 0; c < num_items_customers; c++) {
				int quantity_bought = scan.nextInt();
				String name_item = scan.next();
				
				
				for (int d = 0; d < num_items_store; d++) {
					if (names[d].equals(name_item)) {
						totalPrices[b] += prices[d] * quantity_bought;
						
					}
				}
				
			}
		}
		
		Double smallest = totalPrices[0];
		Double biggest = totalPrices[0];
		Double average;
		int m = 0;
		int n = 0;
		double total = 0.0;
 
		for (int e = 0; e < totalPrices.length - 1; e++) {
			if (totalPrices[e + 1] > biggest) {
				biggest = totalPrices[e + 1];
				m = e + 1;
			}
		}
		
		for (int f = 0; f < totalPrices.length - 1; f++) {
			if (totalPrices[f + 1] < smallest) {
				smallest = totalPrices [f + 1];
				n = f + 1;
			}
		}
		
		for (int g = 0; g < totalPrices.length; g++) {
			total = total + totalPrices [g];
		}
		
		average = total / num_customers;
		
		
		System.out.println ("Biggest:" + " " + first[m] + " " + last [m] + " " + "(" + 	String.format("%.2f", biggest) + ")");
		System.out.println ("Smallest:" + " " + first[n] + " " + last [n] + " " + "(" + String.format("%.2f", smallest) + ")");
		System.out.println("Average:" + " " + String.format("%.2f", average));
		
		
	}
	
	// You can define / use static helper methods here.
}




/*

Then for each item in the store...
The name of each item (a single word)
The price of the item
An integer count of the number of customers
Then for each customer...
The first name of the customer
The last name of the customer
An integer count of the number of items the customer bought.
For each of the items bought...
The quantity of the item bought
The name of the item
*/