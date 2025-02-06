package org.example.design.pattern.iterator.src;

public interface Collection<T> {
	Iterator<T> createIterator();
}
