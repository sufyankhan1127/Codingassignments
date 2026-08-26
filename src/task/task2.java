package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		HashMap<Integer,Inventory> inventory=new HashMap();
		while (true) {

		    displayMenu();

		    int choice = scan.nextInt();

		    if (choice == 1) {
		        addItem(inventory,scan);
		    }
		    else if (choice == 5) {
		        viewItem(inventory);
		    }
		    else if (choice == 3) {
		    	searchItem(inventory, scan);
		    }
		    else if (choice == 4) {
		    	deleteItem(inventory, scan);
		    }
		    else if (choice == 5) {
		        updateItem(inventory, scan);
		    }
		    else if (choice == 6) {
		        break;
		    }
		}
	}
	
	
	public static void displayMenu() {
		System.out.println("Enter the operation you want to perform");
		System.out.println("1. Add item");
		System.out.println("2. Update Item");
		System.out.println("3. Search Item");
		System.out.println("4. Delete Item");
		System.out.println("5. View All Items");
		System.out.println("6. End the program");
	}
	
	public static void addItem(HashMap<Integer,Inventory> inventory,Scanner scan) {
		System.out.println("How many Items you want to add ");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			Inventory inv=new Inventory();
			System.out.println("Enter the id for item "+(i+1));
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the name of the item for "+(i+1));
			String item=scan.nextLine();
			System.out.println("Enter the quantity of item "+(i+1));
			int quantity=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the price of the item"+(i+1));
			float price=scan.nextFloat();
			
			inv.setId(id);
			inv.setNameofproduct(item);
			inv.setQuantity(quantity);
			inv.setPrice(price);
			
			
			inventory.put(id, inv);
			
		}
	}
	
	public static void viewItem(HashMap<Integer,Inventory> inventory) {
		for(Map.Entry<Integer, Inventory> map:inventory.entrySet()) {
			System.out.println(map.getKey()+","+map.getValue());
		}
	}
	
	public static void searchItem(HashMap<Integer,Inventory> inventory,Scanner scan) {
		System.out.println("Enter the id to search for the item");
		int n=scan.nextInt();
		
		if(inventory.containsKey(n)) {
			System.out.println(inventory.get(n));
		}
		else {
			System.out.println("Item not found");
		}
	}
	
	public static void deleteItem(HashMap<Integer,Inventory> inventory,Scanner scan) {
		System.out.println("Enter the id to delete the item");
		int delid=scan.nextInt();
		if(inventory.containsKey(delid)) {
			inventory.remove(delid);
			System.out.println("Item removed");
		}
		else {
			System.out.println("Item not found");
		}
	}
	
	public static void updateItem(HashMap<Integer,Inventory> inventory,Scanner scan) {
		System.out.println("Enter the id to update that product");
		int updid=scan.nextInt();
		if(inventory.containsKey(updid)) {
			Inventory inv=inventory.get(updid);
			
			System.out.println("Enter the updated Item name:");
			String updname=scan.nextLine();
			System.out.println("Enter the updated Quantity:");
			int updquantity=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the updated Price");
			float updprice=scan.nextFloat();
			scan.nextLine();
			
			inv.setNameofproduct(updname);
			inv.setQuantity(updquantity);
			inv.setPrice(updprice);
			
			inventory.put(updid, inv);
		}
		
		else {
			System.out.println("item does not exist");
		}
	}

}
