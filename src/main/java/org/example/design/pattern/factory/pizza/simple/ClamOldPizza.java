package org.example.design.pattern.factory.pizza.simple;

import org.example.design.pattern.factory.pizza.OldPizza;

public class ClamOldPizza extends OldPizza {
	public ClamOldPizza() {
		this.name = "Clam Pizza";
		this.dough = "Thin Crust";
		this.sauce = "White garlic sauce";
		this.toppings.add("Clams");
		this.toppings.add("Grated parmesan cheese");
	}
}
