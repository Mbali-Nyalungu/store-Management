
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
   static void updateItem() {
    if (items.isEmpty()) {
        System.out.println("No items to update.");
        return;
    }
    showStock();
    System.out.println("Enter the index number of the item you want to update:");
    int itemIndex = scan.nextInt() - 1;
    // scan.next();


    if (itemIndex >= 0 && itemIndex < items.size()) {
        System.out.println("Enter new name:");
        items.set(itemIndex, scan.next());
        System.out.println("Enter new price:");
        prices.set(itemIndex, scan.nextDouble());
        System.out.println("Enter new quantity:");
        quantities.set(itemIndex, scan.nextInt());
        // scan.next();
        System.out.println("Item updated.");
    } else {
        System.out.println("Invalid index.");
    }
}


//remove
static void removeItem() {
    if (items.isEmpty()) {
        System.out.println("No items to remove.");
        return;
    }


    showStock();
    System.out.println("Enter the index number of the item you want to remove:");
    int itemIndex = scan.nextInt() - 1;
    // scan.next();


    if (itemIndex >= 0 && itemIndex < items.size()) {
        System.out.println("Removing: " + items.get(itemIndex));
        items.remove(itemIndex);
        prices.remove(itemIndex);
        quantities.remove(itemIndex);
        System.out.println("Item removed.");
    } else {
        System.out.println("Invalid index.");
    }
}


//search function
static void searchItem() {
    System.out.println("Enter the name of the item to search:");
    String searchItem = scan.next();


    boolean found = false;
    for (int i = 0; i < items.size(); i++) {
        if (items.get(i).equalsIgnoreCase(searchItem)) {
            System.out.println("Item found: " + items.get(i) + " - Price: R" + prices.get(i) + " - Quantity: " + quantities.get(i));
            found = true;
            break;
        }
    }
    if (!found) {    System.out.println("Item not found.");
}
}


}






