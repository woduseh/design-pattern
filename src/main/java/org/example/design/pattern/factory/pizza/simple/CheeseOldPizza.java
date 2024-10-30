package org.example.design.pattern.factory.pizza.simple;

import org.example.design.pattern.factory.pizza.OldPizza;

public class CheeseOldPizza extends OldPizza {
	public CheeseOldPizza() {
		this.name = "Cheese Pizza";
		this.dough = "Regular Crust";
		this.sauce = "Marinara Sauce";
		this.toppings.add("Fresh Mozzarella");
	}
}
