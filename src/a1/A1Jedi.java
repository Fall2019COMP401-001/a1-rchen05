package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num_items_store = scan.nextInt();
		//An integer count of the number of items in the store.
		int customers = 0;
		
		String names[] = new String [num_items_store]; 
		Double prices[] = new Double [num_items_store];
		
		for (int a = 0; a < num_items_store; a++) {
			names [a] = scan.next();
			prices [a] = scan.nextDouble();	
		}
		
		int num_customers = scan.nextInt();
		
		String first[] = new String [num_customers]; 
		String last[] = new String [num_customers]; 
		int totalQuantities[] = new int [num_items_store];
		int countingCustomers [] = new int [num_items_store];
		
		
//		for (int z = 0; z < num_customers; z++) {
//			totalQuantities [z] = 0;
//		}
		
		for (int b = 0; b < num_customers; b++) {
			first[b] = scan.next();
			last[b] = scan.next();
			int num_items_customers = scan.nextInt();
			
			boolean allFalse [] = new boolean [num_items_store];
			
			for (int c = 0; c < num_items_customers; c++) {
				
				int individual_quantity_bought = scan.nextInt();
				String name_item = scan.next();
				
				
				for (int d = 0; d < num_items_store; d++) {
					if (names[d].equals(name_item)) {
						totalQuantities[d] += individual_quantity_bought;
						if (allFalse[d] == false) {
							countingCustomers[d]++;
							allFalse[d] = true;
						}	
					}
				}
				
			}
		}
		
		
		for (int d = 0; d < num_items_store; d++) {
			if (totalQuantities[d] == 0) {
				System.out.println("No " + "customers " + "bought " + names[d]);
			} else {
				System.out.println(countingCustomers[d] + " customers bought " + totalQuantities[d] + " " + names[d]);
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	// You can define / use static helper methods here.
}
