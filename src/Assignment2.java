//*******************************************
// Assignment2 
// James Rangel
//
// Restaurant Ordering Application
//*******************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment2 {
	
	   public static void main(String[] args)
	   {
		   
		   char pickUp;
		   char delivery;
		   String decision;
		   String order;
		   String another = "y";
		   int zipCode;
		   float tax;
		   float deliveryFee;
		   float burgerValue;
		   float drinkValue;
		   float friesValue;
		   float dessertValue;
		   Float burgerSubtotal;
		   Float drinkSubtotal;
		   Float friesSubtotal;
		   Float dessertSubtotal;
		   float subtotal;
		   float total;
		   
		   
		   burgerValue = (float) 4.50;
		   drinkValue = (float) 1.50;
		   friesValue = (float) 2.50;
		   dessertValue = (float) 3.00;
		   tax = (float) 0.05;
		   
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Welcome to the Flyers Restaurant Command Line Ordering System!");
		   System.out.println("Is this order for pickup or deliver? (p/d): ");
		   decision = (scan.nextLine());
		   if (decision.equalsIgnoreCase("p")) {
			   deliveryFee = 0;
		   }
			  
		   else if (decision.equalsIgnoreCase("d")) {
		   		System.out.println("Please enter destination Zipcode: ");
		   		zipCode = (scan.nextInt());
		   		if (zipCode == 60446) {
	   				deliveryFee = (float) 5.00;
	   				System.out.println("Delivery Available. This is a $5.00 fee.");
			   }
	   			else if(zipCode == 60451 || (zipCode == 60441)) {
	   				deliveryFee = (float) 7.00;
	   				System.out.println("Delivery Available with Extra Cost. This is a $7.00 fee.");
	   			}
	   			else {
	   				deliveryFee = 0;
	   				System.out.println("Delivery Not Available in your area. Please order for pickup.");
	   			}
		   }
	   			
			 while (another.equalsIgnoreCase("y"))  // allows y or Y
		      { 
				 System.out.println("What would you like to order?");
				 System.out.println("Please choose from the following items:");
				 System.out.println("Burger, Fries, Drink, Dessert");
		
		
				 order = (scan.nextLine());
				 if(order.equalsIgnoreCase("burger")) {
					 System.out.println("How many burgers would you like?");
					 burgerSubtotal = (scan.nextInt() * burgerValue);
				 }
		
				 else {
					 System.out.println("Invalid Entry. Please type in Burger, Fries, Drink, or Dessert");
				 }
		
				 System.out.println("Would you like anything else? (y/n)");
				 another = scan.nextLine();
		
				 order = (scan.nextLine());
				 if(order.equalsIgnoreCase("drink")) {
					 System.out.println("How many drinks would you like?");
					 drinkSubtotal = (scan.nextInt() * drinkValue);
				 }
		
				 else {
					 System.out.println("Invalid Entry. Please type in Burger, Fries, Drink, or Dessert");
				 }
		
				 System.out.println("Would you like anything else? (y/n");
				 another = scan.nextLine();
		
				 if(order.equalsIgnoreCase("fries")) {
					 System.out.println("How many fries would you like?");
					 friesSubtotal = (scan.nextInt() * friesValue);
				 }
		
				 else {
					 System.out.println("Invalid Entry. Please type in Burger, Fries, Drink, or Dessert");
				 }
		
				 System.out.println("Would you like anything else? (y/n)");
				 another = scan.nextLine();
		
				 if(order.equalsIgnoreCase("dessert")) {
					 System.out.println("How many desserts would you like?");
					 dessertSubtotal = (scan.nextInt() * drinkValue);
				 }
		
				 else {
					 System.out.println("Invalid Entry. Please type in Burger, Fries, Drink, or Dessert");
				 }
		
				 System.out.println("Would you like anything else? (y/n)");
				 another = scan.nextLine();
		
		subtotal = (burgerSubtotal + drinkSubtotal + friesSubtotal + dessertSubtotal);
		total = (subtotal * tax + deliveryFee);
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.println("Your order has been received!");
		System.out.println("Subtotal: " + fmt.format(subtotal));
		System.out.println("Tax: " + fmt.format(subtotal * tax));
		System.out.println("Delivery Fee: " + fmt.format(deliveryFee));
		System.out.println("Total: " + fmt.format(total));
	      }
	}
}

