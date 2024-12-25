package org.example.design.pattern.composite.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Leaf implements Component {
	private final String name;
	private final int price;

	public Leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		log.info(name + " : " + price);
	}

	@Override
	public int getPrice() {
		return price;
	}
}
