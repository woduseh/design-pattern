package org.example.design.pattern.factory.pizza.simple;

import org.example.design.pattern.factory.pizza.OldPizza;

public class PepperoniOldPizza extends OldPizza {
	public PepperoniOldPizza() {
		this.name = "Pepperoni Pizza";
		this.dough = "Thick Crust";
		this.sauce = "Plum Tomato Sauce";
		this.toppings.add("Sliced Pepperoni");
		this.toppings.add("Onions");
		this.toppings.add("Mushrooms");
		this.toppings.add("Red Pepper");
	}
}
