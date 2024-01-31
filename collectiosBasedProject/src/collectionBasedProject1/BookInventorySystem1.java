package collectionBasedProject1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private String isbn;
	private int quantity;

	public Book(String title, String author, String isbn, int quantity) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Quantity: " + quantity;
	}
}

public class BookInventorySystem1 {
	private Map<String, Book> inventory;

	public BookInventorySystem1() {
		this.inventory = new HashMap<>();
	}

	public void addBook(String title, String author, String isbn, int quantity) {
		Book newBook = new Book(title, author, isbn, quantity);
		inventory.put(isbn, newBook);
		System.out.println("Book added to inventory: " + newBook.toString());
	}

	public void searchBook(String isbn) {
		if (inventory.containsKey(isbn)) {
			System.out.println("Book found in inventory: " + inventory.get(isbn).toString());
		} else {
			System.out.println("Book with ISBN " + isbn + " not found in inventory.");
		}
	}

	public void updateQuantity(String isbn, int newQuantity) {
		if (inventory.containsKey(isbn)) {
			Book book = inventory.get(isbn);
			book.setQuantity(newQuantity);
			System.out.println("Quantity for book with ISBN " + isbn + " updated to " + newQuantity);
			System.out.println("The Quantity is updated.");
		} else {
			System.out.println("Book with ISBN " + isbn + " not found in inventory.");
		}
	}

	public void displayInventory() {
		System.out.println("Book Inventory:");
		for (Book book : inventory.values()) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		BookInventorySystem1 inventorySystem = new BookInventorySystem1();
		Scanner scanner = new Scanner(System.in);

		inventorySystem.addBook("Wings of Fire An Autobiography", "Dr. APJ Abdul Kalam", "978-8173711466", 20);
		inventorySystem.addBook("India 2020: A Vision for the New Millennium", "Dr. APJ Abdul Kalam", "978-0143423683",
				18);
		inventorySystem.addBook("The White Tiger", "Aravind Adiga", "978-1-4165-6282-2", 30);
		inventorySystem.addBook("Interpreter of Maladies", "Jhumpa Lahirie", "978-0-395-92720-54", 15);

		inventorySystem.displayInventory();

		System.out.println("Enter ISBN to search for a book:");
		String searchIsbn = scanner.nextLine();
		inventorySystem.searchBook(searchIsbn);

		System.out.println("Enter ISBN and new quantity to update the quantity of a book:");
		String updateIsbn = scanner.nextLine();
		int newQuantity = scanner.nextInt();
		inventorySystem.updateQuantity(updateIsbn, newQuantity);

		inventorySystem.displayInventory();

		scanner.close();
	}
}
