package org.example.design.pattern.iterator.src;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection<T> implements Collection<T> {
	private final List<T> items;

	public ConcreteCollection() {
		this.items = new ArrayList<>();
	}

	public void addItem(T item) {
		items.add(item);
	}

	@Override
	public Iterator<T> createIterator() {
		return new ConcreteIterator<>(items);
	}
}
