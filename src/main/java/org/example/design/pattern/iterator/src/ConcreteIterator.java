package org.example.design.pattern.iterator.src;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
	private final List<T> items;
	private int position;

	public ConcreteIterator(List<T> items) {
		this.items = items;
		this.position = 0;
	}

	@Override
	public boolean hasNext() {
		return position < items.size();
	}

	@Override
	public T next() {
		if (this.hasNext()) {
			return items.get(position++);
		}
		return null;
	}
}
