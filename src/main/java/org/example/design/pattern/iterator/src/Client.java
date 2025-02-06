package org.example.design.pattern.iterator.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
	public static void main(String[] args) {
		ConcreteCollection<String> collection = new ConcreteCollection<>();
		collection.addItem("Item 1");
		collection.addItem("Item 2");
		collection.addItem("Item 3");

		Iterator<String> iterator = collection.createIterator();
		while (iterator.hasNext()) {
			log.info(iterator.next());
		}
	}
}
