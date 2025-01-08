package org.example.design.pattern.flyweight.src;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private final Map<String, Flyweight> flyweights = new HashMap<>();

	public Flyweight getFlyweight(String key) {
		return flyweights.computeIfAbsent(key, k -> new ConcreteFlyweight(key));
	}
}
