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
		   
		   String decision, order, another = "y";
		   int zipCode;
		   double tax = 0.05;
		   float deliveryFee = 0;
		   double burgerValue = 4.50;
		   double drinkValue = 1.50;
		   double friesValue = 2.50;
		   double dessertValue = 3.00;
		   double burgerSubtotal = 0;
		   double drinkSubtotal = 0;
		   double friesSubtotal = 0;
		   double dessertSubtotal = 0;
		   double subtotal;
		   double orderTax;
		   double total;	   
		   
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
		   		if (zipCode >= 60442 && (zipCode <= 60450)) {
	   				deliveryFee = (float) 5.00;
	   				System.out.println("Delivery Available. This is a $5.00 fee.");
			   }
	   			else if(zipCode == 60441 || (zipCode == 60451)) {
	   				deliveryFee = (float) 7.00;
	   				System.out.println("Delivery Available with Extra Cost. This is a $7.00 fee.");
	   			}
	   			else {
	   				deliveryFee = 0;
	   				System.out.println("Delivery Not Available in your area. Please order for pickup.");
	   			}
		   }
	   		
		   
		   while (another.equalsIgnoreCase("y")) 
		   {
				 System.out.println("What would you like to order?");
				 System.out.println("Please choose from the following items:");
				 System.out.println("Burger, Fries, Drink, Dessert");
		
		
				 order = (scan.next());
				 if(order.equalsIgnoreCase("burger")) {
					 System.out.println("How many burgers would you like?");
					 burgerSubtotal = (burgerSubtotal + (scan.nextInt() * burgerValue));
				 }

				 else if(order.equalsIgnoreCase("drink")) {
					 System.out.println("How many drinks would you like?");
					 drinkSubtotal = (drinkSubtotal + (scan.nextInt() * drinkValue));
				 }
		
				 else if(order.equalsIgnoreCase("fries")) {
					 System.out.println("How many fries would you like?");
					 friesSubtotal = (friesSubtotal + (scan.nextInt() * friesValue));
				 }

				 else if(order.equalsIgnoreCase("dessert")) {
					 System.out.println("How many desserts would you like?");
					 dessertSubtotal = (dessertSubtotal + (scan.nextInt() * dessertValue));
				}
				 else {
					 System.out.println("Invalid Entry. Please type in Burger, Fries, Drink, or Dessert");
				 }
		
				 System.out.println("Would you like anything else? (y/n)");
				 another = scan.next();
				 
		   }
		   
		   NumberFormat fmt = NumberFormat.getCurrencyInstance();
		   NumberFormat bill = NumberFormat.getNumberInstance();
		   
			
			subtotal = (burgerSubtotal + drinkSubtotal + friesSubtotal + dessertSubtotal);
			orderTax = (subtotal * tax);
			total = (subtotal + orderTax + deliveryFee);	  
			
			System.out.println("Your order of the following items has been received!");
			System.out.println("Burger(s): " + (bill.format(burgerSubtotal / burgerValue)));
			System.out.println("Fries: " + (bill.format(friesSubtotal / friesValue)));
			System.out.println("Drink(s): " + (bill.format(drinkSubtotal / drinkValue)));
			System.out.println("Dessert(s): " + (bill.format(dessertSubtotal / dessertValue)));
			System.out.println("Subtotal: " + fmt.format(subtotal));
			System.out.println("Tax: " + fmt.format(orderTax));
			System.out.println("Delivery Fee: " + fmt.format(deliveryFee));
			System.out.println("Total: " + fmt.format(total));
	   }
}





