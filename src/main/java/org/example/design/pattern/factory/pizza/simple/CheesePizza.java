package org.example.design.pattern.factory.pizza.simple;

import org.example.design.pattern.factory.pizza.Pizza;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		this.name = "Cheese Pizza";
		this.dough = "Regular Crust";
		this.sauce = "Marinara Sauce";
		this.toppings.add("Fresh Mozzarella");
	}
}
