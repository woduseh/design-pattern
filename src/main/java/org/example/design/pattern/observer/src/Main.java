package org.example.design.pattern.observer.src;

public class Main {
	public static void main(String[] args) {
		Store store = new Store();

		Customer customer1 = new Customer("Alice");
		Customer customer2 = new Customer("Bob");

		store.registerSubscriber(customer1);
		store.registerSubscriber(customer2);

		store.addNewProduct("New Phone");

		store.removeSubscriber(customer1);

		store.addNewProduct("New Laptop");
	}
}
