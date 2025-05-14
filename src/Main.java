
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   static ArrayList<String> items = new ArrayList<>();
   static ArrayList<Double> prices = new ArrayList<>();
   static ArrayList<Integer> quantities = new ArrayList<>();
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //this is our store manager
       preloadItems();
       while (true) {
           System.out.println("\n--- Store Management System ---");
           System.out.println("1. Show Stock");
           System.out.println("2. Add New Items");
           System.out.println("3. Update an Item");
           System.out.println("5. Search an Item");
           System.out.print("Choose an option: ");
           int choice = scan.nextInt();
           // scan.next();


           switch (choice) {
               case 1:
                   showStock();
                   break;
               case 2:
                   addNewItem();
                   break;
               default:
                   System.out.println("Invalid choice. Try again.");
           }
       }
   }



   static void preloadItems() {
       items.add("Sugar");
       prices.add(2.5);
       quantities.add(10);


       items.add("Maize");
       prices.add(3.0);
       quantities.add(20);


       items.add("Rice");
       prices.add(4.0);
       quantities.add(15);


       items.add("Beans");
       prices.add(1.5);
       quantities.add(25);


       items.add("Flour");
       prices.add(2.0);
       quantities.add(30);
   }


   static void showStock() {
       if (items.isEmpty()) {
           System.out.println("No items in stock.");
       } else {
           for (int i = 0; i < items.size(); i++) {
               System.out.println((i + 1) + ". " + items.get(i) + " - Price: R" + prices.get(i) + " - Quantity: " + quantities.get(i));
           }
       }
   }
//add item
   static void addNewItem() {
       System.out.println("Please enter the number of items you want to add:");
       int numberOfItems = scan.nextInt();
       for (int i = 0; i < numberOfItems; i++) {
           System.out.println("Enter the name of item " + (i + 1) + ":");
           String newItem = scan.next();
           System.out.println("Enter the price of " + newItem + ":");
           double newPrice = scan.nextDouble();
           System.out.println("Enter the quantity of " + newItem + ":");
           int newQuantity = scan.nextInt();
           // scan.next();


           items.add(newItem);
           prices.add(newPrice);
           quantities.add(newQuantity);
       }
   }


}


