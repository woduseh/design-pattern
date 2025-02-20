package org.example.design.pattern.observer.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Customer implements Subscriber {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		log.info("{} received update: {}", name, message);
	}
}
