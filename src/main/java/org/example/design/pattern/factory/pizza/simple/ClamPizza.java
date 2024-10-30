package org.example.design.pattern.factory.pizza.simple;

import org.example.design.pattern.factory.pizza.Pizza;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		this.name = "Clam Pizza";
		this.dough = "Thin Crust";
		this.sauce = "White garlic sauce";
		this.toppings.add("Clams");
		this.toppings.add("Grated parmesan cheese");
	}
}
