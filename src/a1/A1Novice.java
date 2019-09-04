package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num_customers = scan.nextInt();
		
		for (int i = 0; i < num_customers; i++) {
			
		String first_name = scan.next();
		String last_name = scan.next();
		int item_one = scan.nextInt();
		double total = 0.0;
		// String.format("%.2f", total);

			for (int a = 0; a < item_one; a++) {
				
				int quantity_one = scan.nextInt();
				String item_name_one = scan.next();
				double price_one = scan.nextDouble();
				total = total + (quantity_one * price_one);
			
			}
								
		System.out.println(first_name.charAt(0) + ". " + last_name + ": " + String.format("%.2f", total));
			}
		
		}
		
		// Your code goes here.
	}
	
	// You can define / use static helper methods here.


