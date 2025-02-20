package org.example.design.pattern.observer.src;

import java.util.ArrayList;
import java.util.List;

public class Store implements Publisher {
	private List<Subscriber> subscribers = new ArrayList<>();
	private String newProduct;

	@Override
	public void registerSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update("New product available: " + newProduct);
		}
	}

	public void addNewProduct(String product) {
		this.newProduct = product;
		notifySubscribers();
	}
}
