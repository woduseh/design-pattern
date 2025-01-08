package org.example.design.pattern.flyweight.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();

		Flyweight flyweight1 = factory.getFlyweight("A");
		flyweight1.operation("First Call");

		Flyweight flyweight2 = factory.getFlyweight("B");
		flyweight2.operation("Second Call");

		Flyweight flyweight3 = factory.getFlyweight("A");
		flyweight3.operation("Third Call");

		log.info("flyweight1 == flyweight3: {}", flyweight1 == flyweight3);
	}
}
