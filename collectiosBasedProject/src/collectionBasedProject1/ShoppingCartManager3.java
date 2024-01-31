package collectionBasedProject1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Item {
	private int itemID;
	private String itemName;
	private int quantity;
	private double price;

	public Item(int itemID, String itemName, int quantity, double price) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getItemID() {
		return itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item ID: " + itemID + ", Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + price;
	}
}

public class ShoppingCartManager3 {
	private Map<Integer, Map<Integer, Item>> userCarts;

	public ShoppingCartManager3() {
		this.userCarts = new HashMap<>();
	}

	public void addItemToCart(int userID, int itemID, String itemName, int quantity, double price) {
		Map<Integer, Item> userCart = userCarts.computeIfAbsent(userID, k -> new HashMap<>());
		userCart.put(itemID, new Item(itemID, itemName, quantity, price));
		System.out.println("Item added to the cart for User ID " + userID + ": " + userCart.get(itemID));
	}

	public void removeItemFromCart(int userID, int itemID) {
		Map<Integer, Item> userCart = userCarts.get(userID);
		if (userCart != null) {
			Item removedItem = userCart.remove(itemID);
			if (removedItem != null) {
				System.out.println("Item removed from the cart for User ID " + userID + ": " + removedItem);
			} else {
				System.out.println("Item with ID " + itemID + " not found in the cart for User ID " + userID);
			}
		} else {
			System.out.println("User with ID " + userID + " not found.");
		}
	}

	public void calculateTotalPrice(int userID) {
		Map<Integer, Item> userCart = userCarts.get(userID);
		if (userCart != null && !userCart.isEmpty()) {
			double totalPrice = 0;
			for (Item item : userCart.values()) {
				totalPrice += item.getQuantity() * item.getPrice();
			}
			System.out.println("Total price for the cart of User ID " + userID + ": $" + totalPrice);
		} else {
			System.out.println("User with ID " + userID + " not found or the cart is empty.");
		}
	}

	public void displayCart(int userID) {
		Map<Integer, Item> userCart = userCarts.get(userID);
		if (userCart != null && !userCart.isEmpty()) {
			System.out.println("Shopping Cart for User ID " + userID + ":");
			for (Item item : userCart.values()) {
				System.out.println(item.toString());
			}
		} else {
			System.out.println("User with ID " + userID + " not found or the cart is empty.");
		}
	}

	public static void main(String[] args) {
		ShoppingCartManager3 cartManager = new ShoppingCartManager3();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Add Item to Cart");
			System.out.println("2. Display Cart");
			System.out.println("3. Remove Item from Cart");
			System.out.println("4. Calculate Total Price");
			System.out.println("5. Exit");

			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// Example usage: Adding items to the cart
				System.out.println("Enter User ID, Item ID, Item Name, Quantity, and Price to add item to the cart:");
				int userIDToAdd = scanner.nextInt();
				int itemIDToAdd = scanner.nextInt();
				String itemNameToAdd = scanner.next();
				int quantityToAdd = scanner.nextInt();
				double priceToAdd = scanner.nextDouble();
				cartManager.addItemToCart(userIDToAdd, itemIDToAdd, itemNameToAdd, quantityToAdd, priceToAdd);
				break;

			case 2:
				// Displaying the cart for a user
				System.out.println("Enter User ID to display the cart:");
				int userIDToDisplay = scanner.nextInt();
				cartManager.displayCart(userIDToDisplay);
				break;

			case 3:
				// Removing an item from the cart
				System.out.println("Enter User ID and Item ID to remove from the cart:");
				int userIDToRemove = scanner.nextInt();
				int itemIDToRemove = scanner.nextInt();
				cartManager.removeItemFromCart(userIDToRemove, itemIDToRemove);
				break;

			case 4:
				// Calculating the total price for a user's cart
				System.out.println("Enter User ID to calculate total price:");
				int userIDToCalculateTotal = scanner.nextInt();
				cartManager.calculateTotalPrice(userIDToCalculateTotal);
				break;

			case 5:
				System.out.println("Exiting the program.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
			
		}
	}
}
